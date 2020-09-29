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

/* renamed from: nzq reason: default package */
public final class nzq {
    public Disposable a = Disposables.b();
    private final Observable<SessionState> b;
    private final nzu c;
    private final Scheduler d;
    private final nyx e;
    private final nzo f;

    public nzq(nzu nzu, Scheduler scheduler, nyx nyx, Observable<SessionState> observable, nzo nzo) {
        this.c = (nzu) fbp.a(nzu);
        this.d = scheduler;
        this.e = nyx;
        this.b = observable;
        this.f = nzo;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return this.e.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Boolean bool, Boolean bool2) {
        return bool2.equals(bool) || bool.booleanValue();
    }

    public final void a() {
        this.a.bd_();
        Observable a2 = this.b.c((Function<? super T, ? extends R>) $$Lambda$vBAchyDs5cF2YASEAOsxlt4ggc.INSTANCE).a((BiPredicate<? super T, ? super T>) $$Lambda$nzq$HgRr2OF0CSIVUXaIHtSR7gmZOI.INSTANCE);
        $$Lambda$nzq$ss63EXyDRqicF9CyxD2d3mGyh5U r1 = new $$Lambda$nzq$ss63EXyDRqicF9CyxD2d3mGyh5U(this);
        $$Lambda$wD3qfNpQBWfSalnW4g82x3CqhLQ r2 = $$Lambda$wD3qfNpQBWfSalnW4g82x3CqhLQ.INSTANCE;
        int b2 = Observable.b();
        int b3 = Observable.b();
        ObjectHelper.a(r1, "mapper is null");
        ObjectHelper.a(r2, "combiner is null");
        Observable a3 = a2.a(ObservableInternalHelper.a(r1, r2), false, b2, b3).c((Function<? super T, ? extends R>) this.f).a(this.d);
        nzu nzu = this.c;
        nzu.getClass();
        this.a = a3.a((Consumer<? super T>) new $$Lambda$BsgrbWoePvUAQtSugrfcYu15fFU<Object>(nzu), (Consumer<? super Throwable>) $$Lambda$nzq$3dQR7RFZ6IsouAqUZYOiosMMYXo.INSTANCE);
    }
}
