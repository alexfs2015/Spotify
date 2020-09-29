package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: mdo reason: default package */
public final class mdo {
    private final RxResolver a;

    public mdo(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public final wud<Boolean> a() {
        return vun.a((ObservableSource<T>) this.a.resolve(new Request(Request.POST, "hm://payment-iap/subscription/1/cancel")), BackpressureStrategy.BUFFER).f($$Lambda$mdo$cJykh1dUi18iFe9cHc5Eqg3Kt3s.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Response response) {
        return Boolean.valueOf(response.getStatus() == 200);
    }
}
