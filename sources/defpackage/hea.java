package defpackage;

import io.reactivex.Scheduler;

/* renamed from: hea reason: default package */
public final class hea implements heg {
    private final Scheduler a;
    private final Scheduler b;
    private final Scheduler c;

    public hea(Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
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
