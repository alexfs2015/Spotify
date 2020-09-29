package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: ern reason: default package */
public final class ern extends etm {
    char a = 0;
    long b = -1;
    public final erp c = new erp(this, 6, false, false);
    final erp d = new erp(this, 6, true, false);
    final erp e = new erp(this, 6, false, true);
    public final erp f = new erp(this, 5, false, false);
    final erp g = new erp(this, 5, true, false);
    public final erp h = new erp(this, 5, false, true);
    final erp i = new erp(this, 4, false, false);
    final erp j = new erp(this, 3, false, false);
    public final erp k = new erp(this, 2, false, false);
    private String l;

    ern(esp esp) {
        super(esp);
    }

    protected static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new erq(str);
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
            if (!(obj instanceof Throwable)) {
                return obj instanceof erq ? ((erq) obj).a : z ? str2 : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String b2 = b(AppMeasurement.class.getCanonicalName());
            String b3 = b(esp.class.getCanonicalName());
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
        }
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

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    private final String f() {
        String str;
        synchronized (this) {
            if (this.l == null) {
                if (this.r.c != null) {
                    this.l = this.r.c;
                } else {
                    this.l = ewn.d();
                }
            }
            str = this.l;
        }
        return str;
    }

    public final String M_() {
        long j2;
        Pair<String, Long> pair;
        esb esb = r().c;
        esb.d.c();
        esb.d.c();
        long b2 = esb.b();
        if (b2 == 0) {
            esb.a();
            j2 = 0;
        } else {
            j2 = Math.abs(b2 - esb.d.l().a());
        }
        if (j2 >= esb.c) {
            if (j2 > (esb.c << 1)) {
                esb.a();
            } else {
                String string = esb.d.f().getString(esb.b, null);
                long j3 = esb.d.f().getLong(esb.a, 0);
                esb.a();
                pair = (string == null || j3 <= 0) ? ery.a : new Pair<>(string, Long.valueOf(j3));
                if (pair != null || pair == ery.a) {
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

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        Log.println(i2, f(), str);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && a(i2)) {
            a(i2, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            bxo.a(str);
            esl esl = this.r.g;
            if (esl == null) {
                a(6, "Scheduler not set. Not logging error/warn");
            } else if (!esl.v()) {
                a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                ero ero = new ero(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3);
                esl.a((Runnable) ero);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        return Log.isLoggable(f(), i2);
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
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
}
