package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Scheduler;

/* renamed from: myt reason: default package */
public final class myt implements wig<JacksonResponseParser<HubsJsonViewModel>> {
    private final wzi<ObjectMapper> a;
    private final wzi<Scheduler> b;

    private myt(wzi<ObjectMapper> wzi, wzi<Scheduler> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static myt a(wzi<ObjectMapper> wzi, wzi<Scheduler> wzi2) {
        return new myt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (JacksonResponseParser) wil.a(JacksonResponseParser.forClass(HubsJsonViewModel.class, (ObjectMapper) this.a.get(), (Scheduler) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}