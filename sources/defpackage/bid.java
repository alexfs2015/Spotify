package defpackage;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

@cey
/* renamed from: bid reason: default package */
final class bid extends clp {
    final /* synthetic */ bia a;
    private final int b;

    public bid(bia bia, int i) {
        this.a = bia;
        this.b = i;
    }

    public final void a() {
        bif bif = new bif(this.a.e.J, this.a.J(), this.a.l, this.a.m, this.a.e.J ? this.b : -1, this.a.n, this.a.e.j.L, this.a.e.j.O);
        int C = this.a.e.j.b.C();
        if (C == -1) {
            C = this.a.e.j.h;
        }
        int i = C;
        bia bia = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(bia, bia, bia, bia.e.j.b, i, this.a.e.e, this.a.e.j.A, bif);
        cmd.a.post(new bie(this, adOverlayInfoParcel));
    }

    public final void s_() {
    }
}
