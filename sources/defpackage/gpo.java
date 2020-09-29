package defpackage;

import io.reactivex.Scheduler;

/* renamed from: gpo reason: default package */
public final class gpo implements wig<gpn> {
    private final wzi<Scheduler> a;
    private final wzi<gix> b;

    private gpo(wzi<Scheduler> wzi, wzi<gix> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gpo a(wzi<Scheduler> wzi, wzi<gix> wzi2) {
        return new gpo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new gpn((Scheduler) this.a.get(), (gix) this.b.get());
    }
}
