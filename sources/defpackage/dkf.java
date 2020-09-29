package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@cey
/* renamed from: dkf reason: default package */
public final class dkf implements dko {
    public final Object a = new Object();
    public final WeakHashMap<ckz, dkg> b = new WeakHashMap<>();
    private final ArrayList<dkg> c = new ArrayList<>();
    private final Context d;
    private final coy e;
    private final eah f;

    public dkf(Context context, coy coy) {
        this.d = context.getApplicationContext();
        this.e = coy;
        this.f = new eah(context.getApplicationContext(), coy, (String) dpn.f().a(dsp.a));
    }

    private final boolean d(ckz ckz) {
        boolean z;
        synchronized (this.a) {
            dkg dkg = (dkg) this.b.get(ckz);
            z = dkg != null && dkg.c();
        }
        return z;
    }

    public final void a(ckz ckz) {
        synchronized (this.a) {
            dkg dkg = (dkg) this.b.get(ckz);
            if (dkg != null) {
                dkg.b();
            }
        }
    }

    public final void a(dkg dkg) {
        synchronized (this.a) {
            if (!dkg.c()) {
                this.c.remove(dkg);
                Iterator it = this.b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == dkg) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void a(dpc dpc, ckz ckz) {
        a(dpc, ckz, ckz.b.o());
    }

    public final void a(dpc dpc, ckz ckz, View view) {
        a(dpc, ckz, (dlr) new dkm(view, ckz), (csr) null);
    }

    public final void a(dpc dpc, ckz ckz, View view, csr csr) {
        a(dpc, ckz, (dlr) new dkm(view, ckz), csr);
    }

    public final void a(dpc dpc, ckz ckz, dlr dlr, csr csr) {
        dkg dkg;
        synchronized (this.a) {
            if (d(ckz)) {
                dkg = (dkg) this.b.get(ckz);
            } else {
                dkg dkg2 = new dkg(this.d, dpc, ckz, this.e, dlr);
                dkg2.a((dko) this);
                this.b.put(ckz, dkg2);
                this.c.add(dkg2);
                dkg = dkg2;
            }
            dkg.b(csr != null ? new dkp(dkg, csr) : new dkt(dkg, this.f, this.d));
        }
    }

    public final void b(ckz ckz) {
        synchronized (this.a) {
            dkg dkg = (dkg) this.b.get(ckz);
            if (dkg != null) {
                dkg.f();
            }
        }
    }

    public final void c(ckz ckz) {
        synchronized (this.a) {
            dkg dkg = (dkg) this.b.get(ckz);
            if (dkg != null) {
                dkg.g();
            }
        }
    }
}
