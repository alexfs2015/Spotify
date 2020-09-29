package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: wsu reason: default package */
public final class wsu extends a {
    private final ObjectMapper a;

    public wsu(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    public final wry<wmg, ?> a(Type type, Annotation[] annotationArr, wsk wsk) {
        return new wsw(this.a.readerFor(this.a.getTypeFactory().constructType(type)));
    }

    public final wry<?, wme> a(Type type) {
        return new wsv(this.a.writerFor(this.a.getTypeFactory().constructType(type)));
    }
}
