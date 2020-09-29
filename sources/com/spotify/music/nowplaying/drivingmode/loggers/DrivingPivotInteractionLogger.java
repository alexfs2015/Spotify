package com.spotify.music.nowplaying.drivingmode.loggers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class DrivingPivotInteractionLogger {
    public final InteractionLogger a;
    private final wlc<PlayerState> b;
    private final String c;

    public enum SectionId {
        OPEN_PIVOT_TOUCH_AREA("open_pivot_touch_area"),
        CLOSE_PIVOT_TOUCH_AREA("close_pivot_touch_area");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        OPEN_PIVOT("open_pivot"),
        CLOSE_PIVOT("close_pivot"),
        SCROLL_ITEMS("scroll_pivot_items");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public DrivingPivotInteractionLogger(InteractionLogger interactionLogger, wlc<PlayerState> wlc, String str) {
        this.a = interactionLogger;
        this.b = wlc;
        this.c = str;
    }

    public void a(SectionId sectionId, UserIntent userIntent, int i, InteractionType interactionType) {
        this.a.a(a(), (String) null, a(sectionId), i, interactionType, userIntent.toString());
    }

    private String a(SectionId sectionId) {
        return String.format("%s_%s", new Object[]{this.c, sectionId});
    }

    public String a() {
        PlayerState playerState = (PlayerState) this.b.get();
        if (playerState == null) {
            return null;
        }
        return playerState.playbackId();
    }
}
