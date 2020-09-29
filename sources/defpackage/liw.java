package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/* renamed from: liw reason: default package */
public final class liw implements vua<ObjectMapper> {
    private final wlc<rnf> a;

    private liw(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static liw a(wlc<rnf> wlc) {
        return new liw(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) vuf.a(((rnf) this.a.get()).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(Include.NON_NULL).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
