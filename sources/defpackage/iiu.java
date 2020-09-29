package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: iiu reason: default package */
public final class iiu {
    iiy a;
    private final jyk<Response> b;
    private final iiw c;
    private final CompositeDisposable d = new CompositeDisposable();

    public iiu(iiw iiw, jyk<Response> jyk) {
        this.c = iiw;
        this.b = jyk;
    }

    /* access modifiers changed from: private */
    public static void a(Response response) {
        if (response.getStatus() == 200) {
            Logger.b("ADS: Accessory Request Succeeded", new Object[0]);
            return;
        }
        Logger.b("ADS: Accessory Request Failed. Status Code:%d", Integer.valueOf(response.getStatus()));
    }

    private void a(Observable<Response> observable) {
        this.d.a(observable.a(wit.a((c<T, R>) this.b, BackpressureStrategy.LATEST)).a((Consumer<? super T>) $$Lambda$iiu$hJk2d574ylQcx_jCazVJTf_Ohs.INSTANCE, (Consumer<? super Throwable>) $$Lambda$iiu$kun_UomGJRCYPjfDN61czt9LwC0.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static void a(Throwable th) {
        Logger.b("ADS: Accessory Request Failed. Throwable message: %s", th.getMessage());
    }

    public final void a() {
        Logger.c("ExternalAccessoryConnector is stopped.", new Object[0]);
        this.d.c();
    }

    public final void a(rzt rzt) {
        a(this.c.a(rzt));
        this.a.a("active_connected_device", this.c.a());
    }

    public final void b(rzt rzt) {
        a(this.c.b(rzt));
        this.a.a("active_connected_device", this.c.a());
    }
}
