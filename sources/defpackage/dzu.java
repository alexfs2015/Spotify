package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

@cfp
/* renamed from: dzu reason: default package */
public final class dzu extends dqv {
    private final String a;
    private boolean b;
    private final dyk c;
    private bir d;
    private final dzm e;

    public dzu(Context context, String str, edg edg, cpp cpp, bkz bkz) {
        this(str, new dyk(context, edg, cpp, bkz));
    }

    private dzu(String str, dyk dyk) {
        String str2;
        this.a = str;
        this.c = dyk;
        this.e = new dzm();
        dzp r = bkc.r();
        if (r.c == null) {
            r.c = new dyk(dyk.a.getApplicationContext(), dyk.b, dyk.c, dyk.d);
            if (r.c != null) {
                SharedPreferences sharedPreferences = r.c.a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (r.b.size() > 0) {
                    dzq dzq = (dzq) r.b.remove();
                    dzr dzr = (dzr) r.a.get(dzq);
                    dzp.a("Flushing interstitial queue for %s.", dzq);
                    while (dzr.a.size() > 0) {
                        dzr.a((dpp) null).a.K();
                    }
                    r.a.remove(dzq);
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
                            dzv a2 = dzv.a((String) entry.getValue());
                            dzq dzq2 = new dzq(a2.a, a2.b, a2.c);
                            if (!r.a.containsKey(dzq2)) {
                                r.a.put(dzq2, new dzr(a2.a, a2.b, a2.c));
                                hashMap.put(dzq2.toString(), dzq2);
                                dzp.a("Restored interstitial queue for %s.", dzq2);
                            }
                        }
                    }
                    for (String str3 : dzp.a(sharedPreferences.getString(str2, ""))) {
                        dzq dzq3 = (dzq) hashMap.get(str3);
                        if (r.a.containsKey(dzq3)) {
                            r.b.add(dzq3);
                        }
                    }
                } catch (IOException | RuntimeException e2) {
                    bkc.i().a(e2, "InterstitialAdPool.restore");
                    cpn.a(5);
                    r.a.clear();
                    r.b.clear();
                }
            }
        }
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

    public final drd E() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final dqj F() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void I() {
        bir bir = this.d;
        if (bir != null) {
            bir.c(this.b);
            this.d.I();
            return;
        }
        cpn.a(5);
    }

    public final String J_() {
        bir bir = this.d;
        if (bir != null) {
            return bir.J_();
        }
        return null;
    }

    public final String a() {
        bir bir = this.d;
        if (bir != null) {
            return bir.a();
        }
        return null;
    }

    public final void a(cdg cdg) {
        cpn.a(5);
    }

    public final void a(cdm cdm, String str) {
        cpn.a(5);
    }

    public final void a(cjn cjn) {
        dzm dzm = this.e;
        dzm.f = cjn;
        bir bir = this.d;
        if (bir != null) {
            dzm.a(bir);
        }
    }

    public final void a(dpt dpt) {
        bir bir = this.d;
        if (bir != null) {
            bir.a(dpt);
        }
    }

    public final void a(dqg dqg) {
        dzm dzm = this.e;
        dzm.e = dqg;
        bir bir = this.d;
        if (bir != null) {
            dzm.a(bir);
        }
    }

    public final void a(dqj dqj) {
        dzm dzm = this.e;
        dzm.a = dqj;
        bir bir = this.d;
        if (bir != null) {
            dzm.a(bir);
        }
    }

    public final void a(dqz dqz) {
        dzm dzm = this.e;
        dzm.b = dqz;
        bir bir = this.d;
        if (bir != null) {
            dzm.a(bir);
        }
    }

    public final void a(drd drd) {
        dzm dzm = this.e;
        dzm.c = drd;
        bir bir = this.d;
        if (bir != null) {
            dzm.a(bir);
        }
    }

    public final void a(drj drj) {
        c();
        bir bir = this.d;
        if (bir != null) {
            bir.a(drj);
        }
    }

    public final void a(drw drw) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(dsp dsp) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final void a(dty dty) {
        dzm dzm = this.e;
        dzm.d = dty;
        bir bir = this.d;
        if (bir != null) {
            dzm.a(bir);
        }
    }

    public final void a(String str) {
    }

    public final void b(boolean z) {
        c();
        bir bir = this.d;
        if (bir != null) {
            bir.b(z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.dpp r14) {
        /*
            r13 = this;
            java.util.Set r0 = defpackage.dzp.a(r14)
            java.lang.String r1 = "gw"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x000f
            r13.c()
        L_0x000f:
            java.util.Set r0 = defpackage.dzp.a(r14)
            java.lang.String r1 = "_skipMediation"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x001e
            r13.c()
        L_0x001e:
            dsl r0 = r14.j
            if (r0 == 0) goto L_0x0025
            r13.c()
        L_0x0025:
            bir r0 = r13.d
            if (r0 == 0) goto L_0x002e
            boolean r14 = r0.b(r14)
            return r14
        L_0x002e:
            dzp r0 = defpackage.bkc.r()
            java.util.Set r1 = defpackage.dzp.a(r14)
            java.lang.String r2 = "_ad"
            boolean r1 = r1.contains(r2)
            java.lang.String r2 = "Interstitial pool created at %s."
            r3 = 1
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = r13.a
            dyk r4 = r0.c
            if (r4 == 0) goto L_0x0091
            dyk r4 = r0.c
            android.content.Context r4 = r4.a
            android.content.Context r4 = r4.getApplicationContext()
            cij r5 = new cij
            r5.<init>(r4)
            cii r4 = r5.a()
            int r4 = r4.n
            dpp r5 = defpackage.dzp.c(r14)
            java.lang.String r1 = defpackage.dzp.c(r1)
            dzq r6 = new dzq
            r6.<init>(r5, r1, r4)
            java.util.Map<dzq, dzr> r7 = r0.a
            java.lang.Object r7 = r7.get(r6)
            dzr r7 = (defpackage.dzr) r7
            if (r7 != 0) goto L_0x007e
            defpackage.dzp.a(r2, r6)
            dzr r7 = new dzr
            r7.<init>(r5, r1, r4)
            java.util.Map<dzq, dzr> r1 = r0.a
            r1.put(r6, r7)
        L_0x007e:
            dyk r1 = r0.c
            dzs r4 = new dzs
            r4.<init>(r7, r1, r14)
            java.util.LinkedList<dzs> r1 = r7.a
            r1.add(r4)
            r7.e = r3
            java.lang.String r1 = "Inline entry added to the queue at %s."
            defpackage.dzp.a(r1, r6)
        L_0x0091:
            java.lang.String r1 = r13.a
            boolean r4 = defpackage.dzp.b(r1)
            r5 = 0
            if (r4 != 0) goto L_0x019b
            dyk r4 = r0.c
            android.content.Context r4 = r4.a
            android.content.Context r4 = r4.getApplicationContext()
            cij r6 = new cij
            r6.<init>(r4)
            cii r4 = r6.a()
            int r4 = r4.n
            dpp r6 = defpackage.dzp.c(r14)
            java.lang.String r1 = defpackage.dzp.c(r1)
            dzq r7 = new dzq
            r7.<init>(r6, r1, r4)
            java.util.Map<dzq, dzr> r8 = r0.a
            java.lang.Object r8 = r8.get(r7)
            dzr r8 = (defpackage.dzr) r8
            if (r8 != 0) goto L_0x00d1
            defpackage.dzp.a(r2, r7)
            dzr r8 = new dzr
            r8.<init>(r6, r1, r4)
            java.util.Map<dzq, dzr> r1 = r0.a
            r1.put(r7, r8)
        L_0x00d1:
            java.util.LinkedList<dzq> r1 = r0.b
            r1.remove(r7)
            java.util.LinkedList<dzq> r1 = r0.b
            r1.add(r7)
            r8.e = r3
        L_0x00dd:
            java.util.LinkedList<dzq> r1 = r0.b
            int r1 = r1.size()
            dsw<java.lang.Integer> r2 = defpackage.dtg.aV
            dte r4 = defpackage.dqe.f()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 <= r2) goto L_0x012f
            java.util.LinkedList<dzq> r1 = r0.b
            java.lang.Object r1 = r1.remove()
            dzq r1 = (defpackage.dzq) r1
            java.util.Map<dzq, dzr> r2 = r0.a
            java.lang.Object r2 = r2.get(r1)
            dzr r2 = (defpackage.dzr) r2
            java.lang.String r4 = "Evicting interstitial queue for %s."
            defpackage.dzp.a(r4, r1)
        L_0x010a:
            java.util.LinkedList<dzs> r4 = r2.a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0129
            dzs r4 = r2.a(r5)
            boolean r9 = r4.e
            if (r9 == 0) goto L_0x0123
            dzt r9 = defpackage.dzt.a()
            int r10 = r9.c
            int r10 = r10 + r3
            r9.c = r10
        L_0x0123:
            bir r4 = r4.a
            r4.K()
            goto L_0x010a
        L_0x0129:
            java.util.Map<dzq, dzr> r2 = r0.a
            r2.remove(r1)
            goto L_0x00dd
        L_0x012f:
            java.util.LinkedList<dzs> r0 = r8.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x019b
            dzs r0 = r8.a(r6)
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x0172
            bzx r1 = defpackage.bkc.l()
            long r1 = r1.a()
            long r9 = r0.d
            long r1 = r1 - r9
            r9 = 1000(0x3e8, double:4.94E-321)
            dsw<java.lang.Integer> r4 = defpackage.dtg.aX
            dte r11 = defpackage.dqe.f()
            java.lang.Object r4 = r11.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r11 = (long) r4
            long r11 = r11 * r9
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0172
            java.lang.String r0 = "Expired interstitial at %s."
            defpackage.dzp.a(r0, r7)
            dzt r0 = defpackage.dzt.a()
            int r1 = r0.b
            int r1 = r1 + r3
            r0.b = r1
            goto L_0x012f
        L_0x0172:
            dpp r1 = r0.b
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
            defpackage.dzp.a(r1, r7)
            goto L_0x019c
        L_0x019b:
            r0 = r5
        L_0x019c:
            if (r0 == 0) goto L_0x01cb
            boolean r14 = r0.e
            if (r14 != 0) goto L_0x01ad
            r0.a()
            dzt r14 = defpackage.dzt.a()
            r14.b()
            goto L_0x01b6
        L_0x01ad:
            dzt r14 = defpackage.dzt.a()
            int r1 = r14.d
            int r1 = r1 + r3
            r14.d = r1
        L_0x01b6:
            bir r14 = r0.a
            r13.d = r14
            dyl r14 = r0.c
            dzm r1 = r13.e
            r14.a(r1)
            dzm r14 = r13.e
            bir r1 = r13.d
            r14.a(r1)
            boolean r14 = r0.f
            return r14
        L_0x01cb:
            r13.c()
            dzt r0 = defpackage.dzt.a()
            r0.b()
            bir r0 = r13.d
            boolean r14 = r0.b(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzu.b(dpp):boolean");
    }

    public final void c(boolean z) {
        this.b = z;
    }

    public final void j() {
        bir bir = this.d;
        if (bir != null) {
            bir.j();
        }
    }

    public final cbi k() {
        bir bir = this.d;
        if (bir != null) {
            return bir.k();
        }
        return null;
    }

    public final dpt l() {
        bir bir = this.d;
        if (bir != null) {
            return bir.l();
        }
        return null;
    }

    public final boolean m() {
        bir bir = this.d;
        return bir != null && bir.m();
    }

    public final void n() {
        bir bir = this.d;
        if (bir != null) {
            bir.n();
        } else {
            cpn.a(5);
        }
    }

    public final void o() {
        bir bir = this.d;
        if (bir != null) {
            bir.o();
        }
    }

    public final void p() {
        bir bir = this.d;
        if (bir != null) {
            bir.p();
        }
    }

    public final Bundle q() {
        bir bir = this.d;
        return bir != null ? bir.q() : new Bundle();
    }

    public final void r() {
        bir bir = this.d;
        if (bir != null) {
            bir.r();
        }
    }

    public final boolean s() {
        bir bir = this.d;
        return bir != null && bir.s();
    }

    public final drq t() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }
}
