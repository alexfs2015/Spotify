package defpackage;

import android.app.Activity;
import android.os.Bundle;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: rwp reason: default package */
public final class rwp extends jwp {
    private final glm a;
    private String b;
    private String c;
    private wuk d;

    public rwp(glm glm) {
        this.a = glm;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        if (!this.a.a) {
            if (activity instanceof b) {
                this.d = vun.a((ObservableSource<T>) ((b) activity).af().a, BackpressureStrategy.BUFFER).a((wun<? super T>) new $$Lambda$rwp$dKd3gwMc1a3Y3x0MlBY7UEVP8<Object>(this), (wun<Throwable>) $$Lambda$rwp$IZukylwtpKZ3IYJE8WOpA3Nyy_Y.INSTANCE);
            } else {
                this.a.a("no_main_activity", (String) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rdd rdd) {
        if (!this.a.a) {
            if (!(rdd instanceof rde) || this.b != null) {
                boolean z = rdd instanceof a;
                if (!z || this.c != null) {
                    if (z) {
                        this.a.a("first_view_cancel", (String) null);
                    }
                    return;
                }
                this.c = ((a) rdd).a();
                return;
            }
            this.b = ((rde) rdd).a();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        wuk wuk = this.d;
        if (wuk != null) {
            wuk.unsubscribe();
        }
    }
}
