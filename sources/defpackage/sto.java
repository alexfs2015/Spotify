package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: sto reason: default package */
public final class sto implements srt {
    private final krq a;

    public sto(krq krq) {
        this.a = krq;
    }

    public final boolean a(PlayerState playerState) {
        PlayerTrack playerTrack = (PlayerTrack) fay.a(playerState.track());
        return !slh.a(playerTrack) && this.a.a.a().containsTrack(playerTrack.uri());
    }
}
