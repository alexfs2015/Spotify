package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.R;
import com.spotify.music.features.navigation.BottomNavigationItemView;
import com.spotify.music.features.navigation.BottomNavigationView;
import com.spotify.music.features.navigation.BottomTab;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem.NavigationGroup;

/* renamed from: obf reason: default package */
public final class obf implements obe {
    public final BottomNavigationView a;
    final obd b;
    public final rqb c;
    public final srz d;
    public BottomTab e;
    public final int f;
    public final OnClickListener g = new OnClickListener() {
        public final void onClick(View view) {
            BottomTab bottomTab = ((BottomNavigationItemView) view).b;
            obd obd = obf.this.b;
            boolean z = bottomTab == obf.this.e;
            if (obd.a != null) {
                sso sso = obd.a.a().mViewUri;
                sso sso2 = bottomTab.mViewUri;
                if (sso2 != null) {
                    jlr jlr = obd.c;
                    bg bgVar = r8;
                    bg bgVar2 = new bg(null, uqo.I.a(), sso != null ? sso.toString() : "", "tabbar", (long) obd.a.a(bottomTab), sso2.toString(), "hit", "tab-selected", (double) obd.d.a());
                    jlr.a(bgVar);
                }
            }
            if (!z) {
                obd.b.b(bottomTab);
            } else {
                obd.b.a(bottomTab);
            }
            if (obd.a != null) {
                obd.a.a(bottomTab, false);
            }
        }
    };
    public final OnLongClickListener h = new OnLongClickListener() {
        public final boolean onLongClick(View view) {
            View view2 = view;
            BottomTab bottomTab = ((BottomNavigationItemView) view2).b;
            obd obd = obf.this.b;
            if (!ViewUris.ag.equals(bottomTab.mViewUri) && !ViewUris.ae.equals(bottomTab.mViewUri)) {
                return false;
            }
            obd.b.b(view2);
            if (obd.a != null) {
                jlr jlr = obd.c;
                bg bgVar = r4;
                bg bgVar2 = new bg(null, uqo.bg.a(), bottomTab.mViewUri.toString(), "tabbar", (long) obd.a.a(bottomTab), ViewUris.bU.toString(), InteractionType.LONG_PRESS.mInteractionType, InteractionIntent.NAVIGATE.mInteractionIntent, (double) obd.d.a());
                jlr.a(bgVar);
            }
            return true;
        }
    };
    private final uix i;
    private final vbn j;

    public obf(obd obd, BottomNavigationView bottomNavigationView, uix uix, rqb rqb, vbn vbn, fqn fqn, srz srz, int i2) {
        this.b = (obd) fbp.a(obd);
        this.a = (BottomNavigationView) fbp.a(bottomNavigationView);
        this.i = (uix) fbp.a(uix);
        this.c = (rqb) fbp.a(rqb);
        this.j = (vbn) fbp.a(vbn);
        this.d = srz;
        fbp.a(fqn);
        this.e = BottomTab.UNKNOWN;
        this.f = i2;
    }

    public final int a(BottomTab bottomTab) {
        BottomNavigationView bottomNavigationView = this.a;
        for (int i2 = 0; i2 < bottomNavigationView.a.size(); i2++) {
            if (bottomTab == ((BottomNavigationItemView) bottomNavigationView.a.get(i2)).b) {
                return i2;
            }
        }
        return -1;
    }

    public final BottomTab a() {
        return this.e;
    }

    public final void a(BottomTab bottomTab, boolean z) {
        BottomNavigationItemView b2 = this.a.b(bottomTab);
        if (b2 != null) {
            b2.a(false);
        }
    }

    public void a(fqn fqn, boolean z) {
        this.a.a(NavigationGroup.START_PAGE, SpotifyIconV2.HOME, SpotifyIconV2.HOME_ACTIVE, BottomTab.START_PAGE, R.string.start_page_title, R.id.home_tab, this.f);
        this.a.a(NavigationGroup.FIND, SpotifyIconV2.SEARCH, SpotifyIconV2.SEARCH_ACTIVE, BottomTab.FIND, R.string.search_tab_title, R.id.search_tab, this.f);
        this.a.a(NavigationGroup.COLLECTION, SpotifyIconV2.COLLECTION, SpotifyIconV2.COLLECTION_ACTIVE, BottomTab.LIBRARY, isx.a(fqn, R.string.collection_title), R.id.your_library_tab, this.f);
        if (z) {
            BottomNavigationView bottomNavigationView = this.a;
            NavigationGroup navigationGroup = NavigationGroup.PREMIUM;
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SPOTIFYLOGO;
            bottomNavigationView.a(navigationGroup, spotifyIconV2, spotifyIconV2, BottomTab.FREE_TIER_PREMIUM, R.string.in_app_premium_destination_nav_title, R.id.premium_tab, this.f);
        }
        if (uvx.a(fqn) && jvi.a(this.a.getContext())) {
            this.a.a(BottomTab.FIND, this.h);
        }
    }

    public final void b(BottomTab bottomTab) {
        this.e = this.a.a(bottomTab);
    }
}
