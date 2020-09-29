package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzhu.zza.zzb;

@cfp
/* renamed from: cfs reason: default package */
public final class cfs extends cmg implements cgd {
    final cgm a;
    final Object b = new Object();
    final Context c;
    Runnable d;
    cnm e;
    private final cfr f;
    private final dny g;
    private final doc h;
    private cgl i;
    private cgp k;
    private ecq l;

    public cfs(Context context, cgm cgm, cfr cfr, doc doc) {
        dny dny;
        dnz dnz;
        this.f = cfr;
        this.c = context;
        this.a = cgm;
        this.h = doc;
        this.g = new dny(this.h);
        this.g.a((dnz) new cft(this));
        doy doy = new doy();
        doy.a = Integer.valueOf(this.a.j.b);
        doy.b = Integer.valueOf(this.a.j.c);
        doy.c = Integer.valueOf(this.a.j.d ? 0 : 2);
        this.g.a((dnz) new cfu(doy));
        if (this.a.f != null) {
            this.g.a((dnz) new cfv(this));
        }
        dpt dpt = this.a.c;
        if (dpt.d) {
            if ("interstitial_mb".equals(dpt.a)) {
                dny = this.g;
                dnz = cfw.a;
                dny.a(dnz);
                this.g.a(zzb.AD_REQUEST);
            }
        }
        if (dpt.d) {
            if ("reward_mb".equals(dpt.a)) {
                dny = this.g;
                dnz = cfx.a;
                dny.a(dnz);
                this.g.a(zzb.AD_REQUEST);
            }
        }
        if (dpt.h || dpt.d) {
            dny = this.g;
            dnz = cfz.a;
        } else {
            dny = this.g;
            dnz = cfy.a;
        }
        dny.a(dnz);
        this.g.a(zzb.AD_REQUEST);
    }

    private final dpt a(cgl cgl) {
        dpt[] dptArr;
        cgl cgl2 = this.i;
        if ((cgl2 == null || cgl2.V == null || this.i.V.size() <= 1) ? false : true) {
            ecq ecq = this.l;
            if (ecq != null && !ecq.t) {
                return null;
            }
        }
        if (this.k.y) {
            for (dpt dpt : cgl.d.g) {
                if (dpt.i) {
                    return new dpt(dpt, cgl.d.g);
                }
            }
        }
        if (this.k.l != null) {
            String[] split = this.k.l.split("x");
            if (split.length != 2) {
                String str = "Invalid ad size format from the ad response: ";
                String valueOf = String.valueOf(this.k.l);
                throw new zzadu(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), 0);
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                dpt[] dptArr2 = cgl.d.g;
                int length = dptArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    dpt dpt2 = dptArr2[i2];
                    float f2 = this.c.getResources().getDisplayMetrics().density;
                    int i3 = dpt2.e == -1 ? (int) (((float) dpt2.f) / f2) : dpt2.e;
                    int i4 = dpt2.b == -2 ? (int) (((float) dpt2.c) / f2) : dpt2.b;
                    if (parseInt == i3 && parseInt2 == i4 && !dpt2.i) {
                        return new dpt(dpt2, cgl.d.g);
                    }
                }
                String str2 = "The ad size from the ad response was not one of the requested sizes: ";
                String valueOf2 = String.valueOf(this.k.l);
                throw new zzadu(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), 0);
            } catch (NumberFormatException unused) {
                String str3 = "Invalid ad size number from the ad response: ";
                String valueOf3 = String.valueOf(this.k.l);
                throw new zzadu(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), 0);
            }
        } else {
            throw new zzadu("The ad response must specify one of the supported ad sizes.", 0);
        }
    }

    public final void a() {
        cpn.a(3);
        this.d = new cga(this);
        cmu.a.postDelayed(this.d, ((Long) dqe.f().a(dtg.by)).longValue());
        long b2 = bkc.l().b();
        if (((Boolean) dqe.f().a(dtg.bw)).booleanValue() && this.a.b.c != null) {
            String string = this.a.b.c.getString("_ad");
            if (string != null) {
                cgl cgl = new cgl(this.a, b2, null, null, null);
                this.i = cgl;
                a(chz.a(this.c, this.i, string));
                return;
            }
        }
        cqz cqz = new cqz();
        cms.a((Runnable) new cgb(this, cqz));
        String g2 = bkc.B().g(this.c);
        String h2 = bkc.B().h(this.c);
        String i2 = bkc.B().i(this.c);
        bkc.B().e(this.c, i2);
        cgl cgl2 = new cgl(this.a, b2, g2, h2, i2);
        this.i = cgl2;
        cqz.a(this.i);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, String str) {
        int i3 = i2;
        if (i3 == 3 || i3 == -1) {
            cpn.a(4);
        } else {
            cpn.a(5);
        }
        cgp cgp = this.k;
        if (cgp == null) {
            this.k = new cgp(i3);
        } else {
            this.k = new cgp(i3, cgp.j);
        }
        cgl cgl = this.i;
        if (cgl == null) {
            cgl = new cgl(this.a, -1, null, null, null);
        }
        cgl cgl2 = cgl;
        cgp cgp2 = this.k;
        clr clr = new clr(cgl2, cgp2, this.l, null, i2, -1, cgp2.m, null, this.g, null);
        this.f.a(clr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cgp r15) {
        /*
            r14 = this;
            r0 = 3
            defpackage.cpn.a(r0)
            r14.k = r15
            bzx r15 = defpackage.bkc.l()
            long r7 = r15.b()
            java.lang.Object r15 = r14.b
            monitor-enter(r15)
            r1 = 0
            r14.e = r1     // Catch:{ all -> 0x020d }
            monitor-exit(r15)     // Catch:{ all -> 0x020d }
            clv r15 = defpackage.bkc.i()
            cmn r15 = r15.g()
            cgp r2 = r14.k
            boolean r2 = r2.F
            r15.d(r2)
            dsw<java.lang.Boolean> r15 = defpackage.dtg.aR
            dte r2 = defpackage.dqe.f()
            java.lang.Object r15 = r2.a(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x005b
            cgp r15 = r14.k
            boolean r15 = r15.N
            if (r15 == 0) goto L_0x004c
            clv r15 = defpackage.bkc.i()
            cmn r15 = r15.g()
            cgl r2 = r14.i
            java.lang.String r2 = r2.e
            r15.a(r2)
            goto L_0x005b
        L_0x004c:
            clv r15 = defpackage.bkc.i()
            cmn r15 = r15.g()
            cgl r2 = r14.i
            java.lang.String r2 = r2.e
            r15.b(r2)
        L_0x005b:
            cgp r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r15 = r15.d     // Catch:{ zzadu -> 0x0202 }
            r2 = -2
            r3 = -3
            if (r15 == r2) goto L_0x008b
            cgp r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r15 = r15.d     // Catch:{ zzadu -> 0x0202 }
            if (r15 != r3) goto L_0x006a
            goto L_0x008b
        L_0x006a:
            com.google.android.gms.internal.ads.zzadu r15 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x0202 }
            cgp r0 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r0 = r0.d     // Catch:{ zzadu -> 0x0202 }
            r1 = 66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ zzadu -> 0x0202 }
            r2.<init>(r1)     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r1 = "There was a problem getting an ad response. ErrorCode: "
            r2.append(r1)     // Catch:{ zzadu -> 0x0202 }
            r2.append(r0)     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r0 = r2.toString()     // Catch:{ zzadu -> 0x0202 }
            cgp r1 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r1 = r1.d     // Catch:{ zzadu -> 0x0202 }
            r15.<init>(r0, r1)     // Catch:{ zzadu -> 0x0202 }
            throw r15     // Catch:{ zzadu -> 0x0202 }
        L_0x008b:
            cgp r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r15 = r15.d     // Catch:{ zzadu -> 0x0202 }
            if (r15 == r3) goto L_0x0137
            cgp r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r15 = r15.b     // Catch:{ zzadu -> 0x0202 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ zzadu -> 0x0202 }
            if (r15 != 0) goto L_0x012f
            clv r15 = defpackage.bkc.i()     // Catch:{ zzadu -> 0x0202 }
            cmn r15 = r15.g()     // Catch:{ zzadu -> 0x0202 }
            cgp r2 = r14.k     // Catch:{ zzadu -> 0x0202 }
            boolean r2 = r2.t     // Catch:{ zzadu -> 0x0202 }
            r15.a(r2)     // Catch:{ zzadu -> 0x0202 }
            cgp r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            boolean r15 = r15.g     // Catch:{ zzadu -> 0x0202 }
            if (r15 == 0) goto L_0x00ef
            ecq r15 = new ecq     // Catch:{ JSONException -> 0x00c7 }
            cgp r2 = r14.k     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r2 = r2.b     // Catch:{ JSONException -> 0x00c7 }
            r15.<init>(r2)     // Catch:{ JSONException -> 0x00c7 }
            r14.l = r15     // Catch:{ JSONException -> 0x00c7 }
            clv r15 = defpackage.bkc.i()     // Catch:{ JSONException -> 0x00c7 }
            ecq r2 = r14.l     // Catch:{ JSONException -> 0x00c7 }
            boolean r2 = r2.h     // Catch:{ JSONException -> 0x00c7 }
            r15.a(r2)     // Catch:{ JSONException -> 0x00c7 }
            goto L_0x00fa
        L_0x00c7:
            r15 = move-exception
            java.lang.String r0 = "Could not parse mediation config."
            defpackage.cml.a(r0, r15)     // Catch:{ zzadu -> 0x0202 }
            com.google.android.gms.internal.ads.zzadu r15 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r0 = "Could not parse mediation config: "
            cgp r1 = r14.k     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r1 = r1.b     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ zzadu -> 0x0202 }
            int r2 = r1.length()     // Catch:{ zzadu -> 0x0202 }
            if (r2 == 0) goto L_0x00e4
            java.lang.String r0 = r0.concat(r1)     // Catch:{ zzadu -> 0x0202 }
            goto L_0x00ea
        L_0x00e4:
            java.lang.String r1 = new java.lang.String     // Catch:{ zzadu -> 0x0202 }
            r1.<init>(r0)     // Catch:{ zzadu -> 0x0202 }
            r0 = r1
        L_0x00ea:
            r1 = 0
            r15.<init>(r0, r1)     // Catch:{ zzadu -> 0x0202 }
            throw r15     // Catch:{ zzadu -> 0x0202 }
        L_0x00ef:
            clv r15 = defpackage.bkc.i()     // Catch:{ zzadu -> 0x0202 }
            cgp r2 = r14.k     // Catch:{ zzadu -> 0x0202 }
            boolean r2 = r2.I     // Catch:{ zzadu -> 0x0202 }
            r15.a(r2)     // Catch:{ zzadu -> 0x0202 }
        L_0x00fa:
            cgp r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r15 = r15.G     // Catch:{ zzadu -> 0x0202 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ zzadu -> 0x0202 }
            if (r15 != 0) goto L_0x0137
            dsw<java.lang.Boolean> r15 = defpackage.dtg.cA     // Catch:{ zzadu -> 0x0202 }
            dte r2 = defpackage.dqe.f()     // Catch:{ zzadu -> 0x0202 }
            java.lang.Object r15 = r2.a(r15)     // Catch:{ zzadu -> 0x0202 }
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ zzadu -> 0x0202 }
            boolean r15 = r15.booleanValue()     // Catch:{ zzadu -> 0x0202 }
            if (r15 == 0) goto L_0x0137
            defpackage.cpn.a(r0)     // Catch:{ zzadu -> 0x0202 }
            cna r15 = defpackage.bkc.g()     // Catch:{ zzadu -> 0x0202 }
            android.content.Context r0 = r14.c     // Catch:{ zzadu -> 0x0202 }
            android.webkit.CookieManager r15 = r15.c(r0)     // Catch:{ zzadu -> 0x0202 }
            if (r15 == 0) goto L_0x0137
            java.lang.String r0 = "="
            cgp r2 = r14.k     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r2 = r2.G     // Catch:{ zzadu -> 0x0202 }
            r15.setCookie(r0, r2)     // Catch:{ zzadu -> 0x0202 }
            goto L_0x0137
        L_0x012f:
            com.google.android.gms.internal.ads.zzadu r15 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r1 = "No fill from ad server."
            r15.<init>(r1, r0)     // Catch:{ zzadu -> 0x0202 }
            throw r15     // Catch:{ zzadu -> 0x0202 }
        L_0x0137:
            cgl r15 = r14.i     // Catch:{ zzadu -> 0x0202 }
            dpt r15 = r15.d     // Catch:{ zzadu -> 0x0202 }
            dpt[] r15 = r15.g     // Catch:{ zzadu -> 0x0202 }
            if (r15 == 0) goto L_0x0147
            cgl r15 = r14.i     // Catch:{ zzadu -> 0x0202 }
            dpt r15 = r14.a(r15)     // Catch:{ zzadu -> 0x0202 }
            r5 = r15
            goto L_0x0148
        L_0x0147:
            r5 = r1
        L_0x0148:
            clv r15 = defpackage.bkc.i()
            cmn r15 = r15.g()
            cgp r0 = r14.k
            boolean r0 = r0.u
            r15.b(r0)
            clv r15 = defpackage.bkc.i()
            cmn r15 = r15.g()
            cgp r0 = r14.k
            boolean r0 = r0.M
            r15.c(r0)
            cgp r15 = r14.k
            java.lang.String r15 = r15.q
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x0181
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x017b }
            cgp r0 = r14.k     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = r0.q     // Catch:{ Exception -> 0x017b }
            r15.<init>(r0)     // Catch:{ Exception -> 0x017b }
            r11 = r15
            goto L_0x0182
        L_0x017b:
            r15 = move-exception
            java.lang.String r0 = "Error parsing the JSON for Active View."
            defpackage.cml.a(r0, r15)
        L_0x0181:
            r11 = r1
        L_0x0182:
            cgp r15 = r14.k
            int r15 = r15.P
            r0 = 2
            r2 = 1
            if (r15 != r0) goto L_0x01c7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            cgl r15 = r14.i
            dpp r15 = r15.c
            android.os.Bundle r0 = r15.m
            if (r0 == 0) goto L_0x0197
            android.os.Bundle r15 = r15.m
            goto L_0x019c
        L_0x0197:
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
        L_0x019c:
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r0 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r0 = r0.getName()
            android.os.Bundle r0 = r15.getBundle(r0)
            if (r0 == 0) goto L_0x01b3
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r0 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r0 = r0.getName()
            android.os.Bundle r15 = r15.getBundle(r0)
            goto L_0x01c2
        L_0x01b3:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r3 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r3 = r3.getName()
            r15.putBundle(r3, r0)
            r15 = r0
        L_0x01c2:
            java.lang.String r0 = "render_test_label"
            r15.putBoolean(r0, r2)
        L_0x01c7:
            cgp r15 = r14.k
            int r15 = r15.P
            if (r15 != r2) goto L_0x01cf
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x01cf:
            cgp r15 = r14.k
            int r15 = r15.P
            if (r15 != 0) goto L_0x01e3
            cgl r15 = r14.i
            dpp r15 = r15.c
            boolean r15 = defpackage.cov.a(r15)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r13 = r15
            goto L_0x01e4
        L_0x01e3:
            r13 = r1
        L_0x01e4:
            clr r15 = new clr
            cgl r2 = r14.i
            cgp r3 = r14.k
            ecq r4 = r14.l
            r6 = -2
            long r9 = r3.m
            dny r12 = r14.g
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            cfr r0 = r14.f
            r0.a(r15)
        L_0x01fa:
            android.os.Handler r15 = defpackage.cmu.a
            java.lang.Runnable r0 = r14.d
            r15.removeCallbacks(r0)
            return
        L_0x0202:
            r15 = move-exception
            int r0 = r15.mErrorCode
            java.lang.String r15 = r15.getMessage()
            r14.a(r0, r15)
            goto L_0x01fa
        L_0x020d:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x020d }
            goto L_0x0211
        L_0x0210:
            throw r0
        L_0x0211:
            goto L_0x0210
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfs.a(cgp):void");
    }

    public final void s_() {
        synchronized (this.b) {
            if (this.e != null) {
                this.e.b();
            }
        }
    }
}
