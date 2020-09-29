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

/* renamed from: rwr reason: default package */
public final class rwr {
    private final glo a;
    private final glv b;
    private final Handler c;
    private final Context d;

    public rwr(glo glo, glv glv, Handler handler, Context context) {
        this.a = glo;
        this.b = glv;
        this.c = handler;
        this.d = context;
    }

    public final ViewLoadingTracker a(View view, String str, Bundle bundle, rdh rdh) {
        return a(view, str, bundle, rdh, true, Optional.e());
    }

    public final ViewLoadingTracker a(View view, String str, Bundle bundle, rdh rdh, Reason reason) {
        return a(view, str, bundle, rdh, true, Optional.b(reason));
    }

    public ViewLoadingTracker a(View view, String str, Bundle bundle, rdh rdh, boolean z, Optional<Reason> optional) {
        ViewLoadingTracker viewLoadingTracker = new ViewLoadingTracker(view, this.b, this.a, str, bundle, this.c, this.d);
        if (bundle == null && z) {
            if (optional.b()) {
                viewLoadingTracker.a((Reason) optional.c());
            } else {
                viewLoadingTracker.a();
            }
        }
        vun.a((ObservableSource<T>) rdh.a, BackpressureStrategy.BUFFER).a((wun<? super T>) new $$Lambda$rwr$qPhvNSofGPR1NTj1Pn3zZ80M1dY<Object>(new WeakReference(viewLoadingTracker)), (wun<Throwable>) $$Lambda$rwr$z7Jcu8yHytsYf9tRGqGi4GWLE.INSTANCE);
        return viewLoadingTracker;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(WeakReference weakReference, rdd rdd) {
        if (rdd instanceof rde) {
            ViewLoadingTracker viewLoadingTracker = (ViewLoadingTracker) weakReference.get();
            if (viewLoadingTracker != null) {
                viewLoadingTracker.a(((rde) rdd).a());
            }
        }
    }
}
