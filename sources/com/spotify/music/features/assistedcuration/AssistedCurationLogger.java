package com.spotify.music.features.assistedcuration;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class AssistedCurationLogger {
    private final ImpressionLogger a;
    private final InteractionLogger b;

    enum UserIntent {
        CLOSE("close"),
        BACK_NAVIGATION("back-navigation"),
        SEARCH("search"),
        ADDED_FROM_SEARCH("added-from-search"),
        SHOW_MORE("show-more"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        ADD_TRACK_VIA_ACCESSORY("add-track-via-accessory"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public AssistedCurationLogger(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.a = impressionLogger;
        this.b = interactionLogger;
    }

    public final void a(String str, int i) {
        this.a.a(null, str, i, ImpressionType.ITEM, RenderType.CAROUSEL);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent) {
        this.b.a(str, str2, i, interactionType, userIntent.toString());
    }
}
