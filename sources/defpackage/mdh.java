package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mdh reason: default package */
public final class mdh implements wig<mdg> {
    private final wzi<Scheduler> a;
    private final wzi<scc> b;
    private final wzi<mdl> c;

    private mdh(wzi<Scheduler> wzi, wzi<scc> wzi2, wzi<mdl> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mdh a(wzi<Scheduler> wzi, wzi<scc> wzi2, wzi<mdl> wzi3) {
        return new mdh(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mdg((Scheduler) this.a.get(), (scc) this.b.get(), (mdl) this.c.get());
    }
}
