package defpackage;

import com.google.android.gms.internal.ads.zzbco;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: dem reason: default package */
final class dem implements del {
    dem() {
    }

    public final Object a() {
        return zzbco.a().b();
    }

    public final Object a(Object obj, Object obj2) {
        zzbco zzbco = (zzbco) obj;
        zzbco zzbco2 = (zzbco) obj2;
        if (!zzbco2.isEmpty()) {
            if (!zzbco.zzdpi) {
                zzbco = zzbco.b();
            }
            zzbco.c();
            if (!zzbco2.isEmpty()) {
                zzbco.putAll(zzbco2);
            }
        }
        return zzbco;
    }

    public final Map<?, ?> a(Object obj) {
        return (zzbco) obj;
    }

    public final dek<?, ?> b() {
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> b(Object obj) {
        return (zzbco) obj;
    }

    public final boolean c(Object obj) {
        return !((zzbco) obj).zzdpi;
    }

    public final Object d(Object obj) {
        ((zzbco) obj).zzdpi = false;
        return obj;
    }

    public final int e(Object obj) {
        zzbco zzbco = (zzbco) obj;
        if (zzbco.isEmpty()) {
            return 0;
        }
        Iterator it = zzbco.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
