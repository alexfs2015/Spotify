package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;

public final class PlayerStateUtil {
    private PlayerStateUtil() {
    }

    public static boolean isInLoadingState(PlayerState playerState) {
        return "true".equals(playerState.contextMetadata().get(Metadata.IS_LOADING));
    }

    public static boolean isEmptyContext(PlayerState playerState) {
        return (!playerState.isPlaying() && !isInLoadingState(playerState)) || playerState.track() == null;
    }

    public static String getTrackUri(PlayerState playerState) {
        PlayerTrack track = playerState != null ? playerState.track() : null;
        return track != null ? track.uri() : "";
    }
}
