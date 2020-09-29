package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;

/* renamed from: oyf reason: default package */
final class oyf {
    final Player a;
    final List<a> b = Lists.a();
    final CompletableSubject c = CompletableSubject.f();
    final PlayerStateObserver d = new $$Lambda$oyf$znqpRWpSOzSP_IHrH0h2sk3E60(this);
    private final hfv e;
    private String f;
    private hfv g;
    private boolean h;

    oyf(Player player, String str) {
        this.a = player;
        this.e = new hfv(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(PlayerState playerState) {
        a(playerState, false);
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
        hfv hfv = new hfv(playerState.contextUri());
        boolean z2 = playerState.isPlaying() && !playerState.isPaused();
        if (!fbn.a(hfv, this.g) || !fbn.a(uid, this.f) || z2 != this.h || z) {
            for (a a4 : this.b) {
                a4.a(hfv.equals(this.e) ? uid : null, z2);
            }
            this.f = uid;
            this.g = hfv;
            this.h = z2;
        }
    }

    public final boolean a() {
        PlayerState lastPlayerState = this.a.getLastPlayerState();
        if (a(lastPlayerState)) {
            this.a.pause();
            return true;
        }
        if (!(lastPlayerState != null && new hfv(lastPlayerState.contextUri()).equals(this.e) && lastPlayerState.isPaused() && lastPlayerState.isPlaying())) {
            return false;
        }
        this.a.resume();
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(PlayerState playerState) {
        return playerState != null && new hfv(playerState.contextUri()).equals(this.e) && playerState.isPlaying() && !playerState.isPaused();
    }
}
