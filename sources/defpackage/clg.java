package defpackage;

import android.text.TextUtils;

/* renamed from: clg reason: default package */
final class clg extends clp {
    private final /* synthetic */ cle a;

    clg(cle cle) {
        this.a = cle;
    }

    public final void s_() {
    }

    public final void a() {
        dsr dsr = new dsr(this.a.e, this.a.f.a);
        synchronized (this.a.a) {
            try {
                bjl.n();
                dss dss = this.a.g;
                if (dsr.c == null) {
                    throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
                } else if (!TextUtils.isEmpty(dsr.d)) {
                    dss.a(dsr.c, dsr.d, dsr.a, dsr.b);
                } else {
                    throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
                }
            } catch (IllegalArgumentException unused) {
                cow.a(5);
            }
        }
    }
}
