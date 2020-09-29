package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: trp reason: default package */
public final class trp implements a, a {
    private final vco a;
    private final vcs b;
    private boolean c;
    private tsj d;

    public trp(vco vco, vcs vcs) {
        this.a = vco;
        this.b = vcs;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerTrack playerTrack) {
        if (this.c) {
            this.d.e();
        } else {
            this.d.e(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.c = bool.booleanValue();
    }

    public final void a() {
        if (this.c) {
            this.d.e();
        } else {
            this.d.e(false);
        }
    }

    public final void a(tsj tsj) {
        this.d = (tsj) fbp.a(tsj);
        this.a.a((a<T>) new $$Lambda$trp$we0MtIVdyQF1i1bWhtD8jux2D4A<T>(this));
        this.b.a((a<T>) new $$Lambda$trp$LpyhQpwu4ofmsNPimJp95q7jAUw<T>(this));
        this.d.a((a) this);
    }

    public final void d() {
        if (!this.c) {
            this.d.e(false);
        } else if (this.d.d()) {
            this.d.e();
        } else {
            this.d.e(true);
        }
    }
}
