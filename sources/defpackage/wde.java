package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: wde reason: default package */
public final class wde implements wig<ObjectMapper> {
    private final wzi<rwl> a;

    private wde(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static wde a(wzi<rwl> wzi) {
        return new wde(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) wil.a(((rwl) this.a.get()).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
