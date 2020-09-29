package defpackage;

import android.text.TextUtils;

/* renamed from: clx reason: default package */
final class clx extends cmg {
    private final /* synthetic */ clv a;

    clx(clv clv) {
        this.a = clv;
    }

    public final void a() {
        dti dti = new dti(this.a.e, this.a.f.a);
        synchronized (this.a.a) {
            try {
                bkc.n();
                dtj dtj = this.a.g;
                if (dti.c == null) {
                    throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
                } else if (!TextUtils.isEmpty(dti.d)) {
                    dtj.a(dti.c, dti.d, dti.a, dti.b);
                } else {
                    throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
                }
            } catch (IllegalArgumentException unused) {
                cpn.a(5);
            }
        }
    }

    public final void s_() {
    }
}
