package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ewn reason: default package */
public final class ewn extends etl {
    ewp a = ewo.a;
    private Boolean b;
    private Boolean c;

    ewn(esp esp) {
        super(esp);
        erd.a(esp);
    }

    static String d() {
        return (String) erd.h.a();
    }

    public static long g() {
        return ((Long) erd.K.a()).longValue();
    }

    public static long h() {
        return ((Long) erd.k.a()).longValue();
    }

    public static boolean j() {
        return ((Boolean) erd.g.a()).booleanValue();
    }

    static boolean u() {
        return ((Boolean) erd.ac.a()).booleanValue();
    }

    public final int a(String str) {
        return b(str, erd.v);
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

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final boolean a(a<Boolean> aVar) {
        return c(null, aVar);
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

    /* access modifiers changed from: 0000 */
    public final Boolean b(String str) {
        bxo.a(str);
        try {
            if (m().getPackageManager() == null) {
                q().c.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a2 = cas.a(m()).a(m().getPackageName(), 128);
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

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final boolean c(String str) {
        return "1".equals(this.a.a(str, "gaia_collection_enabled"));
    }

    public final boolean c(String str, a<Boolean> aVar) {
        if (str == null) {
            return ((Boolean) aVar.a()).booleanValue();
        }
        String a2 = this.a.a(str, aVar.a);
        return TextUtils.isEmpty(a2) ? ((Boolean) aVar.a()).booleanValue() : ((Boolean) aVar.a(Boolean.valueOf(Boolean.parseBoolean(a2)))).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final boolean d(String str) {
        return c(str, erd.Q);
    }

    public final boolean e() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    ApplicationInfo applicationInfo = m().getApplicationInfo();
                    String a2 = cah.a();
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

    /* access modifiers changed from: 0000 */
    public final boolean e(String str) {
        return c(str, erd.V);
    }

    public final boolean f() {
        Boolean b2 = b("firebase_analytics_collection_deactivated");
        return b2 != null && b2.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final boolean f(String str) {
        return c(str, erd.X);
    }

    /* access modifiers changed from: 0000 */
    public final boolean g(String str) {
        return c(str, erd.ab);
    }

    /* access modifiers changed from: 0000 */
    public final boolean h(String str) {
        return c(str, erd.ad);
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

    /* access modifiers changed from: 0000 */
    public final boolean i(String str) {
        return c(str, erd.ae);
    }

    /* access modifiers changed from: 0000 */
    public final boolean j(String str) {
        return c(str, erd.af);
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    /* access modifiers changed from: 0000 */
    public final boolean k(String str) {
        return c(str, erd.ag);
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    /* access modifiers changed from: 0000 */
    public final boolean l(String str) {
        return c(str, erd.ai);
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
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
}
