package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: jiw reason: default package */
public final class jiw implements PlayerStateObserver {
    private AudioStream a = AudioStream.DEFAULT;
    private final jiv b;

    jiw(jiv jiv) {
        this.b = jiv;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        if (playerState.audioStream() != null && playerState.audioStream() != this.a) {
            this.a = playerState.audioStream();
            this.b.a(this.a);
        }
    }
}
