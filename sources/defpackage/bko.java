package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarg;

/* renamed from: bko reason: default package */
final class bko implements Runnable {
    final /* synthetic */ clr a;
    final /* synthetic */ clb b;
    final /* synthetic */ bkl c;
    private final /* synthetic */ dtt d;

    bko(bkl bkl, clr clr, clb clb, dtt dtt) {
        this.c = bkl;
        this.a = clr;
        this.b = clb;
        this.d = dtt;
    }

    public final void run() {
        if (this.a.b.r && this.c.e.B != null) {
            String str = null;
            if (this.a.b.a != null) {
                bkc.e();
                str = cmu.a(this.a.b.a);
            }
            dtu dtu = new dtu(this.c, str, this.a.b.b);
            this.c.e.I = 1;
            try {
                this.c.c = false;
                this.c.e.B.a(dtu);
                return;
            } catch (RemoteException e) {
                cml.b("#007 Could not call remote method.", e);
                this.c.c = true;
            }
        }
        bla bla = new bla(this.c.e.c, this.b, this.a.b.E);
        try {
            cti a2 = this.c.a(this.a, bla, this.b);
            a2.setOnTouchListener(new bkq(this, bla));
            a2.setOnClickListener(new bkr(this, bla));
            this.c.e.I = 0;
            bkd bkd = this.c.e;
            bkc.d();
            Context context = this.c.e.c;
            bkl bkl = this.c;
            bkd.h = cdt.a(context, bkl, this.a, bkl.e.d, a2, this.c.o, this.c, this.d);
        } catch (zzarg e2) {
            cml.a("Could not obtain webview.", e2);
            cmu.a.post(new bkp(this));
        }
    }
}
