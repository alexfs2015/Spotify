package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: mea reason: default package */
public final class mea implements wig<mdy> {
    private final wzi<Observable<Boolean>> a;
    private final wzi<kyk> b;
    private final wzi<meb> c;
    private final wzi<mdw> d;
    private final wzi<Scheduler> e;

    public static mdy a(Observable<Boolean> observable, kyk kyk, who<meb> who, who<mdw> who2, Scheduler scheduler) {
        mdy mdy = new mdy(observable, kyk, who, who2, scheduler);
        return mdy;
    }

    public final /* synthetic */ Object get() {
        mdy mdy = new mdy((Observable) this.a.get(), (kyk) this.b.get(), wif.b(this.c), wif.b(this.d), (Scheduler) this.e.get());
        return mdy;
    }
}
