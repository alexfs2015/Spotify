package defpackage;

import io.reactivex.Scheduler;

/* renamed from: jdm reason: default package */
final class jdm {
    private final jbm a;
    private final jbi b;
    private final jbw c;
    private final Scheduler d;
    private final Scheduler e;

    jdm(Scheduler scheduler, Scheduler scheduler2, jbm jbm, jbi jbi, jbw jbw) {
        this.d = scheduler;
        this.e = scheduler2;
        this.a = jbm;
        this.b = jbi;
        this.c = jbw;
    }

    /* access modifiers changed from: 0000 */
    public final jdl a(jal jal) {
        jdl jdl = new jdl(this.d, this.e, this.a, this.b, this.c, jal);
        return jdl;
    }
}
