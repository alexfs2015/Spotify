package defpackage;

import io.reactivex.Scheduler;

/* renamed from: nkd reason: default package */
public final class nkd implements wig<nkc> {
    private final wzi<nkb> a;
    private final wzi<rwl> b;
    private final wzi<Boolean> c;
    private final wzi<Scheduler> d;

    private nkd(wzi<nkb> wzi, wzi<rwl> wzi2, wzi<Boolean> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nkc a(nkb nkb, rwl rwl, boolean z, Scheduler scheduler) {
        return new nkc(nkb, rwl, z, scheduler);
    }

    public static nkd a(wzi<nkb> wzi, wzi<rwl> wzi2, wzi<Boolean> wzi3, wzi<Scheduler> wzi4) {
        return new nkd(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new nkc((nkb) this.a.get(), (rwl) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (Scheduler) this.d.get());
    }
}
