package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzhu.zza.zzb;

@cey
/* renamed from: cfb reason: default package */
public final class cfb extends clp implements cfm {
    final cfv a;
    final Object b = new Object();
    final Context c;
    Runnable d;
    cmv e;
    private final cfa f;
    private final dnh g;
    private final dnl h;
    private cfu i;
    private cfy k;
    private ebz l;

    public cfb(Context context, cfv cfv, cfa cfa, dnl dnl) {
        dnh dnh;
        dni dni;
        this.f = cfa;
        this.c = context;
        this.a = cfv;
        this.h = dnl;
        this.g = new dnh(this.h);
        this.g.a((dni) new cfc(this));
        doh doh = new doh();
        doh.a = Integer.valueOf(this.a.j.b);
        doh.b = Integer.valueOf(this.a.j.c);
        doh.c = Integer.valueOf(this.a.j.d ? 0 : 2);
        this.g.a((dni) new cfd(doh));
        if (this.a.f != null) {
            this.g.a((dni) new cfe(this));
        }
        dpc dpc = this.a.c;
        if (dpc.d) {
            if ("interstitial_mb".equals(dpc.a)) {
                dnh = this.g;
                dni = cff.a;
                dnh.a(dni);
                this.g.a(zzb.AD_REQUEST);
            }
        }
        if (dpc.d) {
            if ("reward_mb".equals(dpc.a)) {
                dnh = this.g;
                dni = cfg.a;
                dnh.a(dni);
                this.g.a(zzb.AD_REQUEST);
            }
        }
        if (dpc.h || dpc.d) {
            dnh = this.g;
            dni = cfi.a;
        } else {
            dnh = this.g;
            dni = cfh.a;
        }
        dnh.a(dni);
        this.g.a(zzb.AD_REQUEST);
    }

    private final dpc a(cfu cfu) {
        dpc[] dpcArr;
        cfu cfu2 = this.i;
        if ((cfu2 == null || cfu2.V == null || this.i.V.size() <= 1) ? false : true) {
            ebz ebz = this.l;
            if (ebz != null && !ebz.t) {
                return null;
            }
        }
        if (this.k.y) {
            for (dpc dpc : cfu.d.g) {
                if (dpc.i) {
                    return new dpc(dpc, cfu.d.g);
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
                dpc[] dpcArr2 = cfu.d.g;
                int length = dpcArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    dpc dpc2 = dpcArr2[i2];
                    float f2 = this.c.getResources().getDisplayMetrics().density;
                    int i3 = dpc2.e == -1 ? (int) (((float) dpc2.f) / f2) : dpc2.e;
                    int i4 = dpc2.b == -2 ? (int) (((float) dpc2.c) / f2) : dpc2.b;
                    if (parseInt == i3 && parseInt2 == i4 && !dpc2.i) {
                        return new dpc(dpc2, cfu.d.g);
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

    public final void s_() {
        synchronized (this.b) {
            if (this.e != null) {
                this.e.b();
            }
        }
    }

    public final void a() {
        cow.a(3);
        this.d = new cfj(this);
        cmd.a.postDelayed(this.d, ((Long) dpn.f().a(dsp.by)).longValue());
        long b2 = bjl.l().b();
        if (((Boolean) dpn.f().a(dsp.bw)).booleanValue() && this.a.b.c != null) {
            String string = this.a.b.c.getString("_ad");
            if (string != null) {
                cfu cfu = new cfu(this.a, b2, null, null, null);
                this.i = cfu;
                a(chi.a(this.c, this.i, string));
                return;
            }
        }
        cqi cqi = new cqi();
        cmb.a((Runnable) new cfk(this, cqi));
        String g2 = bjl.B().g(this.c);
        String h2 = bjl.B().h(this.c);
        String i2 = bjl.B().i(this.c);
        bjl.B().e(this.c, i2);
        cfu cfu2 = new cfu(this.a, b2, g2, h2, i2);
        this.i = cfu2;
        cqi.a(this.i);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, String str) {
        int i3 = i2;
        if (i3 == 3 || i3 == -1) {
            cow.a(4);
        } else {
            cow.a(5);
        }
        cfy cfy = this.k;
        if (cfy == null) {
            this.k = new cfy(i3);
        } else {
            this.k = new cfy(i3, cfy.j);
        }
        cfu cfu = this.i;
        if (cfu == null) {
            cfu = new cfu(this.a, -1, null, null, null);
        }
        cfu cfu2 = cfu;
        cfy cfy2 = this.k;
        cla cla = new cla(cfu2, cfy2, this.l, null, i2, -1, cfy2.m, null, this.g, null);
        this.f.a(cla);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cfy r15) {
        /*
            r14 = this;
            r0 = 3
            defpackage.cow.a(r0)
            r14.k = r15
            bzg r15 = defpackage.bjl.l()
            long r7 = r15.b()
            java.lang.Object r15 = r14.b
            monitor-enter(r15)
            r1 = 0
            r14.e = r1     // Catch:{ all -> 0x020d }
            monitor-exit(r15)     // Catch:{ all -> 0x020d }
            cle r15 = defpackage.bjl.i()
            clw r15 = r15.g()
            cfy r2 = r14.k
            boolean r2 = r2.F
            r15.d(r2)
            dsf<java.lang.Boolean> r15 = defpackage.dsp.aR
            dsn r2 = defpackage.dpn.f()
            java.lang.Object r15 = r2.a(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x005b
            cfy r15 = r14.k
            boolean r15 = r15.N
            if (r15 == 0) goto L_0x004c
            cle r15 = defpackage.bjl.i()
            clw r15 = r15.g()
            cfu r2 = r14.i
            java.lang.String r2 = r2.e
            r15.a(r2)
            goto L_0x005b
        L_0x004c:
            cle r15 = defpackage.bjl.i()
            clw r15 = r15.g()
            cfu r2 = r14.i
            java.lang.String r2 = r2.e
            r15.b(r2)
        L_0x005b:
            cfy r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r15 = r15.d     // Catch:{ zzadu -> 0x0202 }
            r2 = -2
            r3 = -3
            if (r15 == r2) goto L_0x008b
            cfy r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r15 = r15.d     // Catch:{ zzadu -> 0x0202 }
            if (r15 != r3) goto L_0x006a
            goto L_0x008b
        L_0x006a:
            com.google.android.gms.internal.ads.zzadu r15 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x0202 }
            cfy r0 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r0 = r0.d     // Catch:{ zzadu -> 0x0202 }
            r1 = 66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ zzadu -> 0x0202 }
            r2.<init>(r1)     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r1 = "There was a problem getting an ad response. ErrorCode: "
            r2.append(r1)     // Catch:{ zzadu -> 0x0202 }
            r2.append(r0)     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r0 = r2.toString()     // Catch:{ zzadu -> 0x0202 }
            cfy r1 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r1 = r1.d     // Catch:{ zzadu -> 0x0202 }
            r15.<init>(r0, r1)     // Catch:{ zzadu -> 0x0202 }
            throw r15     // Catch:{ zzadu -> 0x0202 }
        L_0x008b:
            cfy r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            int r15 = r15.d     // Catch:{ zzadu -> 0x0202 }
            if (r15 == r3) goto L_0x0137
            cfy r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r15 = r15.b     // Catch:{ zzadu -> 0x0202 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ zzadu -> 0x0202 }
            if (r15 != 0) goto L_0x012f
            cle r15 = defpackage.bjl.i()     // Catch:{ zzadu -> 0x0202 }
            clw r15 = r15.g()     // Catch:{ zzadu -> 0x0202 }
            cfy r2 = r14.k     // Catch:{ zzadu -> 0x0202 }
            boolean r2 = r2.t     // Catch:{ zzadu -> 0x0202 }
            r15.a(r2)     // Catch:{ zzadu -> 0x0202 }
            cfy r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            boolean r15 = r15.g     // Catch:{ zzadu -> 0x0202 }
            if (r15 == 0) goto L_0x00ef
            ebz r15 = new ebz     // Catch:{ JSONException -> 0x00c7 }
            cfy r2 = r14.k     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r2 = r2.b     // Catch:{ JSONException -> 0x00c7 }
            r15.<init>(r2)     // Catch:{ JSONException -> 0x00c7 }
            r14.l = r15     // Catch:{ JSONException -> 0x00c7 }
            cle r15 = defpackage.bjl.i()     // Catch:{ JSONException -> 0x00c7 }
            ebz r2 = r14.l     // Catch:{ JSONException -> 0x00c7 }
            boolean r2 = r2.h     // Catch:{ JSONException -> 0x00c7 }
            r15.a(r2)     // Catch:{ JSONException -> 0x00c7 }
            goto L_0x00fa
        L_0x00c7:
            r15 = move-exception
            java.lang.String r0 = "Could not parse mediation config."
            defpackage.clu.a(r0, r15)     // Catch:{ zzadu -> 0x0202 }
            com.google.android.gms.internal.ads.zzadu r15 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r0 = "Could not parse mediation config: "
            cfy r1 = r14.k     // Catch:{ zzadu -> 0x0202 }
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
            cle r15 = defpackage.bjl.i()     // Catch:{ zzadu -> 0x0202 }
            cfy r2 = r14.k     // Catch:{ zzadu -> 0x0202 }
            boolean r2 = r2.I     // Catch:{ zzadu -> 0x0202 }
            r15.a(r2)     // Catch:{ zzadu -> 0x0202 }
        L_0x00fa:
            cfy r15 = r14.k     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r15 = r15.G     // Catch:{ zzadu -> 0x0202 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ zzadu -> 0x0202 }
            if (r15 != 0) goto L_0x0137
            dsf<java.lang.Boolean> r15 = defpackage.dsp.cA     // Catch:{ zzadu -> 0x0202 }
            dsn r2 = defpackage.dpn.f()     // Catch:{ zzadu -> 0x0202 }
            java.lang.Object r15 = r2.a(r15)     // Catch:{ zzadu -> 0x0202 }
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ zzadu -> 0x0202 }
            boolean r15 = r15.booleanValue()     // Catch:{ zzadu -> 0x0202 }
            if (r15 == 0) goto L_0x0137
            defpackage.cow.a(r0)     // Catch:{ zzadu -> 0x0202 }
            cmj r15 = defpackage.bjl.g()     // Catch:{ zzadu -> 0x0202 }
            android.content.Context r0 = r14.c     // Catch:{ zzadu -> 0x0202 }
            android.webkit.CookieManager r15 = r15.c(r0)     // Catch:{ zzadu -> 0x0202 }
            if (r15 == 0) goto L_0x0137
            java.lang.String r0 = "googleads.g.doubleclick.net"
            cfy r2 = r14.k     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r2 = r2.G     // Catch:{ zzadu -> 0x0202 }
            r15.setCookie(r0, r2)     // Catch:{ zzadu -> 0x0202 }
            goto L_0x0137
        L_0x012f:
            com.google.android.gms.internal.ads.zzadu r15 = new com.google.android.gms.internal.ads.zzadu     // Catch:{ zzadu -> 0x0202 }
            java.lang.String r1 = "No fill from ad server."
            r15.<init>(r1, r0)     // Catch:{ zzadu -> 0x0202 }
            throw r15     // Catch:{ zzadu -> 0x0202 }
        L_0x0137:
            cfu r15 = r14.i     // Catch:{ zzadu -> 0x0202 }
            dpc r15 = r15.d     // Catch:{ zzadu -> 0x0202 }
            dpc[] r15 = r15.g     // Catch:{ zzadu -> 0x0202 }
            if (r15 == 0) goto L_0x0147
            cfu r15 = r14.i     // Catch:{ zzadu -> 0x0202 }
            dpc r15 = r14.a(r15)     // Catch:{ zzadu -> 0x0202 }
            r5 = r15
            goto L_0x0148
        L_0x0147:
            r5 = r1
        L_0x0148:
            cle r15 = defpackage.bjl.i()
            clw r15 = r15.g()
            cfy r0 = r14.k
            boolean r0 = r0.u
            r15.b(r0)
            cle r15 = defpackage.bjl.i()
            clw r15 = r15.g()
            cfy r0 = r14.k
            boolean r0 = r0.M
            r15.c(r0)
            cfy r15 = r14.k
            java.lang.String r15 = r15.q
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x0181
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x017b }
            cfy r0 = r14.k     // Catch:{ Exception -> 0x017b }
            java.lang.String r0 = r0.q     // Catch:{ Exception -> 0x017b }
            r15.<init>(r0)     // Catch:{ Exception -> 0x017b }
            r11 = r15
            goto L_0x0182
        L_0x017b:
            r15 = move-exception
            java.lang.String r0 = "Error parsing the JSON for Active View."
            defpackage.clu.a(r0, r15)
        L_0x0181:
            r11 = r1
        L_0x0182:
            cfy r15 = r14.k
            int r15 = r15.P
            r0 = 2
            r2 = 1
            if (r15 != r0) goto L_0x01c7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            cfu r15 = r14.i
            doy r15 = r15.c
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
            cfy r15 = r14.k
            int r15 = r15.P
            if (r15 != r2) goto L_0x01cf
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x01cf:
            cfy r15 = r14.k
            int r15 = r15.P
            if (r15 != 0) goto L_0x01e3
            cfu r15 = r14.i
            doy r15 = r15.c
            boolean r15 = defpackage.coe.a(r15)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r13 = r15
            goto L_0x01e4
        L_0x01e3:
            r13 = r1
        L_0x01e4:
            cla r15 = new cla
            cfu r2 = r14.i
            cfy r3 = r14.k
            ebz r4 = r14.l
            r6 = -2
            long r9 = r3.m
            dnh r12 = r14.g
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            cfa r0 = r14.f
            r0.a(r15)
        L_0x01fa:
            android.os.Handler r15 = defpackage.cmd.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfb.a(cfy):void");
    }
}
