package defpackage;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: esp reason: default package */
public class esp implements etn {
    private static volatile esp m;
    private boolean A = false;
    private Boolean B;
    private long C;
    private volatile Boolean D;
    private Boolean E;
    private Boolean F;
    private AtomicInteger G = new AtomicInteger(0);
    final String a;
    final String b;
    final String c;
    final boolean d;
    final ewn e;
    final ern f;
    final esl g;
    public final AppMeasurement h;
    public final eqw i;
    esd j;
    int k;
    final long l;
    private final Context n;
    private final ewk o;
    private final ery p;
    private final evh q;
    private final ewd r;
    private final erl s;
    private final bzx t;
    private final eug u;
    private final ett v;
    private erj w;
    private euj x;
    private ewx y;
    private erh z;

    private esp(ets ets) {
        bxo.a(ets);
        this.o = new ewk();
        erd.a(this.o);
        this.n = ets.a;
        this.a = ets.b;
        this.b = ets.c;
        this.c = ets.d;
        this.d = ets.e;
        this.D = ets.f;
        eri eri = ets.g;
        if (!(eri == null || eri.g == null)) {
            Object obj = eri.g.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.E = (Boolean) obj;
            }
            Object obj2 = eri.g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.F = (Boolean) obj2;
            }
        }
        elu.a(this.n);
        this.t = caa.d();
        this.l = this.t.a();
        this.e = new ewn(this);
        ery ery = new ery(this);
        ery.x();
        this.p = ery;
        ern ern = new ern(this);
        ern.x();
        this.f = ern;
        ewd ewd = new ewd(this);
        ewd.x();
        this.r = ewd;
        erl erl = new erl(this);
        erl.x();
        this.s = erl;
        this.i = new eqw(this);
        eug eug = new eug(this);
        eug.E();
        this.u = eug;
        ett ett = new ett(this);
        ett.E();
        this.v = ett;
        this.h = new AppMeasurement(this);
        evh evh = new evh(this);
        evh.E();
        this.q = evh;
        esl esl = new esl(this);
        esl.x();
        this.g = esl;
        if (this.n.getApplicationContext() instanceof Application) {
            ett d2 = d();
            if (d2.m().getApplicationContext() instanceof Application) {
                Application application = (Application) d2.m().getApplicationContext();
                if (d2.a == null) {
                    d2.a = new euc(d2, 0);
                }
                application.unregisterActivityLifecycleCallbacks(d2.a);
                application.registerActivityLifecycleCallbacks(d2.a);
                d2.q().k.a("Registered activity lifecycle callback");
            }
        } else {
            q().f.a("Application context is not an Application");
        }
        this.g.a((Runnable) new esq(this, ets));
    }

    public static esp a(Context context, eri eri) {
        if (eri != null && (eri.e == null || eri.f == null)) {
            eri eri2 = new eri(eri.a, eri.b, eri.c, eri.d, null, null, eri.g);
            eri = eri2;
        }
        bxo.a(context);
        bxo.a(context.getApplicationContext());
        if (m == null) {
            synchronized (esp.class) {
                if (m == null) {
                    m = new esp(new ets(context, eri));
                }
            }
        } else if (!(eri == null || eri.g == null || !eri.g.containsKey("dataCollectionDefaultEnabled"))) {
            m.a(eri.g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return m;
    }

    static /* synthetic */ void a(esp esp, ets ets) {
        String str;
        erp erp;
        esp.p().c();
        ewn.d();
        ewx ewx = new ewx(esp);
        ewx.x();
        esp.y = ewx;
        erh erh = new erh(esp);
        erh.E();
        esp.z = erh;
        erj erj = new erj(esp);
        erj.E();
        esp.w = erj;
        euj euj = new euj(esp);
        euj.E();
        esp.x = euj;
        esp.r.y();
        esp.p.y();
        esp.j = new esd(esp);
        esp.z.F();
        esp.q().i.a("App measurement is starting up, version", Long.valueOf(14700));
        esp.q().i.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String v2 = erh.v();
        if (TextUtils.isEmpty(esp.a)) {
            if (esp.e().f(v2)) {
                erp = esp.q().i;
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                erp = esp.q().i;
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(v2);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            erp.a(str);
        }
        esp.q().j.a("Debug-level message logging enabled");
        if (esp.k != esp.G.get()) {
            esp.q().c.a("Not all components initialized", Integer.valueOf(esp.k), Integer.valueOf(esp.G.get()));
        }
        esp.A = true;
    }

    private static void a(etl etl) {
        if (etl == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void a(etm etm) {
        if (etm == null) {
            throw new IllegalStateException("Component not created");
        } else if (!etm.v()) {
            String valueOf = String.valueOf(etm.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void a(evi evi) {
        if (evi == null) {
            throw new IllegalStateException("Component not created");
        } else if (!evi.C()) {
            String valueOf = String.valueOf(evi.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final void u() {
        if (!this.A) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        p().c();
        if (b().d.a() == 0) {
            b().d.a(this.t.a());
        }
        if (b().i.a() == 0) {
            q().k.a("Persisting first open", Long.valueOf(this.l));
            b().i.a(this.l);
        }
        if (t()) {
            if (!TextUtils.isEmpty(k().w()) || !TextUtils.isEmpty(k().x())) {
                e();
                if (ewd.a(k().w(), b().g(), k().x(), b().h())) {
                    q().i.a("Rechecking which service to use due to a GMP App Id change");
                    b().j();
                    erj g2 = g();
                    g2.c();
                    try {
                        int delete = g2.w().delete("messages", null, null) + 0;
                        if (delete > 0) {
                            g2.q().k.a("Reset local analytics data. records", Integer.valueOf(delete));
                        }
                    } catch (SQLiteException e2) {
                        g2.q().c.a("Error resetting local analytics data. error", e2);
                    }
                    this.x.A();
                    this.x.z();
                    b().i.a(this.l);
                    b().k.a(null);
                }
                b().c(k().w());
                b().d(k().x());
                if (this.e.j(k().v())) {
                    this.q.a(this.l);
                }
            }
            ett d2 = d();
            esc esc = b().k;
            if (!esc.b) {
                esc.b = true;
                esc.c = esc.d.f().getString(esc.a, null);
            }
            d2.a(esc.c);
            if (!TextUtils.isEmpty(k().w()) || !TextUtils.isEmpty(k().x())) {
                boolean o2 = o();
                if (!b().b.contains("deferred_analytics_collection") && !this.e.f()) {
                    b().c(!o2);
                }
                if (!this.e.e(k().v()) || o2) {
                    d().v();
                }
                i().a(new AtomicReference<>());
            }
        } else if (o()) {
            if (!e().d("android.permission.INTERNET")) {
                q().c.a("App is missing INTERNET permission");
            }
            if (!e().d("android.permission.ACCESS_NETWORK_STATE")) {
                q().c.a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!cas.a(this.n).a() && !this.e.t()) {
                if (!esg.a(this.n)) {
                    q().c.a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ewd.a(this.n)) {
                    q().c.a("AppMeasurementService not registered/enabled");
                }
            }
            q().c.a("Uploading is not possible. App measurement disabled");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z2) {
        this.D = Boolean.valueOf(z2);
    }

    public final ery b() {
        a((etl) this.p);
        return this.p;
    }

    public final evh c() {
        a((evi) this.q);
        return this.q;
    }

    public final ett d() {
        a((evi) this.v);
        return this.v;
    }

    public final ewd e() {
        a((etl) this.r);
        return this.r;
    }

    public final erl f() {
        a((etl) this.s);
        return this.s;
    }

    public final erj g() {
        a((evi) this.w);
        return this.w;
    }

    public final eug h() {
        a((evi) this.u);
        return this.u;
    }

    public final euj i() {
        a((evi) this.x);
        return this.x;
    }

    public final ewx j() {
        a((etm) this.y);
        return this.y;
    }

    public final erh k() {
        a((evi) this.z);
        return this.z;
    }

    public final bzx l() {
        return this.t;
    }

    public final Context m() {
        return this.n;
    }

    public final boolean n() {
        return this.D != null && this.D.booleanValue();
    }

    public final boolean o() {
        boolean z2;
        p().c();
        u();
        String str = "firebase_analytics_collection_enabled";
        if (this.e.a(erd.ak)) {
            if (this.e.f()) {
                return false;
            }
            Boolean bool = this.F;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            Boolean t2 = b().t();
            if (t2 != null) {
                return t2.booleanValue();
            }
            Boolean b2 = this.e.b(str);
            if (b2 != null) {
                return b2.booleanValue();
            }
            Boolean bool2 = this.E;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (btk.b()) {
                return false;
            }
            if (!this.e.a(erd.ah) || this.D == null) {
                return true;
            }
            return this.D.booleanValue();
        } else if (this.e.f()) {
            return false;
        } else {
            Boolean b3 = this.e.b(str);
            if (b3 != null) {
                z2 = b3.booleanValue();
            } else {
                z2 = !btk.b();
                if (z2 && this.D != null && ((Boolean) erd.ah.a()).booleanValue()) {
                    z2 = this.D.booleanValue();
                }
            }
            return b().b(z2);
        }
    }

    public final esl p() {
        a((etm) this.g);
        return this.g;
    }

    public final ern q() {
        a((etm) this.f);
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public final void r() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    public final void s() {
        this.G.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        u();
        p().c();
        Boolean bool = this.B;
        if (bool == null || this.C == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.t.b() - this.C) > 1000)) {
            this.C = this.t.b();
            boolean z2 = true;
            this.B = Boolean.valueOf(e().d("android.permission.INTERNET") && e().d("android.permission.ACCESS_NETWORK_STATE") && (cas.a(this.n).a() || this.e.t() || (esg.a(this.n) && ewd.a(this.n))));
            if (this.B.booleanValue()) {
                if (!e().b(k().w(), k().x()) && TextUtils.isEmpty(k().x())) {
                    z2 = false;
                }
                this.B = Boolean.valueOf(z2);
            }
        }
        return this.B.booleanValue();
    }
}
