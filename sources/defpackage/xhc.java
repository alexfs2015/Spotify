package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* renamed from: xhc reason: default package */
public final class xhc extends a {
    private final fky a = null;

    private xhc(fky fky) {
    }

    public static xhc a() {
        return new xhc(null);
    }

    public final xgd<?, xak> a(Type type) {
        if ((type instanceof Class) && fli.class.isAssignableFrom((Class) type)) {
            return new xhd();
        }
        return null;
    }

    public final xgd<xam, ?> a(Type type, Annotation[] annotationArr, xgp xgp) {
        fll fll;
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!fli.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            fll = (fll) cls.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0]);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            try {
                fll = (fll) cls.getDeclaredField("PARSER").get(null);
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
                StringBuilder sb = new StringBuilder("Found a protobuf message but ");
                sb.append(cls.getName());
                sb.append(" had no parser() method or PARSER field.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new xhe(fll, this.a);
    }
}
