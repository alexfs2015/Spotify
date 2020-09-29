package defpackage;

import android.os.RemoteException;

/* renamed from: bjr reason: default package */
final class bjr implements Runnable {
    private final /* synthetic */ dwn a;
    private final /* synthetic */ bjj b;

    bjr(bjj bjj, dwn dwn) {
        this.b = bjj;
        this.a = dwn;
    }

    public final void run() {
        try {
            ((dxb) this.b.e.v.get(this.a.l())).a(this.a);
        } catch (RemoteException e) {
            cml.b("#007 Could not call remote method.", e);
        }
    }
}
