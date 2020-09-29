package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public final class PlayTrackQueueUtils {
    public static final String ITERATION_METADATA_KEY = "iteration";

    private PlayTrackQueueUtils() {
    }

    public static String getGloballyUniqueUid(PlayerTrack playerTrack) {
        if (playerTrack.uid().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(playerTrack.uri());
            sb.append(playerTrack.provider());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(playerTrack.uid());
        sb2.append(jvs.a(playerTrack, "iteration"));
        return sb2.toString();
    }
}
