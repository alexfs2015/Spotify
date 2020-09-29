package defpackage;

import java.util.Map;

/* renamed from: bgu reason: default package */
final class bgu implements bhc<cti> {
    bgu() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        bhk t = cti.t();
        if (t != null) {
            t.a();
            return;
        }
        bhk u = cti.u();
        if (u != null) {
            u.a();
        } else {
            cpn.a(5);
        }
    }
}
