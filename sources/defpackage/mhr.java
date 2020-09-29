package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: mhr reason: default package */
public final class mhr {
    private final RxResolver a;

    public mhr(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Response response) {
        return Boolean.valueOf(response.getStatus() == 200);
    }

    public final xii<Boolean> a() {
        return wit.a((ObservableSource<T>) this.a.resolve(new Request(Request.POST, "hm://payment-iap/subscription/1/cancel")), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) $$Lambda$mhr$fV_SMKcPclhh8EpwdCTgKYWzZI.INSTANCE);
    }
}
