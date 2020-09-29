package com.spotify.music.features.assistedcuration.search;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.SimpleNavigationManager.NavigationType;

public final class AssistedCurationSearchLogger implements szu {
    private static final gkq a = PageIdentifiers.ASSISTED_CURATION_SEARCH;
    private static final sso b = ViewUris.C;
    private final jlr c;

    enum InteractionType {
        HIT("hit");
        
        private final String mStrValue;

        private InteractionType(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    enum UserIntent {
        ADD_TRACK("add_track"),
        NAVIGATE_BACK("nav-back-hardware-back-button"),
        NAVIGATE_UP("nav-back-up-toolbar-button");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public static UserIntent a(NavigationType navigationType) {
            return navigationType == NavigationType.UP ? NAVIGATE_UP : NAVIGATE_BACK;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public AssistedCurationSearchLogger(jlr jlr) {
        this.c = jlr;
    }

    private void a(String str, String str2, UserIntent userIntent) {
        a(null, str, str2, null, -1, InteractionType.HIT, userIntent);
    }

    private void a(String str, String str2, String str3, String str4, int i, InteractionType interactionType, UserIntent userIntent) {
        jlr jlr = this.c;
        bg bgVar = new bg(null, a.a(), str2, null, -1, str3, interactionType.toString(), userIntent.toString(), (double) jtp.a.a());
        jlr.a(bgVar);
    }

    public final void a(String str) {
        a(b.toString(), str, UserIntent.ADD_TRACK);
    }

    public final void a(String str, String str2, NavigationType navigationType) {
        a(str, str2, UserIntent.a(navigationType));
    }
}
