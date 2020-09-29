package com.spotify.music.features.editplaylist;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class EditPlaylistLogger {
    private final InteractionLogger a;
    private final ImpressionLogger b;

    public enum UserIntent {
        CLOSE("close"),
        SAVE("save"),
        REMOVE("remove"),
        UNDO("undo"),
        CANCEL("cancel"),
        DISCARD("discard"),
        NAME_CHANGE("name-change"),
        DESCRIPTION_CHANGE("description-change"),
        PICTURE_CHANGE("picture-change"),
        MOVE("move"),
        BACK_NAVIGATION("back-navigation");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public EditPlaylistLogger(InteractionLogger interactionLogger, ImpressionLogger impressionLogger) {
        this.a = interactionLogger;
        this.b = impressionLogger;
    }

    public void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(null, str2, 0, interactionType, userIntent.toString());
    }
}
