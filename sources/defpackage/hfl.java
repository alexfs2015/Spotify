package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: hfl reason: default package */
public final class hfl implements wig<ObjectMapper> {
    private final wzi<rwl> a;

    private hfl(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static hfl a(wzi<rwl> wzi) {
        return new hfl(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) wil.a(((rwl) this.a.get()).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
