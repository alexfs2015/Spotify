package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: hcp reason: default package */
public final class hcp implements vua<ObjectMapper> {
    private final wlc<rnf> a;

    private hcp(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static hcp a(wlc<rnf> wlc) {
        return new hcp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) vuf.a(((rnf) this.a.get()).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
