package com.spotify.mobile.android.spotlets.collection.logging;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.ubi.interactions.InteractionAction;

public final class CollectionLogger {
    private final InteractionLogger a;

    public enum UserIntent {
        ALBUMS_HIDE_INCOMPLETE("hide-incomplete-albums"),
        ALBUMS_SHOW_INCOMPLETE("show-incomplete-albums"),
        BROWSE("browse"),
        COLLECTION_ADD("add-to-collection"),
        COLLECTION_COMPLETE("complete-in-collection"),
        COLLECTION_REMOVE("remove-from-collection"),
        DOWNLOAD("download"),
        DOWNLOAD_REMOVE("remove-download"),
        FOLLOW("follow"),
        MARK_AS_PLAYED("mark-as-played"),
        NAVIGATE_FORWARD("navigate-forward"),
        PLAY("play"),
        REMOVE("remove"),
        SHOW_ALL_CONTENT("show-all-content"),
        SHOW_ONLY_OFFLINED_CONTENT("show-only-offlined-content"),
        SHUFFLE_PLAY("shuffle-play"),
        UNFOLLOW("unfollow");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public CollectionLogger(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public final void a(String str, String str2, InteractionType interactionType, UserIntent userIntent) {
        a(str, str2, -1, interactionType, userIntent);
    }

    public final void a(String str, String str2, InteractionType interactionType, UserIntent userIntent, InteractionAction interactionAction) {
        a(str, str2, -1, interactionType, userIntent, interactionAction);
    }

    public final void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, i, interactionType, userIntent.toString());
    }

    public final void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent, InteractionAction interactionAction) {
        this.a.a(str, str2, -1, interactionType, userIntent.toString(), interactionAction);
    }
}
