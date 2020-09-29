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
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger;
import com.spotify.mobile.android.spotlets.collection.logging.CollectionLogger.UserIntent;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.mobile.android.util.view.CollectionEntityListLayout;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.util.filterheader.FilterHeaderView;
import com.spotify.music.util.filterheader.FilterHeaderView.a;
import io.reactivex.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: inl reason: default package */
public class inl extends jor implements fyw, jol, joq, udv {
    public static final String a = ViewUris.bf.toString();
    /* access modifiers changed from: private */
    public static final b<Object, String> ad = b.b("artists_sort_order");
    private static final List<SortOption> ae;
    private static final SortOption af;
    private static final ListPolicy ax;
    public spi T;
    public rwr U;
    public jsz V;
    public jmq W;
    public ioj X;
    public inw Y;
    public wug Z;
    private final xac<Integer> aA = xac.e();
    private final jmf<uyr> aB = new jmf<uyr>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            uyr uyr = (uyr) obj;
            return inl.this.W.a(uyr.getUri(), uyr.getName()).a(inl.this.an).a(true).c(true).d(false).a(udt.w).a();
        }
    };
    private final OnClickListener aC = new OnClickListener() {
        public final void onClick(View view) {
            inl.this.am.b();
        }
    };
    private final a aD = new a() {
        public final void a() {
        }

        public final void a(String str) {
            inl.this.ag = str;
            inl.this.al();
            if (inl.this.ar.b()) {
                inl.this.aw.h();
            }
        }

        public final void a(SortOption sortOption) {
            inl.this.ah = sortOption;
            inl.this.ao.a().a(inl.ad, inl.this.ah.a()).b();
            inl.this.al();
        }
    };
    private final a aE = new a() {
        public final void a(int i, uyr uyr) {
            String collectionUri = uyr.getCollectionUri();
            if (uyr.getNumTracksInCollection() == 0 || fax.a(uyr.getCollectionUri())) {
                collectionUri = uyr.getUri();
            }
            String str = collectionUri;
            inl.this.b.a(str, "artist", i, InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
            inl inl = inl.this;
            inl.a(kmf.a(inl.p(), collectionUri).a(uyr.getName()).a);
        }
    };
    public Flowable<PlayerState> aa;
    public kyi ab;
    public jvy ac;
    /* access modifiers changed from: private */
    public String ag;
    /* access modifiers changed from: private */
    public SortOption ah;
    private RecyclerView ai;
    private View aj;
    private View ak;
    private fuj al;
    /* access modifiers changed from: private */
    public iqm am;
    /* access modifiers changed from: private */
    public sih an;
    /* access modifiers changed from: private */
    public SpSharedPreferences<Object> ao;
    private imm ap;
    private uwh aq;
    /* access modifiers changed from: private */
    public FilterHeaderView ar;
    private LoadingView as;
    private ViewLoadingTracker at;
    private boolean au;
    private String av;
    /* access modifiers changed from: private */
    public fxq<fxw> aw;
    private final xag ay = xaj.a(new wuk[0]);
    private final xac<Integer> az = xac.e();
    public CollectionLogger b;

    public final void a(fyt fyt) {
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "collection:artists";
    }

    static {
        String str = "name";
        af = new SortOption(str, (int) R.string.sort_order_name);
        ArrayList arrayList = new ArrayList();
        ae = arrayList;
        arrayList.add(af);
        ae.add(new SortOption("addTime", (int) R.string.sort_order_recently_added));
        ae.add(new jss(new SortOption("recentlyPlayedRank", R.string.sort_order_recently_played, false)).a(new SortOption(str)).a);
        ListPolicy listPolicy = new ListPolicy();
        ax = listPolicy;
        String str2 = "collectionLink";
        String str3 = "isPremiumOnly";
        String str4 = "playable";
        String str5 = "available";
        String str6 = "offline";
        String str7 = "syncProgress";
        String str8 = "portraits";
        String str9 = "numTracksInCollection";
        String str10 = "isFollowed";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str2, Boolean.TRUE).b(str, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b(str9, Boolean.TRUE).b(str10, Boolean.TRUE).b());
        ax.setArtistAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ax.setArtistsAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ax.setAlbumAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ax.setAddedByAttributes(Collections.emptyMap());
        ax.setShowAttributes(Collections.emptyMap());
    }

    public static inl a(fpt fpt, String str, boolean z) {
        inl inl = new inl();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", z);
        bundle.putString("username", str);
        inl.g(bundle);
        fpu.a((Fragment) inl, fpt);
        return inl;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.an = ViewUris.bf;
        if (this.i != null) {
            this.au = this.i.getBoolean("can_sync", false);
            this.av = this.i.getString("username");
        }
        c(true);
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            this.ag = bundle.getString("filter");
        }
        this.ao = this.ac.c(p());
        this.ah = SortOption.a(this.ao, ad, af, ae);
        if (this.ag == null) {
            this.ag = "";
        }
        if (this.ah == null) {
            this.ah = af;
        }
        iqm iqm = new iqm(p(), this.b, this.au, this.ao, iqm.b, this.V);
        this.am = iqm;
        this.am.e = new $$Lambda$inl$a8c6FL2MaSvjzwtWooRK0Fgum4(this);
        al();
    }

    /* access modifiers changed from: private */
    /* renamed from: ai */
    public void al() {
        int i = 0;
        int hashCode = this.ah.mKey.hashCode() + (this.ah.b() ? 1 : 0) + (this.am.c() ? 4 : 0);
        if (!TextUtils.isEmpty(this.ag)) {
            i = this.ag.hashCode();
        }
        this.aA.onNext(Integer.valueOf(hashCode + i));
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CollectionEntityListLayout collectionEntityListLayout = new CollectionEntityListLayout(n());
        this.at = this.U.a(collectionEntityListLayout, this.an.toString(), bundle, rdh.a(PageIdentifiers.COLLECTION_ARTISTS, null));
        this.ar = FilterHeaderView.a(layoutInflater, this.ag, ae, this.ah, this.am.d, this.aD);
        this.ar.setBackgroundColor(fr.c(p(), R.color.bg_filter));
        this.ar.a(this.an, (gjf) PageIdentifiers.COLLECTION_ARTISTS);
        this.ar.a((int) R.string.header_filter_artists_hint);
        this.ap = new imm(p(), this.aB, this.aE, this.az);
        this.aw = fxq.c(p()).b().a(null, 0).c((View) this.ar).b(true).c(true).a(false).a((Fragment) this);
        this.ai = this.aw.f();
        collectionEntityListLayout.a(this.aw.b());
        ka p = p();
        this.ak = mdr.a(p, R.string.placeholder_collection_empty_title_artists, -1, mdr.a((Context) p, SpotifyIcon.ARTIST_32), this.T);
        this.ak.setVisibility(8);
        collectionEntityListLayout.addView(this.ak);
        this.aj = mdr.a((Context) p(), this.aC, (OnClickListener) null, 0);
        this.aj.setVisibility(8);
        collectionEntityListLayout.addView(this.aj);
        this.al = mdr.a((Context) p(), "");
        View inflate = layoutInflater.inflate(R.layout.collection_show_all, null);
        inflate.findViewById(R.id.button).setOnClickListener(this.aC);
        this.aq = new uwh();
        this.aq.a((RecyclerView.a<H>) this.ap, 0);
        this.aq.a((RecyclerView.a<H>) new jlu<H>(this.al.getView(), false), 1);
        this.aq.a((RecyclerView.a<H>) new jlu<H>(inflate, false), 2);
        this.aq.h(0);
        this.aq.a(false, 1, 2);
        this.as = LoadingView.a(LayoutInflater.from(p()), p(), this.ai);
        collectionEntityListLayout.addView(this.as);
        this.ai.a((RecyclerView.a) this.aq);
        return collectionEntityListLayout;
    }

    public final void ax_() {
        FilterHeaderView.a(this.ar);
        super.ax_();
        this.at.e();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("filter", this.ag);
        this.at.a(bundle);
    }

    public final void z() {
        super.z();
        this.ab.a(this, p().getString(R.string.collection_artists_page_title));
        this.ab.ap_();
    }

    public final void A() {
        super.A();
        this.ar.a();
    }

    public final void g() {
        super.g();
        this.ai.setVisibility(4);
        this.as.a();
        this.ay.a(this.aA.b().i(new $$Lambda$inl$5QUr7AbClldwSduwE2PIFKvwFPc(this)).a(this.Z).a((wun<? super T>) new $$Lambda$inl$4dJPdQm5WN56jRc171bMsbLDHtc<Object>(this), (wun<Throwable>) $$Lambda$inl$os5phDzyJPHhh6t_Y9pfeq3mf0.INSTANCE));
        this.ay.a(vun.a((wrf<T>) this.aa).a(this.Z).a((wun<? super T>) new $$Lambda$inl$5DMpWA0orwzrzg_cPCVFnYGudA<Object>(this), (wun<Throwable>) $$Lambda$inl$Apnih4RBzTHd7etnQEQY9VI01Q.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Integer num) {
        $$Lambda$inl$xjK8sXwEux3XxapHI0cCYL0YS9c r3 = new $$Lambda$inl$xjK8sXwEux3XxapHI0cCYL0YS9c(this);
        if (r3 != null) {
            return new inv(r3).a(ax, (wud<Integer>) this.az);
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ioi ak() {
        ioi a2 = this.X.a();
        a2.c = this.ah;
        a2.a(false, this.am.c(), false);
        a2.b = this.ag;
        a2.i = "name".equals(this.ah.mKey);
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        imm imm = this.ap;
        imm.d = playerState.contextUri();
        imm.e();
    }

    public final void h() {
        super.h();
        this.ay.a();
        this.as.c();
    }

    public final void B() {
        super.B();
        this.am.a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r0 != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<defpackage.uyr> r7) {
        /*
            r6 = this;
            imm r0 = r6.ap
            r0.a = r7
            r0.e()
            boolean r7 = r7.isEmpty()
            uwh r0 = r6.aq
            r1 = 0
            r0.h(r1)
            com.spotify.music.contentviewstate.view.LoadingView r0 = r6.as
            r0.b()
            r0 = 1
            if (r7 == 0) goto L_0x003d
            com.spotify.music.util.filterheader.FilterHeaderView r2 = r6.ar
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x003d
            fuj r2 = r6.al
            r3 = 2131953210(0x7f13063a, float:1.9542885E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r5 = r6.ag
            r4[r1] = r5
            java.lang.String r3 = r6.a(r3, r4)
            r2.a(r3)
            uwh r2 = r6.aq
            int[] r3 = new int[r0]
            r3[r1] = r0
            r2.a(r0, r3)
            goto L_0x0046
        L_0x003d:
            uwh r2 = r6.aq
            int[] r3 = new int[r0]
            r3[r1] = r0
            r2.a(r1, r3)
        L_0x0046:
            r2 = 2
            if (r7 != 0) goto L_0x005b
            iqm r7 = r6.am
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x005b
            uwh r7 = r6.aq
            int[] r3 = new int[r0]
            r3[r1] = r2
            r7.a(r0, r3)
            goto L_0x0064
        L_0x005b:
            uwh r7 = r6.aq
            int[] r3 = new int[r0]
            r3[r1] = r2
            r7.a(r1, r3)
        L_0x0064:
            iqm r7 = r6.am
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x0071
            fxq<fxw> r7 = r6.aw
            r7.h()
        L_0x0071:
            iqm r7 = r6.am
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x007e
            fxq<fxw> r7 = r6.aw
            r7.h()
        L_0x007e:
            imm r7 = r6.ap
            int r7 = r7.b()
            if (r7 != 0) goto L_0x008f
            com.spotify.music.util.filterheader.FilterHeaderView r7 = r6.ar
            boolean r7 = r7.b()
            if (r7 != 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            iqm r7 = r6.am
            boolean r7 = r7.c()
            r2 = 8
            if (r7 == 0) goto L_0x00a4
            if (r0 == 0) goto L_0x00a4
            android.view.View r7 = r6.aj
            r7.setVisibility(r1)
            android.view.View r7 = r6.ak
            goto L_0x00ae
        L_0x00a4:
            android.view.View r7 = r6.aj
            r7.setVisibility(r2)
            android.view.View r7 = r6.ak
            if (r0 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r1 = 8
        L_0x00b0:
            r7.setVisibility(r1)
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker r7 = r6.at
            r7.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.inl.a(java.util.List):void");
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final String b(Context context) {
        return context.getString(R.string.collection_artists_page_title);
    }

    public final udr ag() {
        return udt.w;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.COLLECTION_ARTISTS, null);
    }

    public final gjf aj() {
        return PageIdentifiers.COLLECTION_ARTISTS;
    }

    public final sih ae_() {
        return ViewUris.bf;
    }
}
