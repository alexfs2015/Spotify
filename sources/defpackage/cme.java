package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@cfp
/* renamed from: cme reason: default package */
public final class cme implements dmo {
    public final Object a;
    public final HashSet<cls> b;
    private final cma c;
    private final HashSet<cmd> d;

    public cme() {
        this(dqe.c());
    }

    private cme(String str) {
        this.a = new Object();
        this.b = new HashSet<>();
        this.d = new HashSet<>();
        this.c = new cma(str);
    }

    public final Bundle a(Context context, cmb cmb, String str) {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.c.a(context, str));
            Bundle bundle2 = new Bundle();
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                cmd cmd = (cmd) it.next();
                bundle2.putBundle(cmd.e, cmd.a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                arrayList.add(((cls) it2.next()).a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            cmb.a(this.b);
            this.b.clear();
        }
        return bundle;
    }

    public final void a() {
        synchronized (this.a) {
            this.c.a();
        }
    }

    public final void a(cls cls) {
        synchronized (this.a) {
            this.b.add(cls);
        }
    }

    public final void a(cmd cmd) {
        synchronized (this.a) {
            this.d.add(cmd);
        }
    }

    public final void a(dpp dpp, long j) {
        synchronized (this.a) {
            this.c.a(dpp, j);
        }
    }

    public final void a(boolean z) {
        cma cma;
        int l;
        long a2 = bkc.l().a();
        if (z) {
            if (a2 - bkc.i().g().k() > ((Long) dqe.f().a(dtg.aG)).longValue()) {
                cma = this.c;
                l = -1;
            } else {
                cma = this.c;
                l = bkc.i().g().l();
            }
            cma.a = l;
            return;
        }
        cmn g = bkc.i().g();
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
        cmn g2 = bkc.i().g();
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

    public final void b() {
        synchronized (this.a) {
            this.c.b();
        }
    }
}
