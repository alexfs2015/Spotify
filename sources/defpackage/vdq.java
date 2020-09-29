package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: vdq reason: default package */
public final class vdq implements a {
    private final Player a;
    private final vco b;
    private final vdp c;
    private boolean d;
    private vdr e;

    public vdq(Player player, vco vco, vdp vdp) {
        this.a = player;
        this.b = vco;
        this.c = vdp;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.d = z;
        if (this.d) {
            this.e.f();
        } else {
            this.e.e();
        }
    }

    public final void a() {
        if (this.d) {
            this.c.b();
            this.a.pause();
            return;
        }
        this.c.a();
        this.a.resume();
    }

    public final void a(vdr vdr) {
        this.e = (vdr) fbp.a(vdr);
        this.e.a(this);
        this.b.a((a<T>) new $$Lambda$vdq$f2YYV4zYtY3ohVwhU5rEmmWJu4M<T>(this));
    }
}
