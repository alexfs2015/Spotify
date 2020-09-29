package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: tsp reason: default package */
public final class tsp implements a<PlayerState> {
    public final vcq a;
    public ijc b;

    public tsp(vcq vcq) {
        this.a = vcq;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        this.b.a(playerState.duration());
        long currentPlaybackPosition = playerState.currentPlaybackPosition();
        this.b.a(currentPlaybackPosition, playerState.playbackSpeed() == 0.0f ? currentPlaybackPosition : playerState.duration(), playerState.playbackSpeed());
    }
}
