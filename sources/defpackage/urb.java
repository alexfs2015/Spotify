package defpackage;

import io.reactivex.Scheduler;

/* renamed from: urb reason: default package */
public final class urb implements wig<ura> {
    private final wzi<gmn> a;
    private final wzi<Scheduler> b;

    private urb(wzi<gmn> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static urb a(wzi<gmn> wzi, wzi<Scheduler> wzi2) {
        return new urb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ura((gmn) this.a.get(), (Scheduler) this.b.get());
    }
}
