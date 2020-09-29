package defpackage;

import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: wau reason: default package */
public abstract class wau implements wat {
    boolean a;

    public void e(wav wav) {
    }

    public void f(wav wav) {
    }

    public final boolean a() {
        Class cls = getClass();
        wjc b = wjc.b();
        Map map = b.f;
        if (map == null) {
            map = new WeakHashMap(4);
            b.f = map;
        }
        Boolean bool = (Boolean) map.get(cls);
        if (bool == null) {
            bool = Boolean.valueOf(cls.isAnnotationPresent(a.class));
            map.put(cls, bool);
        }
        return bool.booleanValue();
    }

    public void a(wav wav, Throwable th) {
        wav.a(th);
    }
}
