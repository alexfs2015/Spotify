package com.spotify.music.features.findfriends.legacy.logging;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class FindFriendsLogger {
    private final InteractionLogger a;

    public enum UserIntent {
        FOCUS("focus"),
        FOLLOW("follow"),
        NAVIGATE_FORWARD("navigate-forward"),
        UNFOLLOW("unfollow");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public FindFriendsLogger(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public final void a(String str, String str2, InteractionType interactionType, UserIntent userIntent) {
        this.a.a(str, str2, -1, interactionType, userIntent.toString());
    }
}
