package defpackage;

import android.os.RemoteException;
import java.util.List;

/* renamed from: bjm reason: default package */
final class bjm implements Runnable {
    private final /* synthetic */ duw a;
    private final /* synthetic */ int b;
    private final /* synthetic */ List c;
    private final /* synthetic */ bjj d;

    bjm(bjj bjj, duw duw, int i, List list) {
        this.d = bjj;
        this.a = duw;
        this.b = i;
        this.c = list;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.a instanceof duk) && this.d.e.t != null) {
                bjj bjj = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bjj.c = z;
                dup a2 = bjj.b(this.a);
                this.d.e.t.a(a2);
                this.d.a(a2.n());
            } else if ((this.a instanceof duk) && this.d.e.s != null) {
                bjj bjj2 = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bjj2.c = z;
                duk duk = (duk) this.a;
                this.d.e.s.a(duk);
                this.d.a(duk.j());
            } else if ((this.a instanceof dui) && this.d.e.t != null) {
                bjj bjj3 = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bjj3.c = z;
                dup a3 = bjj.b(this.a);
                this.d.e.t.a(a3);
                this.d.a(a3.n());
            } else if (!(this.a instanceof dui) || this.d.e.r == null) {
                bjj bjj4 = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bjj4.a(3, z);
            } else {
                bjj bjj5 = this.d;
                if (this.b != this.c.size() - 1) {
                    z = true;
                }
                bjj5.c = z;
                dui dui = (dui) this.a;
                this.d.e.r.a(dui);
                this.d.a(dui.j());
            }
        } catch (RemoteException e) {
            cml.b("#007 Could not call remote method.", e);
        }
    }
}
