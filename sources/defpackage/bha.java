package defpackage;

import java.util.Map;

/* renamed from: bha reason: default package */
final class bha implements bhc<cti> {
    bha() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        if (map.keySet().contains("start")) {
            cti.x().h();
        } else if (map.keySet().contains("stop")) {
            cti.x().i();
        } else {
            if (map.keySet().contains("cancel")) {
                cti.x().j();
            }
        }
    }
}
