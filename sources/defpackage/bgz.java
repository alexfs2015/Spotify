package defpackage;

import java.util.Map;

/* renamed from: bgz reason: default package */
final class bgz implements bhc<cti> {
    bgz() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            cti.x_();
            return;
        }
        if ("resume".equals(str)) {
            cti.y_();
        }
    }
}
