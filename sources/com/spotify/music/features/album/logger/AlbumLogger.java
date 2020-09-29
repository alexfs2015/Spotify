package com.spotify.music.features.album.logger;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.ubi.interactions.InteractionAction;

public final class AlbumLogger {
    private final InteractionLogger a;

    public enum SectionId {
        ALBUM_HEADER("album_header"),
        CONTEXT_MENU("album_context_menu"),
        SAVE_BUTTON("header_save_button"),
        HEADER_BUTTON("header_button"),
        HEADER_DOWNLOAD("header_download_toggle"),
        TRACKS("album_tracks"),
        RELATED_ALBUMS("related_albums");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        SAVE("save"),
        UNSAVE("unsave"),
        OPEN_ARTIST("open-artist"),
        PLAY("play"),
        OPEN_CONTEXT_MENU("open-context-menu"),
        OPEN_RELATED_ALBUM("open-related-album"),
        SWIPE_META_DATA("swipe-meta-data");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public AlbumLogger(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public void a(String str, SectionId sectionId, int i, InteractionType interactionType, UserIntent userIntent, InteractionAction interactionAction) {
        this.a.a(str, sectionId != null ? sectionId.toString() : null, i, interactionType, userIntent.toString(), interactionAction);
    }
}
