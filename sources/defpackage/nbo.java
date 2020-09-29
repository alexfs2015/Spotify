package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: nbo reason: default package */
public final class nbo implements wig<nbn> {
    private final wzi<RxResolver> a;
    private final wzi<rog> b;
    private final wzi<Boolean> c;
    private final wzi<ndp> d;
    private final wzi<JacksonResponseParser<HubsJsonViewModel>> e;

    private nbo(wzi<RxResolver> wzi, wzi<rog> wzi2, wzi<Boolean> wzi3, wzi<ndp> wzi4, wzi<JacksonResponseParser<HubsJsonViewModel>> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static nbo a(wzi<RxResolver> wzi, wzi<rog> wzi2, wzi<Boolean> wzi3, wzi<ndp> wzi4, wzi<JacksonResponseParser<HubsJsonViewModel>> wzi5) {
        nbo nbo = new nbo(wzi, wzi2, wzi3, wzi4, wzi5);
        return nbo;
    }

    public final /* synthetic */ Object get() {
        nbn nbn = new nbn((RxResolver) this.a.get(), this.b, ((Boolean) this.c.get()).booleanValue(), (ndp) this.d.get(), (JacksonResponseParser) this.e.get());
        return nbn;
    }
}
