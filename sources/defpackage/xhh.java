package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: xhh reason: default package */
public final class xhh extends a {
    public final xgd<?, xak> a(Type type) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return xhf.a;
        }
        return null;
    }

    public final xgd<xam, ?> a(Type type, Annotation[] annotationArr, xgp xgp) {
        if (type == String.class) {
            return i.a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return a.a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return b.a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return c.a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return d.a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return e.a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return f.a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return g.a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return h.a;
        }
        return null;
    }
}