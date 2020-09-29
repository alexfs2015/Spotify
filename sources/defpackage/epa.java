package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: epa reason: default package */
final class epa {
    private static final epa a = new epa();
    private final epf b;
    private final ConcurrentMap<Class<?>, epe<?>> c = new ConcurrentHashMap();

    private epa() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        epf epf = null;
        for (int i = 0; i <= 0; i++) {
            epf = a(strArr[0]);
            if (epf != null) {
                break;
            }
        }
        if (epf == null) {
            epf = new eoe();
        }
        this.b = epf;
    }

    public static epa a() {
        return a;
    }

    private static epf a(String str) {
        try {
            return (epf) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> epe<T> a(Class<T> cls) {
        String str = "messageType";
        enp.a(cls, str);
        epe<T> epe = (epe) this.c.get(cls);
        if (epe != null) {
            return epe;
        }
        epe<T> a2 = this.b.a(cls);
        enp.a(cls, str);
        enp.a(a2, "schema");
        epe epe2 = (epe) this.c.putIfAbsent(cls, a2);
        return epe2 != null ? epe2 : a2;
    }

    public final <T> epe<T> a(T t) {
        return a(t.getClass());
    }
}
