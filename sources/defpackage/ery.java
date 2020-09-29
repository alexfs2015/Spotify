package defpackage;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ery reason: default package */
public class ery implements esw {
    private static volatile ery m;
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
    final evw e;
    final eqw f;
    final eru g;
    public final AppMeasurement h;
    public final eqf i;
    erm j;
    int k;
    final long l;
    private final Context n;
    private final evt o;
    private final erh p;
    private final euq q;
    private final evm r;
    private final equ s;
    private final bzg t;
    private final etp u;
    private final etc v;
    private eqs w;
    private ets x;
    private ewg y;
    private eqq z;

    private ery(etb etb) {
        bwx.a(etb);
        this.o = new evt();
        eqm.a(this.o);
        this.n = etb.a;
        this.a = etb.b;
        this.b = etb.c;
        this.c = etb.d;
        this.d = etb.e;
        this.D = etb.f;
        eqr eqr = etb.g;
        if (!(eqr == null || eqr.g == null)) {
            Object obj = eqr.g.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.E = (Boolean) obj;
            }
            Object obj2 = eqr.g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.F = (Boolean) obj2;
            }
        }
        eld.a(this.n);
        this.t = bzj.d();
        this.l = this.t.a();
        this.e = new evw(this);
        erh erh = new erh(this);
        erh.x();
        this.p = erh;
        eqw eqw = new eqw(this);
        eqw.x();
        this.f = eqw;
        evm evm = new evm(this);
        evm.x();
        this.r = evm;
        equ equ = new equ(this);
        equ.x();
        this.s = equ;
        this.i = new eqf(this);
        etp etp = new etp(this);
        etp.E();
        this.u = etp;
        etc etc = new etc(this);
        etc.E();
        this.v = etc;
        this.h = new AppMeasurement(this);
        euq euq = new euq(this);
        euq.E();
        this.q = euq;
        eru eru = new eru(this);
        eru.x();
        this.g = eru;
        if (this.n.getApplicationContext() instanceof Application) {
            etc d2 = d();
            if (d2.m().getApplicationContext() instanceof Application) {
                Application application = (Application) d2.m().getApplicationContext();
                if (d2.a == null) {
                    d2.a = new etl(d2, 0);
                }
                application.unregisterActivityLifecycleCallbacks(d2.a);
                application.registerActivityLifecycleCallbacks(d2.a);
                d2.q().k.a("Registered activity lifecycle callback");
            }
        } else {
            q().f.a("Application context is not an Application");
        }
        this.g.a((Runnable) new erz(this, etb));
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
                if (evm.a(k().w(), b().g(), k().x(), b().h())) {
                    q().i.a("Rechecking which service to use due to a GMP App Id change");
                    b().j();
                    eqs g2 = g();
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
            etc d2 = d();
            erl erl = b().k;
            if (!erl.b) {
                erl.b = true;
                erl.c = erl.d.f().getString(erl.a, null);
            }
            d2.a(erl.c);
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
            if (!cab.a(this.n).a() && !this.e.t()) {
                if (!erp.a(this.n)) {
                    q().c.a("AppMeasurementReceiver not registered/enabled");
                }
                if (!evm.a(this.n)) {
                    q().c.a("AppMeasurementService not registered/enabled");
                }
            }
            q().c.a("Uploading is not possible. App measurement disabled");
        }
    }

    public final erh b() {
        a((esu) this.p);
        return this.p;
    }

    public final eqw q() {
        a((esv) this.f);
        return this.f;
    }

    public final eru p() {
        a((esv) this.g);
        return this.g;
    }

    public final euq c() {
        a((eur) this.q);
        return this.q;
    }

    public final etc d() {
        a((eur) this.v);
        return this.v;
    }

    public final evm e() {
        a((esu) this.r);
        return this.r;
    }

    public final equ f() {
        a((esu) this.s);
        return this.s;
    }

    public final eqs g() {
        a((eur) this.w);
        return this.w;
    }

    public final Context m() {
        return this.n;
    }

    public final bzg l() {
        return this.t;
    }

    public final etp h() {
        a((eur) this.u);
        return this.u;
    }

    public final ets i() {
        a((eur) this.x);
        return this.x;
    }

    public final ewg j() {
        a((esv) this.y);
        return this.y;
    }

    public final eqq k() {
        a((eur) this.z);
        return this.z;
    }

    public static ery a(Context context, eqr eqr) {
        if (eqr != null && (eqr.e == null || eqr.f == null)) {
            eqr eqr2 = new eqr(eqr.a, eqr.b, eqr.c, eqr.d, null, null, eqr.g);
            eqr = eqr2;
        }
        bwx.a(context);
        bwx.a(context.getApplicationContext());
        if (m == null) {
            synchronized (ery.class) {
                if (m == null) {
                    m = new ery(new etb(context, eqr));
                }
            }
        } else if (!(eqr == null || eqr.g == null || !eqr.g.containsKey("dataCollectionDefaultEnabled"))) {
            m.a(eqr.g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return m;
    }

    private final void u() {
        if (!this.A) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    private static void a(esv esv) {
        if (esv == null) {
            throw new IllegalStateException("Component not created");
        } else if (!esv.v()) {
            String valueOf = String.valueOf(esv.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void a(eur eur) {
        if (eur == null) {
            throw new IllegalStateException("Component not created");
        } else if (!eur.C()) {
            String valueOf = String.valueOf(eur.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void a(esu esu) {
        if (esu == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z2) {
        this.D = Boolean.valueOf(z2);
    }

    public final boolean n() {
        return this.D != null && this.D.booleanValue();
    }

    public final boolean o() {
        boolean z2;
        p().c();
        u();
        String str = "firebase_analytics_collection_enabled";
        if (this.e.a(eqm.ak)) {
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
            if (bst.b()) {
                return false;
            }
            if (!this.e.a(eqm.ah) || this.D == null) {
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
                z2 = !bst.b();
                if (z2 && this.D != null && ((Boolean) eqm.ah.a()).booleanValue()) {
                    z2 = this.D.booleanValue();
                }
            }
            return b().b(z2);
        }
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
            this.B = Boolean.valueOf(e().d("android.permission.INTERNET") && e().d("android.permission.ACCESS_NETWORK_STATE") && (cab.a(this.n).a() || this.e.t() || (erp.a(this.n) && evm.a(this.n))));
            if (this.B.booleanValue()) {
                if (!e().b(k().w(), k().x()) && TextUtils.isEmpty(k().x())) {
                    z2 = false;
                }
                this.B = Boolean.valueOf(z2);
            }
        }
        return this.B.booleanValue();
    }

    static /* synthetic */ void a(ery ery, etb etb) {
        String str;
        eqy eqy;
        ery.p().c();
        evw.d();
        ewg ewg = new ewg(ery);
        ewg.x();
        ery.y = ewg;
        eqq eqq = new eqq(ery);
        eqq.E();
        ery.z = eqq;
        eqs eqs = new eqs(ery);
        eqs.E();
        ery.w = eqs;
        ets ets = new ets(ery);
        ets.E();
        ery.x = ets;
        ery.r.y();
        ery.p.y();
        ery.j = new erm(ery);
        ery.z.F();
        ery.q().i.a("App measurement is starting up, version", Long.valueOf(14700));
        ery.q().i.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String v2 = eqq.v();
        if (TextUtils.isEmpty(ery.a)) {
            if (ery.e().f(v2)) {
                eqy = ery.q().i;
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                eqy = ery.q().i;
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(v2);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            eqy.a(str);
        }
        ery.q().j.a("Debug-level message logging enabled");
        if (ery.k != ery.G.get()) {
            ery.q().c.a("Not all components initialized", Integer.valueOf(ery.k), Integer.valueOf(ery.G.get()));
        }
        ery.A = true;
    }
}
