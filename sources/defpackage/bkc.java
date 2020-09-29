package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import java.util.List;

@cey
/* renamed from: bkc reason: default package */
public final class bkc extends bjp implements due {
    private boolean j;
    /* access modifiers changed from: private */
    public ckz k;
    private boolean l = false;

    public bkc(Context context, bki bki, dpc dpc, String str, ecp ecp, coy coy) {
        super(context, dpc, str, ecp, coy, bki);
    }

    private final ebz K() {
        if (this.e.j == null || !this.e.j.n) {
            return null;
        }
        return this.e.j.r;
    }

    private static ckz a(cla cla, int i) {
        cla cla2 = cla;
        ckz ckz = new ckz(cla2.a.c, null, cla2.b.c, i, cla2.b.e, cla2.b.i, cla2.b.k, cla2.b.j, cla2.a.i, cla2.b.g, null, null, null, cla2.c, null, cla2.b.h, cla2.d, cla2.b.f, cla2.f, cla2.g, cla2.b.n, cla2.h, null, cla2.b.A, cla2.b.B, cla2.b.B, cla2.b.D, cla2.b.E, null, cla2.b.H, cla2.b.L, cla2.i, cla2.b.O, cla2.j, cla2.b.Q, cla2.b.R, cla2.b.S, cla2.b.T);
        return ckz;
    }

    private final void a(dty dty) {
        cmd.a.post(new bke(this, dty));
    }

    public final void I() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void J() {
        cow.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void N() {
        cow.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void O() {
        cow.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
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
    public final void a(car car) {
        Object a = car != null ? cas.a(car) : null;
        if (a instanceof duc) {
            ((duc) a).d();
        }
        super.b(this.e.j, false);
    }

    public final void a(dth dth) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void a(dua dua) {
        cow.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void a(duc duc) {
        cow.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* access modifiers changed from: protected */
    public final boolean a(doy doy, ckz ckz, boolean z) {
        return false;
    }

    public final dwh b(String str) {
        bwx.b("getOnCustomClickListener must be called on the main UI thread.");
        return (dwh) this.e.u.get(str);
    }

    public final void b(View view) {
        cow.b("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void b(boolean z) {
        bwx.b("setManualImpressionsEnabled must be called from the main thread.");
        this.j = z;
    }

    public final boolean b(doy doy) {
        doy doy2 = doy;
        if (this.e.A != null && this.e.A.size() == 1 && ((Integer) this.e.A.get(0)).intValue() == 2) {
            clu.a("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            a(0);
            return false;
        } else if (this.e.z == null) {
            return super.b(doy);
        } else {
            if (doy2.h != this.j) {
                doy doy3 = new doy(doy2.a, doy2.b, doy2.c, doy2.d, doy2.e, doy2.f, doy2.g, doy2.h || this.j, doy2.i, doy2.j, doy2.k, doy2.l, doy2.m, doy2.n, doy2.o, doy2.p, doy2.q, doy2.r);
                doy2 = doy3;
            }
            return super.b(doy2);
        }
    }

    public final void c(List<String> list) {
        bwx.b("setNativeTemplates must be called on the main UI thread.");
        this.e.F = list;
    }

    public final void d(List<Integer> list) {
        bwx.b("setAllowedAdTypes must be called on the main UI thread.");
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

    public final dqz t() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void x() {
        super.x();
        ckz ckz = this.e.j;
        if (!(ckz == null || ckz.o == null || !ckz.o.a() || this.e.z == null)) {
            try {
                this.e.z.a(this, cas.a(this.e.c));
                super.b(this.e.j, false);
            } catch (RemoteException e) {
                clu.b("#007 Could not call remote method.", e);
            }
        }
    }

    public final void a(cla cla, dtc dtc) {
        this.k = null;
        if (cla.e != -2) {
            this.k = a(cla, cla.e);
        } else if (!cla.b.g) {
            cow.a(5);
            this.k = a(cla, 0);
        }
        if (this.k != null) {
            cmd.a.post(new bkd(this));
            return;
        }
        if (cla.d != null) {
            this.e.i = cla.d;
        }
        this.e.I = 0;
        bjm bjm = this.e;
        bjl.d();
        bjm.h = cdc.a(this.e.c, this, cla, this.e.d, null, this.o, this, dtc);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.ckz r5, defpackage.ckz r6) {
        /*
            r4 = this;
            bjm r0 = r4.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0096
            boolean r0 = r6.n
            r1 = 5
            r2 = 0
            if (r0 != 0) goto L_0x0015
            r4.a(r2)
            defpackage.cow.a(r1)
            return r2
        L_0x0015:
            eby r0 = r6.o
            r3 = 1
            if (r0 == 0) goto L_0x0066
            eby r0 = r6.o
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0066
            bjm r0 = r4.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x003a
            bjm r0 = r4.e
            bjn r0 = r0.f
            if (r0 == 0) goto L_0x003a
            bjm r0 = r4.e
            bjn r0 = r0.f
            cmw r0 = r0.a
            java.lang.String r1 = r6.A
            r0.b = r1
        L_0x003a:
            boolean r0 = super.a(r5, r6)
            if (r0 != 0) goto L_0x0042
        L_0x0040:
            r5 = 0
            goto L_0x0060
        L_0x0042:
            bjm r0 = r4.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0054
            boolean r5 = r4.c(r5, r6)
            if (r5 != 0) goto L_0x0054
            r4.a(r2)
            goto L_0x0040
        L_0x0054:
            bjm r5 = r4.e
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
            eby r0 = r6.o
            if (r0 == 0) goto L_0x008f
            eby r0 = r6.o
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
            defpackage.cow.a(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkc.a(ckz, ckz):boolean");
    }

    private final boolean b(ckz ckz, ckz ckz2) {
        Handler handler;
        Runnable bkg;
        dty dty;
        ckz ckz3 = ckz2;
        View view = null;
        c(null);
        if (!this.e.c()) {
            cow.a(5);
            a(0);
            return false;
        }
        try {
            edi p = ckz3.p != null ? ckz3.p.p() : null;
            edb h = ckz3.p != null ? ckz3.p.h() : null;
            edf i = ckz3.p != null ? ckz3.p.i() : null;
            dvw n = ckz3.p != null ? ckz3.p.n() : null;
            String c = c(ckz2);
            if (p != null && this.e.t != null) {
                String a = p.a();
                List b = p.b();
                String c2 = p.c();
                dva d = p.d() != null ? p.d() : null;
                String e = p.e();
                String f = p.f();
                double g = p.g();
                String h2 = p.h();
                String i2 = p.i();
                dqz j2 = p.j();
                if (p.m() != null) {
                    view = (View) cas.a(p.m());
                }
                dty = new dty(a, b, c2, d, e, f, g, h2, i2, null, j2, view, p.n(), c, p.o());
                dub dub = new dub(this.e.c, (due) this, this.e.d, p, (duf) dty);
                dty.a((duc) dub);
            } else if (h == null || this.e.t == null) {
                if (h != null && this.e.r != null) {
                    String a2 = h.a();
                    List b2 = h.b();
                    String c3 = h.c();
                    dva d2 = h.d() != null ? h.d() : null;
                    String e2 = h.e();
                    double f2 = h.f();
                    String g2 = h.g();
                    String h3 = h.h();
                    Bundle l2 = h.l();
                    dqz m = h.m();
                    if (h.p() != null) {
                        view = (View) cas.a(h.p());
                    }
                    dtr dtr = new dtr(a2, b2, c3, d2, e2, f2, g2, h3, null, l2, m, view, h.q(), c);
                    dub dub2 = new dub(this.e.c, (due) this, this.e.d, h, (duf) dtr);
                    dtr.a((duc) dub2);
                    handler = cmd.a;
                    bkg = new bkf(this, dtr);
                } else if (i != null && this.e.t != null) {
                    String a3 = i.a();
                    List b3 = i.b();
                    String c4 = i.c();
                    dva d3 = i.d() != null ? i.d() : null;
                    String e3 = i.e();
                    String f3 = i.f();
                    dqz l3 = i.l();
                    if (i.n() != null) {
                        view = (View) cas.a(i.n());
                    }
                    dty dty2 = new dty(a3, b3, c4, d3, e3, f3, -1.0d, null, null, null, l3, view, i.o(), c, i.j());
                    edf edf = i;
                    dty = dty2;
                    dub dub3 = new dub(this.e.c, (due) this, this.e.d, edf, (duf) dty2);
                    dty.a((duc) dub3);
                } else if (i != null && this.e.s != null) {
                    String a4 = i.a();
                    List b4 = i.b();
                    String c5 = i.c();
                    dva d4 = i.d() != null ? i.d() : null;
                    String e4 = i.e();
                    String f4 = i.f();
                    Bundle j3 = i.j();
                    dqz l4 = i.l();
                    if (i.n() != null) {
                        view = (View) cas.a(i.n());
                    }
                    dtt dtt = new dtt(a4, b4, c5, d4, e4, f4, null, j3, l4, view, i.o(), c);
                    edf edf2 = i;
                    dtt dtt2 = dtt;
                    dub dub4 = new dub(this.e.c, (due) this, this.e.d, edf2, (duf) dtt);
                    dtt2.a((duc) dub4);
                    handler = cmd.a;
                    bkg = new bkg(this, dtt2);
                } else if (n == null || this.e.v == null || this.e.v.get(n.l()) == null) {
                    cow.a(5);
                    a(0);
                    return false;
                } else {
                    cmd.a.post(new bkh(this, n));
                    return super.a(ckz, ckz2);
                }
                handler.post(bkg);
                return super.a(ckz, ckz2);
            } else {
                String a5 = h.a();
                List b5 = h.b();
                String c6 = h.c();
                dva d5 = h.d() != null ? h.d() : null;
                String e5 = h.e();
                double f5 = h.f();
                String g3 = h.g();
                String h4 = h.h();
                dqz m2 = h.m();
                if (h.p() != null) {
                    view = (View) cas.a(h.p());
                }
                dty = new dty(a5, b5, c6, d5, e5, null, f5, g3, h4, null, m2, view, h.q(), c, h.l());
                dub dub5 = new dub(this.e.c, (due) this, this.e.d, h, (duf) dty);
                dty.a((duc) dub5);
            }
            a(dty);
            return super.a(ckz, ckz2);
        } catch (RemoteException e6) {
            clu.b("#007 Could not call remote method.", e6);
            a(0);
            return false;
        }
    }

    private final boolean c(ckz ckz, ckz ckz2) {
        View a = bih.a(ckz2);
        if (a == null) {
            return false;
        }
        View nextView = this.e.f.getNextView();
        if (nextView != null) {
            if (nextView instanceof csr) {
                ((csr) nextView).destroy();
            }
            this.e.f.removeView(nextView);
        }
        if (!bih.b(ckz2)) {
            try {
                a(a);
            } catch (Throwable th) {
                bjl.i().a(th, "AdLoaderManager.swapBannerViews");
                cow.a(5);
                return false;
            }
        }
        if (this.e.f.getChildCount() > 1) {
            this.e.f.showNext();
        }
        if (ckz != null) {
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
}
