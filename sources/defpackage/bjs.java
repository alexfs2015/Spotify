package defpackage;

import java.lang.ref.WeakReference;

@cfp
/* renamed from: bjs reason: default package */
public final class bjs {
    dpp a;
    boolean b;
    boolean c;
    private final bju d;
    private final Runnable e;
    private long f;

    public bjs(bif bif) {
        this(bif, new bju(cmu.a));
    }

    private bjs(bif bif, bju bju) {
        this.b = false;
        this.c = false;
        this.f = 0;
        this.d = bju;
        this.e = new bjt(this, new WeakReference(bif));
    }

    public final void a() {
        this.b = false;
        this.d.a(this.e);
    }

    public final void a(dpp dpp) {
        a(dpp, 60000);
    }

    public final void a(dpp dpp, long j) {
        if (this.b) {
            cpn.a(5);
            return;
        }
        this.a = dpp;
        this.b = true;
        this.f = j;
        if (!this.c) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j);
            sb.append(" milliseconds from now.");
            sb.toString();
            cpn.a(4);
            this.d.a(this.e, j);
        }
    }

    public final void b() {
        this.c = true;
        if (this.b) {
            this.d.a(this.e);
        }
    }

    public final void c() {
        this.c = false;
        if (this.b) {
            this.b = false;
            a(this.a, this.f);
        }
    }
}
