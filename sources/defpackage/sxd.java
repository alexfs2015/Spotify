package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: sxd reason: default package */
public final class sxd {
    public static kmv<swt> a(Flowable<fqn> flowable, Flowable<SessionState> flowable2) {
        return new $$Lambda$sxd$IsN5AvkiKVP2Jig1DpmXOXdkbO4(flowable, flowable2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kno a(Flowable flowable, Flowable flowable2, knw knw) {
        Flowable a = Flowable.a((xfk<? extends T>) flowable.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$89GyJo5qYHbZ5jGGWc4fJM4NIwc.INSTANCE), (xfk<? extends T>) flowable2.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$hPA28wJhXu1M72ura30PTrpDk.INSTANCE));
        knw.getClass();
        Disposable a2 = a.a((Consumer<? super T>) new $$Lambda$wsjNVlYshP4iDBVoIfrxF6aHYA<Object>(knw), (Consumer<? super Throwable>) $$Lambda$1VDBnBhhgaCoL1nooXJr2SRdtZ8.INSTANCE);
        a2.getClass();
        return new $$Lambda$YaNxOMmA4R76ybpDfZhL3nYfnY(a2);
    }
}
