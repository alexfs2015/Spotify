package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: hdw reason: default package */
public final class hdw implements vua<hdv> {
    private final wlc<ObjectMapper> a;

    private hdw(wlc<ObjectMapper> wlc) {
        this.a = wlc;
    }

    public static hdw a(wlc<ObjectMapper> wlc) {
        return new hdw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hdv((ObjectMapper) this.a.get());
    }
}
