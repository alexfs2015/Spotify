package defpackage;

import android.util.Patterns;

/* renamed from: pjb reason: default package */
public final class pjb implements a {
    private final lon a;
    private final tyj b;
    private final piv c;
    private final String d;
    private final phf e;

    public pjb(lon lon, tyj tyj, piv piv, String str, phf phf) {
        this.a = lon;
        this.b = tyj;
        this.c = piv;
        this.d = str;
        this.e = phf;
    }

    public final void a() {
        this.c.e();
    }

    public final void a(String str) {
        if (Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            this.c.h();
        } else if (jva.h(str)) {
            this.c.d(str);
        } else {
            this.c.g();
        }
    }

    public final void a(String str, long j, boolean z) {
        if (!this.e.b || !z) {
            this.b.a(str, this.d, j);
        } else {
            this.a.a(this.d, str);
        }
        this.c.f();
    }
}
