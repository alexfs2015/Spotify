package defpackage;

import android.content.res.Resources;

/* renamed from: tmm reason: default package */
public final class tmm {
    public final String a;
    private final String b;
    private final tmr c;
    private final tmr d;

    public tmm(tmr tmr, tmr tmr2, String str, String str2) {
        this.c = tmr;
        this.d = tmr2;
        this.b = str;
        this.a = str2;
    }

    public final String a(Resources resources) {
        return this.c.a(resources);
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }

    public final String b(Resources resources) {
        return this.d.a(resources);
    }
}
