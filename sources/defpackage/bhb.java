package defpackage;

import java.util.Map;

/* renamed from: bhb reason: default package */
final class bhb implements bhc<cti> {
    bhb() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        if (map.keySet().contains("start")) {
            cti.e(true);
        }
        if (map.keySet().contains("stop")) {
            cti.e(false);
        }
    }
}
