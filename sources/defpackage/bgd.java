package defpackage;

import java.util.Map;

/* renamed from: bgd reason: default package */
final class bgd implements bgl<csr> {
    bgd() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        bgt t = csr.t();
        if (t != null) {
            t.a();
            return;
        }
        bgt u = csr.u();
        if (u != null) {
            u.a();
        } else {
            cow.a(5);
        }
    }
}
