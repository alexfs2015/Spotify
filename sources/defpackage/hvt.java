package defpackage;

import io.reactivex.Scheduler;

/* renamed from: hvt reason: default package */
public final class hvt implements wig<hvs> {
    private final wzi<hvq> a;
    private final wzi<Scheduler> b;

    private hvt(wzi<hvq> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hvt a(wzi<hvq> wzi, wzi<Scheduler> wzi2) {
        return new hvt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hvs((hvq) this.a.get(), (Scheduler) this.b.get());
    }
}
