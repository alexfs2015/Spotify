package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: bis reason: default package */
public final class bis extends bjp implements due {
    cqc<duf> j;
    public csr k;
    public csr l;
    int m;
    public final String n;
    private final Object p;
    private boolean q;
    private boolean r;
    private ced s;

    public bis(Context context, bki bki, dpc dpc, String str, ecp ecp, coy coy) {
        this(context, bki, dpc, str, ecp, coy, false);
    }

    public bis(Context context, bki bki, dpc dpc, String str, ecp ecp, coy coy, boolean z) {
        super(context, dpc, str, ecp, coy, bki);
        this.p = new Object();
        this.j = new cqc<>();
        this.m = 1;
        this.n = UUID.randomUUID().toString();
        this.q = z;
    }

    private final void a(dtr dtr) {
        cmd.a.post(new biw(this, dtr));
    }

    private final void a(dtt dtt) {
        cmd.a.post(new biy(this, dtt));
    }

    private final void a(dty dty) {
        cmd.a.post(new bix(this, dty));
    }

    private final boolean ab() {
        return this.e.j != null && this.e.j.N;
    }

    private final ebz ac() {
        if (this.e.j == null || !this.e.j.n) {
            return null;
        }
        return this.e.j.r;
    }

    private final void ad() {
        ced A_ = A_();
        if (A_ != null) {
            A_.a();
        }
    }

    public final ced A_() {
        ced ced;
        synchronized (this.p) {
            ced = this.s;
        }
        return ced;
    }

    public final String D() {
        return this.e.b;
    }

    public final void I() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void J() {
        if (ab() && this.h != null) {
            csr csr = this.l;
            if (csr == null) {
                csr = this.k;
                if (csr == null) {
                    csr = null;
                }
            }
            if (csr != null) {
                csr.a("onSdkImpression", (Map<String, ?>) new HashMap<String,Object>());
            }
        }
    }

    public final dv<String, dwk> M() {
        bwx.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.e.v;
    }

    public final void N() {
        csr csr = this.k;
        if (csr != null) {
            csr.destroy();
            this.k = null;
        }
    }

    public final void O() {
        super.G();
        csr csr = this.l;
        if (csr != null) {
            csr.destroy();
            this.l = null;
        }
    }

    public final void P() {
        csr csr = this.k;
        if (csr != null && csr.b() != null && this.e.w != null && this.e.w.f != null) {
            this.k.b().a(this.e.w.f);
        }
    }

    public final boolean Q() {
        if (ac() != null) {
            return ac().p;
        }
        return false;
    }

    public final boolean R() {
        if (ac() != null) {
            return ac().q;
        }
        return false;
    }

    public final void S() {
        if (this.e.j != null) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.j.q)) {
                z();
                return;
            }
        }
        super.S();
    }

    public final void T() {
        if (this.e.j != null) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.j.q)) {
                y();
                return;
            }
        }
        super.T();
    }

    public final void U() {
        ckz ckz = this.e.j;
        if (ckz.p == null) {
            super.U();
            return;
        }
        try {
            ecs ecs = ckz.p;
            dqz dqz = null;
            edb h = ecs.h();
            if (h != null) {
                dqz = h.m();
            } else {
                edf i = ecs.i();
                if (i != null) {
                    dqz = i.l();
                } else {
                    dvw n2 = ecs.n();
                    if (n2 != null) {
                        dqz = n2.c();
                    }
                }
            }
            if (dqz != null) {
                drc h2 = dqz.h();
                if (h2 != null) {
                    h2.d();
                }
            }
        } catch (RemoteException e) {
            clu.b("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        a(i, false);
    }

    /* access modifiers changed from: protected */
    public final void a(int i, boolean z) {
        ad();
        super.a(i, z);
    }

    /* access modifiers changed from: protected */
    public final void a(car car) {
        Object a = car != null ? cas.a(car) : null;
        if (a instanceof duc) {
            ((duc) a).d();
        }
        super.b(this.e.j, false);
    }

    public final void a(ccp ccp) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void a(dth dth) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void a(dua dua) {
        csr csr = this.k;
        if (csr != null) {
            csr.a(dua);
        }
    }

    public final boolean a(doy doy, dtc dtc) {
        try {
            z_();
            return super.a(doy, dtc, this.m);
        } catch (Exception unused) {
            cow.a(4);
            return false;
        }
    }

    public final dwh b(String str) {
        bwx.b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.e.u == null) {
            return null;
        }
        return (dwh) this.e.u.get(str);
    }

    public final void b(View view) {
        if (this.h != null) {
            bjl.u().a(this.h, view);
        }
    }

    public final void c(List<String> list) {
        bwx.b("setNativeTemplates must be called on the main UI thread.");
        this.e.F = list;
    }

    /* access modifiers changed from: protected */
    public final void d(boolean z) {
        String str;
        super.d(z);
        if (this.r) {
            if (((Boolean) dpn.f().a(dsp.ce)).booleanValue()) {
                K();
            }
        }
        if (!ab()) {
            return;
        }
        if (this.l != null || this.k != null) {
            csr csr = this.l;
            String str2 = null;
            if (csr == null) {
                csr = this.k;
                if (csr != null) {
                    str2 = "javascript";
                } else {
                    csr = null;
                    str = null;
                    if (csr.n() != null && bjl.u().a(this.e.c)) {
                        int i = this.e.e.b;
                        int i2 = this.e.e.c;
                        StringBuilder sb = new StringBuilder(23);
                        sb.append(i);
                        sb.append(".");
                        sb.append(i2);
                        this.h = bjl.u().a(sb.toString(), csr.n(), "", "javascript", str);
                        if (this.h != null) {
                            bjl.u().a(this.h);
                            return;
                        }
                        return;
                    }
                }
            }
            str = str2;
            if (csr.n() != null) {
            }
        }
    }

    public final void o() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void p() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    /* access modifiers changed from: protected */
    public final void x() {
        d(false);
    }

    /* access modifiers changed from: 0000 */
    public final void z_() {
        synchronized (this.p) {
            clu.a();
            ceh ceh = new ceh(this.e.c, this, this.n, this.e.d, this.e.e);
            this.s = ceh;
        }
    }

    public final void a(cla cla, dtc dtc) {
        if (cla.d != null) {
            this.e.i = cla.d;
        }
        if (cla.e != -2) {
            cmd.a.post(new bit(this, cla));
            return;
        }
        int i = cla.a.Y;
        if (i == 1) {
            this.e.I = 0;
            bjm bjm = this.e;
            bjl.d();
            bjm.h = cdc.a(this.e.c, this, cla, this.e.d, null, this.o, this, dtc);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.e.h.getClass().getName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cow.a(3);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(cla.b.b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("ads");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    jSONArray.put(jSONArray3.get(i3));
                }
            }
            ad();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                biu biu = new biu(this, i4, jSONArray, i, cla);
                arrayList.add(cmb.a((Callable<T>) biu));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    cmd.a.post(new biv(this, (duf) ((cpr) arrayList.get(i5)).get(((Long) dpn.f().a(dsp.bz)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException unused) {
                    cow.a(5);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException unused2) {
                    cow.a(5);
                }
            }
        } catch (JSONException unused3) {
            cow.a(5);
            a(0);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(doy doy, ckz ckz, boolean z) {
        return this.d.b;
    }

    /* access modifiers changed from: protected */
    public final boolean a(ckz ckz, ckz ckz2) {
        dty dty;
        ckz ckz3 = ckz2;
        View view = null;
        c(null);
        if (this.e.c()) {
            if (ckz3.n) {
                ad();
                try {
                    edi p2 = ckz3.p != null ? ckz3.p.p() : null;
                    edb h = ckz3.p != null ? ckz3.p.h() : null;
                    edf i = ckz3.p != null ? ckz3.p.i() : null;
                    dvw n2 = ckz3.p != null ? ckz3.p.n() : null;
                    String c = c(ckz2);
                    if (p2 != null && this.e.t != null) {
                        String a = p2.a();
                        List b = p2.b();
                        String c2 = p2.c();
                        dva d = p2.d() != null ? p2.d() : null;
                        String e = p2.e();
                        String f = p2.f();
                        double g = p2.g();
                        String h2 = p2.h();
                        String i2 = p2.i();
                        dqz j2 = p2.j();
                        if (p2.m() != null) {
                            view = (View) cas.a(p2.m());
                        }
                        dty = new dty(a, b, c2, d, e, f, g, h2, i2, null, j2, view, p2.n(), c, p2.o());
                        dub dub = new dub(this.e.c, (due) this, this.e.d, p2, (duf) dty);
                        dty.a((duc) dub);
                    } else if (h != null && this.e.t != null) {
                        String a2 = h.a();
                        List b2 = h.b();
                        String c3 = h.c();
                        dva d2 = h.d() != null ? h.d() : null;
                        String e2 = h.e();
                        double f2 = h.f();
                        String g2 = h.g();
                        String h3 = h.h();
                        dqz m2 = h.m();
                        if (h.p() != null) {
                            view = (View) cas.a(h.p());
                        }
                        dty = new dty(a2, b2, c3, d2, e2, null, f2, g2, h3, null, m2, view, h.q(), c, h.l());
                        dub dub2 = new dub(this.e.c, (due) this, this.e.d, h, (duf) dty);
                        dty.a((duc) dub2);
                    } else if (h != null && this.e.r != null) {
                        String a3 = h.a();
                        List b3 = h.b();
                        String c4 = h.c();
                        dva d3 = h.d() != null ? h.d() : null;
                        String e3 = h.e();
                        double f3 = h.f();
                        String g3 = h.g();
                        String h4 = h.h();
                        Bundle l2 = h.l();
                        dqz m3 = h.m();
                        if (h.p() != null) {
                            view = (View) cas.a(h.p());
                        }
                        dtr dtr = new dtr(a3, b3, c4, d3, e3, f3, g3, h4, null, l2, m3, view, h.q(), c);
                        dub dub3 = new dub(this.e.c, (due) this, this.e.d, h, (duf) dtr);
                        dtr.a((duc) dub3);
                        a(dtr);
                    } else if (i != null && this.e.t != null) {
                        String a4 = i.a();
                        List b4 = i.b();
                        String c5 = i.c();
                        dva d4 = i.d() != null ? i.d() : null;
                        String e4 = i.e();
                        String f4 = i.f();
                        dqz l3 = i.l();
                        if (i.n() != null) {
                            view = (View) cas.a(i.n());
                        }
                        dty dty2 = new dty(a4, b4, c5, d4, e4, f4, -1.0d, null, null, null, l3, view, i.o(), c, i.j());
                        edf edf = i;
                        dty = dty2;
                        dub dub4 = new dub(this.e.c, (due) this, this.e.d, edf, (duf) dty2);
                        dty.a((duc) dub4);
                    } else if (i != null && this.e.s != null) {
                        String a5 = i.a();
                        List b5 = i.b();
                        String c6 = i.c();
                        dva d5 = i.d() != null ? i.d() : null;
                        String e5 = i.e();
                        String f5 = i.f();
                        Bundle j3 = i.j();
                        dqz l4 = i.l();
                        if (i.n() != null) {
                            view = (View) cas.a(i.n());
                        }
                        dtt dtt = new dtt(a5, b5, c6, d5, e5, f5, null, j3, l4, view, i.o(), c);
                        edf edf2 = i;
                        dtt dtt2 = dtt;
                        dub dub5 = new dub(this.e.c, (due) this, this.e.d, edf2, (duf) dtt);
                        dtt2.a((duc) dub5);
                        a(dtt2);
                    } else if (n2 == null || this.e.v == null || this.e.v.get(n2.l()) == null) {
                        cow.a(5);
                        a(0);
                        return false;
                    } else {
                        cmd.a.post(new bja(this, n2));
                    }
                    a(dty);
                } catch (RemoteException e6) {
                    clu.b("#007 Could not call remote method.", e6);
                }
            } else {
                duf duf = ckz3.C;
                if (this.q) {
                    this.j.b(duf);
                } else {
                    boolean z = duf instanceof dtt;
                    if (!z || this.e.t == null) {
                        if (!z || this.e.s == null) {
                            boolean z2 = duf instanceof dtr;
                            if (!z2 || this.e.t == null) {
                                if (!z2 || this.e.r == null) {
                                    if ((duf instanceof dtv) && this.e.v != null) {
                                        dtv dtv = (dtv) duf;
                                        if (this.e.v.get(dtv.l()) != null) {
                                            cmd.a.post(new biz(this, dtv.l(), ckz3));
                                        }
                                    }
                                    cow.a(5);
                                    a(0);
                                    return false;
                                }
                                a((dtr) ckz3.C);
                            }
                        } else {
                            a((dtt) ckz3.C);
                        }
                    }
                    a(b(ckz3.C));
                }
            }
            return super.a(ckz, ckz2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    public final void a(duc duc) {
        if (this.e.j.k != null) {
            bjl.i().b.a(this.e.i, this.e.j, (dlr) new dki(duc), (csr) null);
        }
    }

    public final void K() {
        if (this.e.j == null || this.k == null) {
            this.r = true;
            cow.a(5);
            return;
        }
        bjl.i().b.a(this.e.i, this.e.j, this.k.o(), this.k);
        this.r = false;
    }

    public final void L() {
        this.r = false;
        if (this.e.j == null || this.k == null) {
            cow.a(5);
        } else {
            bjl.i().b.a(this.e.j);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dty b(defpackage.duf r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof defpackage.dtt
            if (r1 == 0) goto L_0x0050
            dtt r0 = (defpackage.dtt) r0
            dty r1 = new dty
            r3 = r1
            java.lang.String r4 = r0.a()
            java.util.List r5 = r0.b()
            java.lang.String r6 = r0.e()
            dva r7 = r0.f()
            java.lang.String r8 = r0.g()
            java.lang.String r9 = r0.h()
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = 0
            r13 = 0
            dtm r14 = r0.a
            dqz r15 = r0.i()
            android.view.View r2 = r0.b
            r16 = r2
            car r17 = r0.c()
            java.lang.String r18 = r0.d()
            android.os.Bundle r19 = r0.n()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            car r2 = r0.j()
            if (r2 == 0) goto L_0x00a7
            car r0 = r0.j()
            java.lang.Object r0 = defpackage.cas.a(r0)
            r2 = r0
            goto L_0x00a8
        L_0x0050:
            boolean r1 = r0 instanceof defpackage.dtr
            if (r1 == 0) goto L_0x00a6
            dtr r0 = (defpackage.dtr) r0
            dty r18 = new dty
            r1 = r18
            java.lang.String r2 = r0.a()
            java.util.List r3 = r0.b()
            java.lang.String r4 = r0.c()
            dva r5 = r0.d()
            java.lang.String r6 = r0.e()
            r7 = 0
            double r8 = r0.f()
            java.lang.String r10 = r0.g()
            java.lang.String r11 = r0.h()
            dtm r12 = r0.a
            dqz r13 = r0.i()
            android.view.View r14 = r0.b
            car r15 = r0.p()
            java.lang.String r16 = r0.q()
            android.os.Bundle r17 = r0.n()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            car r1 = r0.j()
            if (r1 == 0) goto L_0x00a2
            car r0 = r0.j()
            java.lang.Object r0 = defpackage.cas.a(r0)
            r2 = r0
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            r1 = r18
            goto L_0x00a8
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            boolean r0 = r2 instanceof defpackage.duh
            if (r0 == 0) goto L_0x00b1
            duh r2 = (defpackage.duh) r2
            r1.a(r2)
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bis.b(duf):dty");
    }

    static /* synthetic */ void a(bjm bjm, bjm bjm2) {
        if (bjm2.r == null) {
            bjm2.r = bjm.r;
        }
        if (bjm2.s == null) {
            bjm2.s = bjm.s;
        }
        if (bjm2.u == null) {
            bjm2.u = bjm.u;
        }
        if (bjm2.v == null) {
            bjm2.v = bjm.v;
        }
        if (bjm2.x == null) {
            bjm2.x = bjm.x;
        }
        if (bjm2.w == null) {
            bjm2.w = bjm.w;
        }
        if (bjm2.F == null) {
            bjm2.F = bjm.F;
        }
        if (bjm2.l == null) {
            bjm2.l = bjm.l;
        }
        if (bjm2.G == null) {
            bjm2.G = bjm.G;
        }
        if (bjm2.m == null) {
            bjm2.m = bjm.m;
        }
        if (bjm2.n == null) {
            bjm2.n = bjm.n;
        }
        if (bjm2.i == null) {
            bjm2.i = bjm.i;
        }
        if (bjm2.j == null) {
            bjm2.j = bjm.j;
        }
        if (bjm2.k == null) {
            bjm2.k = bjm.k;
        }
    }
}
