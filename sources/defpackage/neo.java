package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: neo reason: default package */
public final class neo implements wig<nen> {
    private final wzi<RxResolver> a;
    private final wzi<rog> b;
    private final wzi<nfe> c;
    private final wzi<Boolean> d;
    private final wzi<JacksonResponseParser<HubsJsonViewModel>> e;
    private final wzi<rmm> f;
    private final wzi<suo> g;
    private final wzi<ttt> h;
    private final wzi<uku> i;
    private final wzi<heg> j;
    private final wzi<rmq> k;

    private neo(wzi<RxResolver> wzi, wzi<rog> wzi2, wzi<nfe> wzi3, wzi<Boolean> wzi4, wzi<JacksonResponseParser<HubsJsonViewModel>> wzi5, wzi<rmm> wzi6, wzi<suo> wzi7, wzi<ttt> wzi8, wzi<uku> wzi9, wzi<heg> wzi10, wzi<rmq> wzi11) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
    }

    public static neo a(wzi<RxResolver> wzi, wzi<rog> wzi2, wzi<nfe> wzi3, wzi<Boolean> wzi4, wzi<JacksonResponseParser<HubsJsonViewModel>> wzi5, wzi<rmm> wzi6, wzi<suo> wzi7, wzi<ttt> wzi8, wzi<uku> wzi9, wzi<heg> wzi10, wzi<rmq> wzi11) {
        neo neo = new neo(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11);
        return neo;
    }

    public final /* synthetic */ Object get() {
        nen nen = new nen((RxResolver) this.a.get(), this.b, (nfe) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (JacksonResponseParser) this.e.get(), (rmm) this.f.get(), (suo) this.g.get(), (ttt) this.h.get(), (uku) this.i.get(), (heg) this.j.get(), (rmq) this.k.get());
        return nen;
    }
}
