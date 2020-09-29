package defpackage;

import java.util.Map;

/* renamed from: bgj reason: default package */
final class bgj implements bgl<csr> {
    bgj() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        if (map.keySet().contains("start")) {
            csr.x().h();
        } else if (map.keySet().contains("stop")) {
            csr.x().i();
        } else {
            if (map.keySet().contains("cancel")) {
                csr.x().j();
            }
        }
    }
}
