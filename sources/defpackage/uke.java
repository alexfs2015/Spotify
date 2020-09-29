package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: uke reason: default package */
public final class uke implements vua<ObjectMapper> {
    private final wlc<rnf> a;

    private uke(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static uke a(wlc<rnf> wlc) {
        return new uke(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) vuf.a(CC.a((rnf) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
