package defpackage;

import java.util.Map;

/* renamed from: bgk reason: default package */
final class bgk implements bgl<csr> {
    bgk() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        if (map.keySet().contains("start")) {
            csr.e(true);
        }
        if (map.keySet().contains("stop")) {
            csr.e(false);
        }
    }
}
