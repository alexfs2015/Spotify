package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: igh reason: default package */
public final class igh {
    igl a;
    private final jwc<Response> b;
    private final igj c;
    private final CompositeDisposable d = new CompositeDisposable();

    public igh(igj igj, jwc<Response> jwc) {
        this.c = igj;
        this.b = jwc;
    }

    public final void a(rqi rqi) {
        a(this.c.a(rqi));
        this.a.a("active_connected_device", this.c.a());
    }

    public final void b(rqi rqi) {
        a(this.c.b(rqi));
        this.a.a("active_connected_device", this.c.a());
    }

    private void a(Observable<Response> observable) {
        this.d.a(observable.a(vun.a((c<T, R>) this.b, BackpressureStrategy.LATEST)).a((Consumer<? super T>) $$Lambda$igh$fzh_r27yb8hhtKvEWWmGA0pa7NU.INSTANCE, (Consumer<? super Throwable>) $$Lambda$igh$3UYuPvWC23vIgetpF1lWceA2b10.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static void a(Response response) {
        if (response.getStatus() == 200) {
            Logger.b("ADS: Accessory Request Succeeded", new Object[0]);
            return;
        }
        Logger.b("ADS: Accessory Request Failed. Status Code:%d", Integer.valueOf(response.getStatus()));
    }

    /* access modifiers changed from: private */
    public static void a(Throwable th) {
        Logger.b("ADS: Accessory Request Failed. Throwable message: %s", th.getMessage());
    }

    public final void a() {
        Logger.c("ExternalAccessoryConnector is stopped.", new Object[0]);
        this.d.c();
    }
}
