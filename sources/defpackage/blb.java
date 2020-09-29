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

@cfp
/* renamed from: blb reason: default package */
public final class blb extends bkl implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean j;
    private boolean k;
    private WeakReference<Object> l = new WeakReference<>(null);

    public blb(Context context, dpt dpt, String str, edg edg, cpp cpp, bkz bkz) {
        super(context, dpt, str, edg, cpp, bkz);
    }

    private final boolean b(clq clq, clq clq2) {
        if (clq2.n) {
            View a = biy.a(clq2);
            if (a == null) {
                cpn.a(5);
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
                    if (bkc.B().b(this.e.c)) {
                        new dlu(this.e.c, a).a((dly) new clf(this.e.c, this.e.b));
                    }
                    if (clq2.u != null) {
                        this.e.f.setMinimumWidth(clq2.u.f);
                        this.e.f.setMinimumHeight(clq2.u.c);
                    }
                    a(a);
                } catch (Exception e) {
                    bkc.i().a((Throwable) e, "BannerAdManager.swapViews");
                    cpn.a(5);
                    return false;
                }
            }
        } else if (!(clq2.u == null || clq2.b == null)) {
            clq2.b.a(cuv.a(clq2.u));
            this.e.f.removeAllViews();
            this.e.f.setMinimumWidth(clq2.u.f);
            this.e.f.setMinimumHeight(clq2.u.c);
            a(clq2.b.o());
        }
        if (this.e.f.getChildCount() > 1) {
            this.e.f.showNext();
        }
        if (clq != null) {
            View nextView2 = this.e.f.getNextView();
            if (nextView2 instanceof cti) {
                ((cti) nextView2).destroy();
            } else if (nextView2 != null) {
                this.e.f.removeView(nextView2);
            }
            this.e.b();
        }
        this.e.f.setVisibility(0);
        return true;
    }

    private final void c(cti cti) {
        if (M()) {
            WebView n = cti.n();
            if (n != null) {
                View o = cti.o();
                if (bkc.u().a(this.e.c)) {
                    int i = this.e.e.b;
                    int i2 = this.e.e.c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    this.h = bkc.u().a(sb.toString(), n, "", "javascript", H());
                    if (this.h != null) {
                        bkc.u().a(this.h, o);
                        bkc.u().a(this.h);
                        this.k = true;
                    }
                }
            }
        }
    }

    public final void I() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public final void L() {
        bjs bjs = this.d;
        bjs.c = false;
        bjs.b = false;
        if (!(bjs.a == null || bjs.a.c == null)) {
            bjs.a.c.remove("_ad");
        }
        bjs.a(bjs.a, 0);
    }

    /* access modifiers changed from: protected */
    public final boolean V() {
        boolean z;
        bkc.e();
        if (!cmu.a(this.e.c, "android.permission.INTERNET")) {
            dqe.a().a(this.e.f, this.e.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        bkc.e();
        if (!cmu.a(this.e.c)) {
            dqe.a().a(this.e.f, this.e.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.e.f != null) {
            this.e.f.setVisibility(0);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final cti a(clr clr, bla bla, clb clb) {
        dpt dpt;
        bfi bfi;
        if (this.e.i.g == null && this.e.i.i) {
            bkd bkd = this.e;
            if (clr.b.y) {
                dpt = this.e.i;
            } else {
                String str = clr.b.l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    bfi = new bfi(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    bfi = this.e.i.c();
                }
                dpt = new dpt(this.e.c, bfi);
            }
            bkd.i = dpt;
        }
        return super.a(clr, bla, clb);
    }

    /* access modifiers changed from: protected */
    public final void a(clq clq, boolean z) {
        if (M()) {
            cti cti = clq != null ? clq.b : null;
            if (cti != null) {
                if (!this.k) {
                    c(cti);
                }
                if (this.h != null) {
                    cti.a("onSdkImpression", (Map<String, ?>) new dp<String,Object>());
                }
            }
        }
        super.a(clq, z);
        if (biy.b(clq)) {
            bii bii = new bii(this);
            if (clq != null && biy.b(clq)) {
                cti cti2 = clq.b;
                Object o = cti2 != null ? cti2.o() : null;
                if (o == null) {
                    cpn.a(5);
                    return;
                }
                try {
                    List list = clq.o != null ? clq.o.r : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            eds h = clq.p != null ? clq.p.h() : null;
                            edw i = clq.p != null ? clq.p.i() : null;
                            String str = "/nativeExpressViewClicked";
                            if (list.contains("2") && h != null) {
                                h.b(cbj.a(o));
                                if (!h.j()) {
                                    h.i();
                                }
                                cti2.a(str, biy.a(h, (edw) null, bii));
                                return;
                            } else if (!list.contains("1") || i == null) {
                                cpn.a(5);
                                return;
                            } else {
                                i.b(cbj.a(o));
                                if (!i.h()) {
                                    i.g();
                                }
                                cti2.a(str, biy.a((eds) null, i, bii));
                                return;
                            }
                        }
                    }
                    cpn.a(5);
                } catch (RemoteException unused) {
                    cpn.a(5);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (((java.lang.Boolean) defpackage.dqe.f().a(defpackage.dtg.bU)).booleanValue() != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.clq r5, defpackage.clq r6) {
        /*
            r4 = this;
            boolean r0 = super.a(r5, r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            bkd r0 = r4.e
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0025
            boolean r5 = r4.b(r5, r6)
            if (r5 != 0) goto L_0x0025
            dny r5 = r6.K
            if (r5 == 0) goto L_0x0021
            dny r5 = r6.K
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
            defpackage.bkc.A()
            bkd r5 = r4.e
            bke r5 = r5.f
            defpackage.crb.a(r5, r4)
            defpackage.bkc.A()
            bkd r5 = r4.e
            bke r5 = r5.f
            defpackage.crb.a(r5, r4)
            boolean r5 = r6.m
            if (r5 != 0) goto L_0x0081
            bih r5 = new bih
            r5.<init>(r4)
            cti r1 = r6.b
            if (r1 == 0) goto L_0x0058
            cti r1 = r6.b
            cup r1 = r1.x()
            goto L_0x0059
        L_0x0058:
            r1 = r0
        L_0x0059:
            if (r1 == 0) goto L_0x0081
            blc r2 = new blc
            r2.<init>(r6, r5)
            r1.a(r2)
            goto L_0x0081
        L_0x0064:
            bkd r5 = r4.e
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x007e
            dsw<java.lang.Boolean> r5 = defpackage.dtg.bU
            dte r2 = defpackage.dqe.f()
            java.lang.Object r5 = r2.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0081
        L_0x007e:
            r4.a(r6, r1)
        L_0x0081:
            cti r5 = r6.b
            if (r5 == 0) goto L_0x00a5
            cti r5 = r6.b
            ctx r5 = r5.b()
            cti r1 = r6.b
            cup r1 = r1.x()
            if (r1 == 0) goto L_0x0096
            r1.g()
        L_0x0096:
            bkd r1 = r4.e
            dsp r1 = r1.x
            if (r1 == 0) goto L_0x00a5
            if (r5 == 0) goto L_0x00a5
            bkd r1 = r4.e
            dsp r1 = r1.x
            r5.a(r1)
        L_0x00a5:
            bkd r5 = r4.e
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x0118
            cti r5 = r6.b
            if (r5 == 0) goto L_0x0133
            org.json.JSONObject r5 = r6.k
            if (r5 == 0) goto L_0x00be
            dkw r5 = r4.g
            bkd r0 = r4.e
            dpt r0 = r0.i
            r5.a(r0, r6)
        L_0x00be:
            cti r5 = r6.b
            android.view.View r0 = r5.o()
            dlu r5 = new dlu
            bkd r1 = r4.e
            android.content.Context r1 = r1.c
            r5.<init>(r1, r0)
            clg r1 = defpackage.bkc.B()
            bkd r2 = r4.e
            android.content.Context r2 = r2.c
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L_0x00fd
            dpp r1 = r6.a
            boolean r1 = a(r1)
            if (r1 == 0) goto L_0x00fd
            bkd r1 = r4.e
            java.lang.String r1 = r1.b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00fd
            clf r1 = new clf
            bkd r2 = r4.e
            android.content.Context r2 = r2.c
            bkd r3 = r4.e
            java.lang.String r3 = r3.b
            r1.<init>(r2, r3)
            r5.a(r1)
        L_0x00fd:
            boolean r1 = r6.a()
            if (r1 == 0) goto L_0x0109
            cti r1 = r6.b
            r5.a(r1)
            goto L_0x0133
        L_0x0109:
            cti r1 = r6.b
            cup r1 = r1.x()
            big r2 = new big
            r2.<init>(r5, r6)
            r1.a(r2)
            goto L_0x0133
        L_0x0118:
            bkd r5 = r4.e
            android.view.View r5 = r5.H
            if (r5 == 0) goto L_0x0133
            org.json.JSONObject r5 = r6.k
            if (r5 == 0) goto L_0x0133
            dkw r5 = r4.g
            bkd r0 = r4.e
            dpt r0 = r0.i
            bkd r1 = r4.e
            android.view.View r1 = r1.H
            r5.a(r0, r6, r1)
            bkd r5 = r4.e
            android.view.View r0 = r5.H
        L_0x0133:
            boolean r5 = r6.n
            if (r5 != 0) goto L_0x013c
            bkd r5 = r4.e
            r5.a(r0)
        L_0x013c:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blb.a(clq, clq):boolean");
    }

    public final void b(boolean z) {
        bxo.b("setManualImpressionsEnabled must be called from the main thread.");
        this.j = z;
    }

    public final boolean b(dpp dpp) {
        dpp dpp2 = dpp;
        if (dpp2.h != this.j) {
            dpp dpp3 = new dpp(dpp2.a, dpp2.b, dpp2.c, dpp2.d, dpp2.e, dpp2.f, dpp2.g, dpp2.h || this.j, dpp2.i, dpp2.j, dpp2.k, dpp2.l, dpp2.m, dpp2.n, dpp2.o, dpp2.p, dpp2.q, dpp2.r);
            dpp2 = dpp3;
        }
        return super.b(dpp2);
    }

    /* access modifiers changed from: 0000 */
    public final void d(clq clq) {
        if (clq != null && !clq.m && this.e.f != null && bkc.e().a((View) this.e.f, this.e.c) && this.e.f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(clq == null || clq.b == null || clq.b.x() == null)) {
                clq.b.x().a((cut) null);
            }
            a(clq, false);
            clq.m = true;
        }
    }

    public final void onGlobalLayout() {
        d(this.e.j);
    }

    public final void onScrollChanged() {
        d(this.e.j);
    }

    public final drq t() {
        bxo.b("getVideoController must be called from the main thread.");
        if (this.e.j == null || this.e.j.b == null) {
            return null;
        }
        return this.e.j.b.b();
    }

    /* access modifiers changed from: protected */
    public final void x() {
        cti cti = this.e.j != null ? this.e.j.b : null;
        if (!this.k && cti != null) {
            c(cti);
        }
        super.x();
    }
}
