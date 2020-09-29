package com.spotify.music.nowplaying.drivingmode.loggers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class DrivingPivotInteractionLoggerImpl implements tnq {
    private final InteractionLogger a;
    private final wzi<PlayerState> b;
    private final String c;

    enum SectionId {
        OPEN_PIVOT_TOUCH_AREA("open_pivot_touch_area"),
        CLOSE_PIVOT_TOUCH_AREA("close_pivot_touch_area"),
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

    public DrivingPivotInteractionLoggerImpl(InteractionLogger interactionLogger, wzi<PlayerState> wzi, String str) {
        this.a = interactionLogger;
        this.b = wzi;
        this.c = str;
    }

    private String a(SectionId sectionId) {
        return this.c.concat(sectionId.toString());
    }

    private void a(SectionId sectionId, UserIntent userIntent, int i, InteractionType interactionType) {
        this.a.a(f(), (String) null, a(sectionId), -1, interactionType, userIntent.toString());
    }

    private String f() {
        PlayerState playerState = (PlayerState) this.b.get();
        if (playerState == null) {
            return null;
        }
        return playerState.playbackId();
    }

    public final void a() {
        a(SectionId.OPEN_PIVOT_TOUCH_AREA, UserIntent.OPEN_PIVOT, -1, InteractionType.HIT);
    }

    public final void a(String str, String str2, int i, boolean z) {
        this.a.a(f(), str, str2, i, z ? InteractionType.SCROLL : InteractionType.TAP, UserIntent.SCROLL_ITEMS.toString());
    }

    public final void b() {
        a(SectionId.OPEN_PIVOT_TOUCH_AREA, UserIntent.OPEN_PIVOT, -1, InteractionType.DRAG);
    }

    public final void c() {
        a(SectionId.CLOSE_PIVOT_TOUCH_AREA, UserIntent.CLOSE_PIVOT, -1, InteractionType.HIT);
    }

    public final void d() {
        a(SectionId.CLOSE_PIVOT_TOUCH_AREA, UserIntent.CLOSE_PIVOT, -1, InteractionType.DRAG);
    }

    public final void e() {
        a(SectionId.BACK_BUTTON, UserIntent.CLOSE_PIVOT, -1, InteractionType.HIT);
    }
}
