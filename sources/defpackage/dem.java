package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: dem reason: default package */
final class dem {
    private static final dem a = new dem();
    private final det b;
    private final ConcurrentMap<Class<?>, des<?>> c = new ConcurrentHashMap();

    private dem() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        det det = null;
        for (int i = 0; i <= 0; i++) {
            det = a(strArr[0]);
            if (det != null) {
                break;
            }
        }
        if (det == null) {
            det = new ddp();
        }
        this.b = det;
    }

    public static dem a() {
        return a;
    }

    private static det a(String str) {
        try {
            return (det) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> des<T> a(Class<T> cls) {
        String str = "messageType";
        dda.a(cls, str);
        des<T> des = (des) this.c.get(cls);
        if (des != null) {
            return des;
        }
        des<T> a2 = this.b.a(cls);
        dda.a(cls, str);
        dda.a(a2, "schema");
        des des2 = (des) this.c.putIfAbsent(cls, a2);
        return des2 != null ? des2 : a2;
    }

    public final <T> des<T> a(T t) {
        return a(t.getClass());
    }
}
