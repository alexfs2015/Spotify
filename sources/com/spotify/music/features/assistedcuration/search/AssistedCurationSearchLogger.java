package com.spotify.music.features.assistedcuration.search;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.SimpleNavigationManager.NavigationType;

public final class AssistedCurationSearchLogger implements spn {
    private static final gjf a = PageIdentifiers.ASSISTED_CURATION_SEARCH;
    private static final sih b = ViewUris.D;
    private final jjf c;

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

        public final String toString() {
            return this.mStrValue;
        }

        public static UserIntent a(NavigationType navigationType) {
            return navigationType == NavigationType.UP ? NAVIGATE_UP : NAVIGATE_BACK;
        }
    }

    public AssistedCurationSearchLogger(jjf jjf) {
        this.c = jjf;
    }

    public final void a(String str) {
        a(b.toString(), str, UserIntent.ADD_TRACK);
    }

    public final void a(String str, String str2, NavigationType navigationType) {
        a(str, str2, UserIntent.a(navigationType));
    }

    private void a(String str, String str2, UserIntent userIntent) {
        a(null, str, str2, null, -1, InteractionType.HIT, userIntent);
    }

    private void a(String str, String str2, String str3, String str4, int i, InteractionType interactionType, UserIntent userIntent) {
        jjf jjf = this.c;
        bh bhVar = new bh(null, a.a(), str2, null, -1, str3, interactionType.toString(), userIntent.toString(), (double) jrf.a.a());
        jjf.a(bhVar);
    }
}
