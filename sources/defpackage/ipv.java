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

/* renamed from: ipv reason: default package */
public class ipv extends jrd implements fzq, jqx, jrc, uqq {
    public static final String a = ViewUris.bf.toString();
    /* access modifiers changed from: private */
    public static final b<Object, String> af = b.b("albums_sort_order");
    /* access modifiers changed from: private */
    public static final b<Object, Boolean> ag = b.b("albums_hide_incomplete_albums");
    private static final List<SortOption> ah;
    private static final SortOption ai = new SortOption("artist.name", (int) R.string.sort_order_artist);
    private static final ListPolicy aj;
    public CollectionLogger T;
    public szp U;
    public sgb V;
    public jvf W;
    public jos X;
    public iqq Y;
    public iqh Z;
    private ViewLoadingTracker aA;
    private String aB;
    private final jor<vkt> aC = new jor<vkt>() {
        public final /* synthetic */ jpe onCreateContextMenu(Object obj) {
            vkt vkt = (vkt) obj;
            g a2 = ipv.this.X.a(vkt.getUri(), vkt.getName());
            ipv ipv = ipv.this;
            return a2.a(ViewUris.bf).a(true).b(true).c(true).a(uqo.t).a();
        }
    };
    private fqn aD;
    /* access modifiers changed from: private */
    public fyk<fyq> aE;
    private final OnClickListener aF = new OnClickListener() {
        public final void onClick(View view) {
            if (ipv.this.au.a) {
                ipv.this.au.a(ipv.this.p());
            }
            ipv.this.at.b();
        }
    };
    private final a aG = new a() {
        public final void a() {
        }

        public final void a(SortOption sortOption) {
            ipv.this.ao = sortOption;
            ipv.this.av.a().a(ipv.af, ipv.this.ao.a()).b();
            ipv.this.am();
        }

        public final void a(String str) {
            ipv.this.an = str;
            ipv.this.am();
            if (ipv.this.b.b()) {
                ipv.this.aE.h();
            }
        }
    };
    private final a aH = new a() {
        public final void a(vau vau) {
            ipv.this.av.a().a(ipv.ag, vau.a).b();
            ipv.this.T.a(null, "filter", InteractionType.HIT, vau.a ? UserIntent.ALBUMS_HIDE_INCOMPLETE : UserIntent.ALBUMS_SHOW_INCOMPLETE);
            ipv.this.am();
        }
    };
    private final a aI = new a() {
        public final void a(int i, vkt vkt) {
            ipv.this.T.a(vkt.getCollectionUri(), "album", i, InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
            String collectionUri = vkt.getCollectionUri();
            if (fbo.a(vkt.getCollectionUri())) {
                collectionUri = vkt.getUri();
            }
            ipv.this.p().startActivity(kpo.a(ipv.this.p(), collectionUri).a(vkt.getName()).a);
        }
    };
    public xil aa;
    public Flowable<PlayerState> ab;
    public lbr ac;
    public jyg ad;
    public jyx ae;
    private final xok ak = xon.a(new xip[0]);
    private final xog<Integer> al = xog.e();
    private final xog<Integer> am = xog.e();
    /* access modifiers changed from: private */
    public String an;
    /* access modifiers changed from: private */
    public SortOption ao;
    private RecyclerView ap;
    private View aq;
    private View ar;
    private fvd as;
    /* access modifiers changed from: private */
    public isz at;
    /* access modifiers changed from: private */
    public vau au;
    /* access modifiers changed from: private */
    public SpSharedPreferences<Object> av;
    private ioy aw;
    private vhx ax;
    private LoadingView ay;
    private boolean az;
    protected FilterHeaderView b;

    static {
        ArrayList arrayList = new ArrayList();
        ah = arrayList;
        String str = "name";
        arrayList.add(new SortOption(str, (int) R.string.sort_order_title));
        ah.add(ai);
        ah.add(new SortOption("addTime", (int) R.string.sort_order_recently_added));
        ah.add(new juz(new SortOption("recentlyPlayedRank", R.string.sort_order_recently_played, false)).a(new SortOption(str)).a);
        ListPolicy listPolicy = new ListPolicy();
        aj = listPolicy;
        String str2 = "collectionLink";
        String str3 = "isPremiumOnly";
        String str4 = "playable";
        String str5 = "available";
        String str6 = "offline";
        String str7 = "syncProgress";
        String str8 = "covers";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str2, Boolean.TRUE).b(str, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b());
        aj.setArtistAttributes(Collections.singletonMap(str, Boolean.TRUE));
        aj.setArtistsAttributes(Collections.singletonMap(str, Boolean.TRUE));
        aj.setAlbumAttributes(Collections.singletonMap(str, Boolean.TRUE));
        aj.setAddedByAttributes(Collections.emptyMap());
        aj.setShowAttributes(Collections.emptyMap());
    }

    public static ipv a(fqn fqn, boolean z, String str) {
        ipv ipv = new ipv();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", z);
        bundle.putString("username", str);
        ipv.g(bundle);
        fqo.a((Fragment) ipv, fqn);
        return ipv;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Integer num) {
        $$Lambda$ipv$hhmiLLkx5P5UJ6bnMJzUevZM6Lk r3 = new $$Lambda$ipv$hhmiLLkx5P5UJ6bnMJzUevZM6Lk(this);
        if (r3 != null) {
            return new iqg(r3).a(aj, (xii<Integer>) this.al);
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        ioy ioy = this.aw;
        ioy.d = playerState.contextUri();
        ioy.e();
    }

    /* access modifiers changed from: private */
    public void a(List<vkt> list) {
        ioy ioy = this.aw;
        ioy.a = list;
        ioy.e();
        boolean z = this.b.b() || this.at.c() || this.au.a;
        int size = list.size();
        boolean z2 = list.isEmpty() && z;
        this.ax.h(0);
        this.ay.b();
        if (this.at.c()) {
            this.aE.h();
        }
        if (size == 0 && !z2) {
            this.aq.setVisibility(8);
            this.ar.setVisibility(0);
            this.ax.a(false, 1);
        } else if (z2 && this.b.b()) {
            this.aq.setVisibility(8);
            this.ar.setVisibility(8);
            this.ax.a(true, 1);
            this.as.a((CharSequence) a((int) R.string.placeholder_no_result_title, this.an));
        } else if (z2) {
            this.aq.setVisibility(0);
            this.ar.setVisibility(8);
            this.ax.a(false, 1);
        } else {
            this.aq.setVisibility(8);
            this.ar.setVisibility(8);
            this.ax.a(false, 1);
            this.ax.h(0);
        }
        if (size == 0 || (!this.at.c() && !this.au.a)) {
            this.ax.a(false, 2);
        } else {
            this.ax.a(true, 2);
        }
        this.aA.b();
    }

    /* access modifiers changed from: private */
    /* renamed from: ak */
    public void am() {
        int i = 0;
        int hashCode = this.ao.mKey.hashCode() + (this.ao.b() ? 1 : 0) + (this.au.a ? 2 : 0) + (this.at.c() ? 4 : 0);
        if (!TextUtils.isEmpty(this.an)) {
            i = this.an.hashCode();
        }
        this.am.onNext(Integer.valueOf(hashCode + i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ iqp al() {
        iqp a2 = this.Y.a();
        a2.c = this.ao;
        boolean z = false;
        a2.a(false, this.at.c(), false);
        a2.b = this.an;
        String str = this.ao.mKey;
        if ("name".equals(str) || "artist.name".equals(str)) {
            z = true;
        }
        a2.i = z;
        return a2;
    }

    public final void A() {
        super.A();
        this.b.a();
    }

    public final void B() {
        super.B();
        this.at.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aD = fqo.a((Fragment) this);
        CollectionEntityListLayout collectionEntityListLayout = new CollectionEntityListLayout(n());
        this.aA = this.V.a(collectionEntityListLayout, ViewUris.bf.toString(), bundle, rmf.a(PageIdentifiers.COLLECTION_ALBUMS, null));
        this.b = FilterHeaderView.a(layoutInflater, this.an, ah, this.ao, this.at.d, this.aG);
        this.b.setBackgroundColor(fr.c(p(), R.color.bg_filter));
        this.b.a(ViewUris.bf, (gkq) PageIdentifiers.COLLECTION_ALBUMS);
        this.b.a((int) R.string.header_filter_albums_hint);
        this.aE = fyk.c(p()).b().a(null, 0).c((View) this.b).b(true).c(true).a((Fragment) this);
        this.ap = this.aE.f();
        collectionEntityListLayout.a(this.aE.b());
        kf p = p();
        this.ar = mhu.a(p, R.string.placeholder_collection_empty_title_albums, -1, mhu.a((Context) p, SpotifyIcon.ALBUM_32), this.U);
        this.ar.setVisibility(8);
        collectionEntityListLayout.addView(this.ar);
        this.aq = mhu.a((Context) p(), this.aF, (OnClickListener) null, 0);
        this.aq.setVisibility(8);
        collectionEntityListLayout.addView(this.aq);
        this.as = mhu.a((Context) p(), "");
        View inflate = layoutInflater.inflate(R.layout.collection_show_all, null);
        inflate.findViewById(R.id.button).setOnClickListener(this.aF);
        this.ax = new vhx();
        ioy ioy = new ioy(p(), this.aC, this.aI, this.al, ae_(), this.ae);
        this.aw = ioy;
        this.ax.a((RecyclerView.a<H>) this.aw, 0);
        this.ax.a((RecyclerView.a<H>) new jog<H>(this.as.getView(), false), 1);
        this.ax.a((RecyclerView.a<H>) new jog<H>(inflate, false), 2);
        this.ax.h(0);
        this.ax.a(false, 1, 2);
        this.ay = LoadingView.a(LayoutInflater.from(p()), p(), this.ap);
        collectionEntityListLayout.addView(this.ay);
        this.ap.setVisibility(4);
        this.ap.a((RecyclerView.a) this.ax);
        this.ay.a();
        return collectionEntityListLayout;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzv.a(this, menu);
    }

    public final void a(fzn fzn) {
    }

    public final void aP_() {
        super.aP_();
        this.ak.a(this.am.b().h(new $$Lambda$ipv$Gxa0TkKQcAOr2730BDTMbDG_YQw(this)).a(this.aa).a((xis<? super T>) new $$Lambda$ipv$Pp3QUWF3JKWvHgT5smfplGklPz0<Object>(this), (xis<Throwable>) $$Lambda$ipv$tcaADiQXdN_k6zsPmsrKq7HIw.INSTANCE));
        this.ak.a(wit.a((xfk<T>) this.ab).a(this.aa).a((xis<? super T>) new $$Lambda$ipv$1QjFZbTyGA0gGljj2wDwsjaGY4s<Object>(this), (xis<Throwable>) $$Lambda$ipv$ajRCfxtiX6dnDdPNlE_0N137CUA.INSTANCE));
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.bf;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.COLLECTION_ALBUMS, null);
    }

    public final uqm ag() {
        return uqo.u;
    }

    public final gkq aj() {
        return PageIdentifiers.COLLECTION_ALBUMS;
    }

    public final void aw_() {
        FilterHeaderView.a(this.b);
        this.aA.e();
        super.aw_();
    }

    public final String b(Context context) {
        return context.getString(R.string.collection_albums_page_title);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (this.i != null) {
            this.az = this.i.getBoolean("can_sync", false);
            this.aB = this.i.getString("username");
        }
        c(true);
        this.aD = fqo.a((Fragment) this);
        String str = "";
        this.an = str;
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            this.an = bundle.getString("filter");
        }
        this.av = this.ad.c(p());
        this.ao = SortOption.a(this.av, af, ai, ah);
        if (this.an == null) {
            this.an = str;
        }
        if (this.ao == null) {
            this.ao = ai;
        }
        isz isz = new isz(p(), this.T, this.az, this.av, isz.a, this.W);
        this.at = isz;
        this.au = new vau(this.aH, R.string.filter_hide_incomplete_albums);
        this.au.a = this.av.a(ag, false);
        if (((Boolean) this.aD.a(ipq.a)).booleanValue()) {
            this.at.a(this.au);
        }
        this.at.e = new $$Lambda$ipv$8S2otjZDg_O00PxnEwHKizDHiVg(this);
        am();
    }

    public final String e() {
        return "collection:albums";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("filter", this.an);
        this.aA.a(bundle);
    }

    public final void h() {
        super.h();
        this.ak.a();
    }

    public final void z() {
        super.z();
        this.ac.a(this, p().getString(R.string.collection_albums_page_title));
        this.ac.ao_();
    }
}
