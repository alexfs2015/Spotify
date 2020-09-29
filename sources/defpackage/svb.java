package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: svb reason: default package */
final class svb {
    public static ImmutableList<String> a(PlayerState playerState) {
        fay.a(playerState);
        return ImmutableList.a(((PlayerTrack) fay.a(playerState.track())).uri(), playerState.contextUri());
    }
}
