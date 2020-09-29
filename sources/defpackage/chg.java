package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: chg reason: default package */
public class chg {
    public static boolean a = Log.isLoggable("Volley", 2);
    private static String b = "Volley";

    /* renamed from: chg$a */
    static class a {
        public static final boolean a = chg.a;
        private final List<cih> b = new ArrayList();
        private boolean c = false;

        a() {
        }

        public final synchronized void a(String str) {
            long j;
            this.c = true;
            if (this.b.size() == 0) {
                j = 0;
            } else {
                j = ((cih) this.b.get(this.b.size() - 1)).c - ((cih) this.b.get(0)).c;
            }
            if (j > 0) {
                long j2 = ((cih) this.b.get(0)).c;
                chg.b("(%-4d ms) %s", Long.valueOf(j), str);
                for (cih cih : this.b) {
                    long j3 = cih.c;
                    chg.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(cih.b), cih.a);
                    j2 = j3;
                }
            }
        }

        public final synchronized void a(String str, long j) {
            if (!this.c) {
                List<cih> list = this.b;
                cih cih = new cih(str, j, SystemClock.elapsedRealtime());
                list.add(cih);
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.c) {
                a("Request on the loose");
                chg.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        if (a) {
            d(str, objArr);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(b, d(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        d(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        Log.e(b, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClass().equals(chg.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
