package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import java.util.List;

@cfp
/* renamed from: bkt reason: default package */
public final class bkt extends bkg implements duv {
    private boolean j;
    /* access modifiers changed from: private */
    public clq k;
    private boolean l = false;

    public bkt(Context context, bkz bkz, dpt dpt, String str, edg edg, cpp cpp) {
        super(context, dpt, str, edg, cpp, bkz);
    }

    private final ecq K() {
        if (this.e.j == null || !this.e.j.n) {
            return null;
        }
        return this.e.j.r;
    }

    private static clq a(clr clr, int i) {
        clr clr2 = clr;
        clq clq = new clq(clr2.a.c, null, clr2.b.c, i, clr2.b.e, clr2.b.i, clr2.b.k, clr2.b.j, clr2.a.i, clr2.b.g, null, null, null, clr2.c, null, clr2.b.h, clr2.d, clr2.b.f, clr2.f, clr2.g, clr2.b.n, clr2.h, null, clr2.b.A, clr2.b.B, clr2.b.B, clr2.b.D, clr2.b.E, null, clr2.b.H, clr2.b.L, clr2.i, clr2.b.O, clr2.j, clr2.b.Q, clr2.b.R, clr2.b.S, clr2.b.T);
        return clq;
    }

    private final void a(dup dup) {
        cmu.a.post(new bkv(this, dup));
    }

    private final boolean b(clq clq, clq clq2) {
        Handler handler;
        Runnable bkx;
        dup dup;
        clq clq3 = clq2;
        View view = null;
        c(null);
        if (!this.e.c()) {
            cpn.a(5);
            a(0);
            return false;
        }
        try {
            edz p = clq3.p != null ? clq3.p.p() : null;
            eds h = clq3.p != null ? clq3.p.h() : null;
            edw i = clq3.p != null ? clq3.p.i() : null;
            dwn n = clq3.p != null ? clq3.p.n() : null;
            String c = c(clq2);
            if (p != null && this.e.t != null) {
                String a = p.a();
                List b = p.b();
                String c2 = p.c();
                dvr d = p.d() != null ? p.d() : null;
                String e = p.e();
                String f = p.f();
                double g = p.g();
                String h2 = p.h();
                String i2 = p.i();
                drq j2 = p.j();
                if (p.m() != null) {
                    view = (View) cbj.a(p.m());
                }
                dup = new dup(a, b, c2, d, e, f, g, h2, i2, null, j2, view, p.n(), c, p.o());
                dus dus = new dus(this.e.c, (duv) this, this.e.d, p, (duw) dup);
                dup.a((dut) dus);
            } else if (h == null || this.e.t == null) {
                if (h != null && this.e.r != null) {
                    String a2 = h.a();
                    List b2 = h.b();
                    String c3 = h.c();
                    dvr d2 = h.d() != null ? h.d() : null;
                    String e2 = h.e();
                    double f2 = h.f();
                    String g2 = h.g();
                    String h3 = h.h();
                    Bundle l2 = h.l();
                    drq m = h.m();
                    if (h.p() != null) {
                        view = (View) cbj.a(h.p());
                    }
                    dui dui = new dui(a2, b2, c3, d2, e2, f2, g2, h3, null, l2, m, view, h.q(), c);
                    dus dus2 = new dus(this.e.c, (duv) this, this.e.d, h, (duw) dui);
                    dui.a((dut) dus2);
                    handler = cmu.a;
                    bkx = new bkw(this, dui);
                } else if (i != null && this.e.t != null) {
                    String a3 = i.a();
                    List b3 = i.b();
                    String c4 = i.c();
                    dvr d3 = i.d() != null ? i.d() : null;
                    String e3 = i.e();
                    String f3 = i.f();
                    drq l3 = i.l();
                    if (i.n() != null) {
                        view = (View) cbj.a(i.n());
                    }
                    dup dup2 = new dup(a3, b3, c4, d3, e3, f3, -1.0d, null, null, null, l3, view, i.o(), c, i.j());
                    edw edw = i;
                    dup = dup2;
                    dus dus3 = new dus(this.e.c, (duv) this, this.e.d, edw, (duw) dup2);
                    dup.a((dut) dus3);
                } else if (i != null && this.e.s != null) {
                    String a4 = i.a();
                    List b4 = i.b();
                    String c5 = i.c();
                    dvr d4 = i.d() != null ? i.d() : null;
                    String e4 = i.e();
                    String f4 = i.f();
                    Bundle j3 = i.j();
                    drq l4 = i.l();
                    if (i.n() != null) {
                        view = (View) cbj.a(i.n());
                    }
                    duk duk = new duk(a4, b4, c5, d4, e4, f4, null, j3, l4, view, i.o(), c);
                    edw edw2 = i;
                    duk duk2 = duk;
                    dus dus4 = new dus(this.e.c, (duv) this, this.e.d, edw2, (duw) duk);
                    duk2.a((dut) dus4);
                    handler = cmu.a;
                    bkx = new bkx(this, duk2);
                } else if (n == null || this.e.v == null || this.e.v.get(n.l()) == null) {
                    cpn.a(5);
                    a(0);
                    return false;
                } else {
                    cmu.a.post(new bky(this, n));
                    return super.a(clq, clq2);
                }
                handler.post(bkx);
                return super.a(clq, clq2);
            } else {
                String a5 = h.a();
                List b5 = h.b();
                String c6 = h.c();
                dvr d5 = h.d() != null ? h.d() : null;
                String e5 = h.e();
                double f5 = h.f();
                String g3 = h.g();
                String h4 = h.h();
                drq m2 = h.m();
                if (h.p() != null) {
                    view = (View) cbj.a(h.p());
                }
                dup = new dup(a5, b5, c6, d5, e5, null, f5, g3, h4, null, m2, view, h.q(), c, h.l());
                dus dus5 = new dus(this.e.c, (duv) this, this.e.d, h, (duw) dup);
                dup.a((dut) dus5);
            }
            a(dup);
            return super.a(clq, clq2);
        } catch (RemoteException e6) {
            cml.b("#007 Could not call remote method.", e6);
            a(0);
            return false;
        }
    }

    private final boolean c(clq clq, clq clq2) {
        View a = biy.a(clq2);
        if (a == null) {
            return false;
        }
        View nextView = this.e.f.getNextView();
        if (nextView != null) {
            if (nextView instanceof cti) {
                ((cti) nextView).destroy();
            }
            this.e.f.removeView(nextView);
        }
        if (!biy.b(clq2)) {
            try {
                a(a);
            } catch (Throwable th) {
                bkc.i().a(th, "AdLoaderManager.swapBannerViews");
                cpn.a(5);
                return false;
            }
        }
        if (this.e.f.getChildCount() > 1) {
            this.e.f.showNext();
        }
        if (clq != null) {
            View nextView2 = this.e.f.getNextView();
            if (nextView2 != null) {
                this.e.f.removeView(nextView2);
            }
            this.e.b();
        }
        this.e.f.setMinimumWidth(l().f);
        this.e.f.setMinimumHeight(l().c);
        this.e.f.requestLayout();
        this.e.f.setVisibility(0);
        return true;
    }

    public final void I() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void J() {
        cpn.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void N() {
        cpn.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void O() {
        cpn.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final boolean Q() {
        if (K() != null) {
            return K().p;
        }
        return false;
    }

    public final boolean R() {
        if (K() != null) {
            return K().q;
        }
        return false;
    }

    public final void S() {
        if (this.e.j != null) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.j.q) && this.e.j.o != null && this.e.j.o.b()) {
                z();
                return;
            }
        }
        super.S();
    }

    public final void T() {
        if (this.e.j != null) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.j.q) && this.e.j.o != null && this.e.j.o.b()) {
                y();
                return;
            }
        }
        super.T();
    }

    /* access modifiers changed from: protected */
    public final void a(cbi cbi) {
        Object a = cbi != null ? cbj.a(cbi) : null;
        if (a instanceof dut) {
            ((dut) a).d();
        }
        super.b(this.e.j, false);
    }

    public final void a(clr clr, dtt dtt) {
        this.k = null;
        if (clr.e != -2) {
            this.k = a(clr, clr.e);
        } else if (!clr.b.g) {
            cpn.a(5);
            this.k = a(clr, 0);
        }
        if (this.k != null) {
            cmu.a.post(new bku(this));
            return;
        }
        if (clr.d != null) {
            this.e.i = clr.d;
        }
        this.e.I = 0;
        bkd bkd = this.e;
        bkc.d();
        bkd.h = cdt.a(this.e.c, this, clr, this.e.d, null, this.o, this, dtt);
    }

    public final void a(dty dty) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void a(dur dur) {
        cpn.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void a(dut dut) {
        cpn.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.clq r5, defpackage.clq r6) {
        /*
            r4 = this;
            bkd r0 = r4.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0096
            boolean r0 = r6.n
            r1 = 5
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r4.a(r2)
            defpackage.cpn.a(r1)
            return r2
        L_0x0015:
            ecp r0 = r6.o
            r3 = 1
            if (r0 == 0) goto L_0x0066
            ecp r0 = r6.o
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0066
            bkd r0 = r4.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x003a
            bkd r0 = r4.e
            bke r0 = r0.f
            if (r0 == 0) goto L_0x003a
            bkd r0 = r4.e
            bke r0 = r0.f
            cnn r0 = r0.a
            java.lang.String r1 = r6.A
            r0.b = r1
        L_0x003a:
            boolean r0 = super.a(r5, r6)
            if (r0 != 0) goto L_0x0042
        L_0x0040:
            r5 = 0
            goto L_0x0060
        L_0x0042:
            bkd r0 = r4.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0054
            boolean r5 = r4.c(r5, r6)
            if (r5 != 0) goto L_0x0054
            r4.a(r2)
            goto L_0x0040
        L_0x0054:
            bkd r5 = r4.e
            boolean r5 = r5.d()
            if (r5 != 0) goto L_0x005f
            super.a(r6, r2)
        L_0x005f:
            r5 = 1
        L_0x0060:
            if (r5 != 0) goto L_0x0063
            return r2
        L_0x0063:
            r4.l = r3
            goto L_0x0079
        L_0x0066:
            ecp r0 = r6.o
            if (r0 == 0) goto L_0x008f
            ecp r0 = r6.o
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x008f
            boolean r5 = r4.b(r5, r6)
            if (r5 != 0) goto L_0x0079
            return r2
        L_0x0079:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r3]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r2] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.d(r5)
            return r3
        L_0x008f:
            r4.a(r2)
            defpackage.cpn.a(r1)
            return r2
        L_0x0096:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            goto L_0x009f
        L_0x009e:
            throw r5
        L_0x009f:
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkt.a(clq, clq):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean a(dpp dpp, clq clq, boolean z) {
        return false;
    }

    public final dwy b(String str) {
        bxo.b("getOnCustomClickListener must be called on the main UI thread.");
        return (dwy) this.e.u.get(str);
    }

    public final void b(View view) {
        cpn.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void b(boolean z) {
        bxo.b("setManualImpressionsEnabled must be called from the main thread.");
        this.j = z;
    }

    public final boolean b(dpp dpp) {
        dpp dpp2 = dpp;
        if (this.e.A != null && this.e.A.size() == 1 && ((Integer) this.e.A.get(0)).intValue() == 2) {
            cml.a("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            a(0);
            return false;
        } else if (this.e.z == null) {
            return super.b(dpp);
        } else {
            if (dpp2.h != this.j) {
                dpp dpp3 = new dpp(dpp2.a, dpp2.b, dpp2.c, dpp2.d, dpp2.e, dpp2.f, dpp2.g, dpp2.h || this.j, dpp2.i, dpp2.j, dpp2.k, dpp2.l, dpp2.m, dpp2.n, dpp2.o, dpp2.p, dpp2.q, dpp2.r);
                dpp2 = dpp3;
            }
            return super.b(dpp2);
        }
    }

    public final void c(List<String> list) {
        bxo.b("setNativeTemplates must be called on the main UI thread.");
        this.e.F = list;
    }

    public final void d(List<Integer> list) {
        bxo.b("setAllowedAdTypes must be called on the main UI thread.");
        this.e.A = list;
    }

    public final void o() {
        if (this.l) {
            super.o();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void p() {
        if (this.l) {
            super.p();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final drq t() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void x() {
        super.x();
        clq clq = this.e.j;
        if (!(clq == null || clq.o == null || !clq.o.a() || this.e.z == null)) {
            try {
                this.e.z.a(this, cbj.a(this.e.c));
                super.b(this.e.j, false);
            } catch (RemoteException e) {
                cml.b("#007 Could not call remote method.", e);
            }
        }
    }
}
