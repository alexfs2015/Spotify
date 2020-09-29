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

@cfp
/* renamed from: bjj reason: default package */
public final class bjj extends bkg implements duv {
    cqt<duw> j;
    public cti k;
    public cti l;
    int m;
    public final String n;
    private final Object p;
    private boolean q;
    private boolean r;
    private ceu s;

    public bjj(Context context, bkz bkz, dpt dpt, String str, edg edg, cpp cpp) {
        this(context, bkz, dpt, str, edg, cpp, false);
    }

    public bjj(Context context, bkz bkz, dpt dpt, String str, edg edg, cpp cpp, boolean z) {
        super(context, dpt, str, edg, cpp, bkz);
        this.p = new Object();
        this.j = new cqt<>();
        this.m = 1;
        this.n = UUID.randomUUID().toString();
        this.q = z;
    }

    static /* synthetic */ void a(bkd bkd, bkd bkd2) {
        if (bkd2.r == null) {
            bkd2.r = bkd.r;
        }
        if (bkd2.s == null) {
            bkd2.s = bkd.s;
        }
        if (bkd2.u == null) {
            bkd2.u = bkd.u;
        }
        if (bkd2.v == null) {
            bkd2.v = bkd.v;
        }
        if (bkd2.x == null) {
            bkd2.x = bkd.x;
        }
        if (bkd2.w == null) {
            bkd2.w = bkd.w;
        }
        if (bkd2.F == null) {
            bkd2.F = bkd.F;
        }
        if (bkd2.l == null) {
            bkd2.l = bkd.l;
        }
        if (bkd2.G == null) {
            bkd2.G = bkd.G;
        }
        if (bkd2.m == null) {
            bkd2.m = bkd.m;
        }
        if (bkd2.n == null) {
            bkd2.n = bkd.n;
        }
        if (bkd2.i == null) {
            bkd2.i = bkd.i;
        }
        if (bkd2.j == null) {
            bkd2.j = bkd.j;
        }
        if (bkd2.k == null) {
            bkd2.k = bkd.k;
        }
    }

    private final void a(dui dui) {
        cmu.a.post(new bjn(this, dui));
    }

    private final void a(duk duk) {
        cmu.a.post(new bjp(this, duk));
    }

    private final void a(dup dup) {
        cmu.a.post(new bjo(this, dup));
    }

    private final boolean ab() {
        return this.e.j != null && this.e.j.N;
    }

    private final ecq ac() {
        if (this.e.j == null || !this.e.j.n) {
            return null;
        }
        return this.e.j.r;
    }

    private final void ad() {
        ceu A_ = A_();
        if (A_ != null) {
            A_.a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dup b(defpackage.duw r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof defpackage.duk
            if (r1 == 0) goto L_0x0050
            duk r0 = (defpackage.duk) r0
            dup r1 = new dup
            r3 = r1
            java.lang.String r4 = r0.a()
            java.util.List r5 = r0.b()
            java.lang.String r6 = r0.e()
            dvr r7 = r0.f()
            java.lang.String r8 = r0.g()
            java.lang.String r9 = r0.h()
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = 0
            r13 = 0
            dud r14 = r0.a
            drq r15 = r0.i()
            android.view.View r2 = r0.b
            r16 = r2
            cbi r17 = r0.c()
            java.lang.String r18 = r0.d()
            android.os.Bundle r19 = r0.n()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            cbi r2 = r0.j()
            if (r2 == 0) goto L_0x00a7
            cbi r0 = r0.j()
            java.lang.Object r0 = defpackage.cbj.a(r0)
            r2 = r0
            goto L_0x00a8
        L_0x0050:
            boolean r1 = r0 instanceof defpackage.dui
            if (r1 == 0) goto L_0x00a6
            dui r0 = (defpackage.dui) r0
            dup r18 = new dup
            r1 = r18
            java.lang.String r2 = r0.a()
            java.util.List r3 = r0.b()
            java.lang.String r4 = r0.c()
            dvr r5 = r0.d()
            java.lang.String r6 = r0.e()
            r7 = 0
            double r8 = r0.f()
            java.lang.String r10 = r0.g()
            java.lang.String r11 = r0.h()
            dud r12 = r0.a
            drq r13 = r0.i()
            android.view.View r14 = r0.b
            cbi r15 = r0.p()
            java.lang.String r16 = r0.q()
            android.os.Bundle r17 = r0.n()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            cbi r1 = r0.j()
            if (r1 == 0) goto L_0x00a2
            cbi r0 = r0.j()
            java.lang.Object r0 = defpackage.cbj.a(r0)
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
            boolean r0 = r2 instanceof defpackage.duy
            if (r0 == 0) goto L_0x00b1
            duy r2 = (defpackage.duy) r2
            r1.a(r2)
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjj.b(duw):dup");
    }

    public final ceu A_() {
        ceu ceu;
        synchronized (this.p) {
            ceu = this.s;
        }
        return ceu;
    }

    public final String D() {
        return this.e.b;
    }

    public final void I() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void J() {
        if (ab() && this.h != null) {
            cti cti = this.l;
            if (cti == null) {
                cti = this.k;
                if (cti == null) {
                    cti = null;
                }
            }
            if (cti != null) {
                cti.a("onSdkImpression", (Map<String, ?>) new HashMap<String,Object>());
            }
        }
    }

    public final void K() {
        if (this.e.j == null || this.k == null) {
            this.r = true;
            cpn.a(5);
            return;
        }
        bkc.i().b.a(this.e.i, this.e.j, this.k.o(), this.k);
        this.r = false;
    }

    public final void L() {
        this.r = false;
        if (this.e.j == null || this.k == null) {
            cpn.a(5);
        } else {
            bkc.i().b.a(this.e.j);
        }
    }

    public final dv<String, dxb> M() {
        bxo.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.e.v;
    }

    public final void N() {
        cti cti = this.k;
        if (cti != null) {
            cti.destroy();
            this.k = null;
        }
    }

    public final void O() {
        super.G();
        cti cti = this.l;
        if (cti != null) {
            cti.destroy();
            this.l = null;
        }
    }

    public final void P() {
        cti cti = this.k;
        if (cti != null && cti.b() != null && this.e.w != null && this.e.w.f != null) {
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
        clq clq = this.e.j;
        if (clq.p == null) {
            super.U();
            return;
        }
        try {
            edj edj = clq.p;
            drq drq = null;
            eds h = edj.h();
            if (h != null) {
                drq = h.m();
            } else {
                edw i = edj.i();
                if (i != null) {
                    drq = i.l();
                } else {
                    dwn n2 = edj.n();
                    if (n2 != null) {
                        drq = n2.c();
                    }
                }
            }
            if (drq != null) {
                drt h2 = drq.h();
                if (h2 != null) {
                    h2.d();
                }
            }
        } catch (RemoteException e) {
            cml.b("#007 Could not call remote method.", e);
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
    public final void a(cbi cbi) {
        Object a = cbi != null ? cbj.a(cbi) : null;
        if (a instanceof dut) {
            ((dut) a).d();
        }
        super.b(this.e.j, false);
    }

    public final void a(cdg cdg) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void a(clr clr, dtt dtt) {
        if (clr.d != null) {
            this.e.i = clr.d;
        }
        if (clr.e != -2) {
            cmu.a.post(new bjk(this, clr));
            return;
        }
        int i = clr.a.Y;
        if (i == 1) {
            this.e.I = 0;
            bkd bkd = this.e;
            bkc.d();
            bkd.h = cdt.a(this.e.c, this, clr, this.e.d, null, this.o, this, dtt);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.e.h.getClass().getName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cpn.a(3);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(clr.b.b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("ads");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    jSONArray.put(jSONArray3.get(i3));
                }
            }
            ad();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                bjl bjl = new bjl(this, i4, jSONArray, i, clr);
                arrayList.add(cms.a((Callable<T>) bjl));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    cmu.a.post(new bjm(this, (duw) ((cqi) arrayList.get(i5)).get(((Long) dqe.f().a(dtg.bz)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException unused) {
                    cpn.a(5);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException unused2) {
                    cpn.a(5);
                }
            }
        } catch (JSONException unused3) {
            cpn.a(5);
            a(0);
        }
    }

    public final void a(dty dty) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void a(dur dur) {
        cti cti = this.k;
        if (cti != null) {
            cti.a(dur);
        }
    }

    public final void a(dut dut) {
        if (this.e.j.k != null) {
            bkc.i().b.a(this.e.i, this.e.j, (dmi) new dkz(dut), (cti) null);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(clq clq, clq clq2) {
        dup dup;
        clq clq3 = clq2;
        View view = null;
        c(null);
        if (this.e.c()) {
            if (clq3.n) {
                ad();
                try {
                    edz p2 = clq3.p != null ? clq3.p.p() : null;
                    eds h = clq3.p != null ? clq3.p.h() : null;
                    edw i = clq3.p != null ? clq3.p.i() : null;
                    dwn n2 = clq3.p != null ? clq3.p.n() : null;
                    String c = c(clq2);
                    if (p2 != null && this.e.t != null) {
                        String a = p2.a();
                        List b = p2.b();
                        String c2 = p2.c();
                        dvr d = p2.d() != null ? p2.d() : null;
                        String e = p2.e();
                        String f = p2.f();
                        double g = p2.g();
                        String h2 = p2.h();
                        String i2 = p2.i();
                        drq j2 = p2.j();
                        if (p2.m() != null) {
                            view = (View) cbj.a(p2.m());
                        }
                        dup = new dup(a, b, c2, d, e, f, g, h2, i2, null, j2, view, p2.n(), c, p2.o());
                        dus dus = new dus(this.e.c, (duv) this, this.e.d, p2, (duw) dup);
                        dup.a((dut) dus);
                    } else if (h != null && this.e.t != null) {
                        String a2 = h.a();
                        List b2 = h.b();
                        String c3 = h.c();
                        dvr d2 = h.d() != null ? h.d() : null;
                        String e2 = h.e();
                        double f2 = h.f();
                        String g2 = h.g();
                        String h3 = h.h();
                        drq m2 = h.m();
                        if (h.p() != null) {
                            view = (View) cbj.a(h.p());
                        }
                        dup = new dup(a2, b2, c3, d2, e2, null, f2, g2, h3, null, m2, view, h.q(), c, h.l());
                        dus dus2 = new dus(this.e.c, (duv) this, this.e.d, h, (duw) dup);
                        dup.a((dut) dus2);
                    } else if (h != null && this.e.r != null) {
                        String a3 = h.a();
                        List b3 = h.b();
                        String c4 = h.c();
                        dvr d3 = h.d() != null ? h.d() : null;
                        String e3 = h.e();
                        double f3 = h.f();
                        String g3 = h.g();
                        String h4 = h.h();
                        Bundle l2 = h.l();
                        drq m3 = h.m();
                        if (h.p() != null) {
                            view = (View) cbj.a(h.p());
                        }
                        dui dui = new dui(a3, b3, c4, d3, e3, f3, g3, h4, null, l2, m3, view, h.q(), c);
                        dus dus3 = new dus(this.e.c, (duv) this, this.e.d, h, (duw) dui);
                        dui.a((dut) dus3);
                        a(dui);
                    } else if (i != null && this.e.t != null) {
                        String a4 = i.a();
                        List b4 = i.b();
                        String c5 = i.c();
                        dvr d4 = i.d() != null ? i.d() : null;
                        String e4 = i.e();
                        String f4 = i.f();
                        drq l3 = i.l();
                        if (i.n() != null) {
                            view = (View) cbj.a(i.n());
                        }
                        dup dup2 = new dup(a4, b4, c5, d4, e4, f4, -1.0d, null, null, null, l3, view, i.o(), c, i.j());
                        edw edw = i;
                        dup = dup2;
                        dus dus4 = new dus(this.e.c, (duv) this, this.e.d, edw, (duw) dup2);
                        dup.a((dut) dus4);
                    } else if (i != null && this.e.s != null) {
                        String a5 = i.a();
                        List b5 = i.b();
                        String c6 = i.c();
                        dvr d5 = i.d() != null ? i.d() : null;
                        String e5 = i.e();
                        String f5 = i.f();
                        Bundle j3 = i.j();
                        drq l4 = i.l();
                        if (i.n() != null) {
                            view = (View) cbj.a(i.n());
                        }
                        duk duk = new duk(a5, b5, c6, d5, e5, f5, null, j3, l4, view, i.o(), c);
                        edw edw2 = i;
                        duk duk2 = duk;
                        dus dus5 = new dus(this.e.c, (duv) this, this.e.d, edw2, (duw) duk);
                        duk2.a((dut) dus5);
                        a(duk2);
                    } else if (n2 == null || this.e.v == null || this.e.v.get(n2.l()) == null) {
                        cpn.a(5);
                        a(0);
                        return false;
                    } else {
                        cmu.a.post(new bjr(this, n2));
                    }
                    a(dup);
                } catch (RemoteException e6) {
                    cml.b("#007 Could not call remote method.", e6);
                }
            } else {
                duw duw = clq3.C;
                if (this.q) {
                    this.j.b(duw);
                } else {
                    boolean z = duw instanceof duk;
                    if (!z || this.e.t == null) {
                        if (!z || this.e.s == null) {
                            boolean z2 = duw instanceof dui;
                            if (!z2 || this.e.t == null) {
                                if (!z2 || this.e.r == null) {
                                    if ((duw instanceof dum) && this.e.v != null) {
                                        dum dum = (dum) duw;
                                        if (this.e.v.get(dum.l()) != null) {
                                            cmu.a.post(new bjq(this, dum.l(), clq3));
                                        }
                                    }
                                    cpn.a(5);
                                    a(0);
                                    return false;
                                }
                                a((dui) clq3.C);
                            }
                        } else {
                            a((duk) clq3.C);
                        }
                    }
                    a(b(clq3.C));
                }
            }
            return super.a(clq, clq2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    /* access modifiers changed from: protected */
    public final boolean a(dpp dpp, clq clq, boolean z) {
        return this.d.b;
    }

    public final boolean a(dpp dpp, dtt dtt) {
        try {
            z_();
            return super.a(dpp, dtt, this.m);
        } catch (Exception unused) {
            cpn.a(4);
            return false;
        }
    }

    public final dwy b(String str) {
        bxo.b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.e.u == null) {
            return null;
        }
        return (dwy) this.e.u.get(str);
    }

    public final void b(View view) {
        if (this.h != null) {
            bkc.u().a(this.h, view);
        }
    }

    public final void c(List<String> list) {
        bxo.b("setNativeTemplates must be called on the main UI thread.");
        this.e.F = list;
    }

    /* access modifiers changed from: protected */
    public final void d(boolean z) {
        String str;
        super.d(z);
        if (this.r) {
            if (((Boolean) dqe.f().a(dtg.ce)).booleanValue()) {
                K();
            }
        }
        if (!ab()) {
            return;
        }
        if (this.l != null || this.k != null) {
            cti cti = this.l;
            String str2 = null;
            if (cti == null) {
                cti = this.k;
                if (cti != null) {
                    str2 = "javascript";
                } else {
                    cti = null;
                    str = null;
                    if (cti.n() != null && bkc.u().a(this.e.c)) {
                        int i = this.e.e.b;
                        int i2 = this.e.e.c;
                        StringBuilder sb = new StringBuilder(23);
                        sb.append(i);
                        sb.append(".");
                        sb.append(i2);
                        this.h = bkc.u().a(sb.toString(), cti.n(), "", "javascript", str);
                        if (this.h != null) {
                            bkc.u().a(this.h);
                            return;
                        }
                        return;
                    }
                }
            }
            str = str2;
            if (cti.n() != null) {
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
            cml.a();
            cey cey = new cey(this.e.c, this, this.n, this.e.d, this.e.e);
            this.s = cey;
        }
    }
}
