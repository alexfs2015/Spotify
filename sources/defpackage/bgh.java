package defpackage;

import java.util.Map;

/* renamed from: bgh reason: default package */
final class bgh implements bgl<csr> {
    bgh() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        if (((Boolean) dpn.f().a(dsp.br)).booleanValue()) {
            csr.d(!Boolean.parseBoolean((String) map.get("disabled")));
        }
    }
}
