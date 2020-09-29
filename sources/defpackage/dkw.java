package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@cfp
/* renamed from: dkw reason: default package */
public final class dkw implements dlf {
    public final Object a = new Object();
    public final WeakHashMap<clq, dkx> b = new WeakHashMap<>();
    private final ArrayList<dkx> c = new ArrayList<>();
    private final Context d;
    private final cpp e;
    private final eay f;

    public dkw(Context context, cpp cpp) {
        this.d = context.getApplicationContext();
        this.e = cpp;
        this.f = new eay(context.getApplicationContext(), cpp, (String) dqe.f().a(dtg.a));
    }

    private final boolean d(clq clq) {
        boolean z;
        synchronized (this.a) {
            dkx dkx = (dkx) this.b.get(clq);
            z = dkx != null && dkx.c();
        }
        return z;
    }

    public final void a(clq clq) {
        synchronized (this.a) {
            dkx dkx = (dkx) this.b.get(clq);
            if (dkx != null) {
                dkx.b();
            }
        }
    }

    public final void a(dkx dkx) {
        synchronized (this.a) {
            if (!dkx.c()) {
                this.c.remove(dkx);
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == dkx) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void a(dpt dpt, clq clq) {
        a(dpt, clq, clq.b.o());
    }

    public final void a(dpt dpt, clq clq, View view) {
        a(dpt, clq, (dmi) new dld(view, clq), (cti) null);
    }

    public final void a(dpt dpt, clq clq, View view, cti cti) {
        a(dpt, clq, (dmi) new dld(view, clq), cti);
    }

    public final void a(dpt dpt, clq clq, dmi dmi, cti cti) {
        dkx dkx;
        synchronized (this.a) {
            if (d(clq)) {
                dkx = (dkx) this.b.get(clq);
            } else {
                dkx dkx2 = new dkx(this.d, dpt, clq, this.e, dmi);
                dkx2.a((dlf) this);
                this.b.put(clq, dkx2);
                this.c.add(dkx2);
                dkx = dkx2;
            }
            dkx.b(cti != null ? new dlg(dkx, cti) : new dlk(dkx, this.f, this.d));
        }
    }

    public final void b(clq clq) {
        synchronized (this.a) {
            dkx dkx = (dkx) this.b.get(clq);
            if (dkx != null) {
                dkx.f();
            }
        }
    }

    public final void c(clq clq) {
        synchronized (this.a) {
            dkx dkx = (dkx) this.b.get(clq);
            if (dkx != null) {
                dkx.g();
            }
        }
    }
}
