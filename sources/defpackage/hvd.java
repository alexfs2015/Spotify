package defpackage;

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: hvd reason: default package */
public final class hvd implements vua<hvc> {
    private final wlc<Context> a;
    private final wlc<RxResolver> b;
    private final wlc<ConnectManager> c;
    private final wlc<jhz> d;
    private final wlc<grx> e;
    private final wlc<Handler> f;
    private final wlc<wug> g;
    private final wlc<rpb> h;
    private final wlc<rox> i;
    private final wlc<rps> j;

    public static hvc a(Context context, RxResolver rxResolver, ConnectManager connectManager, jhz jhz, grx grx, Handler handler, wug wug, rpb rpb, rox rox, rps rps) {
        hvc hvc = new hvc(context, rxResolver, connectManager, jhz, grx, handler, wug, rpb, rox, rps);
        return hvc;
    }

    public final /* synthetic */ Object get() {
        hvc hvc = new hvc((Context) this.a.get(), (RxResolver) this.b.get(), (ConnectManager) this.c.get(), (jhz) this.d.get(), (grx) this.e.get(), (Handler) this.f.get(), (wug) this.g.get(), (rpb) this.h.get(), (rox) this.i.get(), (rps) this.j.get());
        return hvc;
    }
}
