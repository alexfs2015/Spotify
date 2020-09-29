package defpackage;

import android.content.Context;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agu reason: default package */
public final class agu {
    private static final agw g = agw.a("kju.remoting");
    private static Map<String, agu> h = new HashMap();
    private static String i;
    final Context a;
    String b;
    public volatile boolean c = false;
    public final Map<Type, agt> d = new HashMap();
    public final Map<Type, agv> e = new HashMap();
    public final Map<Type, Object> f = new HashMap();
    private String j;

    private agu(Context context) {
        this.a = context;
    }

    public static final agu a() {
        return (agu) h.get(i);
    }

    public static final agu a(String str) {
        return (agu) h.get(str);
    }

    public static final synchronized void a(Context context, String str, String str2) {
        synchronized (agu.class) {
            i = str;
            if (a(str) != null) {
                a(str).b();
            }
            agu agu = new agu(context);
            agu.j = str;
            agu.b = null;
            h.put(i, agu);
        }
    }

    public final agv a(Type type) {
        return (agv) this.e.get(type);
    }

    public final Object b(Type type) {
        return this.f.get(type);
    }

    public final void b() {
        if (this.c) {
            g.a("stop()...", new Object[0]);
            for (agt n : this.d.values()) {
                n.n();
            }
            g.a("stop() OK!", new Object[0]);
            this.c = false;
        }
    }
}
