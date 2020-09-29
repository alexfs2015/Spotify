package defpackage;

import android.os.RemoteException;

/* renamed from: bky reason: default package */
final class bky implements Runnable {
    private final /* synthetic */ dwn a;
    private final /* synthetic */ bkt b;

    bky(bkt bkt, dwn dwn) {
        this.b = bkt;
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
