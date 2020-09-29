package defpackage;

import com.google.android.gms.internal.measurement.zzve;

/* renamed from: enq reason: default package */
public final class enq<K, V> {
    static <K, V> void a(zzve zzve, enr<K, V> enr, K k, V v) {
        emp.a(zzve, enr.a, 1, k);
        emp.a(zzve, enr.c, 2, v);
    }

    static <K, V> int a(enr<K, V> enr, K k, V v) {
        return emp.a(enr.a, 1, k) + emp.a(enr.c, 2, v);
    }
}
