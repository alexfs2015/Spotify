package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: eoj reason: default package */
final class eoj {
    private static final eoj a = new eoj();
    private final eoo b;
    private final ConcurrentMap<Class<?>, eon<?>> c = new ConcurrentHashMap();

    public static eoj a() {
        return a;
    }

    public final <T> eon<T> a(Class<T> cls) {
        String str = "messageType";
        emy.a(cls, str);
        eon<T> eon = (eon) this.c.get(cls);
        if (eon != null) {
            return eon;
        }
        eon<T> a2 = this.b.a(cls);
        emy.a(cls, str);
        emy.a(a2, "schema");
        eon eon2 = (eon) this.c.putIfAbsent(cls, a2);
        return eon2 != null ? eon2 : a2;
    }

    public final <T> eon<T> a(T t) {
        return a(t.getClass());
    }

    private eoj() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        eoo eoo = null;
        for (int i = 0; i <= 0; i++) {
            eoo = a(strArr[0]);
            if (eoo != null) {
                break;
            }
        }
        if (eoo == null) {
            eoo = new enn();
        }
        this.b = eoo;
    }

    private static eoo a(String str) {
        try {
            return (eoo) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
