package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.cosmos.android.RxResolver;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.concurrent.TimeUnit;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: jmw reason: default package */
public final class jmw<T> {
    private static final wut<ContextMenuViewModel, ContextMenuViewModel> d = $$Lambda$jmw$WNHuY0bOSgk2cGK9aMnrp9AR1Y.INSTANCE;
    public final joc<T> a;
    public final jmy<T> b;
    public wut<ContextMenuViewModel, ContextMenuViewModel> c = d;
    private final jnc<T> e;

    /* access modifiers changed from: private */
    public static /* synthetic */ ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel) {
        return contextMenuViewModel;
    }

    static {
        new jmw(joc.a, jnc.a, jmy.a);
    }

    jmw(joc<T> joc, jnc<T> jnc, jmy<T> jmy) {
        this.a = joc;
        this.e = jnc;
        this.b = jmy;
    }

    public final wud<ContextMenuViewModel> a(RxResolver rxResolver) {
        wud wud;
        wud wud2;
        hec hec = (hec) ggw.a(hec.class);
        hvl hvl = (hvl) ggw.a(hvl.class);
        if (this.a.a()) {
            wud = EmptyObservableHolder.a();
        } else {
            ContextMenuViewModel a2 = this.b.a(this.a);
            a2.f = true;
            wud = ScalarSynchronousObservable.d(a2);
        }
        if (this.a.a()) {
            wud2 = ScalarSynchronousObservable.d(this.a);
        } else {
            wud2 = this.e.load(rxResolver, this.a);
        }
        wud a3 = wud.a(wud2, vun.a((wrf<T>) hec.a()), (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$jmw$jJ8BXEySySI9U5O1EeKwleXs6yg<Object,Object,Object>(this)).a((wut<? super T, ? extends wud<? extends R>>) Identity.INSTANCE);
        wud f = vun.a((wrf<T>) hvl.a).f($$Lambda$aihsryigh8IbmprELa05RucwrPA.INSTANCE);
        jmy<T> jmy = this.b;
        jmy.getClass();
        return wud.a(wud, wud.a(a3, f, (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$g_f36jvR7YPVxYdCU164vvdsETk<Object,Object,Object>(jmy)).f(this.c).b((long) ((Integer) jms.b.a()).intValue(), TimeUnit.MILLISECONDS).b((wun<? super T>) $$Lambda$jmw$foqqfKJUUSWGZTTx3UP9sOFeRvY.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(joc joc, fpt fpt) {
        return vun.a((ObservableSource<T>) this.b.a(joc, fpt), BackpressureStrategy.BUFFER);
    }
}
