package com.spotify.music.nowplaying.drivingmode.loggers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class DrivingContextMenuInteractionLoggerImpl implements tnp {
    private final InteractionLogger a;
    private final wzi<PlayerState> b;
    private final String c;

    enum SectionId {
        CANCEL_BUTTON("cancel_button"),
        DISABLE_BUTTON("disable_button"),
        BACK_BUTTON("back_button");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    enum UserIntent {
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

    public DrivingContextMenuInteractionLoggerImpl(InteractionLogger interactionLogger, wzi<PlayerState> wzi, String str) {
        this.a = interactionLogger;
        this.b = wzi;
        this.c = str;
    }

    private String a(SectionId sectionId) {
        return this.c.concat(sectionId.toString());
    }

    private void a(SectionId sectionId, UserIntent userIntent) {
        this.a.a(d(), (String) null, a(sectionId), -1, InteractionType.HIT, userIntent.toString());
    }

    private String d() {
        PlayerState playerState = (PlayerState) this.b.get();
        if (playerState == null) {
            return null;
        }
        return playerState.playbackId();
    }

    public final void a() {
        a(SectionId.DISABLE_BUTTON, UserIntent.DISABLE_DRIVING_MODE);
    }

    public final void b() {
        a(SectionId.CANCEL_BUTTON, UserIntent.CANCEL);
    }

    public final void c() {
        a(SectionId.BACK_BUTTON, UserIntent.CANCEL);
    }
}
