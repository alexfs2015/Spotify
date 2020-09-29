package defpackage;

import io.reactivex.Scheduler;

/* renamed from: scb reason: default package */
public final class scb implements wig<sca> {
    private final wzi<scc> a;
    private final wzi<scf> b;
    private final wzi<Scheduler> c;

    private scb(wzi<scc> wzi, wzi<scf> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static scb a(wzi<scc> wzi, wzi<scf> wzi2, wzi<Scheduler> wzi3) {
        return new scb(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new sca((scc) this.a.get(), (scf) this.b.get(), (Scheduler) this.c.get());
    }
}
