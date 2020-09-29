package defpackage;

import java.util.Map;

/* renamed from: dve reason: default package */
final class dve implements bhc<Object> {
    private final /* synthetic */ ceu a;
    private final /* synthetic */ dva b;

    dve(dva dva, ceu ceu) {
        this.b = dva;
        this.a = ceu;
    }

    public final void zza(Object obj, Map<String, String> map) {
        cti cti = (cti) this.b.a.get();
        if (cti == null) {
            this.a.b("/hideOverlay", this);
        } else {
            cti.o().setVisibility(8);
        }
    }
}
