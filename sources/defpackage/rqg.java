package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rqg reason: default package */
public final class rqg implements wig<rqf> {
    private final wzi<rqh> a;
    private final wzi<Scheduler> b;
    private final wzi<Scheduler> c;

    private rqg(wzi<rqh> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rqg a(wzi<rqh> wzi, wzi<Scheduler> wzi2, wzi<Scheduler> wzi3) {
        return new rqg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (rqf) wil.a(new rqf((rqh) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
