package defpackage;

import io.reactivex.Scheduler;

/* renamed from: jba reason: default package */
final class jba {
    private final izb a;
    private final iyx b;
    private final izl c;
    private final Scheduler d;
    private final Scheduler e;

    jba(Scheduler scheduler, Scheduler scheduler2, izb izb, iyx iyx, izl izl) {
        this.d = scheduler;
        this.e = scheduler2;
        this.a = izb;
        this.b = iyx;
        this.c = izl;
    }

    /* access modifiers changed from: 0000 */
    public final jaz a(iya iya) {
        jaz jaz = new jaz(this.d, this.e, this.a, this.b, this.c, iya);
        return jaz;
    }
}
