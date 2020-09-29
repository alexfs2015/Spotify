package defpackage;

import android.content.Context;
import android.os.Bundle;

@cfp
/* renamed from: ciy reason: default package */
public final class ciy extends cjj {
    private final Context a;
    private final Object b;
    private final cpp c;
    private final ciz d;

    public ciy(Context context, bkz bkz, edg edg, cpp cpp) {
        ciz ciz = new ciz(context, bkz, dpt.b(), edg, cpp);
        this(context, cpp, ciz);
    }

    private ciy(Context context, cpp cpp, ciz ciz) {
        this.b = new Object();
        this.a = context;
        this.c = cpp;
        this.d = ciz;
    }

    public final void a() {
        synchronized (this.b) {
            ciz ciz = this.d;
            bxo.b("showAd must be called on the main UI thread.");
            if (!ciz.J()) {
                cpn.a(5);
            } else {
                ciz.l.a(ciz.k);
            }
        }
    }

    public final void a(cbi cbi) {
        synchronized (this.b) {
            this.d.o();
        }
    }

    public final void a(cjf cjf) {
        synchronized (this.b) {
            this.d.a(cjf);
        }
    }

    public final void a(cjn cjn) {
        synchronized (this.b) {
            this.d.a(cjn);
        }
    }

    public final void a(cjt cjt) {
        synchronized (this.b) {
            this.d.a(cjt);
        }
    }

    public final void a(dqz dqz) {
        if (((Boolean) dqe.f().a(dtg.aD)).booleanValue()) {
            synchronized (this.b) {
                this.d.a(dqz);
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
        if (!((Boolean) dqe.f().a(dtg.aD)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.b) {
            q = this.d.q();
        }
        return q;
    }

    public final void b(cbi cbi) {
        Context context;
        synchronized (this.b) {
            if (cbi == null) {
                context = null;
            } else {
                try {
                    context = (Context) cbj.a(cbi);
                } catch (Exception unused) {
                    cpn.a(5);
                }
            }
            if (context != null) {
                this.d.a(context);
            }
            this.d.p();
        }
    }

    public final void c(cbi cbi) {
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
        a((cbi) null);
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
}
