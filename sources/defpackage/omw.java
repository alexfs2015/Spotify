package defpackage;

import io.reactivex.Scheduler;

/* renamed from: omw reason: default package */
public final class omw implements wig<omv> {
    private final wzi<opw> a;
    private final wzi<omr> b;
    private final wzi<hec> c;
    private final wzi<String> d;
    private final wzi<Scheduler> e;

    private omw(wzi<opw> wzi, wzi<omr> wzi2, wzi<hec> wzi3, wzi<String> wzi4, wzi<Scheduler> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static omw a(wzi<opw> wzi, wzi<omr> wzi2, wzi<hec> wzi3, wzi<String> wzi4, wzi<Scheduler> wzi5) {
        omw omw = new omw(wzi, wzi2, wzi3, wzi4, wzi5);
        return omw;
    }

    public final /* synthetic */ Object get() {
        omv omv = new omv((opw) this.a.get(), (omr) this.b.get(), (hec) this.c.get(), (String) this.d.get(), (Scheduler) this.e.get());
        return omv;
    }
}
