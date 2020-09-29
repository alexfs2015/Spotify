package defpackage;

import android.content.Context;

/* renamed from: etb reason: default package */
public final class etb {
    final Context a;
    String b;
    String c;
    String d;
    boolean e = true;
    Boolean f;
    eqr g;

    public etb(Context context, eqr eqr) {
        bwx.a(context);
        Context applicationContext = context.getApplicationContext();
        bwx.a(applicationContext);
        this.a = applicationContext;
        if (eqr != null) {
            this.g = eqr;
            this.b = eqr.f;
            this.c = eqr.e;
            this.d = eqr.d;
            this.e = eqr.c;
            if (eqr.g != null) {
                this.f = Boolean.valueOf(eqr.g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
