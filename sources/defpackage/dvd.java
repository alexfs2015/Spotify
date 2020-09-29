package defpackage;

import java.util.Map;

/* renamed from: dvd reason: default package */
final class dvd implements bhc<Object> {
    private final /* synthetic */ ceu a;
    private final /* synthetic */ dva b;

    dvd(dva dva, ceu ceu) {
        this.b = dva;
        this.a = ceu;
    }

    public final void zza(Object obj, Map<String, String> map) {
        cti cti = (cti) this.b.a.get();
        if (cti == null) {
            this.a.b("/showOverlay", this);
        } else {
            cti.o().setVisibility(0);
        }
    }
}
