package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: rwp reason: default package */
public final class rwp implements wig<ObjectMapper> {
    private final wzi<rwj> a;

    private rwp(wzi<rwj> wzi) {
        this.a = wzi;
    }

    public static rwp a(wzi<rwj> wzi) {
        return new rwp(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) wil.a(((rwj) this.a.get()).a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
