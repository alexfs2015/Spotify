package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: jhl reason: default package */
public final class jhl implements PlayerStateObserver {
    private Optional<Boolean> a = Optional.e();
    private Optional<String> b = Optional.e();
    private final jhk c;

    jhl(jhk jhk) {
        this.c = (jhk) fay.a(jhk);
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        fay.a(playerState);
        PlayerTrack track = playerState.track();
        Optional<String> b2 = track != null ? Optional.b(track.uri()) : Optional.e();
        boolean z = false;
        if (!this.b.equals(b2)) {
            this.b = b2;
            Object[] objArr = new Object[1];
            objArr[0] = b2.b() ? b2.c() : "<absent>";
            Logger.b("Playing content %s", objArr);
        }
        if (!playerState.isPaused() && playerState.isPlaying()) {
            z = true;
        }
        Optional<Boolean> b3 = Optional.b(Boolean.valueOf(z));
        if (!this.a.equals(b3)) {
            this.a = b3;
            if (((Boolean) b3.c()).booleanValue()) {
                this.c.b();
                return;
            }
            this.c.a();
        }
    }
}
