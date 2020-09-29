package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@cey
/* renamed from: cln reason: default package */
public final class cln implements dlx {
    public final Object a;
    public final HashSet<clb> b;
    private final clj c;
    private final HashSet<clm> d;

    public cln() {
        this(dpn.c());
    }

    private cln(String str) {
        this.a = new Object();
        this.b = new HashSet<>();
        this.d = new HashSet<>();
        this.c = new clj(str);
    }

    public final void a() {
        synchronized (this.a) {
            this.c.a();
        }
    }

    public final void a(clb clb) {
        synchronized (this.a) {
            this.b.add(clb);
        }
    }

    public final void a(clm clm) {
        synchronized (this.a) {
            this.d.add(clm);
        }
    }

    public final void a(doy doy, long j) {
        synchronized (this.a) {
            this.c.a(doy, j);
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.c.b();
        }
    }

    public final Bundle a(Context context, clk clk, String str) {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.c.a(context, str));
            Bundle bundle2 = new Bundle();
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                clm clm = (clm) it.next();
                bundle2.putBundle(clm.e, clm.a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                arrayList.add(((clb) it2.next()).a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            clk.a(this.b);
            this.b.clear();
        }
        return bundle;
    }

    public final void a(boolean z) {
        clj clj;
        int l;
        long a2 = bjl.l().a();
        if (z) {
            if (a2 - bjl.i().g().k() > ((Long) dpn.f().a(dsp.aG)).longValue()) {
                clj = this.c;
                l = -1;
            } else {
                clj = this.c;
                l = bjl.i().g().l();
            }
            clj.a = l;
            return;
        }
        clw g = bjl.i().g();
        g.a();
        synchronized (g.a) {
            if (g.l != a2) {
                g.l = a2;
                if (g.d != null) {
                    g.d.putLong("app_last_background_time_ms", a2);
                    g.d.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", a2);
                g.a(bundle);
            }
        }
        clw g2 = bjl.i().g();
        int i = this.c.a;
        g2.a();
        synchronized (g2.a) {
            if (g2.n != i) {
                g2.n = i;
                if (g2.d != null) {
                    g2.d.putInt("request_in_session_count", i);
                    g2.d.apply();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("request_in_session_count", i);
                g2.a(bundle2);
            }
        }
    }
}
