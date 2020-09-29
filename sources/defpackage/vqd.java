package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: vqd reason: default package */
public final class vqd implements vua<ObjectMapper> {
    private final wlc<rnf> a;

    private vqd(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static vqd a(wlc<rnf> wlc) {
        return new vqd(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) vuf.a(((rnf) this.a.get()).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
