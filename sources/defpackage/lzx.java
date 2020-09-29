package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: lzx reason: default package */
public final class lzx implements vua<lzv> {
    private final wlc<Observable<Boolean>> a;
    private final wlc<kvb> b;
    private final wlc<lzy> c;
    private final wlc<lzt> d;
    private final wlc<Scheduler> e;

    public static lzv a(Observable<Boolean> observable, kvb kvb, vti<lzy> vti, vti<lzt> vti2, Scheduler scheduler) {
        lzv lzv = new lzv(observable, kvb, vti, vti2, scheduler);
        return lzv;
    }

    public final /* synthetic */ Object get() {
        lzv lzv = new lzv((Observable) this.a.get(), (kvb) this.b.get(), vtz.b(this.c), vtz.b(this.d), (Scheduler) this.e.get());
        return lzv;
    }
}
