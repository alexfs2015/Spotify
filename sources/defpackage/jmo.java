package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: jmo reason: default package */
public final class jmo {
    private final jnx a;
    private final xir b;
    private final hxx c;
    private final RxResolver d;
    private final juc e;

    public jmo(jnx jnx, xir xir, hxx hxx, RxResolver rxResolver, juc juc) {
        this.a = jnx;
        this.b = xir;
        this.c = hxx;
        this.d = rxResolver;
        this.e = juc;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Response response) {
        return Boolean.valueOf(response.getStatus() >= 200 && response.getStatus() < 299);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str) {
        return wit.a((ObservableSource<T>) this.d.resolve(new urd(this.e.a(), str)), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.a.a();
            this.b.call();
        }
    }

    public final xii<Boolean> a() {
        return wit.a((xfk<T>) this.c.a).a(1).e((xiy<? super T, ? extends R>) $$Lambda$Kd55fYzOeaqP5QRbCXcOl_rBI.INSTANCE).h(new $$Lambda$jmo$9u4SjBmqiUUPOjmb2VreXN3dhaA(this)).e((xiy<? super T, ? extends R>) $$Lambda$jmo$8vqV4shp7vGkUYC61X_8puDwt8.INSTANCE).b((xis<? super T>) new $$Lambda$jmo$AafBGnoV0A8ietAMKGijTzdt3q4<Object>(this));
    }
}
