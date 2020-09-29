package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: wcq reason: default package */
public final class wcq implements wig<wcp> {
    private final wzi<ObjectMapper> a;

    private wcq(wzi<ObjectMapper> wzi) {
        this.a = wzi;
    }

    public static wcq a(wzi<ObjectMapper> wzi) {
        return new wcq(wzi);
    }

    public final /* synthetic */ Object get() {
        return new wcp((ObjectMapper) this.a.get());
    }
}
