package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: hna reason: default package */
public abstract class hna {
    private String a;
    private AudioStream b;

    /* access modifiers changed from: protected */
    public abstract void a(String str, AudioStream audioStream);

    public void a(PlayerState playerState) {
        if (playerState != null) {
            if (!fax.a(this.a) && this.b != null && !this.a.equals(playerState.playbackId())) {
                a(this.a, this.b);
                this.a = "";
            }
            if (playerState.playbackId() != null && playerState.isPlaying() && !playerState.isPaused()) {
                this.a = playerState.playbackId();
                this.b = playerState.audioStream() != null ? playerState.audioStream() : AudioStream.DEFAULT;
            }
        }
    }

    public final void a() {
        if (!fax.a(this.a)) {
            AudioStream audioStream = this.b;
            if (audioStream != null) {
                a(this.a, audioStream);
            }
        }
    }
}
