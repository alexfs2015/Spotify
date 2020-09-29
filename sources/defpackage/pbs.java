package defpackage;

import android.util.Patterns;

/* renamed from: pbs reason: default package */
public final class pbs implements a {
    private final lkn a;
    private final tmo b;
    private final pbm c;
    private final String d;
    private final ozw e;

    public pbs(lkn lkn, tmo tmo, pbm pbm, String str, ozw ozw) {
        this.a = lkn;
        this.b = tmo;
        this.c = pbm;
        this.d = str;
        this.e = ozw;
    }

    public final void a(String str, long j, boolean z) {
        if (!this.e.b || !z) {
            this.b.a(str, this.d, j);
        } else {
            this.a.a(this.d, str);
        }
        this.c.f();
    }

    public final void a() {
        this.c.e();
    }

    public final void a(String str) {
        if (Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            this.c.h();
        } else if (jst.h(str)) {
            this.c.d(str);
        } else {
            this.c.g();
        }
    }
}
