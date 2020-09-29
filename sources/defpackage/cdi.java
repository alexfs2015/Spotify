package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@cey
/* renamed from: cdi reason: default package */
public final class cdi extends ccz {
    protected ecg g;
    final csr h;
    boolean i;
    private ecp k;
    private ebx l;
    private ebz m;
    private final dtc n;

    cdi(Context context, cla cla, ecp ecp, cdd cdd, dtc dtc, csr csr) {
        super(context, cla, cdd);
        this.k = ecp;
        this.m = cla.c;
        this.n = dtc;
        this.h = csr;
    }

    /* access modifiers changed from: protected */
    public final ckz a(int i2) {
        String str;
        boolean z;
        ebz ebz;
        long j;
        cga cga;
        String str2;
        String str3;
        boolean z2;
        ebz ebz2;
        long j2;
        Iterator it;
        String str4;
        int i3;
        cfu cfu = this.e.a;
        doy doy = cfu.c;
        csr csr = this.h;
        List<String> list = this.f.c;
        List<String> list2 = this.f.e;
        List<String> list3 = this.f.i;
        int i4 = this.f.k;
        long j3 = this.f.j;
        String str5 = cfu.i;
        boolean z3 = this.f.g;
        ecg ecg = this.g;
        eby eby = ecg != null ? ecg.b : null;
        ecg ecg2 = this.g;
        ecs ecs = ecg2 != null ? ecg2.c : null;
        ecg ecg3 = this.g;
        String name = ecg3 != null ? ecg3.d : AdMobAdapter.class.getName();
        ebz ebz3 = this.m;
        ecg ecg4 = this.g;
        ecc ecc = ecg4 != null ? ecg4.e : null;
        eby eby2 = eby;
        ecs ecs2 = ecs;
        long j4 = this.f.h;
        dpc dpc = this.e.d;
        long j5 = j4;
        long j6 = this.f.f;
        long j7 = this.e.f;
        long j8 = this.f.m;
        String str6 = this.f.n;
        JSONObject jSONObject = this.e.h;
        cjx cjx = this.f.A;
        List<String> list4 = this.f.B;
        List<String> list5 = this.f.C;
        ebz ebz4 = this.m;
        dpc dpc2 = dpc;
        boolean z4 = ebz4 != null ? ebz4.o : false;
        cga cga2 = this.f.E;
        ebx ebx = this.l;
        if (ebx != null) {
            List b = ebx.b();
            String str7 = "";
            if (b == null) {
                ebz = ebz3;
                cga = cga2;
                str = str5;
                z = z3;
                j = j8;
                str2 = str7;
            } else {
                Iterator it2 = b.iterator();
                String str8 = str7;
                while (true) {
                    cga = cga2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    ecg ecg5 = (ecg) it2.next();
                    if (ecg5 != null) {
                        it = it2;
                        if (ecg5.b == null || TextUtils.isEmpty(ecg5.b.d)) {
                            ebz2 = ebz3;
                        } else {
                            String valueOf = String.valueOf(str8);
                            j2 = j8;
                            String str9 = ecg5.b.d;
                            int i5 = ecg5.a;
                            ebz2 = ebz3;
                            if (i5 != -1) {
                                if (i5 == 0) {
                                    str4 = str5;
                                    z2 = z3;
                                    i3 = 0;
                                } else if (i5 == 1) {
                                    str4 = str5;
                                    z2 = z3;
                                    i3 = 1;
                                } else if (i5 == 3) {
                                    i3 = 2;
                                } else if (i5 != 4) {
                                    i3 = 5;
                                    if (i5 != 5) {
                                        i3 = 6;
                                    }
                                } else {
                                    str4 = str5;
                                    z2 = z3;
                                    i3 = 3;
                                }
                                long j9 = ecg5.g;
                                str3 = str4;
                                StringBuilder sb = new StringBuilder(String.valueOf(str9).length() + 33);
                                sb.append(str9);
                                String str10 = ".";
                                sb.append(str10);
                                sb.append(i3);
                                sb.append(str10);
                                sb.append(j9);
                                String sb2 = sb.toString();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                                sb3.append(valueOf);
                                sb3.append(sb2);
                                sb3.append("_");
                                str8 = sb3.toString();
                                it2 = it;
                                cga2 = cga;
                                j8 = j2;
                                ebz3 = ebz2;
                                z3 = z2;
                                str5 = str3;
                            } else {
                                i3 = 4;
                            }
                            str4 = str5;
                            z2 = z3;
                            long j92 = ecg5.g;
                            str3 = str4;
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str9).length() + 33);
                            sb4.append(str9);
                            String str102 = ".";
                            sb4.append(str102);
                            sb4.append(i3);
                            sb4.append(str102);
                            sb4.append(j92);
                            String sb22 = sb4.toString();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb22).length());
                            sb32.append(valueOf);
                            sb32.append(sb22);
                            sb32.append("_");
                            str8 = sb32.toString();
                            it2 = it;
                            cga2 = cga;
                            j8 = j2;
                            ebz3 = ebz2;
                            z3 = z2;
                            str5 = str3;
                        }
                    } else {
                        ebz2 = ebz3;
                        it = it2;
                    }
                    str3 = str5;
                    z2 = z3;
                    j2 = j8;
                    it2 = it;
                    cga2 = cga;
                    j8 = j2;
                    ebz3 = ebz2;
                    z3 = z2;
                    str5 = str3;
                }
                ebz = ebz3;
                str = str5;
                z = z3;
                j = j8;
                str2 = str8.substring(0, Math.max(0, str8.length() - 1));
            }
        } else {
            ebz = ebz3;
            cga = cga2;
            str = str5;
            z = z3;
            j = j8;
            str2 = null;
        }
        ckz ckz = new ckz(doy, csr, list, i2, list2, list3, i4, j3, str, z, eby2, ecs2, name, ebz, ecc, j5, dpc2, j6, j7, j, str6, jSONObject, null, cjx, list4, list5, z4, cga, str2, this.f.H, this.f.L, this.e.i, this.f.O, this.e.j, this.f.Q, this.f.R, this.f.S, this.f.T);
        return ckz;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [ebx] */
    /* JADX WARNING: type inference failed for: r16v0, types: [ecm] */
    /* JADX WARNING: type inference failed for: r4v4, types: [ecj] */
    /* JADX WARNING: type inference failed for: r16v2, types: [ecm] */
    /* JADX WARNING: type inference failed for: r4v5, types: [ecj] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r16v2, types: [ecm]
      assigns: [ecm, ecj]
      uses: [ecm, ebx, ecj]
      mth insns count: 152
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r31) {
        /*
            r30 = this;
            r1 = r30
            java.lang.Object r2 = r1.d
            monitor-enter(r2)
            ebz r0 = r1.m     // Catch:{ all -> 0x0173 }
            int r0 = r0.m     // Catch:{ all -> 0x0173 }
            r3 = -1
            if (r0 == r3) goto L_0x0041
            ecj r0 = new ecj     // Catch:{ all -> 0x0173 }
            android.content.Context r5 = r1.b     // Catch:{ all -> 0x0173 }
            cla r3 = r1.e     // Catch:{ all -> 0x0173 }
            cfu r6 = r3.a     // Catch:{ all -> 0x0173 }
            ecp r7 = r1.k     // Catch:{ all -> 0x0173 }
            ebz r8 = r1.m     // Catch:{ all -> 0x0173 }
            cfy r3 = r1.f     // Catch:{ all -> 0x0173 }
            boolean r9 = r3.s     // Catch:{ all -> 0x0173 }
            cfy r3 = r1.f     // Catch:{ all -> 0x0173 }
            boolean r10 = r3.z     // Catch:{ all -> 0x0173 }
            cfy r3 = r1.f     // Catch:{ all -> 0x0173 }
            java.lang.String r11 = r3.J     // Catch:{ all -> 0x0173 }
            dsf<java.lang.Long> r3 = defpackage.dsp.bz     // Catch:{ all -> 0x0173 }
            dsn r4 = defpackage.dpn.f()     // Catch:{ all -> 0x0173 }
            java.lang.Object r3 = r4.a(r3)     // Catch:{ all -> 0x0173 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0173 }
            long r14 = r3.longValue()     // Catch:{ all -> 0x0173 }
            cla r3 = r1.e     // Catch:{ all -> 0x0173 }
            boolean r3 = r3.j     // Catch:{ all -> 0x0173 }
            r4 = r0
            r12 = r31
            r16 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch:{ all -> 0x0173 }
            goto L_0x0088
        L_0x0041:
            ecm r0 = new ecm     // Catch:{ all -> 0x0173 }
            android.content.Context r3 = r1.b     // Catch:{ all -> 0x0173 }
            cla r4 = r1.e     // Catch:{ all -> 0x0173 }
            cfu r4 = r4.a     // Catch:{ all -> 0x0173 }
            ecp r5 = r1.k     // Catch:{ all -> 0x0173 }
            ebz r6 = r1.m     // Catch:{ all -> 0x0173 }
            cfy r7 = r1.f     // Catch:{ all -> 0x0173 }
            boolean r7 = r7.s     // Catch:{ all -> 0x0173 }
            cfy r8 = r1.f     // Catch:{ all -> 0x0173 }
            boolean r8 = r8.z     // Catch:{ all -> 0x0173 }
            cfy r9 = r1.f     // Catch:{ all -> 0x0173 }
            java.lang.String r9 = r9.J     // Catch:{ all -> 0x0173 }
            dsf<java.lang.Long> r10 = defpackage.dsp.bz     // Catch:{ all -> 0x0173 }
            dsn r11 = defpackage.dpn.f()     // Catch:{ all -> 0x0173 }
            java.lang.Object r10 = r11.a(r10)     // Catch:{ all -> 0x0173 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0173 }
            long r26 = r10.longValue()     // Catch:{ all -> 0x0173 }
            dtc r10 = r1.n     // Catch:{ all -> 0x0173 }
            cla r11 = r1.e     // Catch:{ all -> 0x0173 }
            boolean r11 = r11.j     // Catch:{ all -> 0x0173 }
            r16 = r0
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r31
            r28 = r10
            r29 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29)     // Catch:{ all -> 0x0173 }
        L_0x0088:
            r1.l = r0     // Catch:{ all -> 0x0173 }
            monitor-exit(r2)     // Catch:{ all -> 0x0173 }
            java.util.ArrayList r0 = new java.util.ArrayList
            ebz r2 = r1.m
            java.util.List<eby> r2 = r2.a
            r0.<init>(r2)
            cla r2 = r1.e
            cfu r2 = r2.a
            doy r2 = r2.c
            android.os.Bundle r2 = r2.m
            java.lang.String r3 = "com.google.ads.mediation.admob.AdMobAdapter"
            r4 = 0
            if (r2 == 0) goto L_0x00ae
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 == 0) goto L_0x00ae
            java.lang.String r5 = "_skipMediation"
            boolean r2 = r2.getBoolean(r5)
            goto L_0x00af
        L_0x00ae:
            r2 = 0
        L_0x00af:
            if (r2 == 0) goto L_0x00cd
            java.util.ListIterator r2 = r0.listIterator()
        L_0x00b5:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r2.next()
            eby r5 = (defpackage.eby) r5
            java.util.List<java.lang.String> r5 = r5.c
            boolean r5 = r5.contains(r3)
            if (r5 != 0) goto L_0x00b5
            r2.remove()
            goto L_0x00b5
        L_0x00cd:
            ebx r2 = r1.l
            ecg r0 = r2.a(r0)
            r1.g = r0
            ecg r0 = r1.g
            int r0 = r0.a
            r2 = 1
            if (r0 == 0) goto L_0x0104
            if (r0 == r2) goto L_0x00fb
            com.google.android.gms.internal.ads.zzabk r0 = new com.google.android.gms.internal.ads.zzabk
            ecg r2 = r1.g
            int r2 = r2.a
            r3 = 40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected mediation result: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2, r4)
            throw r0
        L_0x00fb:
            com.google.android.gms.internal.ads.zzabk r0 = new com.google.android.gms.internal.ads.zzabk
            r2 = 3
            java.lang.String r3 = "No fill from any mediation ad networks."
            r0.<init>(r3, r2)
            throw r0
        L_0x0104:
            ecg r0 = r1.g
            eby r0 = r0.b
            if (r0 == 0) goto L_0x0172
            ecg r0 = r1.g
            eby r0 = r0.b
            java.lang.String r0 = r0.o
            if (r0 == 0) goto L_0x0172
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r2)
            android.os.Handler r2 = defpackage.cmd.a
            cdj r3 = new cdj
            r3.<init>(r1, r0)
            r2.post(r3)
            r2 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x014c }
            r0.await(r2, r5)     // Catch:{ InterruptedException -> 0x014c }
            java.lang.Object r2 = r1.d
            monitor-enter(r2)
            boolean r0 = r1.i     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0141
            csr r0 = r1.h     // Catch:{ all -> 0x0149 }
            boolean r0 = r0.D()     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x0139
            monitor-exit(r2)     // Catch:{ all -> 0x0149 }
            return
        L_0x0139:
            com.google.android.gms.internal.ads.zzabk r0 = new com.google.android.gms.internal.ads.zzabk     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "Assets not loaded, web view is destroyed"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0141:
            com.google.android.gms.internal.ads.zzabk r0 = new com.google.android.gms.internal.ads.zzabk     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "View could not be prepared"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0149 }
            throw r0
        L_0x014c:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzabk r2 = new com.google.android.gms.internal.ads.zzabk
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Interrupted while waiting for latch : "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.<init>(r0, r4)
            throw r2
        L_0x0172:
            return
        L_0x0173:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0173 }
            goto L_0x0177
        L_0x0176:
            throw r0
        L_0x0177:
            goto L_0x0176
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdi.a(long):void");
    }

    public final void s_() {
        synchronized (this.d) {
            super.s_();
            if (this.l != null) {
                this.l.a();
            }
        }
    }
}
