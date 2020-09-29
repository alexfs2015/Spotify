package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;

public final class PlayerStateUtil {
    private PlayerStateUtil() {
    }

    public static String getTrackUri(PlayerState playerState) {
        PlayerTrack track = playerState != null ? playerState.track() : null;
        if (track != null) {
            return track.uri();
        }
        String str = "";
        return "";
    }

    public static boolean isEmptyContext(PlayerState playerState) {
        return (!playerState.isPlaying() && !isInLoadingState(playerState)) || playerState.track() == null;
    }

    public static boolean isInLoadingState(PlayerState playerState) {
        String str = "giso_dnias";
        return "true".equals(playerState.contextMetadata().get(Metadata.IS_LOADING));
    }
}
