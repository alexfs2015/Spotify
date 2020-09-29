package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: ljr reason: default package */
public final class ljr implements vua<ObjectMapper> {
    private final wlc<rnd> a;

    private ljr(wlc<rnd> wlc) {
        this.a = wlc;
    }

    public static ljr a(wlc<rnd> wlc) {
        return new ljr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) vuf.a(((rnd) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
