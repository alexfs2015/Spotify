package defpackage;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

@cfp
/* renamed from: biu reason: default package */
final class biu extends cmg {
    final /* synthetic */ bir a;
    private final int b;

    public biu(bir bir, int i) {
        this.a = bir;
        this.b = i;
    }

    public final void a() {
        biw biw = new biw(this.a.e.J, this.a.J(), this.a.l, this.a.m, this.a.e.J ? this.b : -1, this.a.n, this.a.e.j.L, this.a.e.j.O);
        int C = this.a.e.j.b.C();
        if (C == -1) {
            C = this.a.e.j.h;
        }
        int i = C;
        bir bir = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bir, bir, bir, bir.e.j.b, i, this.a.e.e, this.a.e.j.A, biw);
        cmu.a.post(new biv(this, adOverlayInfoParcel));
    }

    public final void s_() {
    }
}
