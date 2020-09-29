package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: smw reason: default package */
public final class smw {
    public static kjm<smm> a(Flowable<fpt> flowable, Flowable<SessionState> flowable2) {
        return new $$Lambda$smw$eMVBreinDmAuRGU5s2LzP15fUeU(flowable, flowable2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkf a(Flowable flowable, Flowable flowable2, kkn kkn) {
        Flowable a = Flowable.a((wrf<? extends T>) flowable.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$3pGpQRrz3L7T1fz7w40QyyZsS_o.INSTANCE), (wrf<? extends T>) flowable2.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$P35X70owjKdvoX8xDsoU0K8o4Nk.INSTANCE));
        kkn.getClass();
        Disposable a2 = a.a((Consumer<? super T>) new $$Lambda$N7A9V4mnIJYHe0EvFHaPuYeNrXg<Object>(kkn), (Consumer<? super Throwable>) $$Lambda$1VDBnBhhgaCoL1nooXJr2SRdtZ8.INSTANCE);
        a2.getClass();
        return new $$Lambda$7MC6PZKfETAxMIMNU1ajkqVCo0(a2);
    }
}
