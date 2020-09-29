package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@cfp
/* renamed from: cke reason: default package */
public final class cke extends cmg implements ckd {
    final ciw a;
    private final clr b;
    private final Context c;
    private final ArrayList<cjv> d;
    private final List<cjy> e;
    private final HashSet<String> f;
    private final Object g;
    private final long h;

    public cke(Context context, clr clr, ciw ciw) {
        Context context2 = context;
        clr clr2 = clr;
        ciw ciw2 = ciw;
        this(context2, clr2, ciw2, ((Long) dqe.f().a(dtg.aC)).longValue());
    }

    private cke(Context context, clr clr, ciw ciw, long j) {
        this.d = new ArrayList<>();
        this.e = new ArrayList();
        this.f = new HashSet<>();
        this.g = new Object();
        this.c = context;
        this.b = clr;
        this.a = ciw;
        this.h = j;
    }

    private final clq a(int i, String str, ecp ecp) {
        boolean z;
        int i2;
        dpp dpp = this.b.a.c;
        List<String> list = this.b.b.c;
        List<String> list2 = this.b.b.e;
        List<String> list3 = this.b.b.i;
        int i3 = this.b.b.k;
        long j = this.b.b.j;
        String str2 = this.b.a.i;
        boolean z2 = this.b.b.g;
        ecq ecq = this.b.c;
        long j2 = this.b.b.h;
        dpt dpt = this.b.d;
        long j3 = j2;
        ecq ecq2 = ecq;
        long j4 = this.b.b.f;
        long j5 = this.b.f;
        long j6 = this.b.b.m;
        String str3 = this.b.b.n;
        JSONObject jSONObject = this.b.h;
        cko cko = this.b.b.A;
        JSONObject jSONObject2 = jSONObject;
        List<String> list4 = this.b.b.B;
        List<String> list5 = this.b.b.C;
        boolean z3 = this.b.b.D;
        cgr cgr = this.b.b.E;
        cko cko2 = cko;
        StringBuilder sb = new StringBuilder("");
        Iterator it = this.e.iterator();
        while (true) {
            dpt dpt2 = dpt;
            if (it.hasNext()) {
                cjy cjy = (cjy) it.next();
                if (cjy != null) {
                    Iterator it2 = it;
                    if (!TextUtils.isEmpty(cjy.a)) {
                        String str4 = cjy.a;
                        String str5 = str3;
                        int i4 = cjy.b;
                        long j7 = j6;
                        if (i4 == 3) {
                            z = z2;
                            i2 = 1;
                        } else if (i4 == 4) {
                            z = z2;
                            i2 = 2;
                        } else if (i4 != 5) {
                            i2 = 6;
                            if (i4 == 6) {
                                z = z2;
                                i2 = 0;
                            } else if (i4 != 7) {
                                z = z2;
                            } else {
                                z = z2;
                                i2 = 3;
                            }
                        } else {
                            z = z2;
                            i2 = 4;
                        }
                        long j8 = cjy.c;
                        boolean z4 = z;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 33);
                        sb2.append(str4);
                        String str6 = ".";
                        sb2.append(str6);
                        sb2.append(i2);
                        sb2.append(str6);
                        sb2.append(j8);
                        sb.append(String.valueOf(sb2.toString()).concat("_"));
                        it = it2;
                        dpt = dpt2;
                        str3 = str5;
                        z2 = z4;
                        j6 = j7;
                    } else {
                        it = it2;
                    }
                }
                dpt = dpt2;
            } else {
                boolean z5 = z2;
                cko cko3 = cko2;
                long j9 = j6;
                long j10 = j5;
                long j11 = j3;
                JSONObject jSONObject3 = jSONObject2;
                List<String> list6 = list5;
                cgr cgr2 = cgr;
                dpt dpt3 = dpt2;
                int i5 = i;
                ecp ecp2 = ecp;
                String str7 = str;
                long j12 = j10;
                long j13 = j9;
                clq clq = new clq(dpp, null, list, i5, list2, list3, i3, j, str2, z2, ecp2, null, str7, ecq2, null, j11, dpt3, j4, j12, j13, str3, jSONObject3, null, cko3, list4, list6, z3, cgr2, sb.substring(0, Math.max(0, sb.length() - 1)), this.b.b.H, this.b.b.L, this.b.i, this.b.b.O, this.b.j, this.b.b.Q, this.b.b.R, this.b.b.S, this.b.b.T);
                return clq;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r19 = this;
            r11 = r19
            clr r0 = r11.b
            ecq r0 = r0.c
            java.util.List<ecp> r0 = r0.a
            java.util.Iterator r12 = r0.iterator()
        L_0x000c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r12.next()
            r13 = r0
            ecp r13 = (defpackage.ecp) r13
            java.lang.String r14 = r13.k
            java.util.List<java.lang.String> r0 = r13.c
            java.util.Iterator r15 = r0.iterator()
        L_0x0021:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r3 = r0
            goto L_0x004c
        L_0x0040:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00aa }
            r0.<init>(r14)     // Catch:{ JSONException -> 0x00aa }
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x00aa }
            goto L_0x003e
        L_0x004c:
            java.lang.Object r9 = r11.g
            monitor-enter(r9)
            ciw r0 = r11.a     // Catch:{ all -> 0x00a3 }
            ckj r7 = r0.a(r3)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x0083
            ckc r0 = r7.b     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0083
            edj r0 = r7.a     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            cjv r0 = new cjv     // Catch:{ all -> 0x00a3 }
            android.content.Context r2 = r11.c     // Catch:{ all -> 0x00a3 }
            clr r6 = r11.b     // Catch:{ all -> 0x00a3 }
            long r4 = r11.h     // Catch:{ all -> 0x00a3 }
            r1 = r0
            r16 = r4
            r4 = r14
            r5 = r13
            r8 = r19
            r18 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a8 }
            ciw r1 = r11.a     // Catch:{ all -> 0x00a8 }
            bgi r1 = r1.b     // Catch:{ all -> 0x00a8 }
            r0.e = r1     // Catch:{ all -> 0x00a8 }
            java.util.ArrayList<cjv> r1 = r11.d     // Catch:{ all -> 0x00a8 }
            r1.add(r0)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r18)     // Catch:{ all -> 0x00a8 }
            goto L_0x0021
        L_0x0083:
            r18 = r9
            java.util.List<cjy> r0 = r11.e     // Catch:{ all -> 0x00a8 }
            cjz r1 = new cjz     // Catch:{ all -> 0x00a8 }
            r1.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = r13.d     // Catch:{ all -> 0x00a8 }
            r1.b = r2     // Catch:{ all -> 0x00a8 }
            r1.a = r3     // Catch:{ all -> 0x00a8 }
            r2 = 0
            r1.d = r2     // Catch:{ all -> 0x00a8 }
            r2 = 7
            r1.c = r2     // Catch:{ all -> 0x00a8 }
            cjy r1 = r1.a()     // Catch:{ all -> 0x00a8 }
            r0.add(r1)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r18)     // Catch:{ all -> 0x00a8 }
            goto L_0x0021
        L_0x00a3:
            r0 = move-exception
            r18 = r9
        L_0x00a6:
            monitor-exit(r18)     // Catch:{ all -> 0x00a8 }
            throw r0
        L_0x00a8:
            r0 = move-exception
            goto L_0x00a6
        L_0x00aa:
            r0 = move-exception
            java.lang.String r1 = "Unable to determine custom event class name, skipping..."
            defpackage.cml.a(r1, r0)
            goto L_0x0021
        L_0x00b2:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList<cjv> r1 = r11.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x00c1:
            if (r4 >= r2) goto L_0x00d7
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            cjv r5 = (defpackage.cjv) r5
            java.lang.String r6 = r5.a
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L_0x00c1
            r5.d()
            goto L_0x00c1
        L_0x00d7:
            java.util.ArrayList<cjv> r0 = r11.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
        L_0x00df:
            if (r3 >= r1) goto L_0x0187
            java.lang.Object r2 = r0.get(r3)
            int r3 = r3 + 1
            cjv r2 = (defpackage.cjv) r2
            java.util.concurrent.Future r4 = r2.d()     // Catch:{ InterruptedException -> 0x014e, Exception -> 0x0131 }
            r4.get()     // Catch:{ InterruptedException -> 0x014e, Exception -> 0x0131 }
            java.lang.Object r4 = r11.g
            monitor-enter(r4)
            java.lang.String r5 = r2.a     // Catch:{ all -> 0x012c }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x012c }
            if (r5 != 0) goto L_0x0104
            java.util.List<cjy> r5 = r11.e     // Catch:{ all -> 0x012c }
            cjy r6 = r2.e()     // Catch:{ all -> 0x012c }
            r5.add(r6)     // Catch:{ all -> 0x012c }
        L_0x0104:
            monitor-exit(r4)     // Catch:{ all -> 0x012c }
            java.lang.Object r5 = r11.g
            monitor-enter(r5)
            java.util.HashSet<java.lang.String> r4 = r11.f     // Catch:{ all -> 0x0129 }
            java.lang.String r6 = r2.a     // Catch:{ all -> 0x0129 }
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x0129 }
            if (r4 == 0) goto L_0x0127
            java.lang.String r0 = r2.a     // Catch:{ all -> 0x0129 }
            ecp r1 = r2.d     // Catch:{ all -> 0x0129 }
            r2 = -2
            clq r0 = r11.a(r2, r0, r1)     // Catch:{ all -> 0x0129 }
            android.os.Handler r1 = defpackage.cpc.a     // Catch:{ all -> 0x0129 }
            ckf r2 = new ckf     // Catch:{ all -> 0x0129 }
            r2.<init>(r11, r0)     // Catch:{ all -> 0x0129 }
            r1.post(r2)     // Catch:{ all -> 0x0129 }
            monitor-exit(r5)     // Catch:{ all -> 0x0129 }
            return
        L_0x0127:
            monitor-exit(r5)     // Catch:{ all -> 0x0129 }
            goto L_0x00df
        L_0x0129:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0129 }
            throw r0
        L_0x012c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x012c }
            throw r0
        L_0x012f:
            r0 = move-exception
            goto L_0x016e
        L_0x0131:
            r4 = 5
            defpackage.cpn.a(r4)     // Catch:{ all -> 0x012f }
            java.lang.Object r4 = r11.g
            monitor-enter(r4)
            java.lang.String r5 = r2.a     // Catch:{ all -> 0x014b }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x014b }
            if (r5 != 0) goto L_0x0149
            java.util.List<cjy> r5 = r11.e     // Catch:{ all -> 0x014b }
            cjy r2 = r2.e()     // Catch:{ all -> 0x014b }
            r5.add(r2)     // Catch:{ all -> 0x014b }
        L_0x0149:
            monitor-exit(r4)     // Catch:{ all -> 0x014b }
            goto L_0x00df
        L_0x014b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x014b }
            throw r0
        L_0x014e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x012f }
            r0.interrupt()     // Catch:{ all -> 0x012f }
            java.lang.Object r1 = r11.g
            monitor-enter(r1)
            java.lang.String r0 = r2.a     // Catch:{ all -> 0x016b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x016b }
            if (r0 != 0) goto L_0x0169
            java.util.List<cjy> r0 = r11.e     // Catch:{ all -> 0x016b }
            cjy r2 = r2.e()     // Catch:{ all -> 0x016b }
            r0.add(r2)     // Catch:{ all -> 0x016b }
        L_0x0169:
            monitor-exit(r1)     // Catch:{ all -> 0x016b }
            goto L_0x0187
        L_0x016b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016b }
            throw r0
        L_0x016e:
            java.lang.Object r1 = r11.g
            monitor-enter(r1)
            java.lang.String r3 = r2.a     // Catch:{ all -> 0x0184 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0184 }
            if (r3 != 0) goto L_0x0182
            java.util.List<cjy> r3 = r11.e     // Catch:{ all -> 0x0184 }
            cjy r2 = r2.e()     // Catch:{ all -> 0x0184 }
            r3.add(r2)     // Catch:{ all -> 0x0184 }
        L_0x0182:
            monitor-exit(r1)     // Catch:{ all -> 0x0184 }
            throw r0
        L_0x0184:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0184 }
            throw r0
        L_0x0187:
            r0 = 3
            r1 = 0
            clq r0 = r11.a(r0, r1, r1)
            android.os.Handler r1 = defpackage.cpc.a
            ckg r2 = new ckg
            r2.<init>(r11, r0)
            r1.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cke.a():void");
    }

    public final void a(int i) {
    }

    public final void a(String str) {
        synchronized (this.g) {
            this.f.add(str);
        }
    }

    public final void s_() {
    }
}
