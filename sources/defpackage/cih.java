package defpackage;

import android.content.Context;
import android.os.Bundle;

@cey
/* renamed from: cih reason: default package */
public final class cih extends cis {
    private final Context a;
    private final Object b;
    private final coy c;
    private final cii d;

    public cih(Context context, bki bki, ecp ecp, coy coy) {
        cii cii = new cii(context, bki, dpc.b(), ecp, coy);
        this(context, coy, cii);
    }

    private cih(Context context, coy coy, cii cii) {
        this.b = new Object();
        this.a = context;
        this.c = coy;
        this.d = cii;
    }

    public final void a(car car) {
        synchronized (this.b) {
            this.d.o();
        }
    }

    public final void a(cio cio) {
        synchronized (this.b) {
            this.d.a(cio);
        }
    }

    public final void a(ciw ciw) {
        synchronized (this.b) {
            this.d.a(ciw);
        }
    }

    public final void a(cjc cjc) {
        synchronized (this.b) {
            this.d.a(cjc);
        }
    }

    public final void a(dqi dqi) {
        if (((Boolean) dpn.f().a(dsp.aD)).booleanValue()) {
            synchronized (this.b) {
                this.d.a(dqi);
            }
        }
    }

    public final void a(String str) {
        synchronized (this.b) {
            this.d.a(str);
        }
    }

    public final void a(boolean z) {
        synchronized (this.b) {
            this.d.c(z);
        }
    }

    public final Bundle b() {
        Bundle q;
        if (!((Boolean) dpn.f().a(dsp.aD)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.b) {
            q = this.d.q();
        }
        return q;
    }

    public final void c(car car) {
        synchronized (this.b) {
            this.d.j();
        }
    }

    public final boolean c() {
        boolean J;
        synchronized (this.b) {
            J = this.d.J();
        }
        return J;
    }

    public final void d() {
        a((car) null);
    }

    public final void e() {
        b(null);
    }

    public final void f() {
        c(null);
    }

    public final String g() {
        String a2;
        synchronized (this.b) {
            a2 = this.d.a();
        }
        return a2;
    }

    public final void a() {
        synchronized (this.b) {
            cii cii = this.d;
            bwx.b("showAd must be called on the main UI thread.");
            if (!cii.J()) {
                cow.a(5);
            } else {
                cii.l.a(cii.k);
            }
        }
    }

    public final void b(car car) {
        Context context;
        synchronized (this.b) {
            if (car == null) {
                context = null;
            } else {
                try {
                    context = (Context) cas.a(car);
                } catch (Exception unused) {
                    cow.a(5);
                }
            }
            if (context != null) {
                this.d.a(context);
            }
            this.d.p();
        }
    }
}
