package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: dcz reason: default package */
public final class dcz implements dgn {
    private final zzbav a;

    dcz(zzbav zzbav) {
        this.a = (zzbav) ddr.a(zzbav, "output");
    }

    public final int a() {
        return e.j;
    }

    public final void a(int i) {
        this.a.a(i, 3);
    }

    public final void a(int i, double d) {
        this.a.a(i, d);
    }

    public final void a(int i, float f) {
        this.a.a(i, f);
    }

    public final void a(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void a(int i, long j) {
        this.a.a(i, j);
    }

    public final void a(int i, zzbah zzbah) {
        this.a.a(i, zzbah);
    }

    public final <K, V> void a(int i, dek<K, V> dek, Map<K, V> map) {
        for (Entry entry : map.entrySet()) {
            this.a.a(i, 2);
            this.a.b(dej.a(dek, entry.getKey(), entry.getValue()));
            dej.a(this.a, dek, entry.getKey(), entry.getValue());
        }
    }

    public final void a(int i, Object obj) {
        if (obj instanceof zzbah) {
            this.a.b(i, (zzbah) obj);
        } else {
            this.a.a(i, (deq) obj);
        }
    }

    public final void a(int i, Object obj, dfj dfj) {
        this.a.a(i, (deq) obj, dfj);
    }

    public final void a(int i, String str) {
        this.a.a(i, str);
    }

    public final void a(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof deb) {
            deb deb = (deb) list;
            while (i2 < list.size()) {
                Object b = deb.b(i2);
                if (b instanceof String) {
                    this.a.a(i, (String) b);
                } else {
                    this.a.a(i, (zzbah) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void a(int i, List<?> list, dfj dfj) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), dfj);
        }
    }

    public final void a(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m(((Integer) list.get(i4)).intValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void a(int i, boolean z) {
        this.a.a(i, z);
    }

    public final void b(int i) {
        this.a.a(i, 4);
    }

    public final void b(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void b(int i, long j) {
        this.a.c(i, j);
    }

    public final void b(int i, Object obj, dfj dfj) {
        zzbav zzbav = this.a;
        deq deq = (deq) obj;
        zzbav.a(i, 3);
        dfj.a(deq, (dgn) zzbav.c);
        zzbav.a(i, 4);
    }

    public final void b(int i, List<zzbah> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.a(i, (zzbah) list.get(i2));
        }
    }

    public final void b(int i, List<?> list, dfj dfj) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), dfj);
        }
    }

    public final void b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += zzbav.a();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void c(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void c(int i, long j) {
        this.a.a(i, j);
    }

    public final void c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.d(((Long) list.get(i4)).longValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void d(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void d(int i, long j) {
        this.a.c(i, j);
    }

    public final void d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.e(((Long) list.get(i4)).longValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void e(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void e(int i, long j) {
        this.a.b(i, j);
    }

    public final void e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += zzbav.c();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void f(int i, int i2) {
        this.a.d(i, i2);
    }

    public final void f(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += zzbav.e();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void g(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += zzbav.f();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.p(((Integer) list.get(i4)).intValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void i(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3 += zzbav.g();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.n(((Integer) list.get(i4)).intValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += zzbav.b();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void l(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += zzbav.d();
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.o(((Integer) list.get(i4)).intValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void n(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.f(((Long) list.get(i4)).longValue());
            }
            this.a.b(i3);
            while (i2 < list.size()) {
                this.a.b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
