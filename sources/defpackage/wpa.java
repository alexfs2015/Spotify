package defpackage;

import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: wpa reason: default package */
public abstract class wpa implements woz {
    boolean a;

    public void a(wpb wpb, Throwable th) {
        wpb.a(th);
    }

    public final boolean a() {
        Class cls = getClass();
        wxi b = wxi.b();
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

    public void e(wpb wpb) {
    }

    public void f(wpb wpb) {
    }
}
