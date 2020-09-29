package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: xgz reason: default package */
public final class xgz extends a {
    private final ObjectMapper a;

    public xgz(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    public final xgd<?, xak> a(Type type) {
        return new xha(this.a.writerFor(this.a.getTypeFactory().constructType(type)));
    }

    public final xgd<xam, ?> a(Type type, Annotation[] annotationArr, xgp xgp) {
        return new xhb(this.a.readerFor(this.a.getTypeFactory().constructType(type)));
    }
}
