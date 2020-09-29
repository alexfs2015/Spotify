package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: tob reason: default package */
public final class tob implements a {
    private final Player a;
    private final vcq b;
    private final vcy c;
    private final vcx d;
    private final vea e;
    private final tlr f;
    private tqe g;
    private boolean h;
    private float i = -1.0f;

    public tob(Player player, vcy vcy, vcx vcx, vcq vcq, tlr tlr, vea vea) {
        this.a = player;
        this.b = vcq;
        this.c = vcy;
        this.d = vcx;
        this.e = vea;
        this.f = tlr;
    }

    /* access modifiers changed from: private */
    public void a(long j) {
        if (!this.h) {
            this.g.a((int) j);
            this.g.c((int) (j / 1000));
        }
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
    public void b(long j) {
        this.g.d((int) j);
        if (!this.f.a()) {
            this.g.d(true);
        }
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

    public final void a(tqe tqe) {
        this.g = tqe;
        tqe.a((a) this);
        this.b.a((a<T>) new $$Lambda$tob$qFaWJ_pstRTrYZS9mgQr0WhSSA<T>(this));
        this.c.a((a<T>) new $$Lambda$tob$_tynDZhPhFMDrU9I2tkOJFvogVs<T>(this));
        this.d.a((a<T>) new $$Lambda$tob$SdrnjR0xUkNU9GtUvZPjMdPUpxA<T>(this));
    }
}
