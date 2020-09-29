package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: dfd reason: default package */
final class dfd {
    private static final dfd a = new dfd();
    private final dfk b;
    private final ConcurrentMap<Class<?>, dfj<?>> c = new ConcurrentHashMap();

    private dfd() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        dfk dfk = null;
        for (int i = 0; i <= 0; i++) {
            dfk = a(strArr[0]);
            if (dfk != null) {
                break;
            }
        }
        if (dfk == null) {
            dfk = new deg();
        }
        this.b = dfk;
    }

    public static dfd a() {
        return a;
    }

    private static dfk a(String str) {
        try {
            return (dfk) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> dfj<T> a(Class<T> cls) {
        String str = "messageType";
        ddr.a(cls, str);
        dfj<T> dfj = (dfj) this.c.get(cls);
        if (dfj != null) {
            return dfj;
        }
        dfj<T> a2 = this.b.a(cls);
        ddr.a(cls, str);
        ddr.a(a2, "schema");
        dfj dfj2 = (dfj) this.c.putIfAbsent(cls, a2);
        return dfj2 != null ? dfj2 : a2;
    }

    public final <T> dfj<T> a(T t) {
        return a(t.getClass());
    }
}
