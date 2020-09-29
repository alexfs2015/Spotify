package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzve;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

/* renamed from: eop reason: default package */
final class eop {
    private static final Class<?> a = d();
    private static final epe<?, ?> b = a(false);
    private static final epe<?, ?> c = a(true);
    private static final epe<?, ?> d = new epg();

    public static void a(Class<?> cls) {
        if (!emw.class.isAssignableFrom(cls)) {
            Class<?> cls2 = a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static void a(int i, List<Double> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.g(i, list, z);
        }
    }

    public static void b(int i, List<Float> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.f(i, list, z);
        }
    }

    public static void c(int i, List<Long> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.c(i, list, z);
        }
    }

    public static void d(int i, List<Long> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.d(i, list, z);
        }
    }

    public static void e(int i, List<Long> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.n(i, list, z);
        }
    }

    public static void f(int i, List<Long> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.e(i, list, z);
        }
    }

    public static void g(int i, List<Long> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.l(i, list, z);
        }
    }

    public static void h(int i, List<Integer> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.a(i, list, z);
        }
    }

    public static void i(int i, List<Integer> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.j(i, list, z);
        }
    }

    public static void j(int i, List<Integer> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.m(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.b(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.k(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.h(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, epr epr, boolean z) {
        if (list != null && !list.isEmpty()) {
            epr.i(i, list, z);
        }
    }

    public static void a(int i, List<String> list, epr epr) {
        if (list != null && !list.isEmpty()) {
            epr.a(i, list);
        }
    }

    public static void b(int i, List<zzun> list, epr epr) {
        if (list != null && !list.isEmpty()) {
            epr.b(i, list);
        }
    }

    public static void a(int i, List<?> list, epr epr, eon eon) {
        if (list != null && !list.isEmpty()) {
            epr.a(i, list, eon);
        }
    }

    public static void b(int i, List<?> list, epr epr, eon eon) {
        if (list != null && !list.isEmpty()) {
            epr.b(i, list, eon);
        }
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof enm) {
            enm enm = (enm) list;
            i = 0;
            while (i2 < size) {
                i += zzve.d(enm.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzve.d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int a(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * zzve.l(i));
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof enm) {
            enm enm = (enm) list;
            i = 0;
            while (i2 < size) {
                i += zzve.e(enm.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzve.e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int b(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * zzve.l(i));
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof enm) {
            enm enm = (enm) list;
            i = 0;
            while (i2 < size) {
                i += zzve.f(enm.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzve.f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int c(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * zzve.l(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof emx) {
            emx emx = (emx) list;
            i = 0;
            while (i2 < size) {
                i += zzve.p(emx.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzve.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int d(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * zzve.l(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof emx) {
            emx emx = (emx) list;
            i = 0;
            while (i2 < size) {
                i += zzve.m(emx.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzve.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int e(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * zzve.l(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof emx) {
            emx emx = (emx) list;
            i = 0;
            while (i2 < size) {
                i += zzve.n(emx.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzve.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int f(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * zzve.l(i));
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof emx) {
            emx emx = (emx) list;
            i = 0;
            while (i2 < size) {
                i += zzve.o(emx.b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzve.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int g(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * zzve.l(i));
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    static int h(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzve.e(i);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    static int i(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzve.g(i);
    }

    static int j(List<?> list) {
        return list.size();
    }

    static int j(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzve.k(i);
    }

    static int k(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int l = zzve.l(i) * size;
        if (list instanceof eni) {
            eni eni = (eni) list;
            while (i4 < size) {
                Object b2 = eni.b(i4);
                if (b2 instanceof zzun) {
                    i3 = zzve.b((zzun) b2);
                } else {
                    i3 = zzve.b((String) b2);
                }
                l += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzun) {
                    i2 = zzve.b((zzun) obj);
                } else {
                    i2 = zzve.b((String) obj);
                }
                l += i2;
                i4++;
            }
        }
        return l;
    }

    static int a(int i, Object obj, eon eon) {
        if (obj instanceof eng) {
            return zzve.a(i, (eng) obj);
        }
        return zzve.b(i, (enx) obj, eon);
    }

    static int a(int i, List<?> list, eon eon) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = zzve.l(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof eng) {
                i2 = zzve.a((eng) obj);
            } else {
                i2 = zzve.b((enx) obj, eon);
            }
            l += i2;
        }
        return l;
    }

    static int l(int i, List<zzun> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = size * zzve.l(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            l += zzve.b((zzun) list.get(i2));
        }
        return l;
    }

    static int b(int i, List<enx> list, eon eon) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzve.c(i, (enx) list.get(i3), eon);
        }
        return i2;
    }

    public static epe<?, ?> a() {
        return b;
    }

    public static epe<?, ?> b() {
        return c;
    }

    public static epe<?, ?> c() {
        return d;
    }

    private static epe<?, ?> a(boolean z) {
        try {
            Class e = e();
            if (e == null) {
                return null;
            }
            return (epe) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void a(ens ens, T t, T t2, long j) {
        epk.a((Object) t, j, ens.a(epk.f(t, j), epk.f(t2, j)));
    }

    static <T, FT extends emr<FT>> void a(emm<FT> emm, T t, T t2) {
        emp a2 = emm.a((Object) t2);
        if (!a2.a.isEmpty()) {
            emp b2 = emm.b((Object) t);
            for (int i = 0; i < a2.a.b(); i++) {
                b2.a(a2.a.b(i));
            }
            for (Entry a3 : a2.a.c()) {
                b2.a(a3);
            }
        }
    }

    static <T, UT, UB> void a(epe<UT, UB> epe, T t, T t2) {
        epe.a((Object) t, epe.c(epe.b(t), epe.b(t2)));
    }

    static <UT, UB> UB a(int i, List<Integer> list, enb enb, UB ub, epe<UT, UB> epe) {
        UB ub2;
        if (enb == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!enb.a(intValue)) {
                        ub = a(i, intValue, ub2, epe);
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
                if (enb.a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, epe);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    static <UT, UB> UB a(int i, int i2, UB ub, epe<UT, UB> epe) {
        if (ub == null) {
            ub = epe.a();
        }
        epe.a(ub, i, (long) i2);
        return ub;
    }
}
