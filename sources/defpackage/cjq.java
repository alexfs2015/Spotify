package defpackage;

import android.os.RemoteException;

@cfp
/* renamed from: cjq reason: default package */
public final class cjq implements blu {
    private final cjc a;

    public cjq(cjc cjc) {
        this.a = cjc;
    }

    public final String a() {
        cjc cjc = this.a;
        if (cjc == null) {
            return null;
        }
        try {
            return cjc.a();
        } catch (RemoteException unused) {
            cpn.a(5);
            return null;
        }
    }

    public final int b() {
        cjc cjc = this.a;
        if (cjc == null) {
            return 0;
        }
        try {
            return cjc.b();
        } catch (RemoteException unused) {
            cpn.a(5);
            return 0;
        }
    }
}
