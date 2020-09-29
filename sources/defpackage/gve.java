package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: gve reason: default package */
public final class gve implements wig<ObjectMapper> {
    private final wzi<rwl> a;

    public static ObjectMapper a(rwl rwl) {
        return (ObjectMapper) wil.a(CC.a(rwl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((rwl) this.a.get());
    }
}
