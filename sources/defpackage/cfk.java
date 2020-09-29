package defpackage;

import android.content.Context;

/* renamed from: cfk reason: default package */
final class cfk implements Runnable {
    private final /* synthetic */ cqe a;
    private final /* synthetic */ cfb b;

    cfk(cfb cfb, cqe cqe) {
        this.b = cfb;
        this.a = cqe;
    }

    public final void run() {
        cfo cfo;
        synchronized (this.b.b) {
            cfb cfb = this.b;
            cfb cfb2 = this.b;
            coy coy = this.b.a.j;
            cqe cqe = this.a;
            Context context = cfb2.c;
            if (new cfl(context).a(coy)) {
                cow.a(3);
                cfo = new cfr(context, cqe, cfb2);
                cfo.c();
            } else {
                cow.a(3);
                dpn.a();
                if (!col.c(context)) {
                    cow.a(5);
                    cfo = null;
                } else {
                    cfo = new cfs(context, coy, cqe, cfb2);
                }
            }
            cfb.e = cfo;
            if (this.b.e == null) {
                this.b.a(0, "Could not start the ad request service.");
                cmd.a.removeCallbacks(this.b.d);
            }
        }
    }
}
