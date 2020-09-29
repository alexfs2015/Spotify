package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tfi reason: default package */
final class tfi {
    public static ImmutableList<String> a(PlayerState playerState) {
        fbp.a(playerState);
        return ImmutableList.a(((PlayerTrack) fbp.a(playerState.track())).uri(), playerState.contextUri());
    }
}
