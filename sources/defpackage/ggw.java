package defpackage;

import com.spotify.globals.GlobalsStateException;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

@Deprecated
/* renamed from: ggw reason: default package */
public final class ggw {
    private static final ggy a = new ggy("Globals");
    private static boolean b = true;
    private static final Set<ggy> c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet(64);
        c = linkedHashSet;
        linkedHashSet.add(a);
        new HashSet(64);
    }

    public static void a(int i) {
        a.a.a = new IdentityHashMap(27);
    }

    public static synchronized <T> T a(Class<T> cls) {
        T a2;
        synchronized (ggw.class) {
            if (!b) {
                a2 = a(a, cls);
            } else {
                throw new GlobalsStateException("You cannot call any getter before the initialization phase is over. If you are calling this from the constructor of a Global, please supply the dependencies as arguments to the constructor instead. This could also be the case if you are running unit tests outside of the music app module in which case you need to manually do Globals.setIsInInitializationPhase(false); during set up phase of your test.");
            }
        }
        return a2;
    }

    private static synchronized <T> T a(ggy ggy, Class<T> cls) {
        T t;
        synchronized (ggw.class) {
            ggx ggx = ggy.a;
            t = ggx.a.get(cls);
            if (t == null) {
                StringBuilder sb = new StringBuilder("Could not find any injection for ");
                sb.append(cls.getName());
                throw new IllegalStateException(sb.toString());
            } else if (t instanceof wlc) {
                t = ((wlc) t).get();
                ggx.a.put(cls, t);
            }
        }
        return t;
    }

    public static synchronized <T> void a(Class<T> cls, wlc<T> wlc) {
        synchronized (ggw.class) {
            if (b) {
                a.a.a.put(cls, wlc);
            } else {
                throw new GlobalsStateException("You cannot add a production Global after the initialization phase");
            }
        }
    }

    public static void a(boolean z) {
        b = z;
    }
}
