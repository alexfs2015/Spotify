package defpackage;

import io.reactivex.Scheduler;

/* renamed from: vlr reason: default package */
public final class vlr implements wig<vlq> {
    private final wzi<jtz> a;
    private final wzi<vlm> b;
    private final wzi<Scheduler> c;

    private vlr(wzi<jtz> wzi, wzi<vlm> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static vlr a(wzi<jtz> wzi, wzi<vlm> wzi2, wzi<Scheduler> wzi3) {
        return new vlr(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new vlq((jtz) this.a.get(), (vlm) this.b.get(), (Scheduler) this.c.get());
    }
}
