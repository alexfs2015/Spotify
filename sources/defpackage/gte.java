package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: gte reason: default package */
public final class gte implements vua<ObjectMapper> {
    private final wlc<rnf> a;

    public static ObjectMapper a(rnf rnf) {
        return (ObjectMapper) vuf.a(CC.a(rnf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((rnf) this.a.get());
    }
}
