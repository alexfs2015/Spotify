package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/* renamed from: wdd reason: default package */
public final class wdd implements wig<ObjectMapper> {
    private final wzi<rwl> a;

    private wdd(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static wdd a(wzi<rwl> wzi) {
        return new wdd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ObjectMapper) wil.a(((rwl) this.a.get()).a().a(Feature.AUTO_CLOSE_SOURCE, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(Include.NON_EMPTY).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
