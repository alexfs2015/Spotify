package com.spotify.music.nowplaying.drivingmode.loggers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class DrivingContextMenuInteractionLogger {
    private final InteractionLogger a;
    private final wlc<PlayerState> b;
    private final String c;

    public enum SectionId {
        CANCEL_BUTTON("cancel_button"),
        DISABLE_BUTTON("disable_button");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        CANCEL("cancel_context_menu"),
        DISABLE_DRIVING_MODE("disable_driving_mode");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public DrivingContextMenuInteractionLogger(InteractionLogger interactionLogger, wlc<PlayerState> wlc, String str) {
        this.a = interactionLogger;
        this.b = wlc;
        this.c = str;
    }

    public void a(SectionId sectionId, UserIntent userIntent) {
        this.a.a(a(), (String) null, a(sectionId), -1, InteractionType.HIT, userIntent.toString());
    }

    private String a(SectionId sectionId) {
        return String.format("%s_%s", new Object[]{this.c, sectionId});
    }

    private String a() {
        PlayerState playerState = (PlayerState) this.b.get();
        if (playerState == null) {
            return null;
        }
        return playerState.playbackId();
    }
}
