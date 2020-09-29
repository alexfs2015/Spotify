package com.spotify.music.podcast.speedcontrol;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.video.model.ContextPlayerConfiguration;
import io.reactivex.Completable;
import io.reactivex.Observable;

public final class SpeedControlInteractor {
    public final uiu a;

    static class SpeedControlPreference implements JacksonModel {
        private final int mValue;

        private SpeedControlPreference(int i) {
            this.mValue = i;
        }

        @JsonProperty("audio.episode.speed")
        public int getValue() {
            return this.mValue;
        }
    }

    public SpeedControlInteractor(uiu uiu) {
        this.a = uiu;
    }

    public final Completable a(int i) {
        return this.a.a(new SpeedControlPreference(i)).g();
    }

    public final Observable<Integer> a() {
        return this.a.b(ContextPlayerConfiguration.PREFS_KEY_PLAYBACK_SPEED, Integer.class);
    }
}
