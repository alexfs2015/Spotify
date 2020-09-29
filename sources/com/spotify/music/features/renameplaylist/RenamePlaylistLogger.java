package com.spotify.music.features.renameplaylist;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class RenamePlaylistLogger {
    private final InteractionLogger a;

    public enum UserIntent {
        CLOSE("close"),
        BACK_NAVIGATION("back-navigation"),
        RENAME("rename");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public RenamePlaylistLogger(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(null, str2, 0, interactionType, userIntent.toString());
    }
}
