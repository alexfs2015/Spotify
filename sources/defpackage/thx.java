package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: thx reason: default package */
public final class thx implements a<PlayerState> {
    public final url a;
    public igp b;

    public final /* synthetic */ void onChanged(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        this.b.a(playerState.duration());
        long currentPlaybackPosition = playerState.currentPlaybackPosition();
        this.b.a(currentPlaybackPosition, playerState.playbackSpeed() == 0.0f ? currentPlaybackPosition : playerState.duration(), playerState.playbackSpeed());
    }

    public thx(url url) {
        this.a = url;
    }
}
