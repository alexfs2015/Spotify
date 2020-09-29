package defpackage;

import io.reactivex.Scheduler;

/* renamed from: hgw reason: default package */
public final class hgw implements hhc {
    private final Scheduler a;
    private final Scheduler b;
    private final Scheduler c;

    public hgw(Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = scheduler3;
    }

    public final Scheduler a() {
        return this.a;
    }

    public final Scheduler b() {
        return this.b;
    }

    public final Scheduler c() {
        return this.c;
    }
}
