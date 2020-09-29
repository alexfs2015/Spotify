package defpackage;

import java.util.Map;

/* renamed from: bgi reason: default package */
final class bgi implements bgl<csr> {
    bgi() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            csr.x_();
            return;
        }
        if ("resume".equals(str)) {
            csr.y_();
        }
    }
}
