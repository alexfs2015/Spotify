package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: usl reason: default package */
public final class usl implements a {
    private final Player a;
    private final urj b;
    private final usk c;
    private boolean d;
    private usm e;

    public usl(Player player, urj urj, usk usk) {
        this.a = player;
        this.b = urj;
        this.c = usk;
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

    public final void a(usm usm) {
        this.e = (usm) fay.a(usm);
        this.e.a(this);
        this.b.a((a<T>) new $$Lambda$usl$mfR9kWughDLRwihMwlEGPVkgD3E<T>(this));
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
}
