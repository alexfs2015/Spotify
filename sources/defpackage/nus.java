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

/* renamed from: nus reason: default package */
public final class nus implements nur {
    public final BottomNavigationView a;
    final nuq b;
    public final rgz c;
    public final uqi d;
    public final shs e;
    public BottomTab f;
    public final int g;
    public final OnClickListener h = new OnClickListener() {
        public final void onClick(View view) {
            BottomTab bottomTab = ((BottomNavigationItemView) view).b;
            nuq nuq = nus.this.b;
            boolean z = bottomTab == nus.this.f;
            if (nuq.a != null) {
                sih sih = nuq.a.a().mViewUri;
                sih sih2 = bottomTab.mViewUri;
                if (sih2 != null) {
                    jjf jjf = nuq.c;
                    bh bhVar = r8;
                    bh bhVar2 = new bh(null, udt.I.a(), sih != null ? sih.toString() : "", "tabbar", (long) nuq.a.a(bottomTab), sih2.toString(), "hit", "tab-selected", (double) nuq.d.a());
                    jjf.a(bhVar);
                }
            }
            if (!z) {
                nuq.b.b(bottomTab);
            } else {
                nuq.b.a(bottomTab);
            }
            if (nuq.a != null) {
                nuq.a.a(bottomTab, false);
            }
        }
    };
    public final OnLongClickListener i = new OnLongClickListener() {
        public final boolean onLongClick(View view) {
            View view2 = view;
            BottomTab bottomTab = ((BottomNavigationItemView) view2).b;
            nuq nuq = nus.this.b;
            if (!ViewUris.ah.equals(bottomTab.mViewUri) && !ViewUris.af.equals(bottomTab.mViewUri)) {
                return false;
            }
            nuq.b.b(view2);
            if (nuq.a != null) {
                jjf jjf = nuq.c;
                bh bhVar = r4;
                bh bhVar2 = new bh(null, udt.bg.a(), bottomTab.mViewUri.toString(), "tabbar", (long) nuq.a.a(bottomTab), ViewUris.bV.toString(), InteractionType.LONG_PRESS.mInteractionType, InteractionIntent.NAVIGATE.mInteractionIntent, (double) nuq.d.a());
                jjf.a(bhVar);
            }
            return true;
        }
    };
    private final twu j;

    public nus(nuq nuq, BottomNavigationView bottomNavigationView, twu twu, rgz rgz, uqi uqi, fpt fpt, shs shs, int i2) {
        this.b = (nuq) fay.a(nuq);
        this.a = (BottomNavigationView) fay.a(bottomNavigationView);
        this.j = (twu) fay.a(twu);
        this.c = (rgz) fay.a(rgz);
        this.d = (uqi) fay.a(uqi);
        this.e = shs;
        fay.a(fpt);
        this.f = BottomTab.UNKNOWN;
        this.g = i2;
    }

    public final BottomTab a() {
        return this.f;
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

    public final void b(BottomTab bottomTab) {
        this.f = this.a.a(bottomTab);
    }

    public final void a(BottomTab bottomTab, boolean z) {
        BottomNavigationItemView b2 = this.a.b(bottomTab);
        if (b2 != null) {
            b2.a(false);
        }
    }

    public void a(fpt fpt, boolean z) {
        this.a.a(NavigationGroup.START_PAGE, SpotifyIconV2.HOME, SpotifyIconV2.HOME_ACTIVE, BottomTab.START_PAGE, R.string.start_page_title, R.id.home_tab, this.g);
        this.a.a(NavigationGroup.FIND, SpotifyIconV2.SEARCH, SpotifyIconV2.SEARCH_ACTIVE, BottomTab.FIND, R.string.search_tab_title, R.id.search_tab, this.g);
        this.a.a(NavigationGroup.COLLECTION, SpotifyIconV2.COLLECTION, SpotifyIconV2.COLLECTION_ACTIVE, BottomTab.LIBRARY, iqk.a(fpt, R.string.collection_title), R.id.your_library_tab, this.g);
        if (z) {
            BottomNavigationView bottomNavigationView = this.a;
            NavigationGroup navigationGroup = NavigationGroup.PREMIUM;
            SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.SPOTIFYLOGO;
            bottomNavigationView.a(navigationGroup, spotifyIconV2, spotifyIconV2, BottomTab.FREE_TIER_PREMIUM, R.string.in_app_premium_destination_nav_title, R.id.premium_tab, this.g);
        }
        if (ukr.a(fpt) && jtc.a(this.a.getContext())) {
            this.a.a(BottomTab.FIND, this.i);
        }
    }
}
