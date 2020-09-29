package defpackage;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@cey
/* renamed from: ces reason: default package */
public final class ces implements cew {
    private static final Object a = new Object();
    private static cew b = null;
    private static cew c = null;
    private final Object d;
    private final Context e;
    private final WeakHashMap<Thread, Boolean> f;
    private final ExecutorService g;
    private final coy h;

    private ces(Context context) {
        this(context, coy.a());
    }

    private ces(Context context, coy coy) {
        this.d = new Object();
        this.f = new WeakHashMap<>();
        this.g = Executors.newCachedThreadPool();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.e = context;
        this.h = coy;
    }

    public static cew a(Context context) {
        synchronized (a) {
            if (b == null) {
                if (((Boolean) dpn.f().a(dsp.b)).booleanValue()) {
                    b = new ces(context);
                } else {
                    b = new cex();
                }
            }
        }
        return b;
    }

    public static cew a(Context context, coy coy) {
        synchronized (a) {
            if (c == null) {
                if (((Boolean) dpn.f().a(dsp.b)).booleanValue()) {
                    ces ces = new ces(context, coy);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (ces.d) {
                            ces.f.put(thread, Boolean.TRUE);
                        }
                        thread.setUncaughtExceptionHandler(new ceu(ces, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new cet(ces, Thread.getDefaultUncaughtExceptionHandler()));
                    c = ces;
                } else {
                    c = new cex();
                }
            }
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r4 == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Throwable r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0042
            r2 = r11
            r3 = 0
            r4 = 0
        L_0x0007:
            if (r2 == 0) goto L_0x003d
            java.lang.StackTraceElement[] r5 = r2.getStackTrace()
            int r6 = r5.length
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x0011:
            if (r3 >= r6) goto L_0x0036
            r8 = r5[r3]
            java.lang.String r9 = r8.getClassName()
            boolean r9 = defpackage.col.b(r9)
            if (r9 == 0) goto L_0x0020
            r4 = 1
        L_0x0020:
            java.lang.Class r9 = r10.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r8 = r8.getClassName()
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0033
            r7 = 1
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0036:
            java.lang.Throwable r2 = r2.getCause()
            r3 = r4
            r4 = r7
            goto L_0x0007
        L_0x003d:
            if (r3 == 0) goto L_0x0042
            if (r4 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x004c
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = ""
            r10.a(r11, r1, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ces.a(java.lang.Throwable):void");
    }

    public final void a(Throwable th, String str) {
        a(th, str, 1.0f);
    }

    public final void a(Throwable th, String str, float f2) {
        if (col.a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            dbh.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f2);
            if (f2 > 0.0f) {
                i2 = (int) (1.0f / f2);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a(name, stringWriter2, str, i2).toString());
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    this.g.submit(new cev(new cox(), (String) obj));
                }
            }
        }
    }

    private final Builder a(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = cab.a(this.e).a();
        } catch (Throwable th) {
            cow.a("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.e.getPackageName();
        } catch (Throwable unused) {
            cow.a(5);
            str4 = "unknown";
        }
        String str5 = "os";
        String str6 = "api";
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(str5, VERSION.RELEASE).appendQueryParameter(str6, String.valueOf(VERSION.SDK_INT));
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        if (!str8.startsWith(str7)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 1 + String.valueOf(str8).length());
            sb.append(str7);
            sb.append(" ");
            sb.append(str8);
            str8 = sb.toString();
        }
        String str9 = "session_id";
        String str10 = "sampling_rate";
        return appendQueryParameter.appendQueryParameter("device", str8).appendQueryParameter("js", this.h.a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", dsp.a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "193400285").appendQueryParameter("rc", "dev").appendQueryParameter(str9, dpn.c()).appendQueryParameter(str10, Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(dpn.f().a(dsp.dh)));
    }
}
