package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/* renamed from: lmv reason: default package */
public final class lmv implements wig<ObjectMapper> {
    private final wzi<rwl> a;

    private lmv(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static lmv a(wzi<rwl> wzi) {
        return new lmv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) wil.a(((rwl) this.a.get()).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(Include.NON_NULL).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
