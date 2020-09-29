package defpackage;

import android.app.Activity;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;

/* renamed from: rdf reason: default package */
public final class rdf extends jwp {
    private final rkw a;
    private final rdj b;
    private Activity c;

    rdf(rkw rkw, rdj rdj) {
        this.a = (rkw) fay.a(rkw);
        this.b = (rdj) fay.a(rdj);
    }

    public final void onActivityResumed(Activity activity) {
        Observable<rdd> observable;
        if (this.c != fay.a(activity)) {
            Activity activity2 = this.c;
            if (activity2 instanceof b) {
                this.a.a(activity2.isChangingConfigurations());
            }
            if (activity instanceof b) {
                observable = ((b) activity).af().a;
            } else {
                observable = rdh.a(activity.getClass().getSimpleName()).a;
            }
            if (activity instanceof rcy) {
                observable = Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) ((rcy) activity).a(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$rdf$y14lJbHFsbf_yHppBB8T_uBWYzU.INSTANCE);
            }
            rkw rkw = this.a;
            rkw.a((Observable) fay.a(observable), rkw.a);
            rkw.a = false;
            this.c = activity;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rdd a(rdd rdd, rdd rdd2) {
        return rdd2 != b.a ? rdd2 : rdd;
    }

    public final void onActivityStopped(Activity activity) {
        fay.a(activity);
        if (this.c == activity) {
            this.a.a(activity.isChangingConfigurations());
            this.c = null;
        }
    }
}
