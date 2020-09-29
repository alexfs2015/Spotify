package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: xgg reason: default package */
final class xgg<ResponseT, ReturnT> extends xgq<ReturnT> {
    private final xgn a;
    private final a b;
    private final xga<ResponseT, ReturnT> c;
    private final xgd<xam, ResponseT> d;

    xgg(xgn xgn, a aVar, xga<ResponseT, ReturnT> xga, xgd<xam, ResponseT> xgd) {
        this.a = xgn;
        this.b = aVar;
        this.c = xga;
        this.d = xgd;
    }

    static <ResponseT, ReturnT> xga<ResponseT, ReturnT> a(xgp xgp, Method method) {
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        try {
            xgr.a(genericReturnType, "returnType == null");
            xgr.a(annotations, "annotations == null");
            int indexOf = xgp.d.indexOf(null) + 1;
            int size = xgp.d.size();
            for (int i = indexOf; i < size; i++) {
                xga<ResponseT, ReturnT> a2 = ((a) xgp.d.get(i)).a(genericReturnType);
                if (a2 != null) {
                    return a2;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
            sb.append(genericReturnType);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = xgp.d.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(((a) xgp.d.get(indexOf)).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } catch (RuntimeException e) {
            throw xgr.a(method, (Throwable) e, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    static <ResponseT> xgd<xam, ResponseT> a(xgp xgp, Method method, Type type) {
        try {
            return xgp.a((a) null, type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw xgr.a(method, (Throwable) e, "Unable to create converter for %s", type);
        }
    }

    /* access modifiers changed from: 0000 */
    public final ReturnT a(Object[] objArr) {
        return this.c.a(new xgi(this.a, objArr, this.b, this.d));
    }
}
