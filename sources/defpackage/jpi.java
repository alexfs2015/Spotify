package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import java.util.concurrent.TimeUnit;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: jpi reason: default package */
public final class jpi<T> {
    private static final xiy<ContextMenuViewModel, ContextMenuViewModel> d = $$Lambda$jpi$Bn_Qbpg8hNCPARjFlLb1NW34kak.INSTANCE;
    public final jqo<T> a;
    public final jpk<T> b;
    public xiy<ContextMenuViewModel, ContextMenuViewModel> c = d;
    private final jpo<T> e;

    static {
        new jpi(jqo.a, jpo.a, jpk.a);
    }

    jpi(jqo<T> jqo, jpo<T> jpo, jpk<T> jpk) {
        this.a = jqo;
        this.e = jpo;
        this.b = jpk;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(jqo jqo, fqn fqn) {
        return wit.a((ObservableSource<T>) this.b.a(jqo, fqn), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel) {
        return contextMenuViewModel;
    }

    public final xii<ContextMenuViewModel> a(RxResolver rxResolver, Flowable<fqn> flowable, Flowable<SessionState> flowable2) {
        xii xii;
        if (this.a.a()) {
            xii = EmptyObservableHolder.a();
        } else {
            ContextMenuViewModel a2 = this.b.a(this.a);
            a2.f = true;
            xii = ScalarSynchronousObservable.d(a2);
        }
        xii a3 = xii.a(this.a.a() ? ScalarSynchronousObservable.d(this.a) : this.e.load(rxResolver, this.a), wit.a((xfk<T>) flowable), (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$jpi$KqIVUBfvE5IaToPoeSPZiqPAOQ<Object,Object,Object>(this)).a((xiy<? super T, ? extends xii<? extends R>>) Identity.INSTANCE);
        xii e2 = wit.a((xfk<T>) flowable2).e((xiy<? super T, ? extends R>) $$Lambda$02gp8ebwmA4MuLHDaqFeeJlcWR0.INSTANCE);
        jpk<T> jpk = this.b;
        jpk.getClass();
        return xii.a(xii, xii.a(a3, e2, (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$yQ0nzFcTeYb2suC6lFNXOACjntA<Object,Object,Object>(jpk)).e(this.c).b((long) ((Integer) jpe.b.a()).intValue(), TimeUnit.MILLISECONDS).b((xis<? super T>) $$Lambda$jpi$tBpBk0rZztBVwSFBjIhdqtjjC0.INSTANCE));
    }
}
