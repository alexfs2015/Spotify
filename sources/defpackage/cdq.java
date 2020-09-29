package defpackage;

import java.util.Map;

/* renamed from: cdq reason: default package */
final class cdq implements bgl<Object> {
    private final /* synthetic */ dtv a;
    private final /* synthetic */ cdm b;

    cdq(cdm cdm, dtv dtv) {
        this.b = cdm;
        this.a = dtv;
    }

    public final void zza(Object obj, Map<String, String> map) {
        cdm.a(this.b, (dvw) this.a, (String) map.get("asset"));
    }
}
