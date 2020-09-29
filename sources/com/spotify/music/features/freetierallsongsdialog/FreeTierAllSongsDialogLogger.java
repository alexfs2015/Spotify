package com.spotify.music.features.freetierallsongsdialog;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class FreeTierAllSongsDialogLogger {
    final InteractionLogger a;
    private final ImpressionLogger b;

    enum UserIntent {
        CLOSE("close"),
        BACK_NAVIGATION("back-navigation"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image"),
        TRACK_CONTEXT_MENU_CLICKED("track-context-menu-clicked"),
        ADD_SONGS("add-songs"),
        LIKE_ENABLE("like-enable"),
        LIKE_DISABLE("like-disable"),
        BAN_ENABLE("ban-enable"),
        BAN_DISABLE("ban-disable");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public FreeTierAllSongsDialogLogger(InteractionLogger interactionLogger, ImpressionLogger impressionLogger) {
        this.a = interactionLogger;
        this.b = impressionLogger;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, i, interactionType, userIntent.toString());
    }
}
