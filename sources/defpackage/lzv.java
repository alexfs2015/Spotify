package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: lzv reason: default package */
public final class lzv {
    Disposable a = Disposables.b();
    lzt b;
    lzy c;
    private final Observable<Boolean> d;
    private final kvb e;
    private final vti<lzy> f;
    private final vti<lzt> g;
    private final Scheduler h;

    lzv(Observable<Boolean> observable, kvb kvb, vti<lzy> vti, vti<lzt> vti2, Scheduler scheduler) {
        this.d = (Observable) fay.a(observable);
        this.e = (kvb) fay.a(kvb);
        this.f = (vti) fay.a(vti);
        this.g = (vti) fay.a(vti2);
        this.h = (Scheduler) fay.a(scheduler);
    }

    public final void a() {
        this.a.bf_();
        this.a = this.d.a(this.h).a((Consumer<? super T>) new $$Lambda$lzv$k46LR9pJnhQBxucmBScXTm5PQKA<Object>(this), (Consumer<? super Throwable>) $$Lambda$lzv$hxNY_y7Nax7JN4zBCnDaf5JgNhA.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            this.e.a(true);
            this.c = (lzy) this.f.get();
            this.c.a();
            return;
        }
        if (this.e.b.a(kvb.a, false)) {
            this.e.a(false);
            this.b = (lzt) this.g.get();
            this.b.a();
        }
        lzy lzy = this.c;
        if (lzy != null) {
            lzy.b();
        }
    }
}
