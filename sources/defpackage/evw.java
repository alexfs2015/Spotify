package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: evw reason: default package */
public final class evw extends esu {
    evy a = evx.a;
    private Boolean b;
    private Boolean c;

    evw(ery ery) {
        super(ery);
        eqm.a(ery);
    }

    static String d() {
        return (String) eqm.h.a();
    }

    public final int a(String str) {
        return b(str, eqm.v);
    }

    public final boolean e() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    ApplicationInfo applicationInfo = m().getApplicationInfo();
                    String a2 = bzq.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.c = Boolean.valueOf(str != null && str.equals(a2));
                    }
                    if (this.c == null) {
                        this.c = Boolean.TRUE;
                        q().c.a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.c.booleanValue();
    }

    public final long a(String str, a<Long> aVar) {
        if (str == null) {
            return ((Long) aVar.a()).longValue();
        }
        String a2 = this.a.a(str, aVar.a);
        if (TextUtils.isEmpty(a2)) {
            return ((Long) aVar.a()).longValue();
        }
        try {
            return ((Long) aVar.a(Long.valueOf(Long.parseLong(a2)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) aVar.a()).longValue();
        }
    }

    public final int b(String str, a<Integer> aVar) {
        if (str == null) {
            return ((Integer) aVar.a()).intValue();
        }
        String a2 = this.a.a(str, aVar.a);
        if (TextUtils.isEmpty(a2)) {
            return ((Integer) aVar.a()).intValue();
        }
        try {
            return ((Integer) aVar.a(Integer.valueOf(Integer.parseInt(a2)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) aVar.a()).intValue();
        }
    }

    public final boolean c(String str, a<Boolean> aVar) {
        if (str == null) {
            return ((Boolean) aVar.a()).booleanValue();
        }
        String a2 = this.a.a(str, aVar.a);
        if (TextUtils.isEmpty(a2)) {
            return ((Boolean) aVar.a()).booleanValue();
        }
        return ((Boolean) aVar.a(Boolean.valueOf(Boolean.parseBoolean(a2)))).booleanValue();
    }

    public final boolean a(a<Boolean> aVar) {
        return c(null, aVar);
    }

    /* access modifiers changed from: 0000 */
    public final Boolean b(String str) {
        bwx.a(str);
        try {
            if (m().getPackageManager() == null) {
                q().c.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a2 = cab.a(m()).a(m().getPackageName(), 128);
            if (a2 == null) {
                q().c.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a2.metaData == null) {
                q().c.a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!a2.metaData.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(a2.metaData.getBoolean(str));
            }
        } catch (NameNotFoundException e) {
            q().c.a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final boolean f() {
        Boolean b2 = b("firebase_analytics_collection_deactivated");
        return b2 != null && b2.booleanValue();
    }

    public static long g() {
        return ((Long) eqm.K.a()).longValue();
    }

    public static long h() {
        return ((Long) eqm.k.a()).longValue();
    }

    public final String i() {
        String str = "";
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", str});
        } catch (ClassNotFoundException e) {
            q().c.a("Could not find SystemProperties class", e);
            return str;
        } catch (NoSuchMethodException e2) {
            q().c.a("Could not find SystemProperties.get() method", e2);
            return str;
        } catch (IllegalAccessException e3) {
            q().c.a("Could not access SystemProperties.get()", e3);
            return str;
        } catch (InvocationTargetException e4) {
            q().c.a("SystemProperties.get() threw an exception", e4);
            return str;
        }
    }

    public static boolean j() {
        return ((Boolean) eqm.g.a()).booleanValue();
    }

    public final boolean c(String str) {
        return "1".equals(this.a.a(str, "gaia_collection_enabled"));
    }

    /* access modifiers changed from: 0000 */
    public final boolean d(String str) {
        return c(str, eqm.Q);
    }

    /* access modifiers changed from: 0000 */
    public final boolean e(String str) {
        return c(str, eqm.V);
    }

    /* access modifiers changed from: 0000 */
    public final boolean f(String str) {
        return c(str, eqm.X);
    }

    /* access modifiers changed from: 0000 */
    public final boolean g(String str) {
        return c(str, eqm.ab);
    }

    /* access modifiers changed from: 0000 */
    public final boolean t() {
        if (this.b == null) {
            this.b = b("app_measurement_lite");
            if (this.b == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.r.d;
    }

    static boolean u() {
        return ((Boolean) eqm.ac.a()).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final boolean h(String str) {
        return c(str, eqm.ad);
    }

    /* access modifiers changed from: 0000 */
    public final boolean i(String str) {
        return c(str, eqm.ae);
    }

    /* access modifiers changed from: 0000 */
    public final boolean j(String str) {
        return c(str, eqm.af);
    }

    /* access modifiers changed from: 0000 */
    public final boolean k(String str) {
        return c(str, eqm.ag);
    }

    /* access modifiers changed from: 0000 */
    public final boolean l(String str) {
        return c(str, eqm.ai);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}
