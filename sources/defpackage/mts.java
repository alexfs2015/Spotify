package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Scheduler;

/* renamed from: mts reason: default package */
public final class mts implements vua<JacksonResponseParser<HubsJsonViewModel>> {
    private final wlc<ObjectMapper> a;
    private final wlc<Scheduler> b;

    private mts(wlc<ObjectMapper> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mts a(wlc<ObjectMapper> wlc, wlc<Scheduler> wlc2) {
        return new mts(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (JacksonResponseParser) vuf.a(JacksonResponseParser.forClass(HubsJsonViewModel.class, (ObjectMapper) this.a.get(), (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
