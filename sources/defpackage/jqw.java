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

/* renamed from: jqw reason: default package */
public class jqw extends jrd implements c, obc {
    public srz T;
    public vbn U;
    public hgz V;
    public obd W;
    public uvu X;
    public lbr Y;
    public int Z;
    public rqb a;
    public int aa;
    public boolean ab;
    private String ac;
    private fqn ad;
    /* access modifiers changed from: private */
    public Fragment ae;
    private xip af;
    /* access modifiers changed from: private */
    public obf ag;
    private final lbq ah = new lbq() {
        public final void onCurrentFragmentChanged(Fragment fragment, String str) {
            jqw.this.ae = fragment;
            BottomTab a2 = jqw.a(fragment);
            if (a2 != BottomTab.UNKNOWN) {
                jqw.this.ag.b(a2);
            }
        }
    };
    public uix b;

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
            bottomTab = BottomTab.a(uqo.a(fragment));
        }
        return bottomTab;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        BottomTab bottomTab;
        obf obf = this.ag;
        fqn fqn = this.ad;
        BottomTab a2 = a(this.ae);
        bool.booleanValue();
        boolean booleanValue = bool2.booleanValue();
        BottomNavigationView bottomNavigationView = obf.a;
        bottomNavigationView.setPadding(0, 0, 0, 0);
        for (int i = 0; i < bottomNavigationView.getChildCount(); i++) {
            bottomNavigationView.getChildAt(i).setOnClickListener(null);
        }
        bottomNavigationView.removeAllViews();
        bottomNavigationView.a.clear();
        if (uix.a(fqn)) {
            obf.a.a(NavigationGroup.START_PAGE, SpotifyIconV2.HOME, SpotifyIconV2.HOME_ACTIVE, BottomTab.START_PAGE, R.string.start_page_title, R.id.home_tab, obf.f);
            obf.a.a(NavigationGroup.FIND, SpotifyIconV2.SEARCH, SpotifyIconV2.SEARCH_ACTIVE, BottomTab.FIND, R.string.search_tab_title, R.id.search_tab, obf.f);
            obf.a.a(NavigationGroup.COLLECTION, SpotifyIconV2.COLLECTION, SpotifyIconV2.COLLECTION_ACTIVE, BottomTab.LIBRARY, R.string.free_tier_your_library_label, R.id.your_library_tab, obf.f);
            if (uvx.a(fqn) && jvi.a(obf.a.getContext())) {
                obf.a.a(BottomTab.FIND, obf.h);
            }
            bottomTab = BottomTab.START_PAGE;
        } else if (obf.c.a(fqn)) {
            obf.a.a(NavigationGroup.FREE_TIER_HOME, SpotifyIconV2.HOME, SpotifyIconV2.HOME_ACTIVE, BottomTab.FREE_TIER_HOME, R.string.start_page_title, R.id.home_tab, obf.f);
            obf.a.a(NavigationGroup.FIND, SpotifyIconV2.SEARCH, SpotifyIconV2.SEARCH_ACTIVE, BottomTab.FIND, R.string.search_tab_title, R.id.search_tab, obf.f);
            if (vbn.a(fqn)) {
                obf.a.a(NavigationGroup.COLLECTION, SpotifyIconV2.COLLECTION, SpotifyIconV2.COLLECTION_ACTIVE, BottomTab.LIBRARY, R.string.free_tier_your_library_label, R.id.your_library_tab, obf.f);
            } else {
                obf.a.a(NavigationGroup.COLLECTION, SpotifyIconV2.COLLECTION, SpotifyIconV2.COLLECTION_ACTIVE, BottomTab.FREE_TIER_YOUR_PLAYLISTS, R.string.free_tier_your_library_label, R.id.your_library_tab, obf.f);
            }
            if (obf.d.a(fqn)) {
                BottomNavigationView bottomNavigationView2 = obf.a;
                NavigationGroup navigationGroup = NavigationGroup.STATIONS_PROMO;
                SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.STATIONS;
                bottomNavigationView2.a(navigationGroup, spotifyIconV2, spotifyIconV2, BottomTab.STATIONS_PROMO, R.string.stations_promo_navigation_tab_label, R.id.stations_promo_tab, obf.f);
            }
            BottomNavigationView bottomNavigationView3 = obf.a;
            NavigationGroup navigationGroup2 = NavigationGroup.PREMIUM;
            SpotifyIconV2 spotifyIconV22 = SpotifyIconV2.SPOTIFYLOGO;
            bottomNavigationView3.a(navigationGroup2, spotifyIconV22, spotifyIconV22, BottomTab.FREE_TIER_PREMIUM, R.string.in_app_premium_destination_nav_title, R.id.premium_tab, obf.f);
            if (uvx.b(fqn)) {
                obf.a.a(BottomTab.FIND, obf.h);
            }
            bottomTab = BottomTab.FREE_TIER_HOME;
        } else if (booleanValue) {
            obf.a(fqn, booleanValue);
            bottomTab = BottomTab.START_PAGE;
        } else {
            obf.a(fqn, false);
            bottomTab = BottomTab.START_PAGE;
        }
        obf.a.setOnClickListener(obf.g);
        if (a2 != BottomTab.UNKNOWN) {
            bottomTab = a2;
        }
        obf.b(bottomTab);
        return bool;
    }

    public static jqw a(fqn fqn) {
        jqw jqw = new jqw();
        fqo.a((Fragment) jqw, fqn);
        return jqw;
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
                this.ad = (fqn) bundle.getParcelable(str2);
            }
            String str3 = "key_current_tab";
            if (bundle.containsKey(str3)) {
                Logger.c("tag_bottom_tab_nav_fragment", "State restored for current tab. Value : %s ", Integer.valueOf(bundle.getInt(str3)));
                this.ag.b(BottomTab.a(bundle.getInt(str3)));
            }
        }
    }

    private void c() {
        xip xip = this.af;
        if (xip != null) {
            xip.unsubscribe();
        }
    }

    private xii<Boolean> e() {
        return xii.a(uix.a(this.V), uix.b(this.V), (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$jqw$daCGk2uKVywnTvN6280b2aqwtY<Object,Object,Object>(this)).a(wit.a(AndroidSchedulers.a()));
    }

    public final void B() {
        super.B();
        this.Y.b(this.ah);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ad = fqo.a((Fragment) this);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) layoutInflater.inflate(this.Z, viewGroup, false);
        bottomNavigationView.b = this.ab;
        obf obf = new obf(this.W, bottomNavigationView, this.b, this.a, this.U, this.ad, this.T, this.aa);
        this.ag = obf;
        this.Y.a(this.ah);
        this.af = e().a((xis<? super T>) new $$Lambda$jqw$NgYH3HCJskH1KiLfc3kqHfJZ55U<Object>(this, bundle), (xis<Throwable>) $$Lambda$jqw$DSb0AAIzXv9QotXZA2_EIljuewM.INSTANCE);
        return bottomNavigationView;
    }

    public final void a(BottomTab bottomTab) {
        Fragment fragment = this.ae;
        if (!(fragment instanceof szs) || !((szs) fragment).ak()) {
            b(bottomTab);
        }
    }

    public final void aP_() {
        super.aP_();
        this.W.a = (obe) fbp.a(this.ag);
        xip xip = this.af;
        if (xip == null || xip.isUnsubscribed()) {
            this.af = e().a((xis<? super T>) xiv.a(), (xis<Throwable>) $$Lambda$jqw$810x7FRbYsdj5RzZFT45lzGFDIg.INSTANCE);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.ad = fqo.a((Fragment) this);
    }

    public final void b(View view) {
        if ((this.ae instanceof jqx) && p() != null) {
            jqx jqx = (jqx) this.ae;
            this.X.a(p(), this.ad, jqx == null ? VoiceInteractionReferral.UNKNOWN.name() : jqx.ag().a(), view);
        }
    }

    public final void b(BottomTab bottomTab) {
        Intent intent = kpo.a(p(), bottomTab.mRootUri).a().a;
        a.a(intent, rta.w);
        p().startActivity(intent);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putString("key_current_product", this.ac);
        fqn fqn = this.ad;
        if (fqn != null) {
            bundle.putParcelable("key_current_flags_config", fqn);
        }
        fbp.a(this.ag);
        bundle.putInt("key_current_tab", this.ag.e.ordinal());
    }

    public final void h() {
        super.h();
        c();
    }

    public void onFlagsChanged(fqn fqn) {
        this.ad = (fqn) fbp.a(fqn);
        c();
        this.af = e().a((xis<? super T>) xiv.a(), (xis<Throwable>) $$Lambda$jqw$QR6yuYHTWtiYKZsulRWPzVQVKo.INSTANCE);
    }
}
