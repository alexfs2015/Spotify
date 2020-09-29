package defpackage;

import android.os.RemoteException;

/* renamed from: bjq reason: default package */
final class bjq implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ clq b;
    private final /* synthetic */ bjj c;

    bjq(bjj bjj, String str, clq clq) {
        this.c = bjj;
        this.a = str;
        this.b = clq;
    }

    public final void run() {
        try {
            ((dxb) this.c.e.v.get(this.a)).a((dum) this.b.C);
        } catch (RemoteException e) {
            cml.b("#007 Could not call remote method.", e);
        }
    }
}
