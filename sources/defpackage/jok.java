package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.feature.FeatureService.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.features.navigation.BottomNavigationView;
import com.spotify.music.features.navigation.BottomTab;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;
import com.spotify.music.spotlets.voice.VoiceInteractionReferral;
import io.reactivex.android.schedulers.AndroidSchedulers;

/* renamed from: jok reason: default package */
public class jok extends jor implements c, nup {
    public shs T;
    public uqi U;
    public hed V;
    public nuq W;
    public ukj X;
    public kyi Y;
    public int Z;
    public rgz a;
    public int aa;
    public boolean ab;
    private String ac;
    private fpt ad;
    /* access modifiers changed from: private */
    public Fragment ae;
    private wuk af;
    /* access modifiers changed from: private */
    public nus ag;
    private final kyh ah = new kyh() {
        public final void onCurrentFragmentChanged(Fragment fragment, String str) {
            jok.this.ae = fragment;
            BottomTab a2 = jok.a(fragment);
            if (a2 != BottomTab.UNKNOWN) {
                jok.this.ag.b(a2);
            }
        }
    };
    public twu b;

    public static jok a(fpt fpt) {
        jok jok = new jok();
        fpu.a((Fragment) jok, fpt);
        return jok;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ad = fpu.a((Fragment) this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ad = fpu.a((Fragment) this);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) layoutInflater.inflate(this.Z, viewGroup, false);
        bottomNavigationView.b = this.ab;
        nus nus = new nus(this.W, bottomNavigationView, this.b, this.a, this.U, this.ad, this.T, this.aa);
        this.ag = nus;
        this.Y.a(this.ah);
        this.af = e().a((wun<? super T>) new $$Lambda$jok$goaXLkfsiBd0ZnonbBfaohu3Ng4<Object>(this, bundle), (wun<Throwable>) $$Lambda$jok$qvNJfJYUKcosmLlktEfe5TnEvF0.INSTANCE);
        return bottomNavigationView;
    }

    public final void g() {
        super.g();
        this.W.a = (nur) fay.a(this.ag);
        wuk wuk = this.af;
        if (wuk == null || wuk.isUnsubscribed()) {
            this.af = e().a((wun<? super T>) wuq.a(), (wun<Throwable>) $$Lambda$jok$Y3KSn228YEoiflnvycP6HDkdKRg.INSTANCE);
        }
    }

    public final void h() {
        super.h();
        c();
    }

    public final void B() {
        super.B();
        this.Y.b(this.ah);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("key_current_product", this.ac);
        fpt fpt = this.ad;
        if (fpt != null) {
            bundle.putParcelable("key_current_flags_config", fpt);
        }
        fay.a(this.ag);
        bundle.putInt("key_current_tab", this.ag.f.ordinal());
    }

    public final void a(BottomTab bottomTab) {
        Fragment fragment = this.ae;
        if (!(fragment instanceof spl) || !((spl) fragment).ak()) {
            b(bottomTab);
        }
    }

    public final void b(BottomTab bottomTab) {
        Intent intent = kmf.a(p(), bottomTab.mRootUri).a().a;
        a.a(intent, rju.w);
        p().startActivity(intent);
    }

    public final void b(View view) {
        String str;
        if ((this.ae instanceof jol) && p() != null) {
            ukj ukj = this.X;
            ka p = p();
            fpt fpt = this.ad;
            jol jol = (jol) this.ae;
            if (jol == null) {
                str = VoiceInteractionReferral.UNKNOWN.name();
            } else {
                str = jol.ag().a();
            }
            ukj.a(p, fpt, str, view);
        }
    }

    public void onFlagsChanged(fpt fpt) {
        this.ad = (fpt) fay.a(fpt);
        c();
        this.af = e().a((wun<? super T>) wuq.a(), (wun<Throwable>) $$Lambda$jok$Pnnwc3ZxKXLFVfquIeAbxedy7vY.INSTANCE);
    }

    private void c() {
        wuk wuk = this.af;
        if (wuk != null) {
            wuk.unsubscribe();
        }
    }

    private wud<Boolean> e() {
        return wud.a(twu.a(this.V), twu.b(this.V), (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$jok$G6ivkYbNASZ7sAqG4JsLtUjNUk<Object,Object,Object>(this)).a(vun.a(AndroidSchedulers.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        BottomTab bottomTab;
        nus nus = this.ag;
        fpt fpt = this.ad;
        BottomTab a2 = a(this.ae);
        bool.booleanValue();
        boolean booleanValue = bool2.booleanValue();
        BottomNavigationView bottomNavigationView = nus.a;
        bottomNavigationView.setPadding(0, 0, 0, 0);
        for (int i = 0; i < bottomNavigationView.getChildCount(); i++) {
            bottomNavigationView.getChildAt(i).setOnClickListener(null);
        }
        bottomNavigationView.removeAllViews();
        bottomNavigationView.a.clear();
        if (twu.a(fpt)) {
            nus.a.a(NavigationGroup.START_PAGE, SpotifyIconV2.HOME, SpotifyIconV2.HOME_ACTIVE, BottomTab.START_PAGE, R.string.start_page_title, R.id.home_tab, nus.g);
            nus.a.a(NavigationGroup.FIND, SpotifyIconV2.SEARCH, SpotifyIconV2.SEARCH_ACTIVE, BottomTab.FIND, R.string.search_tab_title, R.id.search_tab, nus.g);
            nus.a.a(NavigationGroup.COLLECTION, SpotifyIconV2.COLLECTION, SpotifyIconV2.COLLECTION_ACTIVE, BottomTab.LIBRARY, R.string.free_tier_your_library_label, R.id.your_library_tab, nus.g);
            if (ukr.a(fpt) && jtc.a(nus.a.getContext())) {
                nus.a.a(BottomTab.FIND, nus.i);
            }
            bottomTab = BottomTab.START_PAGE;
        } else if (nus.c.a(fpt)) {
            nus.a.a(NavigationGroup.FREE_TIER_HOME, SpotifyIconV2.HOME, SpotifyIconV2.HOME_ACTIVE, BottomTab.FREE_TIER_HOME, R.string.start_page_title, R.id.home_tab, nus.g);
            nus.a.a(NavigationGroup.FIND, SpotifyIconV2.SEARCH, SpotifyIconV2.SEARCH_ACTIVE, BottomTab.FIND, R.string.search_tab_title, R.id.search_tab, nus.g);
            if (nus.d.a(fpt)) {
                nus.a.a(NavigationGroup.COLLECTION, SpotifyIconV2.COLLECTION, SpotifyIconV2.COLLECTION_ACTIVE, BottomTab.LIBRARY, R.string.free_tier_your_library_label, R.id.your_library_tab, nus.g);
            } else {
                nus.a.a(NavigationGroup.COLLECTION, SpotifyIconV2.COLLECTION, SpotifyIconV2.COLLECTION_ACTIVE, BottomTab.FREE_TIER_YOUR_PLAYLISTS, R.string.free_tier_your_library_label, R.id.your_library_tab, nus.g);
            }
            if (nus.e.a(fpt)) {
                BottomNavigationView bottomNavigationView2 = nus.a;
                NavigationGroup navigationGroup = NavigationGroup.STATIONS_PROMO;
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.STATIONS;
                bottomNavigationView2.a(navigationGroup, spotifyIconV2, spotifyIconV2, BottomTab.STATIONS_PROMO, R.string.stations_promo_navigation_tab_label, R.id.stations_promo_tab, nus.g);
            }
            BottomNavigationView bottomNavigationView3 = nus.a;
            NavigationGroup navigationGroup2 = NavigationGroup.PREMIUM;
            SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.SPOTIFYLOGO;
            bottomNavigationView3.a(navigationGroup2, spotifyIconV22, spotifyIconV22, BottomTab.FREE_TIER_PREMIUM, R.string.in_app_premium_destination_nav_title, R.id.premium_tab, nus.g);
            if (ukr.b(fpt)) {
                nus.a.a(BottomTab.FIND, nus.i);
            }
            bottomTab = BottomTab.FREE_TIER_HOME;
        } else if (booleanValue) {
            nus.a(fpt, booleanValue);
            bottomTab = BottomTab.START_PAGE;
        } else {
            nus.a(fpt, false);
            bottomTab = BottomTab.START_PAGE;
        }
        nus.a.setOnClickListener(nus.h);
        if (a2 != BottomTab.UNKNOWN) {
            bottomTab = a2;
        }
        nus.b(bottomTab);
        return bool;
    }

    public static BottomTab a(Fragment fragment) {
        BottomTab bottomTab;
        if (fragment == null) {
            return BottomTab.UNKNOWN;
        }
        if (fragment instanceof NavigationItem) {
            NavigationGroup ah2 = ((NavigationItem) fragment).ah();
            bottomTab = BottomTab.a(ah2);
            if (bottomTab == BottomTab.UNKNOWN) {
                Assertion.b(String.format("Couldn't map Fragment : %s with navigation group %s, to any Navigation Tab.Ensure that the fragment's getNavigationGroup() returns the right NavigationGroup", new Object[]{fragment, ah2}));
            }
        } else {
            bottomTab = BottomTab.a(udt.a(fragment));
        }
        return bottomTab;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bundle bundle, Boolean bool) {
        if (bundle != null) {
            String str = "key_current_product";
            if (bundle.containsKey(str)) {
                this.ac = bundle.getString(str);
            }
            String str2 = "key_current_flags_config";
            if (bundle.containsKey(str2)) {
                this.ad = (fpt) bundle.getParcelable(str2);
            }
            String str3 = "key_current_tab";
            if (bundle.containsKey(str3)) {
                Logger.c("tag_bottom_tab_nav_fragment", "State restored for current tab. Value : %s ", Integer.valueOf(bundle.getInt(str3)));
                this.ag.b(BottomTab.a(bundle.getInt(str3)));
            }
        }
    }
}
