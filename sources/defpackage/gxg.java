package defpackage;

/* renamed from: gxg reason: default package */
public final class gxg {
    final hcm a;
    final int b;

    private gxg(hcm hcm, int i) {
        this.a = (hcm) fbp.a(hcm);
        this.b = i;
    }

    public static gxg a(hcm hcm, gwm gwm) {
        fbp.a(hcm);
        hcm decorate = gwm.g.decorate(hcm);
        return new gxg(decorate, gwm.h.resolve(decorate));
    }
}
