package defpackage;

import java.util.Map;

/* renamed from: dum reason: default package */
final class dum implements bgl<Object> {
    private final /* synthetic */ ced a;
    private final /* synthetic */ duj b;

    dum(duj duj, ced ced) {
        this.b = duj;
        this.a = ced;
    }

    public final void zza(Object obj, Map<String, String> map) {
        csr csr = (csr) this.b.a.get();
        if (csr == null) {
            this.a.b("/showOverlay", this);
        } else {
            csr.o().setVisibility(0);
        }
    }
}
