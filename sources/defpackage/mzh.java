package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mzh reason: default package */
public final class mzh implements wig<mzg> {
    private final wzi<isn> a;
    private final wzi<Scheduler> b;
    private final wzi<String> c;

    private mzh(wzi<isn> wzi, wzi<Scheduler> wzi2, wzi<String> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mzh a(wzi<isn> wzi, wzi<Scheduler> wzi2, wzi<String> wzi3) {
        return new mzh(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mzg((isn) this.a.get(), (Scheduler) this.b.get(), (String) this.c.get());
    }
}
