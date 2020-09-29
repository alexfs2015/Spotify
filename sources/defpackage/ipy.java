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

/* renamed from: ipy reason: default package */
public class ipy extends jrd implements fzq, jqx, jrc, uqq {
    public static final String a = ViewUris.be.toString();
    /* access modifiers changed from: private */
    public static final b<Object, String> ae = b.b("artists_sort_order");
    private static final List<SortOption> af;
    private static final SortOption ag;
    private static final ListPolicy ay;
    public szp T;
    public sgb U;
    public jvf V;
    public jpc W;
    public iqw X;
    public iqj Y;
    public xil Z;
    private final xog<Integer> aA = xog.e();
    private final xog<Integer> aB = xog.e();
    private final jor<vku> aC = new jor<vku>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            vku vku = (vku) obj;
            return ipy.this.W.a(vku.getUri(), vku.getName()).a(ipy.this.ao).a(true).c(true).d(false).a(uqo.w).a();
        }
    };
    private final OnClickListener aD = new OnClickListener() {
        public final void onClick(View view) {
            ipy.this.an.b();
        }
    };
    private final a aE = new a() {
        public final void a() {
        }

        public final void a(SortOption sortOption) {
            ipy.this.ai = sortOption;
            ipy.this.ap.a().a(ipy.ae, ipy.this.ai.a()).b();
            ipy.this.al();
        }

        public final void a(String str) {
            ipy.this.ah = str;
            ipy.this.al();
            if (ipy.this.as.b()) {
                ipy.this.ax.h();
            }
        }
    };
    private final a aF = new a() {
        public final void a(int i, vku vku) {
            String collectionUri = vku.getCollectionUri();
            if (vku.getNumTracksInCollection() == 0 || fbo.a(vku.getCollectionUri())) {
                collectionUri = vku.getUri();
            }
            String str = collectionUri;
            ipy.this.b.a(str, "artist", i, InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
            ipy ipy = ipy.this;
            ipy.a(kpo.a(ipy.p(), collectionUri).a(vku.getName()).a);
        }
    };
    public Flowable<PlayerState> aa;
    public lbr ab;
    public jyg ac;
    public jyx ad;
    /* access modifiers changed from: private */
    public String ah;
    /* access modifiers changed from: private */
    public SortOption ai;
    private RecyclerView aj;
    private View ak;
    private View al;
    private fvd am;
    /* access modifiers changed from: private */
    public isz an;
    /* access modifiers changed from: private */
    public sso ao;
    /* access modifiers changed from: private */
    public SpSharedPreferences<Object> ap;
    private ioz aq;
    private vhx ar;
    /* access modifiers changed from: private */
    public FilterHeaderView as;
    private LoadingView at;
    private ViewLoadingTracker au;
    private boolean av;
    private String aw;
    /* access modifiers changed from: private */
    public fyk<fyq> ax;
    private final xok az = xon.a(new xip[0]);
    public CollectionLogger b;

    static {
        String str = "name";
        ag = new SortOption(str, (int) R.string.sort_order_name);
        ArrayList arrayList = new ArrayList();
        af = arrayList;
        arrayList.add(ag);
        af.add(new SortOption("addTime", (int) R.string.sort_order_recently_added));
        af.add(new juz(new SortOption("recentlyPlayedRank", R.string.sort_order_recently_played, false)).a(new SortOption(str)).a);
        ListPolicy listPolicy = new ListPolicy();
        ay = listPolicy;
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
        ay.setArtistAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ay.setArtistsAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ay.setAlbumAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ay.setAddedByAttributes(Collections.emptyMap());
        ay.setShowAttributes(Collections.emptyMap());
    }

    public static ipy a(fqn fqn, String str, boolean z) {
        ipy ipy = new ipy();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", z);
        bundle.putString("username", str);
        ipy.g(bundle);
        fqo.a((Fragment) ipy, fqn);
        return ipy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Integer num) {
        $$Lambda$ipy$_YdFUGJsGKP5kHyJ6WNIlclCcD0 r3 = new $$Lambda$ipy$_YdFUGJsGKP5kHyJ6WNIlclCcD0(this);
        if (r3 != null) {
            return new iqi(r3).a(ay, (xii<Integer>) this.aA);
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        ioz ioz = this.aq;
        ioz.d = playerState.contextUri();
        ioz.e();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r0 != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<defpackage.vku> r7) {
        /*
            r6 = this;
            ioz r0 = r6.aq
            r0.a = r7
            r0.e()
            boolean r7 = r7.isEmpty()
            vhx r0 = r6.ar
            r1 = 0
            r0.h(r1)
            com.spotify.music.contentviewstate.view.LoadingView r0 = r6.at
            r0.b()
            r0 = 1
            if (r7 == 0) goto L_0x003d
            com.spotify.music.util.filterheader.FilterHeaderView r2 = r6.as
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x003d
            fvd r2 = r6.am
            r3 = 2131953204(0x7f130634, float:1.9542872E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.String r5 = r6.ah
            r4[r1] = r5
            java.lang.String r3 = r6.a(r3, r4)
            r2.a(r3)
            vhx r2 = r6.ar
            int[] r3 = new int[r0]
            r3[r1] = r0
            r2.a(r0, r3)
            goto L_0x0046
        L_0x003d:
            vhx r2 = r6.ar
            int[] r3 = new int[r0]
            r3[r1] = r0
            r2.a(r1, r3)
        L_0x0046:
            r2 = 2
            if (r7 != 0) goto L_0x005b
            isz r7 = r6.an
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x005b
            vhx r7 = r6.ar
            int[] r3 = new int[r0]
            r3[r1] = r2
            r7.a(r0, r3)
            goto L_0x0064
        L_0x005b:
            vhx r7 = r6.ar
            int[] r3 = new int[r0]
            r3[r1] = r2
            r7.a(r1, r3)
        L_0x0064:
            isz r7 = r6.an
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x0071
            fyk<fyq> r7 = r6.ax
            r7.h()
        L_0x0071:
            isz r7 = r6.an
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x007e
            fyk<fyq> r7 = r6.ax
            r7.h()
        L_0x007e:
            ioz r7 = r6.aq
            int r7 = r7.b()
            if (r7 != 0) goto L_0x008f
            com.spotify.music.util.filterheader.FilterHeaderView r7 = r6.as
            boolean r7 = r7.b()
            if (r7 != 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            isz r7 = r6.an
            boolean r7 = r7.c()
            r2 = 8
            if (r7 == 0) goto L_0x00a4
            if (r0 == 0) goto L_0x00a4
            android.view.View r7 = r6.ak
            r7.setVisibility(r1)
            android.view.View r7 = r6.al
            goto L_0x00ae
        L_0x00a4:
            android.view.View r7 = r6.ak
            r7.setVisibility(r2)
            android.view.View r7 = r6.al
            if (r0 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r1 = 8
        L_0x00b0:
            r7.setVisibility(r1)
            com.spotify.libs.instrumentation.performance.ViewLoadingTracker r7 = r6.au
            r7.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipy.a(java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: ai */
    public void al() {
        int i = 0;
        int hashCode = this.ai.mKey.hashCode() + (this.ai.b() ? 1 : 0) + (this.an.c() ? 4 : 0);
        if (!TextUtils.isEmpty(this.ah)) {
            i = this.ah.hashCode();
        }
        this.aB.onNext(Integer.valueOf(hashCode + i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ iqv ak() {
        iqv a2 = this.X.a();
        a2.c = this.ai;
        a2.a(false, this.an.c(), false);
        a2.b = this.ah;
        a2.i = "name".equals(this.ai.mKey);
        return a2;
    }

    public final void A() {
        super.A();
        this.as.a();
    }

    public final void B() {
        super.B();
        this.an.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CollectionEntityListLayout collectionEntityListLayout = new CollectionEntityListLayout(n());
        this.au = this.U.a(collectionEntityListLayout, this.ao.toString(), bundle, rmf.a(PageIdentifiers.COLLECTION_ARTISTS, null));
        this.as = FilterHeaderView.a(layoutInflater, this.ah, af, this.ai, this.an.d, this.aE);
        this.as.setBackgroundColor(fr.c(p(), R.color.bg_filter));
        this.as.a(this.ao, (gkq) PageIdentifiers.COLLECTION_ARTISTS);
        this.as.a((int) R.string.header_filter_artists_hint);
        this.aq = new ioz(this.aC, this.aF, this.aA, this.ad);
        this.ax = fyk.c(p()).b().a(null, 0).c((View) this.as).b(true).c(true).a(false).a((Fragment) this);
        this.aj = this.ax.f();
        collectionEntityListLayout.a(this.ax.b());
        kf p = p();
        this.al = mhu.a(p, R.string.placeholder_collection_empty_title_artists, -1, mhu.a((Context) p, SpotifyIcon.ARTIST_32), this.T);
        this.al.setVisibility(8);
        collectionEntityListLayout.addView(this.al);
        this.ak = mhu.a((Context) p(), this.aD, (OnClickListener) null, 0);
        this.ak.setVisibility(8);
        collectionEntityListLayout.addView(this.ak);
        this.am = mhu.a((Context) p(), "");
        View inflate = layoutInflater.inflate(R.layout.collection_show_all, null);
        inflate.findViewById(R.id.button).setOnClickListener(this.aD);
        this.ar = new vhx();
        this.ar.a((RecyclerView.a<H>) this.aq, 0);
        this.ar.a((RecyclerView.a<H>) new jog<H>(this.am.getView(), false), 1);
        this.ar.a((RecyclerView.a<H>) new jog<H>(inflate, false), 2);
        this.ar.h(0);
        this.ar.a(false, 1, 2);
        this.at = LoadingView.a(LayoutInflater.from(p()), p(), this.aj);
        collectionEntityListLayout.addView(this.at);
        this.aj.a((RecyclerView.a) this.ar);
        return collectionEntityListLayout;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
    }

    public final void aP_() {
        super.aP_();
        this.aj.setVisibility(4);
        this.at.a();
        this.az.a(this.aB.b().h(new $$Lambda$ipy$qi77eGpv1O4WNjLZFnkhVUDqh2c(this)).a(this.Z).a((xis<? super T>) new $$Lambda$ipy$kkRVQYwsE0m5Nj8pMpCyo8JpdM8<Object>(this), (xis<Throwable>) $$Lambda$ipy$n8iD4GzmGZMdJhFr8YSmac3Cqx8.INSTANCE));
        this.az.a(wit.a((xfk<T>) this.aa).a(this.Z).a((xis<? super T>) new $$Lambda$ipy$fCbRs92p1mSh9BFdISvzua4LPdY<Object>(this), (xis<Throwable>) $$Lambda$ipy$84K2Gn0GfJHtvtAaWMWSijafHNs.INSTANCE));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.be;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.COLLECTION_ARTISTS, null);
    }

    public final uqm ag() {
        return uqo.w;
    }

    public final gkq aj() {
        return PageIdentifiers.COLLECTION_ARTISTS;
    }

    public final void aw_() {
        FilterHeaderView.a(this.as);
        super.aw_();
        this.au.e();
    }

    public final String b(Context context) {
        return context.getString(R.string.collection_artists_page_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ao = ViewUris.be;
        if (this.i != null) {
            this.av = this.i.getBoolean("can_sync", false);
            this.aw = this.i.getString("username");
        }
        c(true);
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            this.ah = bundle.getString("filter");
        }
        this.ap = this.ac.c(p());
        this.ai = SortOption.a(this.ap, ae, ag, af);
        if (this.ah == null) {
            this.ah = "";
        }
        if (this.ai == null) {
            this.ai = ag;
        }
        isz isz = new isz(p(), this.b, this.av, this.ap, isz.b, this.V);
        this.an = isz;
        this.an.e = new $$Lambda$ipy$tGiGXoSlvzoJBqi32fA0gkfPoHY(this);
        al();
    }

    public final String e() {
        return "collection:artists";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("filter", this.ah);
        this.au.a(bundle);
    }

    public final void h() {
        super.h();
        this.az.a();
        this.at.c();
    }

    public final void z() {
        super.z();
        this.ab.a(this, p().getString(R.string.collection_artists_page_title));
        this.ab.ao_();
    }
}
