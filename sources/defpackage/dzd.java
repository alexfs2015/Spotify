package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

@cey
/* renamed from: dzd reason: default package */
public final class dzd extends dqe {
    private final String a;
    private boolean b;
    private final dxt c;
    private bia d;
    private final dyv e;

    public dzd(Context context, String str, ecp ecp, coy coy, bki bki) {
        this(str, new dxt(context, ecp, coy, bki));
    }

    private final void c() {
        if (this.d == null) {
            this.d = this.c.a(this.a);
            this.e.a(this.d);
        }
    }

    public final String D() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final dqm E() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final dps F() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final String J_() {
        bia bia = this.d;
        if (bia != null) {
            return bia.J_();
        }
        return null;
    }

    public final String a() {
        bia bia = this.d;
        if (bia != null) {
            return bia.a();
        }
        return null;
    }

    public final void a(ciw ciw) {
        dyv dyv = this.e;
        dyv.f = ciw;
        bia bia = this.d;
        if (bia != null) {
            dyv.a(bia);
        }
    }

    public final void a(dpc dpc) {
        bia bia = this.d;
        if (bia != null) {
            bia.a(dpc);
        }
    }

    public final void a(dpp dpp) {
        dyv dyv = this.e;
        dyv.e = dpp;
        bia bia = this.d;
        if (bia != null) {
            dyv.a(bia);
        }
    }

    public final void a(dps dps) {
        dyv dyv = this.e;
        dyv.a = dps;
        bia bia = this.d;
        if (bia != null) {
            dyv.a(bia);
        }
    }

    public final void a(dqi dqi) {
        dyv dyv = this.e;
        dyv.b = dqi;
        bia bia = this.d;
        if (bia != null) {
            dyv.a(bia);
        }
    }

    public final void a(dqm dqm) {
        dyv dyv = this.e;
        dyv.c = dqm;
        bia bia = this.d;
        if (bia != null) {
            dyv.a(bia);
        }
    }

    public final void a(dqs dqs) {
        c();
        bia bia = this.d;
        if (bia != null) {
            bia.a(dqs);
        }
    }

    public final void a(drf drf) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dry dry) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final void a(dth dth) {
        dyv dyv = this.e;
        dyv.d = dth;
        bia bia = this.d;
        if (bia != null) {
            dyv.a(bia);
        }
    }

    public final void a(String str) {
    }

    public final void b(boolean z) {
        c();
        bia bia = this.d;
        if (bia != null) {
            bia.b(z);
        }
    }

    public final void c(boolean z) {
        this.b = z;
    }

    public final void j() {
        bia bia = this.d;
        if (bia != null) {
            bia.j();
        }
    }

    public final car k() {
        bia bia = this.d;
        if (bia != null) {
            return bia.k();
        }
        return null;
    }

    public final dpc l() {
        bia bia = this.d;
        if (bia != null) {
            return bia.l();
        }
        return null;
    }

    public final boolean m() {
        bia bia = this.d;
        return bia != null && bia.m();
    }

    public final void o() {
        bia bia = this.d;
        if (bia != null) {
            bia.o();
        }
    }

    public final void p() {
        bia bia = this.d;
        if (bia != null) {
            bia.p();
        }
    }

    public final Bundle q() {
        bia bia = this.d;
        return bia != null ? bia.q() : new Bundle();
    }

    public final void r() {
        bia bia = this.d;
        if (bia != null) {
            bia.r();
        }
    }

    public final boolean s() {
        bia bia = this.d;
        return bia != null && bia.s();
    }

    public final dqz t() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    private dzd(String str, dxt dxt) {
        String str2;
        this.a = str;
        this.c = dxt;
        this.e = new dyv();
        dyy r = bjl.r();
        if (r.c == null) {
            r.c = new dxt(dxt.a.getApplicationContext(), dxt.b, dxt.c, dxt.d);
            if (r.c != null) {
                SharedPreferences sharedPreferences = r.c.a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (r.b.size() > 0) {
                    dyz dyz = (dyz) r.b.remove();
                    dza dza = (dza) r.a.get(dyz);
                    dyy.a("Flushing interstitial queue for %s.", dyz);
                    while (dza.a.size() > 0) {
                        dza.a((doy) null).a.K();
                    }
                    r.a.remove(dyz);
                }
                try {
                    HashMap hashMap = new HashMap();
                    Iterator it = sharedPreferences.getAll().entrySet().iterator();
                    while (true) {
                        str2 = "PoolKeys";
                        if (!it.hasNext()) {
                            break;
                        }
                        Entry entry = (Entry) it.next();
                        if (!((String) entry.getKey()).equals(str2)) {
                            dze a2 = dze.a((String) entry.getValue());
                            dyz dyz2 = new dyz(a2.a, a2.b, a2.c);
                            if (!r.a.containsKey(dyz2)) {
                                r.a.put(dyz2, new dza(a2.a, a2.b, a2.c));
                                hashMap.put(dyz2.toString(), dyz2);
                                dyy.a("Restored interstitial queue for %s.", dyz2);
                            }
                        }
                    }
                    for (String str3 : dyy.a(sharedPreferences.getString(str2, ""))) {
                        dyz dyz3 = (dyz) hashMap.get(str3);
                        if (r.a.containsKey(dyz3)) {
                            r.b.add(dyz3);
                        }
                    }
                } catch (IOException | RuntimeException e2) {
                    bjl.i().a(e2, "InterstitialAdPool.restore");
                    cow.a(5);
                    r.a.clear();
                    r.b.clear();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.doy r14) {
        /*
            r13 = this;
            java.util.Set r0 = defpackage.dyy.a(r14)
            java.lang.String r1 = "gw"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x000f
            r13.c()
        L_0x000f:
            java.util.Set r0 = defpackage.dyy.a(r14)
            java.lang.String r1 = "_skipMediation"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x001e
            r13.c()
        L_0x001e:
            dru r0 = r14.j
            if (r0 == 0) goto L_0x0025
            r13.c()
        L_0x0025:
            bia r0 = r13.d
            if (r0 == 0) goto L_0x002e
            boolean r14 = r0.b(r14)
            return r14
        L_0x002e:
            dyy r0 = defpackage.bjl.r()
            java.util.Set r1 = defpackage.dyy.a(r14)
            java.lang.String r2 = "_ad"
            boolean r1 = r1.contains(r2)
            java.lang.String r2 = "Interstitial pool created at %s."
            r3 = 1
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = r13.a
            dxt r4 = r0.c
            if (r4 == 0) goto L_0x0091
            dxt r4 = r0.c
            android.content.Context r4 = r4.a
            android.content.Context r4 = r4.getApplicationContext()
            chs r5 = new chs
            r5.<init>(r4)
            chr r4 = r5.a()
            int r4 = r4.n
            doy r5 = defpackage.dyy.c(r14)
            java.lang.String r1 = defpackage.dyy.c(r1)
            dyz r6 = new dyz
            r6.<init>(r5, r1, r4)
            java.util.Map<dyz, dza> r7 = r0.a
            java.lang.Object r7 = r7.get(r6)
            dza r7 = (defpackage.dza) r7
            if (r7 != 0) goto L_0x007e
            defpackage.dyy.a(r2, r6)
            dza r7 = new dza
            r7.<init>(r5, r1, r4)
            java.util.Map<dyz, dza> r1 = r0.a
            r1.put(r6, r7)
        L_0x007e:
            dxt r1 = r0.c
            dzb r4 = new dzb
            r4.<init>(r7, r1, r14)
            java.util.LinkedList<dzb> r1 = r7.a
            r1.add(r4)
            r7.e = r3
            java.lang.String r1 = "Inline entry added to the queue at %s."
            defpackage.dyy.a(r1, r6)
        L_0x0091:
            java.lang.String r1 = r13.a
            boolean r4 = defpackage.dyy.b(r1)
            r5 = 0
            if (r4 != 0) goto L_0x019b
            dxt r4 = r0.c
            android.content.Context r4 = r4.a
            android.content.Context r4 = r4.getApplicationContext()
            chs r6 = new chs
            r6.<init>(r4)
            chr r4 = r6.a()
            int r4 = r4.n
            doy r6 = defpackage.dyy.c(r14)
            java.lang.String r1 = defpackage.dyy.c(r1)
            dyz r7 = new dyz
            r7.<init>(r6, r1, r4)
            java.util.Map<dyz, dza> r8 = r0.a
            java.lang.Object r8 = r8.get(r7)
            dza r8 = (defpackage.dza) r8
            if (r8 != 0) goto L_0x00d1
            defpackage.dyy.a(r2, r7)
            dza r8 = new dza
            r8.<init>(r6, r1, r4)
            java.util.Map<dyz, dza> r1 = r0.a
            r1.put(r7, r8)
        L_0x00d1:
            java.util.LinkedList<dyz> r1 = r0.b
            r1.remove(r7)
            java.util.LinkedList<dyz> r1 = r0.b
            r1.add(r7)
            r8.e = r3
        L_0x00dd:
            java.util.LinkedList<dyz> r1 = r0.b
            int r1 = r1.size()
            dsf<java.lang.Integer> r2 = defpackage.dsp.aV
            dsn r4 = defpackage.dpn.f()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 <= r2) goto L_0x012f
            java.util.LinkedList<dyz> r1 = r0.b
            java.lang.Object r1 = r1.remove()
            dyz r1 = (defpackage.dyz) r1
            java.util.Map<dyz, dza> r2 = r0.a
            java.lang.Object r2 = r2.get(r1)
            dza r2 = (defpackage.dza) r2
            java.lang.String r4 = "Evicting interstitial queue for %s."
            defpackage.dyy.a(r4, r1)
        L_0x010a:
            java.util.LinkedList<dzb> r4 = r2.a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0129
            dzb r4 = r2.a(r5)
            boolean r9 = r4.e
            if (r9 == 0) goto L_0x0123
            dzc r9 = defpackage.dzc.a()
            int r10 = r9.c
            int r10 = r10 + r3
            r9.c = r10
        L_0x0123:
            bia r4 = r4.a
            r4.K()
            goto L_0x010a
        L_0x0129:
            java.util.Map<dyz, dza> r2 = r0.a
            r2.remove(r1)
            goto L_0x00dd
        L_0x012f:
            java.util.LinkedList<dzb> r0 = r8.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x019b
            dzb r0 = r8.a(r6)
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x0172
            bzg r1 = defpackage.bjl.l()
            long r1 = r1.a()
            long r9 = r0.d
            long r1 = r1 - r9
            r9 = 1000(0x3e8, double:4.94E-321)
            dsf<java.lang.Integer> r4 = defpackage.dsp.aX
            dsn r11 = defpackage.dpn.f()
            java.lang.Object r4 = r11.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r11 = (long) r4
            long r11 = r11 * r9
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0172
            java.lang.String r0 = "Expired interstitial at %s."
            defpackage.dyy.a(r0, r7)
            dzc r0 = defpackage.dzc.a()
            int r1 = r0.b
            int r1 = r1 + r3
            r0.b = r1
            goto L_0x012f
        L_0x0172:
            doy r1 = r0.b
            if (r1 == 0) goto L_0x0179
            java.lang.String r1 = " (inline) "
            goto L_0x017b
        L_0x0179:
            java.lang.String r1 = " "
        L_0x017b:
            int r2 = r1.length()
            int r2 = r2 + 34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "Pooled interstitial"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = "returned at %s."
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            defpackage.dyy.a(r1, r7)
            goto L_0x019c
        L_0x019b:
            r0 = r5
        L_0x019c:
            if (r0 == 0) goto L_0x01cb
            boolean r14 = r0.e
            if (r14 != 0) goto L_0x01ad
            r0.a()
            dzc r14 = defpackage.dzc.a()
            r14.b()
            goto L_0x01b6
        L_0x01ad:
            dzc r14 = defpackage.dzc.a()
            int r1 = r14.d
            int r1 = r1 + r3
            r14.d = r1
        L_0x01b6:
            bia r14 = r0.a
            r13.d = r14
            dxu r14 = r0.c
            dyv r1 = r13.e
            r14.a(r1)
            dyv r14 = r13.e
            bia r1 = r13.d
            r14.a(r1)
            boolean r14 = r0.f
            return r14
        L_0x01cb:
            r13.c()
            dzc r0 = defpackage.dzc.a()
            r0.b()
            bia r0 = r13.d
            boolean r14 = r0.b(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzd.b(doy):boolean");
    }

    public final void I() {
        bia bia = this.d;
        if (bia != null) {
            bia.c(this.b);
            this.d.I();
            return;
        }
        cow.a(5);
    }

    public final void n() {
        bia bia = this.d;
        if (bia != null) {
            bia.n();
        } else {
            cow.a(5);
        }
    }

    public final void a(ccp ccp) {
        cow.a(5);
    }

    public final void a(ccv ccv, String str) {
        cow.a(5);
    }
}
