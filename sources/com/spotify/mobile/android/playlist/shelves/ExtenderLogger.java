package com.spotify.mobile.android.playlist.shelves;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class ExtenderLogger {
    private final InteractionLogger a;

    public enum UserIntent {
        ADD_TRACK_CLICKED("add-track-clicked"),
        COLLAPSE_CLICKED("collapse-clicked"),
        EXPAND_CLICKED("expand-clicked"),
        REFRESH_CLICKED("refresh-clicked"),
        TRACK_CLICKED("track-clicked"),
        TRACK_CLICKED_MUTED("track-click-muted");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public ExtenderLogger(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public final void a(boolean z) {
        a(null, "playlist-extender", -1, InteractionType.HIT, z ? UserIntent.EXPAND_CLICKED : UserIntent.COLLAPSE_CLICKED);
    }

    public void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, i, interactionType, userIntent.toString());
    }
}
