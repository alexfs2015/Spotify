package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

/* renamed from: deu reason: default package */
final class deu {
    private static final Class<?> a = d();
    private static final dfk<?, ?> b = a(false);
    private static final dfk<?, ?> c = a(true);
    private static final dfk<?, ?> d = new dfm();

    static int a(int i, Object obj, des des) {
        return obj instanceof ddi ? zzbav.a(i, (ddi) obj) : zzbav.b(i, (ddz) obj, des);
    }

    static int a(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * zzbav.l(i));
    }

    static int a(int i, List<?> list, des des) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = zzbav.l(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            l += obj instanceof ddi ? zzbav.a((ddi) obj) : zzbav.a((ddz) obj, des);
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
        if (list instanceof ddo) {
            ddo ddo = (ddo) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.d(ddo.b(i2));
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

    public static dfk<?, ?> a() {
        return b;
    }

    private static dfk<?, ?> a(boolean z) {
        try {
            Class e = e();
            if (e == null) {
                return null;
            }
            return (dfk) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, dfk<UT, UB> dfk) {
        if (ub == null) {
            ub = dfk.a();
        }
        dfk.a(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB a(int i, List<Integer> list, ddc<?> ddc, UB ub, dfk<UT, UB> dfk) {
        UB ub2;
        if (ddc == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (ddc.a(intValue) == null) {
                        ub = a(i, intValue, ub2, dfk);
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
                if (ddc.a(intValue2) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, dfk);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    public static void a(int i, List<String> list, dfw dfw) {
        if (list != null && !list.isEmpty()) {
            dfw.a(i, list);
        }
    }

    public static void a(int i, List<?> list, dfw dfw, des des) {
        if (list != null && !list.isEmpty()) {
            dfw.a(i, list, des);
        }
    }

    public static void a(int i, List<Double> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.g(i, list, z);
        }
    }

    static <T> void a(ddu ddu, T t, T t2, long j) {
        dfq.a((Object) t, j, ddu.a(dfq.f(t, j), dfq.f(t2, j)));
    }

    static <T, UT, UB> void a(dfk<UT, UB> dfk, T t, T t2) {
        dfk.a((Object) t, dfk.c(dfk.b(t), dfk.b(t2)));
    }

    public static void a(Class<?> cls) {
        if (!dcy.class.isAssignableFrom(cls)) {
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

    static int b(int i, List<ddz> list, des des) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbav.c(i, (ddz) list.get(i3), des);
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
        if (list instanceof ddo) {
            ddo ddo = (ddo) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.e(ddo.b(i2));
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

    public static dfk<?, ?> b() {
        return c;
    }

    public static void b(int i, List<zzbah> list, dfw dfw) {
        if (list != null && !list.isEmpty()) {
            dfw.b(i, list);
        }
    }

    public static void b(int i, List<?> list, dfw dfw, des des) {
        if (list != null && !list.isEmpty()) {
            dfw.b(i, list, des);
        }
    }

    public static void b(int i, List<Float> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.f(i, list, z);
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
        if (list instanceof ddo) {
            ddo ddo = (ddo) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.f(ddo.b(i2));
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

    public static dfk<?, ?> c() {
        return d;
    }

    public static void c(int i, List<Long> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.c(i, list, z);
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
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.p(dcz.b(i2));
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

    public static void d(int i, List<Long> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.d(i, list, z);
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
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.m(dcz.b(i2));
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

    public static void e(int i, List<Long> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.n(i, list, z);
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
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.n(dcz.b(i2));
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

    public static void f(int i, List<Long> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.e(i, list, z);
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
        if (list instanceof dcz) {
            dcz dcz = (dcz) list;
            i = 0;
            while (i2 < size) {
                i += zzbav.o(dcz.b(i2));
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

    public static void g(int i, List<Long> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.l(i, list, z);
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

    public static void h(int i, List<Integer> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.a(i, list, z);
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

    public static void i(int i, List<Integer> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.j(i, list, z);
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

    public static void j(int i, List<Integer> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.m(i, list, z);
        }
    }

    static int k(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int l = zzbav.l(i) * size;
        if (list instanceof ddk) {
            ddk ddk = (ddk) list;
            while (i2 < size) {
                Object b2 = ddk.b(i2);
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

    public static void k(int i, List<Integer> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.b(i, list, z);
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

    public static void l(int i, List<Integer> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.k(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.h(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, dfw dfw, boolean z) {
        if (list != null && !list.isEmpty()) {
            dfw.i(i, list, z);
        }
    }

    static <T, FT extends dcu<FT>> void a(dcp<FT> dcp, T t, T t2) {
        dcs a2 = dcp.a((Object) t2);
        if (!a2.a.isEmpty()) {
            dcs b2 = dcp.b((Object) t);
            for (int i = 0; i < a2.a.b(); i++) {
                b2.a(a2.a.b(i));
            }
            for (Entry a3 : a2.a.c()) {
                b2.a(a3);
            }
        }
    }
}
