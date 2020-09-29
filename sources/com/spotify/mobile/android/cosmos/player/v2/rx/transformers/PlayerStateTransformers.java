package com.spotify.mobile.android.cosmos.player.v2.rx.transformers;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;

public final class PlayerStateTransformers {
    private PlayerStateTransformers() {
    }

    public static FlowableTransformer<PlayerState, Boolean> isPlaying() {
        return new IsPlayingTransformer();
    }

    public static FlowableTransformer<PlayerState, PlayerTrack> currentTrack() {
        return new CurrentTrackTransformer();
    }

    public static FlowableTransformer<PlayerState, String> currentTrackUri() {
        return new CurrentTrackUriTransformer();
    }

    public static FlowableTransformer<PlayerState, Long> position(long j, Scheduler scheduler) {
        return new TrackPositionTransformer(j, scheduler);
    }

    public static FlowableTransformer<PlayerState, Long> duration() {
        return new TrackDurationTransformer();
    }
}
