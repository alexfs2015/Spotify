package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

/* renamed from: dfl reason: default package */
final class dfl {
    private static final Class<?> a = d();
    private static final dgb<?, ?> b = a(false);
    private static final dgb<?, ?> c = a(true);
    private static final dgb<?, ?> d = new dgd();

    static int a(int i, Object obj, dfj dfj) {
        return obj instanceof ddz ? zzbav.a(i, (ddz) obj) : zzbav.b(i, (deq) obj, dfj);
    }

    static int a(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * zzbav.l(i));
    }

    static int a(int i, List<?> list, dfj dfj) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = zzbav.l(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            l += obj instanceof ddz ? zzbav.a((ddz) obj) : zzbav.a((deq) obj, dfj);
        }
        return l;
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof def) {
            def def = (def) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.d(def.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static dgb<?, ?> a() {
        return b;
    }

    private static dgb<?, ?> a(boolean z) {
        try {
            Class e = e();
            if (e == null) {
                return null;
            }
            return (dgb) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, dgb<UT, UB> dgb) {
        if (ub == null) {
            ub = dgb.a();
        }
        dgb.a(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB a(int i, List<Integer> list, ddt<?> ddt, UB ub, dgb<UT, UB> dgb) {
        UB ub2;
        if (ddt == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (ddt.a(intValue) == null) {
                        ub = a(i, intValue, ub2, dgb);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (ddt.a(intValue2) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, dgb);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    public static void a(int i, List<String> list, dgn dgn) {
        if (list != null && !list.isEmpty()) {
            dgn.a(i, list);
        }
    }

    public static void a(int i, List<?> list, dgn dgn, dfj dfj) {
        if (list != null && !list.isEmpty()) {
            dgn.a(i, list, dfj);
        }
    }

    public static void a(int i, List<Double> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.g(i, list, z);
        }
    }

    static <T, FT extends ddl<FT>> void a(ddg<FT> ddg, T t, T t2) {
        ddj a2 = ddg.a((Object) t2);
        if (!a2.a.isEmpty()) {
            ddj b2 = ddg.b((Object) t);
            for (int i = 0; i < a2.a.b(); i++) {
                b2.a(a2.a.b(i));
            }
            for (Entry a3 : a2.a.c()) {
                b2.a(a3);
            }
        }
    }

    static <T> void a(del del, T t, T t2, long j) {
        dgh.a((Object) t, j, del.a(dgh.f(t, j), dgh.f(t2, j)));
    }

    static <T, UT, UB> void a(dgb<UT, UB> dgb, T t, T t2) {
        dgb.a((Object) t, dgb.c(dgb.b(t), dgb.b(t2)));
    }

    public static void a(Class<?> cls) {
        if (!ddp.class.isAssignableFrom(cls)) {
            Class<?> cls2 = a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static boolean a(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int b(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * zzbav.l(i));
    }

    static int b(int i, List<deq> list, dfj dfj) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbav.c(i, (deq) list.get(i3), dfj);
        }
        return i2;
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof def) {
            def def = (def) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.e(def.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static dgb<?, ?> b() {
        return c;
    }

    public static void b(int i, List<zzbah> list, dgn dgn) {
        if (list != null && !list.isEmpty()) {
            dgn.b(i, list);
        }
    }

    public static void b(int i, List<?> list, dgn dgn, dfj dfj) {
        if (list != null && !list.isEmpty()) {
            dgn.b(i, list, dfj);
        }
    }

    public static void b(int i, List<Float> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.f(i, list, z);
        }
    }

    static int c(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * zzbav.l(i));
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof def) {
            def def = (def) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.f(def.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static dgb<?, ?> c() {
        return d;
    }

    public static void c(int i, List<Long> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.c(i, list, z);
        }
    }

    static int d(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * zzbav.l(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ddq) {
            ddq ddq = (ddq) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.p(ddq.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i, List<Long> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.d(i, list, z);
        }
    }

    static int e(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * zzbav.l(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ddq) {
            ddq ddq = (ddq) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m(ddq.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i, List<Long> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.n(i, list, z);
        }
    }

    static int f(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * zzbav.l(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ddq) {
            ddq ddq = (ddq) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.n(ddq.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.e(i, list, z);
        }
    }

    static int g(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * zzbav.l(i));
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ddq) {
            ddq ddq = (ddq) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.o(ddq.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbav.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void g(int i, List<Long> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.l(i, list, z);
        }
    }

    static int h(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.e(i);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.a(i, list, z);
        }
    }

    static int i(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.g(i);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.j(i, list, z);
        }
    }

    static int j(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbav.k(i);
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.m(i, list, z);
        }
    }

    static int k(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int l = zzbav.l(i) * size;
        if (list instanceof deb) {
            deb deb = (deb) list;
            while (i2 < size) {
                Object b2 = deb.b(i2);
                l += b2 instanceof zzbah ? zzbav.b((zzbah) b2) : zzbav.b((String) b2);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                l += obj instanceof zzbah ? zzbav.b((zzbah) obj) : zzbav.b((String) obj);
                i2++;
            }
        }
        return l;
    }

    public static void k(int i, List<Integer> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.b(i, list, z);
        }
    }

    static int l(int i, List<zzbah> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = size * zzbav.l(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            l += zzbav.b((zzbah) list.get(i2));
        }
        return l;
    }

    public static void l(int i, List<Integer> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.k(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.h(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, dgn dgn, boolean z) {
        if (list != null && !list.isEmpty()) {
            dgn.i(i, list, z);
        }
    }
}
