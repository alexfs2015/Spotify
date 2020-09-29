package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@cey
/* renamed from: bkk reason: default package */
public final class bkk extends bju implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean j;
    private boolean k;
    private WeakReference<Object> l = new WeakReference<>(null);

    public bkk(Context context, dpc dpc, String str, ecp ecp, coy coy, bki bki) {
        super(context, dpc, str, ecp, coy, bki);
    }

    private final void c(csr csr) {
        if (M()) {
            WebView n = csr.n();
            if (n != null) {
                View o = csr.o();
                if (bjl.u().a(this.e.c)) {
                    int i = this.e.e.b;
                    int i2 = this.e.e.c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    this.h = bjl.u().a(sb.toString(), n, "", "javascript", H());
                    if (this.h != null) {
                        bjl.u().a(this.h, o);
                        bjl.u().a(this.h);
                        this.k = true;
                    }
                }
            }
        }
    }

    public final void I() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* access modifiers changed from: protected */
    public final boolean V() {
        boolean z;
        bjl.e();
        if (!cmd.a(this.e.c, "android.permission.INTERNET")) {
            dpn.a().a(this.e.f, this.e.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        bjl.e();
        if (!cmd.a(this.e.c)) {
            dpn.a().a(this.e.f, this.e.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.e.f != null) {
            this.e.f.setVisibility(0);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final csr a(cla cla, bkj bkj, ckk ckk) {
        dpc dpc;
        ber ber;
        if (this.e.i.g == null && this.e.i.i) {
            bjm bjm = this.e;
            if (cla.b.y) {
                dpc = this.e.i;
            } else {
                String str = cla.b.l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    ber = new ber(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    ber = this.e.i.c();
                }
                dpc = new dpc(this.e.c, ber);
            }
            bjm.i = dpc;
        }
        return super.a(cla, bkj, ckk);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (((java.lang.Boolean) defpackage.dpn.f().a(defpackage.dsp.bU)).booleanValue() != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.ckz r5, defpackage.ckz r6) {
        /*
            r4 = this;
            boolean r0 = super.a(r5, r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            bjm r0 = r4.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0025
            boolean r5 = r4.b(r5, r6)
            if (r5 != 0) goto L_0x0025
            dnh r5 = r6.K
            if (r5 == 0) goto L_0x0021
            dnh r5 = r6.K
            com.google.android.gms.internal.ads.zzhu$zza$zzb r6 = com.google.android.gms.internal.ads.zzhu.zza.zzb.AD_FAILED_TO_LOAD
            r5.a(r6)
        L_0x0021:
            r4.a(r1)
            return r1
        L_0x0025:
            r4.b(r6, r1)
            boolean r5 = r6.l
            r0 = 0
            if (r5 == 0) goto L_0x0064
            r4.d(r6)
            defpackage.bjl.A()
            bjm r5 = r4.e
            bjn r5 = r5.f
            defpackage.cqk.a(r5, r4)
            defpackage.bjl.A()
            bjm r5 = r4.e
            bjn r5 = r5.f
            defpackage.cqk.a(r5, r4)
            boolean r5 = r6.m
            if (r5 != 0) goto L_0x0081
            bhq r5 = new bhq
            r5.<init>(r4)
            csr r1 = r6.b
            if (r1 == 0) goto L_0x0058
            csr r1 = r6.b
            cty r1 = r1.x()
            goto L_0x0059
        L_0x0058:
            r1 = r0
        L_0x0059:
            if (r1 == 0) goto L_0x0081
            bkl r2 = new bkl
            r2.<init>(r6, r5)
            r1.a(r2)
            goto L_0x0081
        L_0x0064:
            bjm r5 = r4.e
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x007e
            dsf<java.lang.Boolean> r5 = defpackage.dsp.bU
            dsn r2 = defpackage.dpn.f()
            java.lang.Object r5 = r2.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0081
        L_0x007e:
            r4.a(r6, r1)
        L_0x0081:
            csr r5 = r6.b
            if (r5 == 0) goto L_0x00a5
            csr r5 = r6.b
            ctg r5 = r5.b()
            csr r1 = r6.b
            cty r1 = r1.x()
            if (r1 == 0) goto L_0x0096
            r1.g()
        L_0x0096:
            bjm r1 = r4.e
            dry r1 = r1.x
            if (r1 == 0) goto L_0x00a5
            if (r5 == 0) goto L_0x00a5
            bjm r1 = r4.e
            dry r1 = r1.x
            r5.a(r1)
        L_0x00a5:
            bjm r5 = r4.e
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x0118
            csr r5 = r6.b
            if (r5 == 0) goto L_0x0133
            org.json.JSONObject r5 = r6.k
            if (r5 == 0) goto L_0x00be
            dkf r5 = r4.g
            bjm r0 = r4.e
            dpc r0 = r0.i
            r5.a(r0, r6)
        L_0x00be:
            csr r5 = r6.b
            android.view.View r0 = r5.o()
            dld r5 = new dld
            bjm r1 = r4.e
            android.content.Context r1 = r1.c
            r5.<init>(r1, r0)
            ckp r1 = defpackage.bjl.B()
            bjm r2 = r4.e
            android.content.Context r2 = r2.c
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L_0x00fd
            doy r1 = r6.a
            boolean r1 = a(r1)
            if (r1 == 0) goto L_0x00fd
            bjm r1 = r4.e
            java.lang.String r1 = r1.b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00fd
            cko r1 = new cko
            bjm r2 = r4.e
            android.content.Context r2 = r2.c
            bjm r3 = r4.e
            java.lang.String r3 = r3.b
            r1.<init>(r2, r3)
            r5.a(r1)
        L_0x00fd:
            boolean r1 = r6.a()
            if (r1 == 0) goto L_0x0109
            csr r1 = r6.b
            r5.a(r1)
            goto L_0x0133
        L_0x0109:
            csr r1 = r6.b
            cty r1 = r1.x()
            bhp r2 = new bhp
            r2.<init>(r5, r6)
            r1.a(r2)
            goto L_0x0133
        L_0x0118:
            bjm r5 = r4.e
            android.view.View r5 = r5.H
            if (r5 == 0) goto L_0x0133
            org.json.JSONObject r5 = r6.k
            if (r5 == 0) goto L_0x0133
            dkf r5 = r4.g
            bjm r0 = r4.e
            dpc r0 = r0.i
            bjm r1 = r4.e
            android.view.View r1 = r1.H
            r5.a(r0, r6, r1)
            bjm r5 = r4.e
            android.view.View r0 = r5.H
        L_0x0133:
            boolean r5 = r6.n
            if (r5 != 0) goto L_0x013c
            bjm r5 = r4.e
            r5.a(r0)
        L_0x013c:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkk.a(ckz, ckz):boolean");
    }

    public final void b(boolean z) {
        bwx.b("setManualImpressionsEnabled must be called from the main thread.");
        this.j = z;
    }

    public final boolean b(doy doy) {
        doy doy2 = doy;
        if (doy2.h != this.j) {
            doy doy3 = new doy(doy2.a, doy2.b, doy2.c, doy2.d, doy2.e, doy2.f, doy2.g, doy2.h || this.j, doy2.i, doy2.j, doy2.k, doy2.l, doy2.m, doy2.n, doy2.o, doy2.p, doy2.q, doy2.r);
            doy2 = doy3;
        }
        return super.b(doy2);
    }

    /* access modifiers changed from: 0000 */
    public final void d(ckz ckz) {
        if (ckz != null && !ckz.m && this.e.f != null && bjl.e().a((View) this.e.f, this.e.c) && this.e.f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(ckz == null || ckz.b == null || ckz.b.x() == null)) {
                ckz.b.x().a((cuc) null);
            }
            a(ckz, false);
            ckz.m = true;
        }
    }

    public final void onGlobalLayout() {
        d(this.e.j);
    }

    public final void onScrollChanged() {
        d(this.e.j);
    }

    public final dqz t() {
        bwx.b("getVideoController must be called from the main thread.");
        if (this.e.j == null || this.e.j.b == null) {
            return null;
        }
        return this.e.j.b.b();
    }

    /* access modifiers changed from: protected */
    public final void x() {
        csr csr = this.e.j != null ? this.e.j.b : null;
        if (!this.k && csr != null) {
            c(csr);
        }
        super.x();
    }

    private final boolean b(ckz ckz, ckz ckz2) {
        if (ckz2.n) {
            View a = bih.a(ckz2);
            if (a == null) {
                cow.a(5);
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
                    if (bjl.B().b(this.e.c)) {
                        new dld(this.e.c, a).a((dlh) new cko(this.e.c, this.e.b));
                    }
                    if (ckz2.u != null) {
                        this.e.f.setMinimumWidth(ckz2.u.f);
                        this.e.f.setMinimumHeight(ckz2.u.c);
                    }
                    a(a);
                } catch (Exception e) {
                    bjl.i().a((Throwable) e, "BannerAdManager.swapViews");
                    cow.a(5);
                    return false;
                }
            }
        } else if (!(ckz2.u == null || ckz2.b == null)) {
            ckz2.b.a(cue.a(ckz2.u));
            this.e.f.removeAllViews();
            this.e.f.setMinimumWidth(ckz2.u.f);
            this.e.f.setMinimumHeight(ckz2.u.c);
            a(ckz2.b.o());
        }
        if (this.e.f.getChildCount() > 1) {
            this.e.f.showNext();
        }
        if (ckz != null) {
            View nextView2 = this.e.f.getNextView();
            if (nextView2 instanceof csr) {
                ((csr) nextView2).destroy();
            } else if (nextView2 != null) {
                this.e.f.removeView(nextView2);
            }
            this.e.b();
        }
        this.e.f.setVisibility(0);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(ckz ckz, boolean z) {
        if (M()) {
            csr csr = ckz != null ? ckz.b : null;
            if (csr != null) {
                if (!this.k) {
                    c(csr);
                }
                if (this.h != null) {
                    csr.a("onSdkImpression", (Map<String, ?>) new dp<String,Object>());
                }
            }
        }
        super.a(ckz, z);
        if (bih.b(ckz)) {
            bhr bhr = new bhr(this);
            if (ckz != null && bih.b(ckz)) {
                csr csr2 = ckz.b;
                Object o = csr2 != null ? csr2.o() : null;
                if (o == null) {
                    cow.a(5);
                    return;
                }
                try {
                    List list = ckz.o != null ? ckz.o.r : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            edb h = ckz.p != null ? ckz.p.h() : null;
                            edf i = ckz.p != null ? ckz.p.i() : null;
                            String str = "/nativeExpressViewClicked";
                            if (list.contains("2") && h != null) {
                                h.b(cas.a(o));
                                if (!h.j()) {
                                    h.i();
                                }
                                csr2.a(str, bih.a(h, (edf) null, bhr));
                                return;
                            } else if (!list.contains("1") || i == null) {
                                cow.a(5);
                                return;
                            } else {
                                i.b(cas.a(o));
                                if (!i.h()) {
                                    i.g();
                                }
                                csr2.a(str, bih.a((edb) null, i, bhr));
                                return;
                            }
                        }
                    }
                    cow.a(5);
                } catch (RemoteException unused) {
                    cow.a(5);
                }
            }
        }
    }

    public final void L() {
        bjb bjb = this.d;
        bjb.c = false;
        bjb.b = false;
        if (!(bjb.a == null || bjb.a.c == null)) {
            bjb.a.c.remove("_ad");
        }
        bjb.a(bjb.a, 0);
    }
}
