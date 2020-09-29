package defpackage;

import java.util.Map;

/* renamed from: bgy reason: default package */
final class bgy implements bhc<cti> {
    bgy() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        if (((Boolean) dqe.f().a(dtg.br)).booleanValue()) {
            cti.d(!Boolean.parseBoolean((String) map.get("disabled")));
        }
    }
}
