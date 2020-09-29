package com.spotify.music.nowplaying.drivingmode.loggers;

import com.spotify.mobile.android.spotlets.collection.proto.ProtoGroupHeader;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class DrivingVoiceInteractionLoggerImpl implements tnr {
    private final InteractionLogger a;
    private final String b;

    enum SectionId {
        NPV_MIC_BUTTON("npv_mic_button"),
        HOME_FEED_MIC_BUTTON("home_feed_mic_button"),
        VOICE_VIEW("voice_view"),
        VOICE_VIEW_BACK_BUTTON("voice_view_back_button"),
        VOICE_VIEW_X_BUTTON("voice_view_x_button");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    enum UserIntent {
        START_VOICE("start_voice"),
        CLOSE_VOICE("close_voice");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public DrivingVoiceInteractionLoggerImpl(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    private String a(SectionId sectionId) {
        return this.b.concat(sectionId.toString());
    }

    private void a(SectionId sectionId, UserIntent userIntent) {
        this.a.a((String) null, (String) null, a(sectionId), ProtoGroupHeader.DEFAULT_INDEX.intValue(), InteractionType.HIT, userIntent.toString());
    }

    public final void a() {
        a(SectionId.NPV_MIC_BUTTON, UserIntent.START_VOICE);
    }

    public final void b() {
        a(SectionId.HOME_FEED_MIC_BUTTON, UserIntent.START_VOICE);
    }

    public final void c() {
        this.a.a((String) null, (String) null, a(SectionId.VOICE_VIEW), ProtoGroupHeader.DEFAULT_INDEX.intValue(), InteractionType.DRAG, UserIntent.CLOSE_VOICE.toString());
    }

    public final void d() {
        a(SectionId.VOICE_VIEW_BACK_BUTTON, UserIntent.CLOSE_VOICE);
    }

    public final void e() {
        a(SectionId.VOICE_VIEW_X_BUTTON, UserIntent.CLOSE_VOICE);
    }
}
