package defpackage;

import android.text.TextUtils;

/* renamed from: gvz reason: default package */
public final class gvz implements gvk {
    private final spi b;
    private final gxz c;
    private final gzm d;
    private final vol e;

    public gvz(spi spi, gxz gxz, gzm gzm, vol vol) {
        this.b = (spi) fay.a(spi);
        this.c = (gxz) fay.a(gxz);
        this.d = gzm;
        this.e = vol;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("uri", "");
        if (!TextUtils.isEmpty(string)) {
            this.b.a(string);
            this.c.logInteraction(string, guy.b, "navigate-forward", null);
            vol vol = this.e;
            C0083a a = this.d.a(guy);
            a a2 = voo.a();
            a2.a = voj.this.a;
            a2.b = voj.this.b;
            a2.c = voj.this.c;
            a2.g = voj.this.d;
            a2.d = voj.this.e;
            a a3 = a2.a(a.this.a);
            a3.e = a.a;
            a3.f = "ui_navigate";
            vol.a(a3.a("destination", string).a());
        }
    }

    public static gzp a(String str) {
        return haa.builder().a("navigate").a("uri", str).a();
    }
}
