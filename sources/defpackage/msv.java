package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;

/* renamed from: msv reason: default package */
public final class msv implements vua<msu> {
    private final wlc<RxResolver> a;
    private final wlc<mvn> b;
    private final wlc<JacksonResponseParser<HubsJsonViewModel>> c;

    private msv(wlc<RxResolver> wlc, wlc<mvn> wlc2, wlc<JacksonResponseParser<HubsJsonViewModel>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static msv a(wlc<RxResolver> wlc, wlc<mvn> wlc2, wlc<JacksonResponseParser<HubsJsonViewModel>> wlc3) {
        return new msv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new msu((RxResolver) this.a.get(), (mvn) this.b.get(), (JacksonResponseParser) this.c.get());
    }
}
