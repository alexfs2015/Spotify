package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: ufg reason: default package */
public final class ufg implements uez {
    private final ufi a;
    private final Player b;
    private final uhz c;
    private final ufy d;
    private final sso e;

    public ufg(ufi ufi, Player player, uhz uhz, sso sso, ufy ufy) {
        this.a = ufi;
        this.b = player;
        this.c = uhz;
        this.d = ufy;
        this.e = sso;
    }

    private boolean a(vkv vkv) {
        PlayerState lastPlayerState = this.b.getLastPlayerState();
        PlayerTrack track = lastPlayerState != null ? lastPlayerState.track() : null;
        return lastPlayerState != null && lastPlayerState.isPlaying() && !lastPlayerState.isPaused() && track != null && track.uri().equals(vkv.getUri());
    }

    private void b(vkv vkv, vkv[] vkvArr, String str, int i) {
        this.a.a(vkv, vkvArr, str, i);
    }

    public final void a(vkv vkv, vkv[] vkvArr, String str, int i) {
        if (a(vkv)) {
            this.b.pause();
            this.c.c(vkv.getUri(), str, i);
        } else if (!this.d.a() || !vkv.i()) {
            b(vkv, vkvArr, str, i);
        } else {
            this.d.a(vkv.getUri(), this.e.toString());
        }
    }
}
