package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: uvp reason: default package */
public final class uvp implements wig<ObjectMapper> {
    private final wzi<rwl> a;

    private uvp(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static uvp a(wzi<rwl> wzi) {
        return new uvp(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) wil.a(CC.a((rwl) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
