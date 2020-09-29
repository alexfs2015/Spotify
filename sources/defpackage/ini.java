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

/* renamed from: ini reason: default package */
public class ini extends jor implements fyw, jol, joq, udv {
    public static final String a = ViewUris.bg.toString();
    /* access modifiers changed from: private */
    public static final b<Object, String> ae = b.b("albums_sort_order");
    /* access modifiers changed from: private */
    public static final b<Object, Boolean> af = b.b("albums_hide_incomplete_albums");
    private static final List<SortOption> ag;
    private static final SortOption ah = new SortOption("artist.name", (int) R.string.sort_order_artist);
    private static final ListPolicy ai;
    public CollectionLogger T;
    public spi U;
    public rwr V;
    public jsz W;
    public jmg X;
    public iod Y;
    public inu Z;
    private String aA;
    private final jmf<uyq> aB = new jmf<uyq>() {
        public final /* synthetic */ jms onCreateContextMenu(Object obj) {
            uyq uyq = (uyq) obj;
            g a2 = ini.this.X.a(uyq.getUri(), uyq.getName());
            ini ini = ini.this;
            return a2.a(ViewUris.bg).a(true).b(true).c(true).a(udt.t).a();
        }
    };
    private fpt aC;
    /* access modifiers changed from: private */
    public fxq<fxw> aD;
    private final OnClickListener aE = new OnClickListener() {
        public final void onClick(View view) {
            if (ini.this.at.a) {
                ini.this.at.a(ini.this.p());
            }
            ini.this.as.b();
        }
    };
    private final a aF = new a() {
        public final void a() {
        }

        public final void a(String str) {
            ini.this.am = str;
            ini.this.am();
            if (ini.this.b.b()) {
                ini.this.aD.h();
            }
        }

        public final void a(SortOption sortOption) {
            ini.this.an = sortOption;
            ini.this.au.a().a(ini.ae, ini.this.an.a()).b();
            ini.this.am();
        }
    };
    private final a aG = new a() {
        public final void a(upp upp) {
            ini.this.au.a().a(ini.af, upp.a).b();
            ini.this.T.a(null, "filter", InteractionType.HIT, upp.a ? UserIntent.ALBUMS_HIDE_INCOMPLETE : UserIntent.ALBUMS_SHOW_INCOMPLETE);
            ini.this.am();
        }
    };
    private final a aH = new a() {
        public final void a(int i, uyq uyq) {
            ini.this.T.a(uyq.getCollectionUri(), "album", i, InteractionType.HIT, UserIntent.NAVIGATE_FORWARD);
            String collectionUri = uyq.getCollectionUri();
            if (fax.a(uyq.getCollectionUri())) {
                collectionUri = uyq.getUri();
            }
            ini.this.p().startActivity(kmf.a(ini.this.p(), collectionUri).a(uyq.getName()).a);
        }
    };
    public wug aa;
    public Flowable<PlayerState> ab;
    public kyi ac;
    public jvy ad;
    private final xag aj = xaj.a(new wuk[0]);
    private final xac<Integer> ak = xac.e();
    private final xac<Integer> al = xac.e();
    /* access modifiers changed from: private */
    public String am;
    /* access modifiers changed from: private */
    public SortOption an;
    private RecyclerView ao;
    private View ap;
    private View aq;
    private fuj ar;
    /* access modifiers changed from: private */
    public iqm as;
    /* access modifiers changed from: private */
    public upp at;
    /* access modifiers changed from: private */
    public SpSharedPreferences<Object> au;
    private iml av;
    private uwh aw;
    private LoadingView ax;
    private boolean ay;
    private ViewLoadingTracker az;
    protected FilterHeaderView b;

    public final void a(fyt fyt) {
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "collection:albums";
    }

    static {
        ArrayList arrayList = new ArrayList();
        ag = arrayList;
        String str = "name";
        arrayList.add(new SortOption(str, (int) R.string.sort_order_title));
        ag.add(ah);
        ag.add(new SortOption("addTime", (int) R.string.sort_order_recently_added));
        ag.add(new jss(new SortOption("recentlyPlayedRank", R.string.sort_order_recently_played, false)).a(new SortOption(str)).a);
        ListPolicy listPolicy = new ListPolicy();
        ai = listPolicy;
        String str2 = "collectionLink";
        String str3 = "isPremiumOnly";
        String str4 = "playable";
        String str5 = "available";
        String str6 = "offline";
        String str7 = "syncProgress";
        String str8 = "covers";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str2, Boolean.TRUE).b(str, Boolean.TRUE).b(str3, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b());
        ai.setArtistAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ai.setArtistsAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ai.setAlbumAttributes(Collections.singletonMap(str, Boolean.TRUE));
        ai.setAddedByAttributes(Collections.emptyMap());
        ai.setShowAttributes(Collections.emptyMap());
    }

    public static ini a(fpt fpt, boolean z, String str) {
        ini ini = new ini();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", z);
        bundle.putString("username", str);
        ini.g(bundle);
        fpu.a((Fragment) ini, fpt);
        return ini;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (this.i != null) {
            this.ay = this.i.getBoolean("can_sync", false);
            this.aA = this.i.getString("username");
        }
        c(true);
        this.aC = fpu.a((Fragment) this);
        String str = "";
        this.am = str;
        if (bundle != null) {
            bundle.setClassLoader(p().getClassLoader());
            this.am = bundle.getString("filter");
        }
        this.au = this.ad.c(p());
        this.an = SortOption.a(this.au, ae, ah, ag);
        if (this.am == null) {
            this.am = str;
        }
        if (this.an == null) {
            this.an = ah;
        }
        iqm iqm = new iqm(p(), this.T, this.ay, this.au, iqm.a, this.W);
        this.as = iqm;
        this.at = new upp(this.aG, R.string.filter_hide_incomplete_albums);
        this.at.a = this.au.a(af, false);
        if (((Boolean) this.aC.a(ind.a)).booleanValue()) {
            this.as.a(this.at);
        }
        this.as.e = new $$Lambda$ini$dw6_wZFKPlD9_ecWZA63jQ0Ae10(this);
        am();
    }

    /* access modifiers changed from: private */
    /* renamed from: ak */
    public void am() {
        int i = 0;
        int hashCode = this.an.mKey.hashCode() + (this.an.b() ? 1 : 0) + (this.at.a ? 2 : 0) + (this.as.c() ? 4 : 0);
        if (!TextUtils.isEmpty(this.am)) {
            i = this.am.hashCode();
        }
        this.al.onNext(Integer.valueOf(hashCode + i));
    }

    public final void g() {
        super.g();
        this.aj.a(this.al.b().i(new $$Lambda$ini$cxdjMOUWt3Xdeo1lGZ_viajIQok(this)).a(this.aa).a((wun<? super T>) new $$Lambda$ini$W2glsAcxAMqGf3Ggg_tzL6hNPyA<Object>(this), (wun<Throwable>) $$Lambda$ini$u72aJ6qgLJpcDHndjUXRrG3rsnM.INSTANCE));
        this.aj.a(vun.a((wrf<T>) this.ab).a(this.aa).a((wun<? super T>) new $$Lambda$ini$NLDmbzD2zJZ7DQsJBnTFwRjxb8g<Object>(this), (wun<Throwable>) $$Lambda$ini$hDL1Hc7l1sweVTpLoKvw3AmDcRc.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Integer num) {
        $$Lambda$ini$MEbgvd_92xHCdiGwruYHSKunxpQ r3 = new $$Lambda$ini$MEbgvd_92xHCdiGwruYHSKunxpQ(this);
        if (r3 != null) {
            return new Cint(r3).a(ai, (wud<Integer>) this.ak);
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ioc al() {
        ioc a2 = this.Y.a();
        a2.c = this.an;
        boolean z = false;
        a2.a(false, this.as.c(), false);
        a2.b = this.am;
        String str = this.an.mKey;
        if ("name".equals(str) || "artist.name".equals(str)) {
            z = true;
        }
        a2.i = z;
        return a2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        iml iml = this.av;
        iml.d = playerState.contextUri();
        iml.e();
    }

    public final void h() {
        super.h();
        this.aj.a();
    }

    /* access modifiers changed from: private */
    public void a(List<uyq> list) {
        iml iml = this.av;
        iml.a = list;
        iml.e();
        boolean z = this.b.b() || this.as.c() || this.at.a;
        int size = list.size();
        boolean z2 = list.isEmpty() && z;
        this.aw.h(0);
        this.ax.b();
        if (this.as.c()) {
            this.aD.h();
        }
        if (size == 0 && !z2) {
            this.ap.setVisibility(8);
            this.aq.setVisibility(0);
            this.aw.a(false, 1);
        } else if (z2 && this.b.b()) {
            this.ap.setVisibility(8);
            this.aq.setVisibility(8);
            this.aw.a(true, 1);
            this.ar.a((CharSequence) a((int) R.string.placeholder_no_result_title, this.am));
        } else if (z2) {
            this.ap.setVisibility(0);
            this.aq.setVisibility(8);
            this.aw.a(false, 1);
        } else {
            this.ap.setVisibility(8);
            this.aq.setVisibility(8);
            this.aw.a(false, 1);
            this.aw.h(0);
        }
        if (size == 0 || (!this.as.c() && !this.at.a)) {
            this.aw.a(false, 2);
        } else {
            this.aw.a(true, 2);
        }
        this.az.b();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aC = fpu.a((Fragment) this);
        CollectionEntityListLayout collectionEntityListLayout = new CollectionEntityListLayout(n());
        this.az = this.V.a(collectionEntityListLayout, ViewUris.bg.toString(), bundle, rdh.a(PageIdentifiers.COLLECTION_ALBUMS, null));
        this.b = FilterHeaderView.a(layoutInflater, this.am, ag, this.an, this.as.d, this.aF);
        this.b.setBackgroundColor(fr.c(p(), R.color.bg_filter));
        this.b.a(ViewUris.bg, (gjf) PageIdentifiers.COLLECTION_ALBUMS);
        this.b.a((int) R.string.header_filter_albums_hint);
        this.aD = fxq.c(p()).b().a(null, 0).c((View) this.b).b(true).c(true).a((Fragment) this);
        this.ao = this.aD.f();
        collectionEntityListLayout.a(this.aD.b());
        ka p = p();
        this.aq = mdr.a(p, R.string.placeholder_collection_empty_title_albums, -1, mdr.a((Context) p, SpotifyIcon.ALBUM_32), this.U);
        this.aq.setVisibility(8);
        collectionEntityListLayout.addView(this.aq);
        this.ap = mdr.a((Context) p(), this.aE, (OnClickListener) null, 0);
        this.ap.setVisibility(8);
        collectionEntityListLayout.addView(this.ap);
        this.ar = mdr.a((Context) p(), "");
        View inflate = layoutInflater.inflate(R.layout.collection_show_all, null);
        inflate.findViewById(R.id.button).setOnClickListener(this.aE);
        this.aw = new uwh();
        iml iml = new iml(p(), this.aB, this.aH, this.ak, ae_());
        this.av = iml;
        this.aw.a((RecyclerView.a<H>) this.av, 0);
        this.aw.a((RecyclerView.a<H>) new jlu<H>(this.ar.getView(), false), 1);
        this.aw.a((RecyclerView.a<H>) new jlu<H>(inflate, false), 2);
        this.aw.h(0);
        this.aw.a(false, 1, 2);
        this.ax = LoadingView.a(LayoutInflater.from(p()), p(), this.ao);
        collectionEntityListLayout.addView(this.ax);
        this.ao.setVisibility(4);
        this.ao.a((RecyclerView.a) this.aw);
        this.ax.a();
        return collectionEntityListLayout;
    }

    public final void ax_() {
        FilterHeaderView.a(this.b);
        this.az.e();
        super.ax_();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("filter", this.am);
        this.az.a(bundle);
    }

    public final void z() {
        super.z();
        this.ac.a(this, p().getString(R.string.collection_albums_page_title));
        this.ac.ap_();
    }

    public final void A() {
        super.A();
        this.b.a();
    }

    public final void B() {
        super.B();
        this.as.a();
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        fzb.a(this, menu);
    }

    public final sih ae_() {
        return ViewUris.bg;
    }

    public final String b(Context context) {
        return context.getString(R.string.collection_albums_page_title);
    }

    public final udr ag() {
        return udt.u;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.COLLECTION_ALBUMS, null);
    }

    public final gjf aj() {
        return PageIdentifiers.COLLECTION_ALBUMS;
    }
}
