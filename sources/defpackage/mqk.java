package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: mqk reason: default package */
public final class mqk implements wig<Observable<mqa>> {
    private final wzi<mpt> a;
    private final wzi<mqm> b;
    private final wzi<Scheduler> c;

    private mqk(wzi<mpt> wzi, wzi<mqm> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mqk a(wzi<mpt> wzi, wzi<mqm> wzi2, wzi<Scheduler> wzi3) {
        return new mqk(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((mpt) this.a.get(), (mqm) this.b.get(), (Scheduler) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
