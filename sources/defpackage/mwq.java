package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: mwq reason: default package */
public final class mwq implements vua<mwp> {
    private final wlc<RxResolver> a;
    private final wlc<rfe> b;
    private final wlc<Boolean> c;
    private final wlc<mys> d;
    private final wlc<JacksonResponseParser<HubsJsonViewModel>> e;

    private mwq(wlc<RxResolver> wlc, wlc<rfe> wlc2, wlc<Boolean> wlc3, wlc<mys> wlc4, wlc<JacksonResponseParser<HubsJsonViewModel>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static mwq a(wlc<RxResolver> wlc, wlc<rfe> wlc2, wlc<Boolean> wlc3, wlc<mys> wlc4, wlc<JacksonResponseParser<HubsJsonViewModel>> wlc5) {
        mwq mwq = new mwq(wlc, wlc2, wlc3, wlc4, wlc5);
        return mwq;
    }

    public final /* synthetic */ Object get() {
        mwp mwp = new mwp((RxResolver) this.a.get(), this.b, ((Boolean) this.c.get()).booleanValue(), (mys) this.d.get(), (JacksonResponseParser) this.e.get());
        return mwp;
    }
}
