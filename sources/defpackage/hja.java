package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: hja reason: default package */
public final class hja implements vua<hiz> {
    private final wlc<Context> a;
    private final wlc<jjf> b;
    private final wlc<vgy> c;
    private final wlc<hjb> d;
    private final wlc<jrp> e;
    private final wlc<jvy> f;
    private final wlc<RxResolver> g;
    private final wlc<rnf> h;

    public static hiz a(Context context, jjf jjf, wlc<vgy> wlc, hjb hjb, jrp jrp, jvy jvy, RxResolver rxResolver, rnf rnf) {
        hiz hiz = new hiz(context, jjf, wlc, hjb, jrp, jvy, rxResolver, rnf);
        return hiz;
    }

    public final /* synthetic */ Object get() {
        hiz hiz = new hiz((Context) this.a.get(), (jjf) this.b.get(), this.c, (hjb) this.d.get(), (jrp) this.e.get(), (jvy) this.f.get(), (RxResolver) this.g.get(), (rnf) this.h.get());
        return hiz;
    }
}
