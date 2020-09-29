package defpackage;

import java.util.Map;

/* renamed from: cid reason: default package */
final class cid implements bhc<Object> {
    private final /* synthetic */ cia a;

    cid(cia cia) {
        this.a = cia;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.a.b) {
            if (!this.a.e.isDone()) {
                cig cig = new cig(-2, map);
                if (this.a.c.equals(cig.f)) {
                    this.a.e.b(cig);
                }
            }
        }
    }
}
