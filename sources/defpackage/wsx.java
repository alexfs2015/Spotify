package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* renamed from: wsx reason: default package */
public final class wsx extends a {
    private final fke a = null;

    public static wsx a() {
        return new wsx(null);
    }

    private wsx(fke fke) {
    }

    public final wry<wmg, ?> a(Type type, Annotation[] annotationArr, wsk wsk) {
        fkr fkr;
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!fko.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            fkr = (fkr) cls.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0]);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            try {
                fkr = (fkr) cls.getDeclaredField("PARSER").get(null);
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
                StringBuilder sb = new StringBuilder("Found a protobuf message but ");
                sb.append(cls.getName());
                sb.append(" had no parser() method or PARSER field.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new wsz(fkr, this.a);
    }

    public final wry<?, wme> a(Type type) {
        if ((type instanceof Class) && fko.class.isAssignableFrom((Class) type)) {
            return new wsy();
        }
        return null;
    }
}
