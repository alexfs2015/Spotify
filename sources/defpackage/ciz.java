package defpackage;

import android.os.RemoteException;

@cey
/* renamed from: ciz reason: default package */
public final class ciz implements bld {
    private final cil a;

    public ciz(cil cil) {
        this.a = cil;
    }

    public final String a() {
        cil cil = this.a;
        if (cil == null) {
            return null;
        }
        try {
            return cil.a();
        } catch (RemoteException unused) {
            cow.a(5);
            return null;
        }
    }

    public final int b() {
        cil cil = this.a;
        if (cil == null) {
            return 0;
        }
        try {
            return cil.b();
        } catch (RemoteException unused) {
            cow.a(5);
            return 0;
        }
    }
}
