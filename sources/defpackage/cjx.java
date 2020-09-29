package defpackage;

import android.os.RemoteException;

/* renamed from: cjx reason: default package */
final class cjx implements Runnable {
    private final /* synthetic */ edj a;
    private final /* synthetic */ dpp b;
    private final /* synthetic */ ckc c;
    private final /* synthetic */ cjv d;

    cjx(cjv cjv, edj edj, dpp dpp, ckc ckc) {
        this.d = cjv;
        this.a = edj;
        this.b = dpp;
        this.c = ckc;
    }

    public final void run() {
        try {
            this.a.a(cbj.a(this.d.b), this.b, (String) null, (ckk) this.c, this.d.c);
        } catch (RemoteException unused) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.d.a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(5);
            this.d.a(0);
        }
    }
}
