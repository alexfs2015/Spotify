package com.spotify.mobile.android.spotlets.miniplayer.logging;

public final class MiniPlayerLogConstants {

    public enum SectionId {
        CHEVRON_BUTTON("chevron_button"),
        CONTENT("content");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        OPEN_NPV("open_npv");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }
}
