package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.HeaderPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger.UserIntent;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.DownloadHeaderView.State;
import com.spotify.mobile.android.ui.view.DownloadHeaderView.a;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.mobile.android.util.view.CollectionEntityListLayout;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import com.spotify.music.util.filterheader.FilterHeaderView;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: iqb reason: default package */
public class iqb extends jrd implements fzq, jqx, uqq {
    public static final String a = ViewUris.bi.toString();
    private static final a aN = new a() {
    };
    private static final SortOption aj = new juz(new SortOption("album.name")).a(new SortOption("album.artist.name")).a(new SortOption("discNumber")).a(new SortOption("trackNumber")).a;
    /* access modifiers changed from: private */
    public static final b<Object, String> ak = b.b("tracks_sort_order");
    /* access modifiers changed from: private */
    public static final b<Object, Boolean> al = b.b("tracks_local_files_only");
    private static final List<SortOption> am;
    private static final SortOption an;
    private static final Policy ao;
    private static final ListPolicy ap;
    public lon T;
    public nxo U;
    public szp V;
    public sgb W;
    public ToolbarMenuHelper X;
    public PlayOrigin Y;
    public irc Z;
    /* access modifiers changed from: private */
    public isz aA;
    /* access modifiers changed from: private */
    public vau aB;
    private jts aC;
    /* access modifiers changed from: private */
    public ipa aD;
    private vhx aE;
    /* access modifiers changed from: private */
    public FilterHeaderView aF;
    private View aG;
    private DownloadHeaderView aH;
    private LoadingView aI;
    /* access modifiers changed from: private */
    public fyk<fyq> aJ;
    private vli aK = new f();
    private ViewLoadingTracker aL;
    private final jor<vlf> aM = new jor<vlf>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            vlf vlf = (vlf) obj;
            return iqb.this.ae.a(vlf.getUri(), vlf.getTitle(), iqb.this.ay.toString()).a(iqb.this.ay).a(true).b(true).c(true).d(false).a(uqo.A).a();
        }
    };
    private final xis<Boolean> aO = new xis<Boolean>() {
        public final /* synthetic */ void call(Object obj) {
            Boolean bool = (Boolean) obj;
            iqb.this.aT = bool.booleanValue();
            iqb.this.aD.b(bool.booleanValue());
        }
    };
    private final xok aP = xon.a(new xip[0]);
    private boolean aQ;
    private String aR;
    /* access modifiers changed from: private */
    public fqn aS;
    /* access modifiers changed from: private */
    public boolean aT;
    private final xog<Integer> aU = xog.e();
    private final xog<Integer> aV = xog.e();
    private final a aW = new a() {
        public final void onFilterChanged() {
            iqb.this.am();
            iqb iqb = iqb.this;
            iqb.a(iqb.aa);
            iqb.this.ak();
        }
    };
    private final OnClickListener aX = new OnClickListener() {
        public final void onClick(View view) {
            if (iqb.this.aB.a) {
                iqb.this.aB.a(iqb.this.p());
            }
            iqb.this.aA.b();
        }
    };
    private final a aY = new a() {
        public final void a() {
            iqb.this.V.a("spotify:internal:preferences");
        }

        public final void a(boolean z) {
            iqb.this.aa.a(z);
            OffliningLogger.a(iqb.this.ay, iqb.a, SourceElement.HEADER_TOGGLE, z);
        }
    };
    private final a aZ = new a() {
        public final void a(vau vau) {
            iqb.this.az.a().a(iqb.al, vau.a).b();
            iqb.this.am();
            iqb iqb = iqb.this;
            iqb.a(iqb.aa);
            iqb.this.ak();
        }
    };
    public irb aa;
    public iql ab;
    public xil ac;
    public jvf ad;
    public jpc ae;
    public Flowable<PlayerState> af;
    public jwo ag;
    public lbr ah;
    public jyg ai;
    /* access modifiers changed from: private */
    public String aq;
    /* access modifiers changed from: private */
    public SortOption ar;
    private RecyclerView as;
    private View at;
    private View au;
    private View av;
    private fvd aw;
    private int ax;
    /* access modifiers changed from: private */
    public sso ay;
    /* access modifiers changed from: private */
    public SpSharedPreferences<Object> az;
    public CollectionLogger b;
    private final FilterHeaderView.a ba = new FilterHeaderView.a() {
        public final void a() {
        }

        public final void a(SortOption sortOption) {
            iqb.this.ar = sortOption;
            iqb.this.az.a().a(iqb.ak, iqb.this.ar.a()).b();
            iqb iqb = iqb.this;
            iqb.a(iqb.aa);
            iqb.this.ak();
            if (iqb.this.aF.b()) {
                iqb.this.aJ.h();
            }
        }

        public final void a(String str) {
            iqb.this.aq = str;
            iqb iqb = iqb.this;
            iqb.a(iqb.aa);
            iqb.this.ak();
            if (iqb.this.aF.b()) {
                iqb.this.aJ.h();
            }
        }
    };
    private final OnClickListener bb = new OnClickListener() {
        public final void onClick(View view) {
            iqb.this.b.a(null, "shuffle-play-button", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
            iqb.this.al();
        }
    };

    static {
        SortOption sortOption = new SortOption("addTime", (int) R.string.sort_order_recently_added);
        sortOption.mSecondarySortOption = aj;
        an = sortOption;
        ArrayList arrayList = new ArrayList();
        am = arrayList;
        String str = "name";
        arrayList.add(new SortOption(str, (int) R.string.sort_order_title));
        am.add(an);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        HeaderPolicy headerPolicy = new HeaderPolicy();
        String str2 = "offline";
        headerPolicy.setAttributes(ImmutableMap.g().b(str2, Boolean.TRUE).b("syncProgress", Boolean.TRUE).b());
        decorationPolicy.setHeaderPolicy(headerPolicy);
        decorationPolicy.setListAttributes(Collections.emptyMap());
        decorationPolicy.setListPolicy(new ListPolicy());
        ao = new Policy(decorationPolicy);
        ListPolicy listPolicy = new ListPolicy();
        ap = listPolicy;
        String str3 = "isBanned";
        String str4 = "isExplicit";
        String str5 = "hasLyrics";
        String str6 = "isPremiumOnly";
        String str7 = "playable";
        String str8 = "available";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b(str2, Boolean.TRUE).b());
        ap.setArtistAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ap.setArtistsAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ap.setAlbumAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ap.setAddedByAttributes(Collections.emptyMap());
        ap.setShowAttributes(Collections.emptyMap());
    }

    public static iqb a(fqn fqn, String str, boolean z) {
        iqb iqb = new iqb();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_download", z);
        bundle.putString("username", str);
        iqb.g(bundle);
        fqo.a((Fragment) iqb, fqn);
        return iqb;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Boolean bool) {
        $$Lambda$iqb$Js8KFvoaw4rGo4ZiMdDEXCVeNw r0 = new $$Lambda$iqb$Js8KFvoaw4rGo4ZiMdDEXCVeNw(this, bool);
        if (r0 != null) {
            return new iqk(r0).a(ap, (xii<Integer>) this.aU);
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Integer num) {
        return wit.a((ObservableSource<T>) this.ag.n, BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$7kPACyZoptBihGuDwq4w4TVs5RU.INSTANCE).b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (jva.a(playerState.contextUri()).b != LinkType.COLLECTION_TRACKS || track == null) {
            this.aD.a((String) null);
        } else {
            this.aD.a(track.uri());
        }
    }

    static /* synthetic */ void a(iqb iqb, int i, vlf vlf) {
        if (jus.c(iqb.aS)) {
            iqb.b.a(vlf.getUri(), TrackData.TYPE_TRACK, i, InteractionType.HIT, UserIntent.PLAY);
            if (!vlf.isExplicit() || !iqb.aT) {
                Builder builder = new Builder();
                PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, vlf.getUri(), 0);
                iqb.aa.a(builder.skipTo(playOptionsSkipTo).build(), iqb.Y, Collections.emptyMap());
                return;
            }
            iqb.T.a(vlf.getUri(), iqb.ay.toString());
            return;
        }
        iqb.b.a(vlf.getUri(), "inert-track", i, InteractionType.HIT, UserIntent.PLAY);
        View view = iqb.aG;
        if (view instanceof ShufflePlayHeaderView) {
            ((ShufflePlayHeaderView) view).a();
        } else {
            ShufflePlayHeaderView.a(iqb.aC, view);
        }
    }

    /* access modifiers changed from: private */
    public void a(irb irb) {
        irb.c = this.ar;
        irb.h = this.aB.a;
        irb.a(false, this.aA.c(), false);
        irb.b = this.aq;
    }

    /* access modifiers changed from: private */
    public void a(iri iri) {
        this.aK = iri.a();
        an();
        am();
    }

    /* access modifiers changed from: private */
    public void a(List<vlf> list) {
        ipa ipa = this.aD;
        ipa.a = list;
        ipa.e();
        boolean z = this.aD.b() == 0;
        boolean b2 = this.aF.b();
        boolean z2 = this.aA.c() || this.aB.a;
        if (z) {
            this.aE.a(false, 0);
        } else {
            this.aE.a(true, 0);
        }
        this.aE.h(1);
        if (!z || !b2) {
            this.aE.a(false, 2);
        } else {
            this.aw.a((CharSequence) a((int) R.string.placeholder_no_result_title, this.aq));
            this.aE.a(true, 2);
        }
        if (z || !z2) {
            this.aE.a(false, 3);
        } else {
            this.aE.a(true, 3);
        }
        if (this.aI.d()) {
            this.aI.b();
        }
        if (this.aA.c() || this.aB.a) {
            this.aJ.h();
        }
        boolean z3 = z && !this.aF.b();
        if (this.aA.c() && z3) {
            a(false, true, false);
        } else if (!this.aB.a || !z3) {
            a(z3, false, false);
        } else {
            a(false, false, true);
        }
        View view = this.aG;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
        if (!z) {
            if (this.ax > 1) {
                this.aJ.h();
                ((LinearLayoutManager) this.as.d()).a(this.ax, 0);
            }
            this.ax = -1;
        }
        c(!z);
        this.ah.ao_();
        this.aL.b();
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        this.av.setVisibility(z ? 0 : 8);
        this.at.setVisibility(z2 ? 0 : 8);
        View view = this.au;
        if (!z3) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: private */
    public void ak() {
        int i = 0;
        int hashCode = this.ar.mKey.hashCode() + (this.ar.b() ? 1 : 0) + (this.aB.a ? 2 : 0) + (this.aA.c() ? 4 : 0);
        if (!TextUtils.isEmpty(this.aq)) {
            i = this.aq.hashCode();
        }
        this.aV.onNext(Integer.valueOf(hashCode + i));
    }

    /* access modifiers changed from: private */
    public void al() {
        this.aa.a(new Builder().playerOptionsOverride(Boolean.TRUE, null, null).build(), this.Y, Collections.emptyMap());
    }

    /* access modifiers changed from: private */
    public void am() {
        if (this.aA.c() || this.aB.a) {
            this.aH.a(State.HIDDEN, 0);
        } else {
            this.aH.a(this.aK);
        }
    }

    private void an() {
        this.ah.a(this, p().getString(R.string.collection_tracks_page_title));
        this.ah.ao_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ irb b(Boolean bool) {
        irb a2 = this.Z.a();
        a(a2);
        a2.g = !bool.booleanValue();
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(Integer num) {
        irb irb = this.aa;
        Integer valueOf = Integer.valueOf(0);
        return wit.a((ObservableSource<T>) irb.a(valueOf, valueOf).a(ao), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a(null, "toolbar-menu", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
        al();
    }

    public final void A() {
        super.A();
        this.aF.a();
    }

    public final void B() {
        super.B();
        this.aA.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        this.aS = fqo.a((Fragment) this);
        CollectionEntityListLayout collectionEntityListLayout = new CollectionEntityListLayout(n());
        this.aL = this.W.a(collectionEntityListLayout, this.ay.toString(), bundle, rmf.a(PageIdentifiers.COLLECTION_SONGS, null));
        this.aF = FilterHeaderView.a(layoutInflater, this.aq, am, this.ar, this.aA.d, this.ba);
        this.aF.setBackgroundColor(fr.c(p(), R.color.bg_filter));
        this.aF.a(this.ay, (gkq) PageIdentifiers.COLLECTION_SONGS);
        this.aF.a((int) R.string.header_filter_tracks_hint);
        if (jvi.a(p())) {
            LinearLayout linearLayout = new LinearLayout(p());
            linearLayout.setOrientation(1);
            linearLayout.addView(this.aF, new LayoutParams(-1, -2));
            this.aG = ShufflePlayHeaderView.a(p(), linearLayout, this.bb);
            linearLayout.addView(this.aG, new LayoutParams(-1, -2));
            linearLayout.setTag(R.id.legacy_filter_tag, this.aF);
            view2 = this.aG;
            view = linearLayout;
        } else {
            view2 = null;
            view = this.aF;
        }
        a a2 = fyk.c(p()).b().a(null, 0);
        a2.a.i = view;
        a2.a.j = view2;
        this.aJ = a2.b(true).c(true).a(true).a((Fragment) this);
        this.aE = new vhx();
        ipa ipa = new ipa(aN, this.aM, this.aS, new b() {
            public final void a(int i, vlf vlf) {
                iqb.a(iqb.this, i, vlf);
            }
        }, this.ay, this.aU);
        this.aD = ipa;
        this.as = this.aJ.f();
        collectionEntityListLayout.a(this.aJ.b());
        this.av = mhu.a((Context) p(), this.aS, this.V, (OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                iqb.this.U.a(iqb.this.aS);
            }
        });
        this.at = mhu.a((Context) p(), this.aX, (OnClickListener) null, 0);
        this.au = mhu.a((Context) p(), this.aS, this.aX, this.U);
        collectionEntityListLayout.addView(this.av);
        this.av.setVisibility(8);
        collectionEntityListLayout.addView(this.at);
        this.at.setVisibility(8);
        collectionEntityListLayout.addView(this.au);
        this.au.setVisibility(8);
        this.aw = mhu.a((Context) p(), "");
        View inflate = layoutInflater.inflate(R.layout.collection_show_all, null);
        inflate.findViewById(R.id.button).setOnClickListener(this.aX);
        this.aH = DownloadHeaderView.a((Context) p(), (ViewGroup) null);
        DownloadHeaderView downloadHeaderView = this.aH;
        downloadHeaderView.b = this.aY;
        this.aE.a((RecyclerView.a<H>) new jog<H>(downloadHeaderView, false), 0);
        this.aE.a(0);
        this.aE.a((RecyclerView.a<H>) this.aD, 1);
        this.aE.a((RecyclerView.a<H>) new jog<H>(this.aw.getView(), false), 2);
        this.aE.a((RecyclerView.a<H>) new jog<H>(inflate, false), 3);
        this.aE.a((RecyclerView.a<H>) new jog<H>(this.av, false), 4);
        this.aE.a((RecyclerView.a<H>) new jog<H>(this.at, false), 5);
        this.aE.a((RecyclerView.a<H>) new jog<H>(this.au, false), 6);
        this.aE.h(1);
        this.aE.a(2, 3, 4, 5, 6);
        this.aI = LoadingView.a(LayoutInflater.from(p()), p(), collectionEntityListLayout.a);
        collectionEntityListLayout.addView(this.aI);
        collectionEntityListLayout.a.setVisibility(4);
        this.as.a((RecyclerView.a) this.aE);
        this.aI.a();
        return collectionEntityListLayout;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
    }

    public final void a(fzn fzn) {
        if (jvi.b(p())) {
            ipa ipa = this.aD;
            if (ipa != null && ipa.b() > 0) {
                this.aG = ToolbarMenuHelper.a(fzn, (OnClickListener) new $$Lambda$iqb$S8Z0IikI1NHmcb7JOX7LcWLMjU(this));
            }
        }
    }

    public final void aP_() {
        super.aP_();
        this.aP.a(this.T.a().a(this.ac).a(this.aO, (xis<Throwable>) $$Lambda$iqb$l80mzv_49ZmqJmOOg9pXMmUB28.INSTANCE));
        this.aP.a(this.aV.b().h(new $$Lambda$iqb$gaTxRNvWKBtajeHiOvdyXV0y0mg(this)).a(this.ac).a((xis<? super T>) new $$Lambda$iqb$7WfgQZUzkjOh84nDgUkFGVcbEU<Object>(this), (xis<Throwable>) $$Lambda$iqb$H3GcWzIMqe0QBolqfMnqqTvJ9S4.INSTANCE));
        this.aP.a(this.aV.b().h(new $$Lambda$iqb$KMSd9BOaxxwu0OBUnM6IlSyeeHk(this)).h(new $$Lambda$iqb$VxiW8TQwVgrRa_cp73opcpFV8c(this)).a(this.ac).a((xis<? super T>) new $$Lambda$iqb$ueOLRQOoYFM88hTdkczMb6J7wS8<Object>(this), (xis<Throwable>) $$Lambda$iqb$QWrn4YQ87HnO9vJGMeq6brrw4G8.INSTANCE));
        this.aP.a(wit.a((xfk<T>) this.af).a(this.ac).a((xis<? super T>) new $$Lambda$iqb$qLvBmlfq5LeDjw4vcqAfuDvKMdE<Object>(this), (xis<Throwable>) $$Lambda$iqb$MgBm2eINqGzgqQTG2rDSuqWaTJA.INSTANCE));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.bi;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.COLLECTION_SONGS, null);
    }

    public final uqm ag() {
        return uqo.A;
    }

    public final gkq aj() {
        return PageIdentifiers.COLLECTION_SONGS;
    }

    public final void aw_() {
        FilterHeaderView filterHeaderView = this.aF;
        if (filterHeaderView != null) {
            FilterHeaderView.a(filterHeaderView);
        }
        super.aw_();
        this.aL.e();
    }

    public final String b(Context context) {
        return context.getString(R.string.collection_tracks_page_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(false);
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            this.aQ = bundle2.getBoolean("can_download", false);
            this.aR = bundle2.getString("username");
        }
        this.aS = fqo.a((Fragment) this);
        String str = "filter";
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            this.aq = bundle.getString(str);
        }
        this.az = this.ai.c(p());
        this.ar = SortOption.a(this.az, ak, an, am);
        this.ax = -1;
        if (bundle2 != null) {
            if (this.aq == null && bundle2.containsKey(str)) {
                this.aq = bundle2.getString(str);
            }
            String str2 = "sort_order";
            if (bundle2.containsKey(str2)) {
                this.ar = SortOption.a(bundle2.getString(str2), am);
            }
        }
        if (this.aq == null) {
            this.aq = "";
        }
        if (this.ar == null) {
            this.ar = an;
        }
        this.ay = ViewUris.bi;
        isz isz = new isz(p(), this.b, this.aQ, this.az, isz.c, this.ad);
        this.aA = isz;
        this.aB = new vau(this.aZ, R.string.filter_show_only_local_files);
        this.aB.a = this.az.a(al, false);
        if (nxp.a(this.aS)) {
            this.aA.a(this.aB);
        }
        this.aA.e = this.aW;
        this.aC = new jts();
        a(this.aa);
        ak();
    }

    public final String e() {
        return "collection:tracks";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("filter", this.aq);
        this.aL.a(bundle);
    }

    public final void h() {
        super.h();
        this.aP.a();
    }

    public final void z() {
        super.z();
        an();
    }
}
