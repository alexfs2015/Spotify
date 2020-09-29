package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: meb reason: default package */
public final class meb {
    private final hgy a;
    private final med b;
    private final kym c;
    private final kyt d;
    private final kyk e;
    private final Scheduler f;
    private Disposable g = Disposables.b();

    meb(hgy hgy, med med, kym kym, kyt kyt, kyk kyk, Scheduler scheduler) {
        this.a = (hgy) fbp.a(hgy);
        this.b = (med) fbp.a(med);
        this.c = (kym) fbp.a(kym);
        this.d = (kyt) fbp.a(kyt);
        this.e = (kyk) fbp.a(kyk);
        this.f = (Scheduler) fbp.a(scheduler);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        fqn fqn = (fqn) fbp.a(hoVar.a);
        boolean booleanValue = ((Boolean) fbp.a(hoVar.b)).booleanValue();
        if (this.e.a(fqn)) {
            kyq kyq = this.d.a;
            kyv kyv = kyq.c.d(fqn) ? kyq.b : kyq.a;
            if (booleanValue) {
                new a();
                kyv.a(new kzx(null, null, false, 0));
            } else if (kyv.a(fqn)) {
                kyv.a();
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    public final void a() {
        this.g.bd_();
        Observable a2 = this.a.a().j().a(Functions.a());
        Observable a3 = this.b.a();
        kym kym = this.c;
        kym.getClass();
        this.g = Observable.a((ObservableSource<? extends T1>) a2, (ObservableSource<? extends T2>) a3.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$eEYM_58ZKssbUFOf_TwVx_kOnZ8<Object,Object>(kym), false).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$obUZQ5sN8zzBjfQOSJUmTgjodA.INSTANCE).a(this.f).a((Consumer<? super T>) new $$Lambda$meb$wYyf6ftusovRuQ_CSlGFNbRXShI<Object>(this), (Consumer<? super Throwable>) $$Lambda$meb$_KWOyOA5AbMex6TtOEBxx_UGqU.INSTANCE);
    }

    public final void b() {
        this.g.bd_();
        this.d.a();
    }
}
