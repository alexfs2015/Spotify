package defpackage;

import android.text.TextUtils;

/* renamed from: gya reason: default package */
public final class gya implements gxk {
    private final szp b;
    private final has c;
    private final hcf d;
    private final wbt e;

    public gya(szp szp, has has, hcf hcf, wbt wbt) {
        this.b = (szp) fbp.a(szp);
        this.c = (has) fbp.a(has);
        this.d = hcf;
        this.e = wbt;
    }

    public static hci a(String str) {
        return hct.builder().a("navigate").a("uri", str).a();
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri", "");
        if (!TextUtils.isEmpty(string)) {
            this.b.a(string);
            this.c.logInteraction(string, gwy.b, "navigate-forward", null);
            wbt wbt = this.e;
            C0086a a = this.d.a(gwy);
            a a2 = wbw.a();
            a2.a = wbr.this.a;
            a2.b = wbr.this.b;
            a2.c = wbr.this.c;
            a2.g = wbr.this.d;
            a2.d = wbr.this.e;
            a a3 = a2.a(a.this.a);
            a3.e = a.a;
            a3.f = "ui_navigate";
            wbt.a(a3.a("destination", string).a());
        }
    }
}
