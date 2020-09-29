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

/* renamed from: rmo reason: default package */
public final class rmo implements Router {
    private final wmb a;
    /* access modifiers changed from: private */
    public final rmn b = new rmn("https://spclient.wg.spotify.com");

    rmo(wmb wmb) {
        a b2 = wmb.b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), $$Lambda$rmo$ESIknvsIAogzY0i4RPte5mfhii4.INSTANCE);
        b2.a = new wlr(threadPoolExecutor);
        this.a = b2.a();
    }

    public final Lifetime resolve(final Request request, final ResolveCallback resolveCallback) {
        wmb wmb = this.a;
        rmn rmn = this.b;
        String str = (String) fay.a(request.getAction());
        String str2 = (String) fay.a(request.getUri());
        Map headers = request.getHeaders();
        byte[] body = request.getBody();
        a aVar = new a();
        if (str2.startsWith("hm://") || str2.startsWith("sp://")) {
            str2 = str2.substring(5, str2.length());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rmn.a);
        sb.append('/');
        sb.append(str2);
        a a2 = aVar.a(sb.toString()).a(rmn.a(headers));
        wme wme = null;
        if (body != null && body.length != 0) {
            wme = wme.a(wlz.b(HttpConnection.kDefaultContentType), body);
        } else if (wnc.b(str)) {
            wme = wme.a((wlz) null, new byte[0]);
        }
        wmc a3 = wmc.a(wmb, a2.a(str, wme).a(), false);
        a3.a(new wlk() {
            public final void onResponse(wlj wlj, wmf wmf) {
                ResolveCallback resolveCallback = resolveCallback;
                rmo.this.b;
                resolveCallback.onResolved(rmn.a(request.getUri(), wmf));
            }

            public final void onFailure(wlj wlj, IOException iOException) {
                resolveCallback.onError(iOException);
            }
        });
        a3.getClass();
        return new $$Lambda$uO40H03jNZsZ9eOzoZwWFFqOFIg(a3);
    }

    public final void destroy() {
        this.a.c.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "Cosmos-OkHttp Dispatcher");
        thread.setDaemon(false);
        return thread;
    }
}
