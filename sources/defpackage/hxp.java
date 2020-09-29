package defpackage;

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.connect.ConnectManager;

/* renamed from: hxp reason: default package */
public final class hxp implements wig<hxo> {
    private final wzi<Context> a;
    private final wzi<RxResolver> b;
    private final wzi<ConnectManager> c;
    private final wzi<jkp> d;
    private final wzi<mkk> e;
    private final wzi<Handler> f;
    private final wzi<xil> g;
    private final wzi<ryh> h;
    private final wzi<ryd> i;
    private final wzi<rzb> j;

    public static hxo a(Context context, RxResolver rxResolver, ConnectManager connectManager, jkp jkp, mkk mkk, Handler handler, xil xil, ryh ryh, ryd ryd, rzb rzb) {
        hxo hxo = new hxo(context, rxResolver, connectManager, jkp, mkk, handler, xil, ryh, ryd, rzb);
        return hxo;
    }

    public final /* synthetic */ Object get() {
        hxo hxo = new hxo((Context) this.a.get(), (RxResolver) this.b.get(), (ConnectManager) this.c.get(), (jkp) this.d.get(), (mkk) this.e.get(), (Handler) this.f.get(), (xil) this.g.get(), (ryh) this.h.get(), (ryd) this.i.get(), (rzb) this.j.get());
        return hxo;
    }
}
