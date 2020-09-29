package defpackage;

import android.os.RemoteException;

/* renamed from: biz reason: default package */
final class biz implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ ckz b;
    private final /* synthetic */ bis c;

    biz(bis bis, String str, ckz ckz) {
        this.c = bis;
        this.a = str;
        this.b = ckz;
    }

    public final void run() {
        try {
            ((dwk) this.c.e.v.get(this.a)).a((dtv) this.b.C);
        } catch (RemoteException e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }
}
