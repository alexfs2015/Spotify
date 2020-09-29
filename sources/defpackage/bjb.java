package defpackage;

import java.lang.ref.WeakReference;

@cey
/* renamed from: bjb reason: default package */
public final class bjb {
    doy a;
    boolean b;
    boolean c;
    private final bjd d;
    private final Runnable e;
    private long f;

    public bjb(bho bho) {
        this(bho, new bjd(cmd.a));
    }

    private bjb(bho bho, bjd bjd) {
        this.b = false;
        this.c = false;
        this.f = 0;
        this.d = bjd;
        this.e = new bjc(this, new WeakReference(bho));
    }

    public final void a() {
        this.b = false;
        this.d.a(this.e);
    }

    public final void a(doy doy) {
        a(doy, 60000);
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

    public final void a(doy doy, long j) {
        if (this.b) {
            cow.a(5);
            return;
        }
        this.a = doy;
        this.b = true;
        this.f = j;
        if (!this.c) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j);
            sb.append(" milliseconds from now.");
            sb.toString();
            cow.a(4);
            this.d.a(this.e, j);
        }
    }
}
