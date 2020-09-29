package defpackage;

import android.os.RemoteException;

/* renamed from: efd reason: default package */
final class efd implements cvr<Object, Object> {
    private final /* synthetic */ eet a;
    private final /* synthetic */ edm b;
    private final /* synthetic */ efb c;

    efd(efb efb, eet eet, edm edm) {
        this.c = efb;
        this.a = eet;
        this.b = edm;
    }

    public final void a(String str) {
        try {
            this.a.a(str);
        } catch (RemoteException e) {
            cpn.a("", e);
        }
    }
}
