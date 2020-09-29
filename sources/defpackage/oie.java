package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oie reason: default package */
public final class oie implements wig<gnl<ohl>> {
    private final wzi<Scheduler> a;
    private final wzi<ohy> b;

    private oie(wzi<Scheduler> wzi, wzi<ohy> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oie a(wzi<Scheduler> wzi, wzi<ohy> wzi2) {
        return new oie(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gnl) wil.a(new gnl((Scheduler) this.a.get(), (ohy) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
