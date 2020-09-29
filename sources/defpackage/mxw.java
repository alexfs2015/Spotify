package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: mxw reason: default package */
public final class mxw implements wig<mxv> {
    private final wzi<RxResolver> a;
    private final wzi<nao> b;
    private final wzi<JacksonResponseParser<HubsJsonViewModel>> c;

    private mxw(wzi<RxResolver> wzi, wzi<nao> wzi2, wzi<JacksonResponseParser<HubsJsonViewModel>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mxw a(wzi<RxResolver> wzi, wzi<nao> wzi2, wzi<JacksonResponseParser<HubsJsonViewModel>> wzi3) {
        return new mxw(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mxv((RxResolver) this.a.get(), (nao) this.b.get(), (JacksonResponseParser) this.c.get());
    }
}
