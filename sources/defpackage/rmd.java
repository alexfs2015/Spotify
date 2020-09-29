package defpackage;

import android.app.Activity;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;

/* renamed from: rmd reason: default package */
public final class rmd extends jyr {
    private final ruc a;
    private final rmh b;
    private Activity c;

    rmd(ruc ruc, rmh rmh) {
        this.a = (ruc) fbp.a(ruc);
        this.b = (rmh) fbp.a(rmh);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rmb a(rmb rmb, rmb rmb2) {
        return rmb2 != b.a ? rmb2 : rmb;
    }

    public final void onActivityResumed(Activity activity) {
        if (this.c != fbp.a(activity)) {
            Activity activity2 = this.c;
            if (activity2 instanceof b) {
                this.a.a(activity2.isChangingConfigurations());
            }
            Observable<rmb> observable = activity instanceof b ? ((b) activity).af().a : rmf.a(activity.getClass().getSimpleName()).a;
            if (activity instanceof rlw) {
                observable = Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) ((rlw) activity).a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$rmd$BHfVk50mEFWqe3WpRKWkQKfFmQU.INSTANCE);
            }
            ruc ruc = this.a;
            ruc.a((Observable) fbp.a(observable), ruc.a);
            ruc.a = false;
            this.c = activity;
        }
    }

    public final void onActivityStopped(Activity activity) {
        fbp.a(activity);
        if (this.c == activity) {
            this.a.a(activity.isChangingConfigurations());
            this.c = null;
        }
    }
}
