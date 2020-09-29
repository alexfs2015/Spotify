package defpackage;

import io.reactivex.Scheduler;

/* renamed from: roh reason: default package */
public final class roh implements wig<rog> {
    private final wzi<rwl> a;
    private final wzi<Scheduler> b;

    private roh(wzi<rwl> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static roh a(wzi<rwl> wzi, wzi<Scheduler> wzi2) {
        return new roh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rog((rwl) this.a.get(), (Scheduler) this.b.get());
    }
}
