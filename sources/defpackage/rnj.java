package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: rnj reason: default package */
public final class rnj implements vua<ObjectMapper> {
    private final wlc<rnd> a;

    private rnj(wlc<rnd> wlc) {
        this.a = wlc;
    }

    public static rnj a(wlc<rnd> wlc) {
        return new rnj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) vuf.a(((rnd) this.a.get()).a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
