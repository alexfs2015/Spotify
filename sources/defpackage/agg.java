package defpackage;

import android.content.Context;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* renamed from: agg reason: default package */
public final class agg {
    private static final agi g = agi.a("kju.remoting");
    private static Map<String, agg> h = new HashMap();
    private static String i;
    final Context a;
    String b;
    public volatile boolean c = false;
    public final Map<Type, agf> d = new HashMap();
    public final Map<Type, agh> e = new HashMap();
    public final Map<Type, Object> f = new HashMap();
    private String j;

    public static final agg a() {
        return (agg) h.get(i);
    }

    public static final agg a(String str) {
        return (agg) h.get(str);
    }

    private agg(Context context) {
        this.a = context;
    }

    public final agh a(Type type) {
        return (agh) this.e.get(type);
    }

    public final Object b(Type type) {
        return this.f.get(type);
    }

    public final void b() {
        if (this.c) {
            g.a("stop()...", new Object[0]);
            for (agf n : this.d.values()) {
                n.n();
            }
            g.a("stop() OK!", new Object[0]);
            this.c = false;
        }
    }

    public static final synchronized void a(Context context, String str, String str2) {
        synchronized (agg.class) {
            i = str;
            if (a(str) != null) {
                a(str).b();
            }
            agg agg = new agg(context);
            agg.j = str;
            agg.b = null;
            h.put(i, agg);
        }
    }
}
