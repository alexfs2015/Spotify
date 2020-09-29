package defpackage;

import java.util.Map;

/* renamed from: dun reason: default package */
final class dun implements bgl<Object> {
    private final /* synthetic */ ced a;
    private final /* synthetic */ duj b;

    dun(duj duj, ced ced) {
        this.b = duj;
        this.a = ced;
    }

    public final void zza(Object obj, Map<String, String> map) {
        csr csr = (csr) this.b.a.get();
        if (csr == null) {
            this.a.b("/hideOverlay", this);
        } else {
            csr.o().setVisibility(8);
        }
    }
}
