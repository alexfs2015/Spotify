package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ssg reason: default package */
public final class ssg implements wig<ssf> {
    private final wzi<Scheduler> a;
    private final wzi<ssh> b;
    private final wzi<ssj> c;
    private final wzi<hgz> d;

    private ssg(wzi<Scheduler> wzi, wzi<ssh> wzi2, wzi<ssj> wzi3, wzi<hgz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ssg a(wzi<Scheduler> wzi, wzi<ssh> wzi2, wzi<ssj> wzi3, wzi<hgz> wzi4) {
        return new ssg(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ssf((Scheduler) this.a.get(), (ssh) this.b.get(), (ssj) this.c.get(), (hgz) this.d.get());
    }
}
