package defpackage;

import com.spotify.core.http.HttpConnection;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Router;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: rvu reason: default package */
public final class rvu implements Router {
    private final xah a;
    /* access modifiers changed from: private */
    public final rvt b = new rvt("https://spclient.wg.spotify.com");

    rvu(xah xah) {
        a b2 = xah.b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), $$Lambda$rvu$sQdmg_q3EjmnVAD2fugH1lpSzoQ.INSTANCE);
        b2.a = new wzx(threadPoolExecutor);
        this.a = b2.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "Cosmos-OkHttp Dispatcher");
        thread.setDaemon(false);
        return thread;
    }

    public final void destroy() {
        this.a.c.a();
    }

    public final Lifetime resolve(final Request request, final ResolveCallback resolveCallback) {
        xah xah = this.a;
        rvt rvt = this.b;
        String str = (String) fbp.a(request.getAction());
        String str2 = (String) fbp.a(request.getUri());
        Map headers = request.getHeaders();
        byte[] body = request.getBody();
        a aVar = new a();
        if (str2.startsWith("hm://") || str2.startsWith("sp://")) {
            str2 = str2.substring(5, str2.length());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rvt.a);
        sb.append('/');
        sb.append(str2);
        a a2 = aVar.a(sb.toString()).a(rvt.a(headers));
        xak xak = null;
        if (body != null && body.length != 0) {
            xak = xak.a(xaf.b(HttpConnection.kDefaultContentType), body);
        } else if (xbi.b(str)) {
            xak = xak.a((xaf) null, new byte[0]);
        }
        xai a3 = xai.a(xah, a2.a(str, xak).a(), false);
        a3.a(new wzq() {
            public final void onFailure(wzp wzp, IOException iOException) {
                resolveCallback.onError(iOException);
            }

            public final void onResponse(wzp wzp, xal xal) {
                ResolveCallback resolveCallback = resolveCallback;
                rvu.this.b;
                resolveCallback.onResolved(rvt.a(request.getUri(), xal));
            }
        });
        a3.getClass();
        return new $$Lambda$rJTs9hqM_aBaC5AU19AGUmm4g(a3);
    }
}
