package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;

/* renamed from: oqz reason: default package */
final class oqz {
    final Player a;
    final List<a> b = Lists.a();
    final CompletableSubject c = CompletableSubject.f();
    final PlayerStateObserver d = new $$Lambda$oqz$IB_oKVmaX9Rua3k4YMuE5c1rMlU(this);
    private final hcz e;
    private String f;
    private hcz g;
    private boolean h;

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerState playerState) {
        a(playerState, false);
    }

    oqz(Player player, String str) {
        this.a = player;
        this.e = new hcz(str);
    }

    public final boolean a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (a(lastPlayerState)) {
            this.a.pause();
            return true;
        }
        if (!(lastPlayerState != null && new hcz(lastPlayerState.contextUri()).equals(this.e) && lastPlayerState.isPaused() && lastPlayerState.isPlaying())) {
            return false;
        }
        this.a.resume();
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(PlayerState playerState) {
        if (playerState != null && new hcz(playerState.contextUri()).equals(this.e) && playerState.isPlaying() && !playerState.isPaused()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void a(PlayerState playerState, boolean z) {
        this.c.onComplete();
        boolean a2 = a(playerState);
        for (a a3 : this.b) {
            a3.a(a2);
        }
        PlayerTrack track = playerState.track();
        String uid = track != null ? track.uid() : null;
        hcz hcz = new hcz(playerState.contextUri());
        boolean z2 = playerState.isPlaying() && !playerState.isPaused();
        if (!faw.a(hcz, this.g) || !faw.a(uid, this.f) || z2 != this.h || z) {
            for (a a4 : this.b) {
                a4.a(hcz.equals(this.e) ? uid : null, z2);
            }
            this.f = uid;
            this.g = hcz;
            this.h = z2;
        }
    }
}
