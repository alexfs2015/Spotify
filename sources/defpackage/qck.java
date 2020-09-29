package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

/* renamed from: qck reason: default package */
public abstract class qck {
    PlayerState a;
    private final int b;
    private final int c;
    private boolean d;
    private final PlayerStateObserver e;

    protected qck() {
        this(0, 0);
    }

    protected qck(int i, int i2) {
        this.e = new PlayerStateObserver() {
            public final void onPlayerStateReceived(PlayerState playerState) {
                if (qck.this.a != null) {
                    qck qck = qck.this;
                    if (!qck.a(qck.a, playerState)) {
                        return;
                    }
                }
                qck.this.a(playerState);
                qck.this.a = playerState;
            }
        };
        this.b = i;
        this.c = i2;
    }

    protected static boolean b(PlayerState playerState, PlayerState playerState2) {
        return !fbn.a(playerState.entityUri(), playerState2.entityUri());
    }

    protected static boolean c(PlayerState playerState, PlayerState playerState2) {
        return playerState.isPaused() != playerState2.isPaused();
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            ((PlayerStateCompat) gih.a(PlayerStateCompat.class)).subscribe(this.e, this.b, this.c);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(PlayerState playerState);

    /* access modifiers changed from: protected */
    public abstract boolean a(PlayerState playerState, PlayerState playerState2);

    public final void b() {
        if (this.d) {
            this.d = false;
            ((PlayerStateCompat) gih.a(PlayerStateCompat.class)).unsubscribe(this.e);
        }
    }
}
