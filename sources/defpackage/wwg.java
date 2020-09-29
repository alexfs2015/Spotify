package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: wwg reason: default package */
public class wwg<V> {
    private static final int a = wxi.d();
    private final int b = wxi.d();

    private static void a(wxi wxi, wwg<?> wwg) {
        Set set;
        Object b2 = wxi.b(a);
        if (b2 == wxi.a || b2 == null) {
            set = Collections.newSetFromMap(new IdentityHashMap());
            wxi.a(a, set);
        } else {
            set = (Set) b2;
        }
        set.add(wwg);
    }

    public static void b() {
        wxi a2 = wxi.a();
        if (a2 != null) {
            try {
                Object b2 = a2.b(a);
                if (!(b2 == null || b2 == wxi.a)) {
                    Set set = (Set) b2;
                    for (wwg b3 : (wwg[]) set.toArray(new wwg[set.size()])) {
                        b3.b(a2);
                    }
                }
            } finally {
                wxi.c();
            }
        }
    }

    private static void b(wxi wxi, wwg<?> wwg) {
        Object b2 = wxi.b(a);
        if (b2 != wxi.a && b2 != null) {
            ((Set) b2).remove(wwg);
        }
    }

    private V c(wxi wxi) {
        V v;
        try {
            v = a();
        } catch (Exception e) {
            PlatformDependent.a((Throwable) e);
            v = null;
        }
        wxi.a(this.b, v);
        a(wxi, this);
        return v;
    }

    /* access modifiers changed from: protected */
    public V a() {
        return null;
    }

    public final V a(wxi wxi) {
        V b2 = wxi.b(this.b);
        return b2 != wxi.a ? b2 : c(wxi);
    }

    /* access modifiers changed from: protected */
    public void a(V v) {
    }

    public final void a(wxi wxi, V v) {
        if (v == wxi.a) {
            b(wxi);
        } else if (wxi.a(this.b, v)) {
            a(wxi, this);
        }
    }

    public final void b(wxi wxi) {
        if (wxi != null) {
            Object c = wxi.c(this.b);
            b(wxi, this);
            if (c != wxi.a) {
                try {
                    a((V) c);
                } catch (Exception e) {
                    PlatformDependent.a((Throwable) e);
                }
            }
        }
    }
}
