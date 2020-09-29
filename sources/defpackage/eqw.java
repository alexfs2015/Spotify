package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: eqw reason: default package */
public final class eqw extends esv {
    char a = 0;
    long b = -1;
    public final eqy c = new eqy(this, 6, false, false);
    final eqy d = new eqy(this, 6, true, false);
    final eqy e = new eqy(this, 6, false, true);
    public final eqy f = new eqy(this, 5, false, false);
    final eqy g = new eqy(this, 5, true, false);
    public final eqy h = new eqy(this, 5, false, true);
    final eqy i = new eqy(this, 4, false, false);
    final eqy j = new eqy(this, 3, false, false);
    public final eqy k = new eqy(this, 2, false, false);
    private String l;

    eqw(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    protected static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new eqz(str);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && a(i2)) {
            a(i2, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            bwx.a(str);
            eru eru = this.r.g;
            if (eru == null) {
                a(6, "Scheduler not set. Not logging error/warn");
            } else if (!eru.v()) {
                a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                eqx eqx = new eqx(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3);
                eru.a((Runnable) eqx);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        return Log.isLoggable(f(), i2);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        Log.println(i2, f(), str);
    }

    private final String f() {
        String str;
        synchronized (this) {
            if (this.l == null) {
                if (this.r.c != null) {
                    this.l = this.r.c;
                } else {
                    this.l = evw.d();
                }
            }
            str = this.l;
        }
        return str;
    }

    static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a2 = a(z, obj);
        String a3 = a(z, obj2);
        String a4 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a4)) {
            sb.append(str2);
            sb.append(a4);
        }
        return sb.toString();
    }

    private static String a(boolean z, Object obj) {
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str2 = "-";
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = str2;
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b2 = b(AppMeasurement.class.getCanonicalName());
                String b3 = b(ery.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            String b4 = b(className);
                            if (b4.equals(b2) || b4.equals(b3)) {
                                sb2.append(": ");
                                sb2.append(stackTraceElement);
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof eqz) {
                return ((eqz) obj).a;
            } else {
                return z ? str2 : String.valueOf(obj);
            }
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public final String M_() {
        long j2;
        Pair<String, Long> pair;
        erk erk = r().c;
        erk.d.c();
        erk.d.c();
        long b2 = erk.b();
        if (b2 == 0) {
            erk.a();
            j2 = 0;
        } else {
            j2 = Math.abs(b2 - erk.d.l().a());
        }
        if (j2 >= erk.c) {
            if (j2 > (erk.c << 1)) {
                erk.a();
            } else {
                String string = erk.d.f().getString(erk.b, null);
                long j3 = erk.d.f().getLong(erk.a, 0);
                erk.a();
                if (string == null || j3 <= 0) {
                    pair = erh.a;
                } else {
                    pair = new Pair<>(string, Long.valueOf(j3));
                }
                if (pair != null || pair == erh.a) {
                    return null;
                }
                String valueOf = String.valueOf(pair.second);
                String str = (String) pair.first;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str);
                return sb.toString();
            }
        }
        pair = null;
        if (pair != null) {
        }
        return null;
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
