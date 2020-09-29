package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: tib reason: default package */
public final class tib implements a, b {
    private final kxp a;
    private final szp b;
    private final kxz c;
    private final vcs d;
    private final vcn e;
    private tic f;
    private kxy g;

    public tib(szp szp, kxp kxp, kxz kxz, vcs vcs, vcn vcn) {
        this.b = (szp) fbp.a(szp);
        this.a = (kxp) fbp.a(kxp);
        this.c = (kxz) fbp.a(kxz);
        this.d = (vcs) fbp.a(vcs);
        this.e = vcn;
    }

    /* access modifiers changed from: private */
    public void a(PlayerTrack playerTrack) {
        this.g = this.a.a(playerTrack) ? kxz.a(playerTrack) : null;
        kxy kxy = this.g;
        if (kxy != null) {
            this.f.b(kxy.f());
            this.f.a(this.g.h());
        }
    }

    /* access modifiers changed from: private */
    public void a(vcm vcm) {
        this.f.a(vcm.b());
    }

    public final void a() {
        this.f.b();
    }

    public final void a(tic tic, tks tks) {
        this.f = (tic) fbp.a(tic);
        this.f.a((a) this);
        this.d.a((a<T>) new $$Lambda$tib$NOEGuBaMfF5tzz6HeJpcfKKitso<T>(this));
        this.e.a((a<T>) new $$Lambda$tib$NTy1cXmJBp8m1Srlvfjh16KrEOM<T>(this));
        tks.a((b) this);
    }

    public final void b() {
        if (this.g != null) {
            this.f.a();
        } else {
            this.f.b();
        }
    }

    public final void c() {
        kxy kxy = this.g;
        if (kxy != null) {
            this.b.a(kxy.g());
        }
    }
}
