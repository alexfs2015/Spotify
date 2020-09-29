package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: tds reason: default package */
public final class tds implements a {
    private final Player a;
    private final url b;
    private final urt c;
    private final urs d;
    private final usv e;
    private final tbk f;
    private tfp g;
    private boolean h;
    private float i = -1.0f;

    public tds(Player player, urt urt, urs urs, url url, tbk tbk, usv usv) {
        this.a = player;
        this.b = url;
        this.c = urt;
        this.d = urs;
        this.e = usv;
        this.f = tbk;
    }

    public final void a(tfp tfp) {
        this.g = tfp;
        tfp.a((a) this);
        this.b.a((a<T>) new $$Lambda$tds$pyXngRa_82LqKsp29dTcT6sBm2E<T>(this));
        this.c.a((a<T>) new $$Lambda$tds$PO1B6UdrEFpFmNMJ7lLkyHacxaM<T>(this));
        this.d.a((a<T>) new $$Lambda$tds$S7ma9iSiisSTCni8TtoYfqW36A<T>(this));
    }

    public final void a(int i2, boolean z) {
        this.h = z;
        if (!this.h) {
            this.e.i();
            this.a.seekTo((long) i2);
            return;
        }
        this.g.c(i2 / 1000);
    }

    /* access modifiers changed from: private */
    public void a(PlayerState playerState) {
        this.g.e(playerState.restrictions().disallowSeekingReasons().isEmpty());
        if ((((double) Math.abs(playerState.playbackSpeed() - this.i)) > 0.1d) || ((double) this.i) < -0.1d) {
            if (((double) playerState.playbackSpeed()) < 0.1d) {
                this.g.a(false);
                this.g.d(true);
            } else {
                this.g.a(true);
                this.g.d(true);
            }
        }
        this.i = playerState.playbackSpeed();
    }

    /* access modifiers changed from: private */
    public void a(long j) {
        if (!this.h) {
            this.g.a((int) j);
            this.g.c((int) (j / 1000));
        }
    }

    /* access modifiers changed from: private */
    public void b(long j) {
        this.g.d((int) j);
        if (!this.f.a()) {
            this.g.d(true);
        }
    }
}
