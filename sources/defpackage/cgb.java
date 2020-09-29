package defpackage;

import android.content.Context;

/* renamed from: cgb reason: default package */
final class cgb implements Runnable {
    private final /* synthetic */ cqv a;
    private final /* synthetic */ cfs b;

    cgb(cfs cfs, cqv cqv) {
        this.b = cfs;
        this.a = cqv;
    }

    public final void run() {
        cgf cgf;
        synchronized (this.b.b) {
            cfs cfs = this.b;
            cfs cfs2 = this.b;
            cpp cpp = this.b.a.j;
            cqv cqv = this.a;
            Context context = cfs2.c;
            if (new cgc(context).a(cpp)) {
                cpn.a(3);
                cgf = new cgi(context, cqv, cfs2);
                cgf.c();
            } else {
                cpn.a(3);
                dqe.a();
                if (!cpc.c(context)) {
                    cpn.a(5);
                    cgf = null;
                } else {
                    cgf = new cgj(context, cpp, cqv, cfs2);
                }
            }
            cfs.e = cgf;
            if (this.b.e == null) {
                this.b.a(0, "Could not start the ad request service.");
                cmu.a.removeCallbacks(this.b.d);
            }
        }
    }
}
