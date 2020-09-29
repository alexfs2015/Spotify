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
import com.spotify.cosmos.android.RxResolver;
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

/* renamed from: ino reason: default package */
public class ino extends jor implements fyw, jol, udv {
    public static final String a = ViewUris.bj.toString();
    private static final a aN = new a() {
    };
    private static final SortOption aj = new jss(new SortOption("album.name")).a(new SortOption("album.artist.name")).a(new SortOption("discNumber")).a(new SortOption("trackNumber")).a;
    /* access modifiers changed from: private */
    public static final b<Object, String> ak = b.b("tracks_sort_order");
    /* access modifiers changed from: private */
    public static final b<Object, Boolean> al = b.b("tracks_local_files_only");
    private static final List<SortOption> am;
    private static final SortOption an;
    private static final Policy ao;
    private static final ListPolicy ap;
    public lkn T;
    public nrl U;
    public spi V;
    public rwr W;
    public ToolbarMenuHelper X;
    public PlayOrigin Y;
    public iop Z;
    /* access modifiers changed from: private */
    public iqm aA;
    /* access modifiers changed from: private */
    public upp aB;
    private jri aC;
    /* access modifiers changed from: private */
    public imn aD;
    private uwh aE;
    /* access modifiers changed from: private */
    public FilterHeaderView aF;
    private View aG;
    private DownloadHeaderView aH;
    private LoadingView aI;
    /* access modifiers changed from: private */
    public fxq<fxw> aJ;
    private uzf aK = new f();
    private ViewLoadingTracker aL;
    private final jmf<uzc> aM = new jmf<uzc>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            uzc uzc = (uzc) obj;
            return ino.this.ae.a(uzc.getUri(), uzc.getTitle(), ino.this.ay.toString()).a(ino.this.ay).a(true).b(true).c(true).d(false).a(udt.A).a();
        }
    };
    private final wun<Boolean> aO = new wun<Boolean>() {
        public final /* synthetic */ void call(Object obj) {
            Boolean bool = (Boolean) obj;
            ino.this.aT = bool.booleanValue();
            ino.this.aD.b(bool.booleanValue());
        }
    };
    private final xag aP = xaj.a(new wuk[0]);
    private boolean aQ;
    private String aR;
    /* access modifiers changed from: private */
    public fpt aS;
    /* access modifiers changed from: private */
    public boolean aT;
    private final xac<Integer> aU = xac.e();
    private final xac<Integer> aV = xac.e();
    private final a aW = new a() {
        public final void onFilterChanged() {
            ino.this.am();
            ino ino = ino.this;
            ino.a(ino.aa);
            ino.this.ak();
        }
    };
    private final OnClickListener aX = new OnClickListener() {
        public final void onClick(View view) {
            if (ino.this.aB.a) {
                ino.this.aB.a(ino.this.p());
            }
            ino.this.aA.b();
        }
    };
    private final a aY = new a() {
        public final void a() {
            ino.this.V.a("spotify:internal:preferences");
        }

        public final void a(boolean z) {
            ino.this.aa.a(z);
            OffliningLogger.a(ino.this.ay, ino.a, SourceElement.HEADER_TOGGLE, z);
        }
    };
    private final a aZ = new a() {
        public final void a(upp upp) {
            ino.this.az.a().a(ino.al, upp.a).b();
            ino.this.am();
            ino ino = ino.this;
            ino.a(ino.aa);
            ino.this.ak();
        }
    };
    public ioo aa;
    public iny ab;
    public wug ac;
    public jsz ad;
    public jmq ae;
    public Flowable<PlayerState> af;
    public jug ag;
    public kyi ah;
    public jvy ai;
    /* access modifiers changed from: private */
    public String aq;
    /* access modifiers changed from: private */
    public SortOption ar;
    private RecyclerView as;
    private View at;
    private View au;
    private View av;
    private fuj aw;
    private int ax;
    /* access modifiers changed from: private */
    public sih ay;
    /* access modifiers changed from: private */
    public SpSharedPreferences<Object> az;
    public CollectionLogger b;
    private final FilterHeaderView.a ba = new FilterHeaderView.a() {
        public final void a() {
        }

        public final void a(String str) {
            ino.this.aq = str;
            ino ino = ino.this;
            ino.a(ino.aa);
            ino.this.ak();
            if (ino.this.aF.b()) {
                ino.this.aJ.h();
            }
        }

        public final void a(SortOption sortOption) {
            ino.this.ar = sortOption;
            ino.this.az.a().a(ino.ak, ino.this.ar.a()).b();
            ino ino = ino.this;
            ino.a(ino.aa);
            ino.this.ak();
            if (ino.this.aF.b()) {
                ino.this.aJ.h();
            }
        }
    };
    private final OnClickListener bb = new OnClickListener() {
        public final void onClick(View view) {
            ino.this.b.a(null, "shuffle-play-button", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
            ino.this.al();
        }
    };

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "collection:tracks";
    }

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

    public static ino a(fpt fpt, String str, boolean z) {
        ino ino = new ino();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_download", z);
        bundle.putString("username", str);
        ino.g(bundle);
        fpu.a((Fragment) ino, fpt);
        return ino;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c(false);
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            this.aQ = bundle2.getBoolean("can_download", false);
            this.aR = bundle2.getString("username");
        }
        this.aS = fpu.a((Fragment) this);
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
        this.ay = ViewUris.bj;
        iqm iqm = new iqm(p(), this.b, this.aQ, this.az, iqm.c, this.ad);
        this.aA = iqm;
        this.aB = new upp(this.aZ, R.string.filter_show_only_local_files);
        this.aB.a = this.az.a(al, false);
        if (nrm.a(this.aS)) {
            this.aA.a(this.aB);
        }
        this.aA.e = this.aW;
        this.aC = new jri();
        a(this.aa);
        ak();
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
    public void a(ioo ioo) {
        ioo.c = this.ar;
        ioo.h = this.aB.a;
        ioo.a(false, this.aA.c(), false);
        ioo.b = this.aq;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        this.aS = fpu.a((Fragment) this);
        CollectionEntityListLayout collectionEntityListLayout = new CollectionEntityListLayout(n());
        this.aL = this.W.a(collectionEntityListLayout, this.ay.toString(), bundle, rdh.a(PageIdentifiers.COLLECTION_SONGS, null));
        this.aF = FilterHeaderView.a(layoutInflater, this.aq, am, this.ar, this.aA.d, this.ba);
        this.aF.setBackgroundColor(fr.c(p(), R.color.bg_filter));
        this.aF.a(this.ay, (gjf) PageIdentifiers.COLLECTION_SONGS);
        this.aF.a((int) R.string.header_filter_tracks_hint);
        if (jtc.a(p())) {
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
        a a2 = fxq.c(p()).b().a(null, 0);
        a2.a.i = view;
        a2.a.j = view2;
        this.aJ = a2.b(true).c(true).a(true).a((Fragment) this);
        this.aE = new uwh();
        imn imn = new imn(aN, this.aM, this.aS, new b() {
            public final void a(int i, uzc uzc) {
                ino.a(ino.this, i, uzc);
            }
        }, this.ay, this.aU);
        this.aD = imn;
        this.as = this.aJ.f();
        collectionEntityListLayout.a(this.aJ.b());
        this.av = mdr.a((Context) p(), this.aS, this.V, (OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                ino.this.U.a(ino.this.aS);
            }
        });
        this.at = mdr.a((Context) p(), this.aX, (OnClickListener) null, 0);
        this.au = mdr.a((Context) p(), this.aS, this.aX, this.U);
        collectionEntityListLayout.addView(this.av);
        this.av.setVisibility(8);
        collectionEntityListLayout.addView(this.at);
        this.at.setVisibility(8);
        collectionEntityListLayout.addView(this.au);
        this.au.setVisibility(8);
        this.aw = mdr.a((Context) p(), "");
        View inflate = layoutInflater.inflate(R.layout.collection_show_all, null);
        inflate.findViewById(R.id.button).setOnClickListener(this.aX);
        this.aH = DownloadHeaderView.a((Context) p(), (ViewGroup) null);
        DownloadHeaderView downloadHeaderView = this.aH;
        downloadHeaderView.b = this.aY;
        this.aE.a((RecyclerView.a<H>) new jlu<H>(downloadHeaderView, false), 0);
        this.aE.a(0);
        this.aE.a((RecyclerView.a<H>) this.aD, 1);
        this.aE.a((RecyclerView.a<H>) new jlu<H>(this.aw.getView(), false), 2);
        this.aE.a((RecyclerView.a<H>) new jlu<H>(inflate, false), 3);
        this.aE.a((RecyclerView.a<H>) new jlu<H>(this.av, false), 4);
        this.aE.a((RecyclerView.a<H>) new jlu<H>(this.at, false), 5);
        this.aE.a((RecyclerView.a<H>) new jlu<H>(this.au, false), 6);
        this.aE.h(1);
        this.aE.a(2, 3, 4, 5, 6);
        this.aI = LoadingView.a(LayoutInflater.from(p()), p(), collectionEntityListLayout.a);
        collectionEntityListLayout.addView(this.aI);
        collectionEntityListLayout.a.setVisibility(4);
        this.as.a((RecyclerView.a) this.aE);
        this.aI.a();
        return collectionEntityListLayout;
    }

    public final void g() {
        super.g();
        this.aP.a(this.T.a().a(this.ac).a(this.aO, (wun<Throwable>) $$Lambda$ino$r26FaxzgbKAfCa76YxAK02Fhslw.INSTANCE));
        this.aP.a(this.aV.b().i(new $$Lambda$ino$htBzDCUoaNiRKcwMOPHHIIk6wA(this)).a(this.ac).a((wun<? super T>) new $$Lambda$ino$bnF7li4tBgcpMZpyjPu1oh10k<Object>(this), (wun<Throwable>) $$Lambda$ino$D5z94D1I8eEii_aGt7vzaPgp9E.INSTANCE));
        this.aP.a(this.aV.b().i(new $$Lambda$ino$sBAw1dTaqD9cc7NG_SUp0YTF93k(this)).i(new $$Lambda$ino$l1syLn8PXHMHIyIYYuTkQRPU0go(this)).a(this.ac).a((wun<? super T>) new $$Lambda$ino$9pPNztCqZH7PH0loY253ZmnE1Kc<Object>(this), (wun<Throwable>) $$Lambda$ino$buZ0aAoDnAA8N7Abtq2IY18zmmw.INSTANCE));
        this.aP.a(vun.a((wrf<T>) this.af).a(this.ac).a((wun<? super T>) new $$Lambda$ino$DuT6q1kkQ0i95OpfRrfXid6fuYc<Object>(this), (wun<Throwable>) $$Lambda$ino$DD_Oyj0nPG0OFaPWpjRA6HajG9g.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(Integer num) {
        ioo ioo = this.aa;
        Integer valueOf = Integer.valueOf(0);
        return vun.a((ObservableSource<T>) ioo.a(valueOf, valueOf).a(ao), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Integer num) {
        return vun.a((ObservableSource<T>) this.ag.n, BackpressureStrategy.BUFFER).f($$Lambda$4JPZrGXSUtGct19Dd2rr57fjU.INSTANCE).b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Boolean bool) {
        $$Lambda$ino$foK1rFEV6bN4qFI5Wa8jkGV1E r0 = new $$Lambda$ino$foK1rFEV6bN4qFI5Wa8jkGV1E(this, bool);
        if (r0 != null) {
            return new inx(r0).a(ap, (wud<Integer>) this.aU);
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ioo b(Boolean bool) {
        ioo ioo = new ioo((RxResolver) iop.a(this.Z.a.get(), 1));
        a(ioo);
        ioo.g = !bool.booleanValue();
        return ioo;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (jst.a(playerState.contextUri()).b != LinkType.COLLECTION_TRACKS || track == null) {
            this.aD.a((String) null);
        } else {
            this.aD.a(track.uri());
        }
    }

    public final void h() {
        super.h();
        this.aP.a();
    }

    public final void ax_() {
        FilterHeaderView filterHeaderView = this.aF;
        if (filterHeaderView != null) {
            FilterHeaderView.a(filterHeaderView);
        }
        super.ax_();
        this.aL.e();
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("filter", this.aq);
        this.aL.a(bundle);
    }

    public final void z() {
        super.z();
        an();
    }

    public final void A() {
        super.A();
        this.aF.a();
    }

    public final void B() {
        super.B();
        this.aA.a();
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final void a(fyt fyt) {
        if (jtc.b(p())) {
            imn imn = this.aD;
            if (imn != null && imn.b() > 0) {
                this.aG = ToolbarMenuHelper.a(fyt, (OnClickListener) new $$Lambda$ino$2F_NXdtLSUf_kcxXWSLdbUzc_bM(this));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a(null, "toolbar-menu", InteractionType.HIT, UserIntent.SHUFFLE_PLAY);
        al();
    }

    public final sih ae_() {
        return ViewUris.bj;
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

    /* access modifiers changed from: private */
    public void a(List<uzc> list) {
        imn imn = this.aD;
        imn.a = list;
        imn.e();
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
        this.ah.ap_();
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
    public void a(iov iov) {
        this.aK = iov.a();
        an();
        am();
    }

    private void an() {
        this.ah.a(this, p().getString(R.string.collection_tracks_page_title));
        this.ah.ap_();
    }

    public final String b(Context context) {
        return context.getString(R.string.collection_tracks_page_title);
    }

    public final udr ag() {
        return udt.A;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.COLLECTION_SONGS, null);
    }

    public final gjf aj() {
        return PageIdentifiers.COLLECTION_SONGS;
    }

    static /* synthetic */ void a(ino ino, int i, uzc uzc) {
        if (jsl.c(ino.aS)) {
            ino.b.a(uzc.getUri(), TrackData.TYPE_TRACK, i, InteractionType.HIT, UserIntent.PLAY);
            if (!uzc.isExplicit() || !ino.aT) {
                Builder builder = new Builder();
                PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, 0, null, uzc.getUri(), 0);
                ino.aa.a(builder.skipTo(playOptionsSkipTo).build(), ino.Y, Collections.emptyMap());
                return;
            }
            ino.T.a(uzc.getUri(), ino.ay.toString());
            return;
        }
        ino.b.a(uzc.getUri(), "inert-track", i, InteractionType.HIT, UserIntent.PLAY);
        View view = ino.aG;
        if (view instanceof ShufflePlayHeaderView) {
            ((ShufflePlayHeaderView) view).a();
        } else {
            ShufflePlayHeaderView.a(ino.aC, view);
        }
    }
}
