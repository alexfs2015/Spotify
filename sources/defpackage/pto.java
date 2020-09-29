package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

/* renamed from: pto reason: default package */
public abstract class pto {
    PlayerState a;
    private final int b;
    private final int c;
    private boolean d;
    private final PlayerStateObserver e;

    /* access modifiers changed from: protected */
    public abstract void a(PlayerState playerState);

    /* access modifiers changed from: protected */
    public abstract boolean a(PlayerState playerState, PlayerState playerState2);

    protected pto() {
        this(0, 0);
    }

    protected pto(int i, int i2) {
        this.e = new PlayerStateObserver() {
            public final void onPlayerStateReceived(PlayerState playerState) {
                if (pto.this.a != null) {
                    pto pto = pto.this;
                    if (!pto.a(pto.a, playerState)) {
                        return;
                    }
                }
                pto.this.a(playerState);
                pto.this.a = playerState;
            }
        };
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            ((PlayerStateCompat) ggw.a(PlayerStateCompat.class)).subscribe(this.e, this.b, this.c);
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ((PlayerStateCompat) ggw.a(PlayerStateCompat.class)).unsubscribe(this.e);
        }
    }

    protected static boolean b(PlayerState playerState, PlayerState playerState2) {
        return !faw.a(playerState.entityUri(), playerState2.entityUri());
    }

    protected static boolean c(PlayerState playerState, PlayerState playerState2) {
        return playerState.isPaused() != playerState2.isPaused();
    }
}
