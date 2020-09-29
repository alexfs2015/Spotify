package com.spotify.music.features.hiddencontent;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class FreeTierProfileLogger {
    private final InteractionLogger a;

    public enum UserIntent {
        ADD_MORE("add-more"),
        SONGS_TAB_CLICKED("songs-tab-clicked"),
        ARTISTS_TAB_CLICKED("artists-tab-clicked"),
        TRACK_CONTEXT_MENU_CLICKED("track-context-menu-clicked"),
        ARTIST_CONTEXT_MENU_CLICKED("artist-context-menu-clicked"),
        ARTIST_CLICKED("artist-clicked"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public FreeTierProfileLogger(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public final void a() {
        a(null, "tabs", 0, InteractionType.HIT, UserIntent.SONGS_TAB_CLICKED);
    }

    public final void b() {
        a(null, "tabs", 0, InteractionType.HIT, UserIntent.ARTISTS_TAB_CLICKED);
    }

    public void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, i, interactionType, userIntent.toString());
    }
}
