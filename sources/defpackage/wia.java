package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: wia reason: default package */
public class wia<V> {
    private static final int a = wjc.d();
    private final int b = wjc.d();

    /* access modifiers changed from: protected */
    public V a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(V v) {
    }

    public static void b() {
        wjc a2 = wjc.a();
        if (a2 != null) {
            try {
                Object b2 = a2.b(a);
                if (!(b2 == null || b2 == wjc.a)) {
                    Set set = (Set) b2;
                    for (wia b3 : (wia[]) set.toArray(new wia[set.size()])) {
                        b3.b(a2);
                    }
                }
            } finally {
                wjc.c();
            }
        }
    }

    private static void a(wjc wjc, wia<?> wia) {
        Set set;
        Object b2 = wjc.b(a);
        if (b2 == wjc.a || b2 == null) {
            set = Collections.newSetFromMap(new IdentityHashMap());
            wjc.a(a, set);
        } else {
            set = (Set) b2;
        }
        set.add(wia);
    }

    private static void b(wjc wjc, wia<?> wia) {
        Object b2 = wjc.b(a);
        if (b2 != wjc.a && b2 != null) {
            ((Set) b2).remove(wia);
        }
    }

    public final V a(wjc wjc) {
        V b2 = wjc.b(this.b);
        if (b2 != wjc.a) {
            return b2;
        }
        return c(wjc);
    }

    private V c(wjc wjc) {
        V v;
        try {
            v = a();
        } catch (Exception e) {
            PlatformDependent.a((Throwable) e);
            v = null;
        }
        wjc.a(this.b, v);
        a(wjc, this);
        return v;
    }

    public final void a(wjc wjc, V v) {
        if (v == wjc.a) {
            b(wjc);
        } else if (wjc.a(this.b, v)) {
            a(wjc, this);
        }
    }

    public final void b(wjc wjc) {
        if (wjc != null) {
            Object c = wjc.c(this.b);
            b(wjc, this);
            if (c != wjc.a) {
                try {
                    a((V) c);
                } catch (Exception e) {
                    PlatformDependent.a((Throwable) e);
                }
            }
        }
    }
}
