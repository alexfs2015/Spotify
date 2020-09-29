package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableInternalHelper;

/* renamed from: ntn reason: default package */
public final class ntn {
    public Disposable a = Disposables.b();
    private final Observable<SessionState> b;
    private final ntr c;
    private final Scheduler d;
    private final nsu e;
    private final ntl f;

    public ntn(ntr ntr, Scheduler scheduler, nsu nsu, Observable<SessionState> observable, ntl ntl) {
        this.c = (ntr) fay.a(ntr);
        this.d = scheduler;
        this.e = nsu;
        this.b = observable;
        this.f = ntl;
    }

    public final void a() {
        this.a.bf_();
        Observable a2 = this.b.c((Function<? super T, ? extends R>) $$Lambda$vBAchyDs5cF2YASEAOsxlt4ggc.INSTANCE).a((BiPredicate<? super T, ? super T>) $$Lambda$ntn$_MzquWWDWHktCA8nxmA_FdqVXo.INSTANCE);
        $$Lambda$ntn$T_vXig9pQQ9WlGqCopONx9N5Ve4 r1 = new $$Lambda$ntn$T_vXig9pQQ9WlGqCopONx9N5Ve4(this);
        $$Lambda$cQbgy5orlfyFmkf1XnaOUSZrWKE r2 = $$Lambda$cQbgy5orlfyFmkf1XnaOUSZrWKE.INSTANCE;
        int b2 = Observable.b();
        int b3 = Observable.b();
        ObjectHelper.a(r1, "mapper is null");
        ObjectHelper.a(r2, "combiner is null");
        Observable a3 = a2.a(ObservableInternalHelper.a(r1, r2), false, b2, b3).c((Function<? super T, ? extends R>) this.f).a(this.d);
        ntr ntr = this.c;
        ntr.getClass();
        this.a = a3.a((Consumer<? super T>) new $$Lambda$Sz0oBUasJTrIB2LZAbWlV54GQBA<Object>(ntr), (Consumer<? super Throwable>) $$Lambda$ntn$KJAH3YQ9PMWtsUtr4N_Ur5M19Ko.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Boolean bool, Boolean bool2) {
        return bool2.equals(bool) || bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return this.e.a();
    }
}
