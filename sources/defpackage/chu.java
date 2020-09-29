package defpackage;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: chu reason: default package */
public final class chu extends cgu {
    private static final Object a = new Object();
    private static chu b;
    private final Context c;
    private final cht d;
    private final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();

    private chu(Context context, cht cht) {
        this.c = context;
        this.d = cht;
    }

    private static cgp a(Context context, cht cht, cgl cgl, ScheduledExecutorService scheduledExecutorService) {
        Future future;
        char c2;
        Context context2 = context;
        cht cht2 = cht;
        cgl cgl2 = cgl;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        cpn.a(3);
        dtt dtt = new dtt(((Boolean) dqe.f().a(dtg.N)).booleanValue(), "load_ad", cgl2.d.a);
        if (cgl2.a > 10 && cgl2.A != -1) {
            dtt.a(dtt.a(cgl2.A), "cts");
        }
        dtr a2 = dtt.a();
        cqi a3 = cpx.a(cht2.h.a(), ((Long) dqe.f().a(dtg.cy)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        cqi a4 = cpx.a(cht2.g.a(), ((Long) dqe.f().a(dtg.bt)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        cll cll = cht2.b;
        String str = cgl2.g.packageName;
        cqi a5 = cll.a();
        cll cll2 = cht2.b;
        String str2 = cgl2.g.packageName;
        cqi b2 = cll2.b();
        cqi a6 = cht2.i.a(cgl2.h);
        Future a7 = bkc.p().a(context2);
        cqi a8 = cpx.a(null);
        Bundle bundle = cgl2.c.c;
        String str3 = "_ad";
        boolean z = (bundle == null || bundle.getString(str3) == null) ? false : true;
        if (cgl2.G && !z) {
            a8 = cht2.e.a();
        }
        dtt dtt2 = dtt;
        cqi a9 = cpx.a(a8, ((Long) dqe.f().a(dtg.cp)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future a10 = cpx.a(null);
        if (((Boolean) dqe.f().a(dtg.aH)).booleanValue()) {
            future = a7;
            a10 = cpx.a(cht2.i.a(context2), ((Long) dqe.f().a(dtg.aI)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        } else {
            future = a7;
        }
        Bundle bundle2 = (cgl2.a < 4 || cgl2.o == null) ? null : cgl2.o;
        ((Boolean) dqe.f().a(dtg.ad)).booleanValue();
        bkc.e();
        if (cmu.a(context2, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            cpn.a(3);
        }
        String uuid = cgl2.a >= 7 ? cgl2.v : UUID.randomUUID().toString();
        new cia(context2, uuid, cgl2.f.packageName);
        if (cgl2.c.c != null) {
            String string = cgl2.c.c.getString(str3);
            if (string != null) {
                return chz.a(context2, cgl2, string);
            }
        }
        List<String> a11 = cht2.c.a(cgl2.w);
        dtr dtr = a2;
        String str4 = uuid;
        Bundle bundle3 = (Bundle) cpx.a((Future<T>) a3, null, ((Long) dqe.f().a(dtg.cy)).longValue(), TimeUnit.MILLISECONDS);
        cis cis = (cis) cpx.a((Future<T>) a4, null);
        Location location = (Location) cpx.a((Future<T>) a9, null);
        Info info = (Info) cpx.a(a10, null);
        String str5 = (String) cpx.a((Future<T>) a6, null);
        String str6 = (String) cpx.a((Future<T>) a5, null);
        String str7 = (String) cpx.a((Future<T>) b2, null);
        cii cii = (cii) cpx.a(future, null);
        if (cii == null) {
            cpn.a(5);
            return new cgp(0);
        }
        chs chs = new chs();
        chs.j = cgl2;
        chs.k = cii;
        chs.e = cis;
        chs.d = location;
        chs.b = bundle3;
        chs.h = str5;
        chs.i = info;
        if (a11 == null) {
            chs.c.clear();
        }
        chs.c = a11;
        chs.a = bundle2;
        chs.f = str6;
        chs.g = str7;
        chs.l = cht2.a.a();
        chs.m = true;
        JSONObject a12 = chz.a(context2, chs);
        if (a12 == null) {
            return new cgp(0);
        }
        if (cgl2.a < 7) {
            try {
                a12.put("request_id", str4);
            } catch (JSONException unused) {
            }
        }
        dtt dtt3 = dtt2;
        dtr dtr2 = dtr;
        dtt3.a(dtr2, "arc");
        dtt3.a();
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        cqi a13 = cpx.a(cpx.a(cht2.k.a().b(a12), chv.a, (Executor) scheduledExecutorService3), 10, TimeUnit.SECONDS, scheduledExecutorService3);
        cqi a14 = cht2.d.a();
        if (a14 != null) {
            cpv.a(a14, "AdRequestServiceImpl.loadAd.flags");
        }
        cig cig = (cig) cpx.a((Future<T>) a13, null);
        if (cig == null) {
            return new cgp(0);
        }
        if (cig.i != -2) {
            return new cgp(cig.i);
        }
        cgp a15 = !TextUtils.isEmpty(cig.g) ? chz.a(context2, cgl2, cig.g) : null;
        if (a15 == null && !TextUtils.isEmpty(cig.h)) {
            a15 = a(cgl, context, cgl2.k.a, cig.h, str6, str7, cig, dtt3, cht);
        }
        if (a15 == null) {
            c2 = 0;
            a15 = new cgp(0);
        } else {
            c2 = 0;
        }
        String[] strArr = new String[1];
        strArr[c2] = "tts";
        dtt3.a(dtr2, strArr);
        a15.w = dtt3.b();
        return a15;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0241, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0242, code lost:
        r3 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        r0 = r9.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r5 = new java.io.InputStreamReader(r15.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        defpackage.bkc.e();
        r6 = defpackage.cmu.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        defpackage.cad.a(r5);
        r3.a(r6);
        a(r0, r12, r6, r10);
        r7.c = r6;
        r7.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        if (r2 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        r2.a(r4, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0106, code lost:
        r0 = r1.j;
        r12 = r7.M;
        r13 = r7.b;
        r14 = r7.c;
        r2 = r7.d;
        r3 = r7.h;
        r4 = r7.j;
        r6 = r7.k;
        r8 = r7.l;
        r9 = r7.m;
        r11 = r7.n;
        r21 = r9;
        r9 = r7.a;
        r27 = r7.f;
        r28 = r7.g;
        r29 = r7.o;
        r30 = r7.p;
        r31 = r7.q;
        r32 = r7.r;
        r33 = r7.t;
        r34 = r7.u;
        r35 = r7.v;
        r36 = r7.w;
        r37 = r7.x;
        r38 = r7.y;
        r39 = r7.z;
        r40 = r7.A;
        r41 = r7.B;
        r42 = r7.C;
        r43 = r7.D;
        r44 = r7.E;
        r45 = r7.F;
        r46 = r7.G;
        r47 = r7.e;
        r48 = r7.s;
        r49 = r7.H;
        r10 = r7.I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0180, code lost:
        if (r0 == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0182, code lost:
        r51 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0185, code lost:
        r51 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0193, code lost:
        r23 = r11;
        r11 = r11;
        r56 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r11 = new defpackage.cgp(r12, r13, r14, r2, r3, r4, r6, r8, r21, r23, r9, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r10, r51, r7.J, r7.i, r7.K, r7.L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r56.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01af, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        r56 = r15;
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b7, code lost:
        r56 = r15;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        defpackage.cad.a(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01be, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A[Catch:{ all -> 0x00ae, all -> 0x0245 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cgp a(defpackage.cgl r57, android.content.Context r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, defpackage.cig r63, defpackage.dtt r64, defpackage.cht r65) {
        /*
            r0 = r57
            r1 = r63
            r2 = r64
            if (r2 == 0) goto L_0x000d
            dtr r4 = r64.a()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            cie r7 = new cie     // Catch:{ IOException -> 0x024b }
            java.lang.String r8 = r1.b     // Catch:{ IOException -> 0x024b }
            r7.<init>(r0, r8)     // Catch:{ IOException -> 0x024b }
            java.lang.String r8 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r9 = java.lang.String.valueOf(r60)     // Catch:{ IOException -> 0x024b }
            int r10 = r9.length()     // Catch:{ IOException -> 0x024b }
            if (r10 == 0) goto L_0x0025
            r8.concat(r9)     // Catch:{ IOException -> 0x024b }
            goto L_0x002a
        L_0x0025:
            java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x024b }
            r9.<init>(r8)     // Catch:{ IOException -> 0x024b }
        L_0x002a:
            r8 = 3
            defpackage.cpn.a(r8)     // Catch:{ IOException -> 0x024b }
            java.net.URL r9 = new java.net.URL     // Catch:{ IOException -> 0x024b }
            r10 = r60
            r9.<init>(r10)     // Catch:{ IOException -> 0x024b }
            bzx r10 = defpackage.bkc.l()     // Catch:{ IOException -> 0x024b }
            long r25 = r10.b()     // Catch:{ IOException -> 0x024b }
            r11 = 0
        L_0x003e:
            java.net.URLConnection r12 = r9.openConnection()     // Catch:{ IOException -> 0x024b }
            r15 = r12
            java.net.HttpURLConnection r15 = (java.net.HttpURLConnection) r15     // Catch:{ IOException -> 0x024b }
            cmu r12 = defpackage.bkc.e()     // Catch:{ all -> 0x0245 }
            r13 = r58
            r14 = r59
            r12.a(r13, r14, r15)     // Catch:{ all -> 0x0245 }
            boolean r12 = r1.e     // Catch:{ all -> 0x0245 }
            if (r12 == 0) goto L_0x0072
            boolean r12 = android.text.TextUtils.isEmpty(r61)     // Catch:{ all -> 0x0245 }
            if (r12 != 0) goto L_0x0062
            java.lang.String r12 = "x-afma-drt-cookie"
            r5 = r61
            r15.addRequestProperty(r12, r5)     // Catch:{ all -> 0x0245 }
            goto L_0x0064
        L_0x0062:
            r5 = r61
        L_0x0064:
            boolean r12 = android.text.TextUtils.isEmpty(r62)     // Catch:{ all -> 0x0245 }
            if (r12 != 0) goto L_0x0074
            java.lang.String r12 = "x-afma-drt-v2-cookie"
            r6 = r62
            r15.addRequestProperty(r12, r6)     // Catch:{ all -> 0x0245 }
            goto L_0x0076
        L_0x0072:
            r5 = r61
        L_0x0074:
            r6 = r62
        L_0x0076:
            java.lang.String r12 = r0.H     // Catch:{ all -> 0x0245 }
            boolean r16 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0245 }
            if (r16 != 0) goto L_0x0086
            defpackage.cpn.a(r8)     // Catch:{ all -> 0x0245 }
            java.lang.String r8 = "Cookie"
            r15.addRequestProperty(r8, r12)     // Catch:{ all -> 0x0245 }
        L_0x0086:
            r8 = 1
            if (r1 == 0) goto L_0x00b9
            java.lang.String r12 = r1.c     // Catch:{ all -> 0x0245 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0245 }
            if (r12 != 0) goto L_0x00b9
            r15.setDoOutput(r8)     // Catch:{ all -> 0x0245 }
            java.lang.String r12 = r1.c     // Catch:{ all -> 0x0245 }
            byte[] r12 = r12.getBytes()     // Catch:{ all -> 0x0245 }
            int r3 = r12.length     // Catch:{ all -> 0x0245 }
            r15.setFixedLengthStreamingMode(r3)     // Catch:{ all -> 0x0245 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00b2 }
            java.io.OutputStream r10 = r15.getOutputStream()     // Catch:{ all -> 0x00b2 }
            r3.<init>(r10)     // Catch:{ all -> 0x00b2 }
            r3.write(r12)     // Catch:{ all -> 0x00ae }
            defpackage.cad.a(r3)     // Catch:{ all -> 0x0245 }
            goto L_0x00ba
        L_0x00ae:
            r0 = move-exception
            r17 = r3
            goto L_0x00b5
        L_0x00b2:
            r0 = move-exception
            r17 = 0
        L_0x00b5:
            defpackage.cad.a(r17)     // Catch:{ all -> 0x0245 }
            throw r0     // Catch:{ all -> 0x0245 }
        L_0x00b9:
            r12 = 0
        L_0x00ba:
            cpg r3 = new cpg     // Catch:{ all -> 0x0245 }
            java.lang.String r10 = r0.v     // Catch:{ all -> 0x0245 }
            r3.<init>(r10)     // Catch:{ all -> 0x0245 }
            r3.a(r15, r12)     // Catch:{ all -> 0x0245 }
            int r10 = r15.getResponseCode()     // Catch:{ all -> 0x0245 }
            java.util.Map r12 = r15.getHeaderFields()     // Catch:{ all -> 0x0245 }
            r3.a(r15, r10)     // Catch:{ all -> 0x0245 }
            r8 = 200(0xc8, float:2.8E-43)
            r0 = 300(0x12c, float:4.2E-43)
            if (r10 < r8) goto L_0x01bf
            if (r10 >= r0) goto L_0x01bf
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0245 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x01b6 }
            java.io.InputStream r6 = r15.getInputStream()     // Catch:{ all -> 0x01b6 }
            r5.<init>(r6)     // Catch:{ all -> 0x01b6 }
            defpackage.bkc.e()     // Catch:{ all -> 0x01b0 }
            java.lang.String r6 = defpackage.cmu.a(r5)     // Catch:{ all -> 0x01b0 }
            defpackage.cad.a(r5)     // Catch:{ all -> 0x0245 }
            r3.a(r6)     // Catch:{ all -> 0x0245 }
            a(r0, r12, r6, r10)     // Catch:{ all -> 0x0245 }
            r7.c = r6     // Catch:{ all -> 0x0245 }
            r7.a(r12)     // Catch:{ all -> 0x0245 }
            if (r2 == 0) goto L_0x0106
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0245 }
            java.lang.String r0 = "ufe"
            r5 = 0
            r3[r5] = r0     // Catch:{ all -> 0x0245 }
            r2.a(r4, r3)     // Catch:{ all -> 0x0245 }
        L_0x0106:
            boolean r0 = r1.j     // Catch:{ all -> 0x0245 }
            cgp r1 = new cgp     // Catch:{ all -> 0x0245 }
            cgl r12 = r7.M     // Catch:{ all -> 0x0245 }
            java.lang.String r13 = r7.b     // Catch:{ all -> 0x0245 }
            java.lang.String r14 = r7.c     // Catch:{ all -> 0x0245 }
            java.util.List<java.lang.String> r2 = r7.d     // Catch:{ all -> 0x0245 }
            java.util.List<java.lang.String> r3 = r7.h     // Catch:{ all -> 0x0245 }
            long r4 = r7.j     // Catch:{ all -> 0x0245 }
            boolean r6 = r7.k     // Catch:{ all -> 0x0245 }
            java.util.List<java.lang.String> r8 = r7.l     // Catch:{ all -> 0x0245 }
            long r9 = r7.m     // Catch:{ all -> 0x0245 }
            int r11 = r7.n     // Catch:{ all -> 0x0245 }
            r21 = r9
            java.lang.String r9 = r7.a     // Catch:{ all -> 0x0245 }
            java.lang.String r10 = r7.f     // Catch:{ all -> 0x0245 }
            r27 = r10
            java.lang.String r10 = r7.g     // Catch:{ all -> 0x0245 }
            r28 = r10
            boolean r10 = r7.o     // Catch:{ all -> 0x0245 }
            r29 = r10
            boolean r10 = r7.p     // Catch:{ all -> 0x0245 }
            r30 = r10
            boolean r10 = r7.q     // Catch:{ all -> 0x0245 }
            r31 = r10
            boolean r10 = r7.r     // Catch:{ all -> 0x0245 }
            r32 = r10
            java.lang.String r10 = r7.t     // Catch:{ all -> 0x0245 }
            r33 = r10
            boolean r10 = r7.u     // Catch:{ all -> 0x0245 }
            r34 = r10
            boolean r10 = r7.v     // Catch:{ all -> 0x0245 }
            r35 = r10
            cko r10 = r7.w     // Catch:{ all -> 0x0245 }
            r36 = r10
            java.util.List<java.lang.String> r10 = r7.x     // Catch:{ all -> 0x0245 }
            r37 = r10
            java.util.List<java.lang.String> r10 = r7.y     // Catch:{ all -> 0x0245 }
            r38 = r10
            boolean r10 = r7.z     // Catch:{ all -> 0x0245 }
            r39 = r10
            cgr r10 = r7.A     // Catch:{ all -> 0x0245 }
            r40 = r10
            boolean r10 = r7.B     // Catch:{ all -> 0x0245 }
            r41 = r10
            java.lang.String r10 = r7.C     // Catch:{ all -> 0x0245 }
            r42 = r10
            java.util.List<java.lang.String> r10 = r7.D     // Catch:{ all -> 0x0245 }
            r43 = r10
            boolean r10 = r7.E     // Catch:{ all -> 0x0245 }
            r44 = r10
            java.lang.String r10 = r7.F     // Catch:{ all -> 0x0245 }
            r45 = r10
            cky r10 = r7.G     // Catch:{ all -> 0x0245 }
            r46 = r10
            java.lang.String r10 = r7.e     // Catch:{ all -> 0x0245 }
            r47 = r10
            boolean r10 = r7.s     // Catch:{ all -> 0x0245 }
            r48 = r10
            boolean r10 = r7.H     // Catch:{ all -> 0x0245 }
            r49 = r10
            boolean r10 = r7.I     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x0185
            r51 = 2
            goto L_0x0187
        L_0x0185:
            r51 = 1
        L_0x0187:
            boolean r0 = r7.J     // Catch:{ all -> 0x0245 }
            r52 = r0
            java.util.List<java.lang.String> r0 = r7.i     // Catch:{ all -> 0x0245 }
            r53 = r0
            boolean r0 = r7.K     // Catch:{ all -> 0x0245 }
            java.lang.String r7 = r7.L     // Catch:{ all -> 0x0245 }
            r23 = r11
            r11 = r1
            r56 = r15
            r15 = r2
            r16 = r3
            r17 = r4
            r19 = r6
            r20 = r8
            r24 = r9
            r50 = r10
            r54 = r0
            r55 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x0241 }
            r56.disconnect()     // Catch:{ IOException -> 0x024b }
            return r1
        L_0x01b0:
            r0 = move-exception
            r56 = r15
            r17 = r5
            goto L_0x01bb
        L_0x01b6:
            r0 = move-exception
            r56 = r15
            r17 = 0
        L_0x01bb:
            defpackage.cad.a(r17)     // Catch:{ all -> 0x0241 }
            throw r0     // Catch:{ all -> 0x0241 }
        L_0x01bf:
            r56 = r15
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x0241 }
            r8 = 0
            a(r3, r12, r8, r10)     // Catch:{ all -> 0x0241 }
            if (r10 < r0) goto L_0x021d
            r0 = 400(0x190, float:5.6E-43)
            if (r10 >= r0) goto L_0x021d
            java.lang.String r0 = "Location"
            r3 = r56
            java.lang.String r0 = r3.getHeaderField(r0)     // Catch:{ all -> 0x023f }
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x023f }
            if (r9 == 0) goto L_0x01eb
            r1 = 5
            defpackage.cpn.a(r1)     // Catch:{ all -> 0x023f }
            cgp r0 = new cgp     // Catch:{ all -> 0x023f }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x023f }
            r3.disconnect()     // Catch:{ IOException -> 0x024b }
            return r0
        L_0x01eb:
            java.net.URL r9 = new java.net.URL     // Catch:{ all -> 0x023f }
            r9.<init>(r0)     // Catch:{ all -> 0x023f }
            r0 = 1
            int r11 = r11 + r0
            dsw<java.lang.Integer> r0 = defpackage.dtg.dd     // Catch:{ all -> 0x023f }
            dte r10 = defpackage.dqe.f()     // Catch:{ all -> 0x023f }
            java.lang.Object r0 = r10.a(r0)     // Catch:{ all -> 0x023f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x023f }
            int r0 = r0.intValue()     // Catch:{ all -> 0x023f }
            if (r11 <= r0) goto L_0x0212
            r1 = 5
            defpackage.cpn.a(r1)     // Catch:{ all -> 0x023f }
            cgp r0 = new cgp     // Catch:{ all -> 0x023f }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x023f }
            r3.disconnect()     // Catch:{ IOException -> 0x024b }
            return r0
        L_0x0212:
            r7.a(r12)     // Catch:{ all -> 0x023f }
            r3.disconnect()     // Catch:{ IOException -> 0x024b }
            r8 = 3
            r0 = r57
            goto L_0x003e
        L_0x021d:
            r3 = r56
            r0 = 46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x023f }
            r1.<init>(r0)     // Catch:{ all -> 0x023f }
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)     // Catch:{ all -> 0x023f }
            r1.append(r10)     // Catch:{ all -> 0x023f }
            r1.toString()     // Catch:{ all -> 0x023f }
            r1 = 5
            defpackage.cpn.a(r1)     // Catch:{ all -> 0x023f }
            cgp r0 = new cgp     // Catch:{ all -> 0x023f }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x023f }
            r3.disconnect()     // Catch:{ IOException -> 0x024b }
            return r0
        L_0x023f:
            r0 = move-exception
            goto L_0x0247
        L_0x0241:
            r0 = move-exception
            r3 = r56
            goto L_0x0247
        L_0x0245:
            r0 = move-exception
            r3 = r15
        L_0x0247:
            r3.disconnect()     // Catch:{ IOException -> 0x024b }
            throw r0     // Catch:{ IOException -> 0x024b }
        L_0x024b:
            r0 = move-exception
            java.lang.String r1 = "Error while connecting to ad server: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0260
            r1.concat(r0)
            goto L_0x0265
        L_0x0260:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0265:
            r1 = 5
            defpackage.cpn.a(r1)
            cgp r0 = new cgp
            r1 = 2
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chu.a(cgl, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, cig, dtt, cht):cgp");
    }

    public static chu a(Context context, cht cht) {
        chu chu;
        synchronized (a) {
            if (b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                dtg.a(context);
                b = new chu(context, cht);
                if (context.getApplicationContext() != null) {
                    bkc.e().b(context);
                }
                cmi.a(context);
            }
            chu = b;
        }
        return chu;
    }

    private static void a(String str, Map<String, List<String>> map, String str2, int i) {
        if (cml.a(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            sb.toString();
            cml.a();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    sb2.toString();
                    cml.a();
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf);
                        if (valueOf2.length() != 0) {
                            str4.concat(valueOf2);
                        } else {
                            new String(str4);
                        }
                        cml.a();
                    }
                }
            }
            cml.a();
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    str2.substring(i2, Math.min(str2.length(), i3));
                    cml.a();
                    i2 = i3;
                }
            } else {
                cml.a();
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            sb3.toString();
            cml.a();
        }
    }

    public final cgp a(cgl cgl) {
        return a(this.c, this.d, cgl, this.e);
    }

    public final void a(cgl cgl, cgw cgw) {
        bkc.i().a(this.c, cgl.k);
        cqi a2 = cms.a((Runnable) new chw(this, cgl, cgw));
        bkc.t().a();
        bkc.t().a.postDelayed(new chx(a2), 60000);
    }

    public final void a(che che, cgz cgz) {
        cml.a();
        throw new IllegalArgumentException();
    }

    public final void b(che che, cgz cgz) {
        cml.a();
        throw new IllegalArgumentException();
    }
}
