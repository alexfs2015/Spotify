package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzve;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

/* renamed from: epg reason: default package */
final class epg {
    private static final Class<?> a = d();
    private static final epv<?, ?> b = a(false);
    private static final epv<?, ?> c = a(true);
    private static final epv<?, ?> d = new epx();

    static int a(int i, Object obj, epe epe) {
        return obj instanceof enx ? zzve.a(i, (enx) obj) : zzve.b(i, (eoo) obj, epe);
    }

    static int a(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * zzve.l(i));
    }

    static int a(int i, List<?> list, epe epe) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = zzve.l(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            l += obj instanceof enx ? zzve.a((enx) obj) : zzve.b((eoo) obj, epe);
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
        if (list instanceof eod) {
            eod eod = (eod) list;
            i = 0;
            while (i2 < size) {
                i += zzve.d(eod.b(i2));
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

    public static epv<?, ?> a() {
        return b;
    }

    private static epv<?, ?> a(boolean z) {
        try {
            Class e = e();
            if (e == null) {
                return null;
            }
            return (epv) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, epv<UT, UB> epv) {
        if (ub == null) {
            ub = epv.a();
        }
        epv.a(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB a(int i, List<Integer> list, ens ens, UB ub, epv<UT, UB> epv) {
        UB ub2;
        if (ens == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!ens.a(intValue)) {
                        ub = a(i, intValue, ub2, epv);
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
                if (ens.a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, epv);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    public static void a(int i, List<String> list, eqi eqi) {
        if (list != null && !list.isEmpty()) {
            eqi.a(i, list);
        }
    }

    public static void a(int i, List<?> list, eqi eqi, epe epe) {
        if (list != null && !list.isEmpty()) {
            eqi.a(i, list, epe);
        }
    }

    public static void a(int i, List<Double> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.g(i, list, z);
        }
    }

    static <T, FT extends eni<FT>> void a(end<FT> end, T t, T t2) {
        eng a2 = end.a((Object) t2);
        if (!a2.a.isEmpty()) {
            eng b2 = end.b((Object) t);
            for (int i = 0; i < a2.a.b(); i++) {
                b2.a(a2.a.b(i));
            }
            for (Entry a3 : a2.a.c()) {
                b2.a(a3);
            }
        }
    }

    static <T> void a(eoj eoj, T t, T t2, long j) {
        eqb.a((Object) t, j, eoj.a(eqb.f(t, j), eqb.f(t2, j)));
    }

    static <T, UT, UB> void a(epv<UT, UB> epv, T t, T t2) {
        epv.a((Object) t, epv.c(epv.b(t), epv.b(t2)));
    }

    public static void a(Class<?> cls) {
        if (!enn.class.isAssignableFrom(cls)) {
            Class<?> cls2 = a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int b(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * zzve.l(i));
    }

    static int b(int i, List<eoo> list, epe epe) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzve.c(i, (eoo) list.get(i3), epe);
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
        if (list instanceof eod) {
            eod eod = (eod) list;
            i = 0;
            while (i2 < size) {
                i += zzve.e(eod.b(i2));
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

    public static epv<?, ?> b() {
        return c;
    }

    public static void b(int i, List<zzun> list, eqi eqi) {
        if (list != null && !list.isEmpty()) {
            eqi.b(i, list);
        }
    }

    public static void b(int i, List<?> list, eqi eqi, epe epe) {
        if (list != null && !list.isEmpty()) {
            eqi.b(i, list, epe);
        }
    }

    public static void b(int i, List<Float> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.f(i, list, z);
        }
    }

    static int c(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * zzve.l(i));
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eod) {
            eod eod = (eod) list;
            i = 0;
            while (i2 < size) {
                i += zzve.f(eod.b(i2));
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

    public static epv<?, ?> c() {
        return d;
    }

    public static void c(int i, List<Long> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.c(i, list, z);
        }
    }

    static int d(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * zzve.l(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eno) {
            eno eno = (eno) list;
            i = 0;
            while (i2 < size) {
                i += zzve.p(eno.b(i2));
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

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i, List<Long> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.d(i, list, z);
        }
    }

    static int e(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * zzve.l(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eno) {
            eno eno = (eno) list;
            i = 0;
            while (i2 < size) {
                i += zzve.m(eno.b(i2));
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

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i, List<Long> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.n(i, list, z);
        }
    }

    static int f(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * zzve.l(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eno) {
            eno eno = (eno) list;
            i = 0;
            while (i2 < size) {
                i += zzve.n(eno.b(i2));
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

    public static void f(int i, List<Long> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.e(i, list, z);
        }
    }

    static int g(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * zzve.l(i));
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof eno) {
            eno eno = (eno) list;
            i = 0;
            while (i2 < size) {
                i += zzve.o(eno.b(i2));
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

    public static void g(int i, List<Long> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.l(i, list, z);
        }
    }

    static int h(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzve.e(i);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.a(i, list, z);
        }
    }

    static int i(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzve.g(i);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.j(i, list, z);
        }
    }

    static int j(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzve.k(i);
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.m(i, list, z);
        }
    }

    static int k(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int l = zzve.l(i) * size;
        if (list instanceof enz) {
            enz enz = (enz) list;
            while (i2 < size) {
                Object b2 = enz.b(i2);
                l += b2 instanceof zzun ? zzve.b((zzun) b2) : zzve.b((String) b2);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                l += obj instanceof zzun ? zzve.b((zzun) obj) : zzve.b((String) obj);
                i2++;
            }
        }
        return l;
    }

    public static void k(int i, List<Integer> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.b(i, list, z);
        }
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

    public static void l(int i, List<Integer> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.k(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.h(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, eqi eqi, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqi.i(i, list, z);
        }
    }
}
