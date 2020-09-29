package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: wsb reason: default package */
final class wsb<ResponseT, ReturnT> extends wsl<ReturnT> {
    private final wsi a;
    private final a b;
    private final wrv<ResponseT, ReturnT> c;
    private final wry<wmg, ResponseT> d;

    static <ResponseT, ReturnT> wrv<ResponseT, ReturnT> a(wsk wsk, Method method) {
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        try {
            wsm.a(genericReturnType, "returnType == null");
            wsm.a(annotations, "annotations == null");
            int indexOf = wsk.d.indexOf(null) + 1;
            int size = wsk.d.size();
            for (int i = indexOf; i < size; i++) {
                wrv<ResponseT, ReturnT> a2 = ((a) wsk.d.get(i)).a(genericReturnType);
                if (a2 != null) {
                    return a2;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
            sb.append(genericReturnType);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = wsk.d.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(((a) wsk.d.get(indexOf)).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } catch (RuntimeException e) {
            throw wsm.a(method, (Throwable) e, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    static <ResponseT> wry<wmg, ResponseT> a(wsk wsk, Method method, Type type) {
        try {
            return wsk.a((a) null, type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw wsm.a(method, (Throwable) e, "Unable to create converter for %s", type);
        }
    }

    wsb(wsi wsi, a aVar, wrv<ResponseT, ReturnT> wrv, wry<wmg, ResponseT> wry) {
        this.a = wsi;
        this.b = aVar;
        this.c = wrv;
        this.d = wry;
    }

    /* access modifiers changed from: 0000 */
    public final ReturnT a(Object[] objArr) {
        return this.c.a(new wsd(this.a, objArr, this.b, this.d));
    }
}
