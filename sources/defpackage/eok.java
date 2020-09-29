package defpackage;

import com.google.android.gms.internal.measurement.zzwy;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: eok reason: default package */
final class eok implements eoj {
    eok() {
    }

    public final Object a() {
        return zzwy.a().b();
    }

    public final Object a(Object obj, Object obj2) {
        zzwy zzwy = (zzwy) obj;
        zzwy zzwy2 = (zzwy) obj2;
        if (!zzwy2.isEmpty()) {
            if (!zzwy.zzbup) {
                zzwy = zzwy.b();
            }
            zzwy.c();
            if (!zzwy2.isEmpty()) {
                zzwy.putAll(zzwy2);
            }
        }
        return zzwy;
    }

    public final Map<?, ?> a(Object obj) {
        return (zzwy) obj;
    }

    public final eoi<?, ?> b() {
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> b(Object obj) {
        return (zzwy) obj;
    }

    public final boolean c(Object obj) {
        return !((zzwy) obj).zzbup;
    }

    public final Object d(Object obj) {
        ((zzwy) obj).zzbup = false;
        return obj;
    }

    public final int e(Object obj) {
        zzwy zzwy = (zzwy) obj;
        if (zzwy.isEmpty()) {
            return 0;
        }
        Iterator it = zzwy.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
