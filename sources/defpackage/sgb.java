package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.Reason;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.lang.ref.WeakReference;

/* renamed from: sgb reason: default package */
public final class sgb {
    private final gnd a;
    private final gnk b;
    private final Handler c;
    private final Context d;

    public sgb(gnd gnd, gnk gnk, Handler handler, Context context) {
        this.a = gnd;
        this.b = gnk;
        this.c = handler;
        this.d = context;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(WeakReference weakReference, rmb rmb) {
        if (rmb instanceof rmc) {
            ViewLoadingTracker viewLoadingTracker = (ViewLoadingTracker) weakReference.get();
            if (viewLoadingTracker != null) {
                viewLoadingTracker.a(((rmc) rmb).a());
            }
        }
    }

    public final ViewLoadingTracker a(View view, String str, Bundle bundle, rmf rmf) {
        return a(view, str, bundle, rmf, true, Optional.e());
    }

    public final ViewLoadingTracker a(View view, String str, Bundle bundle, rmf rmf, Reason reason) {
        return a(view, str, bundle, rmf, true, Optional.b(reason));
    }

    public ViewLoadingTracker a(View view, String str, Bundle bundle, rmf rmf, boolean z, Optional<Reason> optional) {
        ViewLoadingTracker viewLoadingTracker = new ViewLoadingTracker(view, this.b, this.a, str, bundle, this.c, this.d);
        if (bundle == null && z) {
            if (optional.b()) {
                viewLoadingTracker.a((Reason) optional.c());
            } else {
                viewLoadingTracker.a();
            }
        }
        wit.a((ObservableSource<T>) rmf.a, BackpressureStrategy.BUFFER).a((xis<? super T>) new $$Lambda$sgb$Jemj0Xhs4PvAg_KZK6eu1k9eYXw<Object>(new WeakReference(viewLoadingTracker)), (xis<Throwable>) $$Lambda$sgb$dqMBUrXP_E96d66P6Sc2Qg4i5_o.INSTANCE);
        return viewLoadingTracker;
    }
}
