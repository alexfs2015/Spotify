package defpackage;

import android.os.RemoteException;
import java.util.List;

/* renamed from: biv reason: default package */
final class biv implements Runnable {
    private final /* synthetic */ duf a;
    private final /* synthetic */ int b;
    private final /* synthetic */ List c;
    private final /* synthetic */ bis d;

    biv(bis bis, duf duf, int i, List list) {
        this.d = bis;
        this.a = duf;
        this.b = i;
        this.c = list;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.a instanceof dtt) && this.d.e.t != null) {
                bis bis = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bis.c = z;
                dty a2 = bis.b(this.a);
                this.d.e.t.a(a2);
                this.d.a(a2.n());
            } else if ((this.a instanceof dtt) && this.d.e.s != null) {
                bis bis2 = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bis2.c = z;
                dtt dtt = (dtt) this.a;
                this.d.e.s.a(dtt);
                this.d.a(dtt.j());
            } else if ((this.a instanceof dtr) && this.d.e.t != null) {
                bis bis3 = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bis3.c = z;
                dty a3 = bis.b(this.a);
                this.d.e.t.a(a3);
                this.d.a(a3.n());
            } else if (!(this.a instanceof dtr) || this.d.e.r == null) {
                bis bis4 = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bis4.a(3, z);
            } else {
                bis bis5 = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bis5.c = z;
                dtr dtr = (dtr) this.a;
                this.d.e.r.a(dtr);
                this.d.a(dtr.j());
            }
        } catch (RemoteException e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }
}
