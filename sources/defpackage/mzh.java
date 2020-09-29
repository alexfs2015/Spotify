package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: mzh reason: default package */
public final class mzh implements vua<mzg> {
    private final wlc<RxResolver> a;
    private final wlc<rfe> b;
    private final wlc<mzx> c;
    private final wlc<Boolean> d;
    private final wlc<JacksonResponseParser<HubsJsonViewModel>> e;
    private final wlc<rdo> f;
    private final wlc<skh> g;
    private final wlc<tjb> h;
    private final wlc<txz> i;

    private mzh(wlc<RxResolver> wlc, wlc<rfe> wlc2, wlc<mzx> wlc3, wlc<Boolean> wlc4, wlc<JacksonResponseParser<HubsJsonViewModel>> wlc5, wlc<rdo> wlc6, wlc<skh> wlc7, wlc<tjb> wlc8, wlc<txz> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static mzh a(wlc<RxResolver> wlc, wlc<rfe> wlc2, wlc<mzx> wlc3, wlc<Boolean> wlc4, wlc<JacksonResponseParser<HubsJsonViewModel>> wlc5, wlc<rdo> wlc6, wlc<skh> wlc7, wlc<tjb> wlc8, wlc<txz> wlc9) {
        mzh mzh = new mzh(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return mzh;
    }

    public final /* synthetic */ Object get() {
        mzg mzg = new mzg((RxResolver) this.a.get(), this.b, (mzx) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (JacksonResponseParser) this.e.get(), (rdo) this.f.get(), (skh) this.g.get(), (tjb) this.h.get(), (txz) this.i.get());
        return mzg;
    }
}
