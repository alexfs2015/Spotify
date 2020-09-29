package defpackage;

import android.os.RemoteException;

/* renamed from: efc reason: default package */
final class efc implements cvr<Object, Object> {
    private final /* synthetic */ eer a;
    private final /* synthetic */ edm b;

    efc(eer eer, edm edm) {
        this.a = eer;
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
