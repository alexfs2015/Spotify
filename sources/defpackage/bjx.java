package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarg;

/* renamed from: bjx reason: default package */
final class bjx implements Runnable {
    final /* synthetic */ cla a;
    final /* synthetic */ ckk b;
    final /* synthetic */ bju c;
    private final /* synthetic */ dtc d;

    bjx(bju bju, cla cla, ckk ckk, dtc dtc) {
        this.c = bju;
        this.a = cla;
        this.b = ckk;
        this.d = dtc;
    }

    public final void run() {
        if (this.a.b.r && this.c.e.B != null) {
            String str = null;
            if (this.a.b.a != null) {
                bjl.e();
                str = cmd.a(this.a.b.a);
            }
            dtd dtd = new dtd(this.c, str, this.a.b.b);
            this.c.e.I = 1;
            try {
                this.c.c = false;
                this.c.e.B.a(dtd);
                return;
            } catch (RemoteException e) {
                clu.b("#007 Could not call remote method.", e);
                this.c.c = true;
            }
        }
        bkj bkj = new bkj(this.c.e.c, this.b, this.a.b.E);
        try {
            csr a2 = this.c.a(this.a, bkj, this.b);
            a2.setOnTouchListener(new bjz(this, bkj));
            a2.setOnClickListener(new bka(this, bkj));
            this.c.e.I = 0;
            bjm bjm = this.c.e;
            bjl.d();
            Context context = this.c.e.c;
            bju bju = this.c;
            bjm.h = cdc.a(context, bju, this.a, bju.e.d, a2, this.c.o, this.c, this.d);
        } catch (zzarg e2) {
            clu.a("Could not obtain webview.", e2);
            cmd.a.post(new bjy(this));
        }
    }
}
