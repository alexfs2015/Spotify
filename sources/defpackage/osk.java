package defpackage;

import io.reactivex.Scheduler;

/* renamed from: osk reason: default package */
public final class osk implements wig<osj> {
    private final wzi<ome> a;
    private final wzi<Scheduler> b;

    private osk(wzi<ome> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static osk a(wzi<ome> wzi, wzi<Scheduler> wzi2) {
        return new osk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new osj((ome) this.a.get(), (Scheduler) this.b.get());
    }
}
