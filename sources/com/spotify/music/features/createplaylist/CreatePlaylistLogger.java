package com.spotify.music.features.createplaylist;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class CreatePlaylistLogger {
    private final InteractionLogger a;

    public enum UserIntent {
        CLOSE("close"),
        BACK_NAVIGATION("back-navigation"),
        CREATE("create"),
        CREATE_DEFAULT_NAME_PLAYLIST("create-default-name-playlist");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public CreatePlaylistLogger(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public void a(String str, UserIntent userIntent) {
        this.a.a(null, str, 0, InteractionType.HIT, userIntent.toString());
    }
}
