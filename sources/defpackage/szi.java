package defpackage;

import android.content.Intent;

/* renamed from: szi reason: default package */
public final class szi {
    private final szc a;
    private final szg b;
    private final szr c;

    public szi(szc szc, szg szg, szr szr) {
        this.a = szc;
        this.b = szg;
        this.c = szr;
    }

    public final void a(jqx jqx, Intent intent) {
        sza a2 = sze.a(intent);
        szb a3 = this.a.a(intent, jqx);
        syx b2 = sze.b(intent);
        this.c.applyReferrerFromIntent(jqx, intent);
        this.b.a(a2, jqx.ae(), a3, b2);
    }
}
