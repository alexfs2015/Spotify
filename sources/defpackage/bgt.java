package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzg;
import java.util.Collections;

@cey
/* renamed from: bgt reason: default package */
public class bgt extends ccj implements bhl {
    private static final int e = Color.argb(0, 0, 0, 0);
    protected final Activity a;
    AdOverlayInfoParcel b;
    csr c;
    int d = 0;
    private bgx f;
    private bhd g;
    private boolean h = false;
    private FrameLayout i;
    private CustomViewCallback j;
    private boolean k = false;
    private boolean l = false;
    private bgw m;
    private boolean n = false;
    private final Object o = new Object();
    private Runnable p;
    private boolean q;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private boolean u = true;

    public bgt(Activity activity) {
        this.a = activity;
    }

    private final void a(boolean z) {
        int intValue = ((Integer) dpn.f().a(dsp.cY)).intValue();
        bhe bhe = new bhe();
        bhe.e = 50;
        bhe.a = z ? intValue : 0;
        bhe.b = z ? 0 : intValue;
        bhe.c = 0;
        bhe.d = intValue;
        this.g = new bhd(this.a, bhe, this);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        a(z, this.b.g);
        this.m.addView(this.g, layoutParams);
    }

    private final void r() {
        if (this.a.isFinishing() && !this.s) {
            this.s = true;
            csr csr = this.c;
            if (csr != null) {
                csr.a(this.d);
                synchronized (this.o) {
                    if (!this.q && this.c.H()) {
                        this.p = new bgv(this);
                        cmd.a.postDelayed(this.p, ((Long) dpn.f().a(dsp.aN)).longValue());
                        return;
                    }
                }
            }
            n();
        }
    }

    private final void s() {
        this.c.q();
    }

    public final void a() {
        this.d = 2;
        this.a.finish();
    }

    public final void a(int i2) {
        if (this.a.getApplicationInfo().targetSdkVersion >= ((Integer) dpn.f().a(dsp.dl)).intValue()) {
            if (this.a.getApplicationInfo().targetSdkVersion <= ((Integer) dpn.f().a(dsp.dm)).intValue()) {
                if (VERSION.SDK_INT >= ((Integer) dpn.f().a(dsp.dn)).intValue()) {
                    if (VERSION.SDK_INT <= ((Integer) dpn.f().a(dsp.f8do)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.a.setRequestedOrientation(i2);
    }

    public final void a(int i2, int i3, Intent intent) {
    }

    public final void a(View view, CustomViewCallback customViewCallback) {
        this.i = new FrameLayout(this.a);
        this.i.setBackgroundColor(-16777216);
        this.i.addView(view, -1, -1);
        this.a.setContentView(this.i);
        this.r = true;
        this.j = customViewCallback;
        this.h = true;
    }

    public final void a(car car) {
        if (((Boolean) dpn.f().a(dsp.cW)).booleanValue() && bzo.h()) {
            Configuration configuration = (Configuration) cas.a(car);
            bjl.e();
            if (cmd.a(this.a, configuration)) {
                this.a.getWindow().addFlags(1024);
                this.a.getWindow().clearFlags(2048);
                return;
            }
            this.a.getWindow().addFlags(2048);
            this.a.getWindow().clearFlags(1024);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, boolean r8) {
        /*
            r6 = this;
            dsf<java.lang.Boolean> r0 = defpackage.dsp.aP
            dsn r1 = defpackage.dpn.f()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.b
            if (r0 == 0) goto L_0x0026
            bif r0 = r0.o
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.b
            bif r0 = r0.o
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            dsf<java.lang.Boolean> r3 = defpackage.dsp.aQ
            dsn r4 = defpackage.dpn.f()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.b
            if (r3 == 0) goto L_0x004b
            bif r3 = r3.o
            if (r3 == 0) goto L_0x004b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.b
            bif r3 = r3.o
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r7 == 0) goto L_0x0062
            if (r8 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0062
            if (r3 != 0) goto L_0x0062
            cce r7 = new cce
            csr r4 = r6.c
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.a(r4)
        L_0x0062:
            bhd r7 = r6.g
            if (r7 == 0) goto L_0x0071
            if (r3 != 0) goto L_0x006e
            if (r8 == 0) goto L_0x006d
            if (r0 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            r7.a(r1)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgt.a(boolean, boolean):void");
    }

    public final void b() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && this.h) {
            a(adOverlayInfoParcel.j);
        }
        if (this.i != null) {
            this.a.setContentView(this.m);
            this.r = true;
            this.i.removeAllViews();
            this.i = null;
        }
        CustomViewCallback customViewCallback = this.j;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.j = null;
        }
        this.h = false;
    }

    public final void b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.k);
    }

    public final void c() {
        this.d = 1;
        this.a.finish();
    }

    public final void d() {
        this.d = 0;
    }

    public final boolean e() {
        this.d = 0;
        csr csr = this.c;
        if (csr == null) {
            return true;
        }
        boolean F = csr.F();
        if (!F) {
            this.c.a("onbackblocked", Collections.emptyMap());
        }
        return F;
    }

    public final void f() {
    }

    public final void i() {
        b();
        if (this.b.c != null) {
            this.b.c.d();
        }
        if (!((Boolean) dpn.f().a(dsp.cX)).booleanValue() && this.c != null && (!this.a.isFinishing() || this.f == null)) {
            bjl.g();
            cmj.a(this.c);
        }
        r();
    }

    public final void j() {
        if (((Boolean) dpn.f().a(dsp.cX)).booleanValue() && this.c != null && (!this.a.isFinishing() || this.f == null)) {
            bjl.g();
            cmj.a(this.c);
        }
        r();
    }

    public final void k() {
        csr csr = this.c;
        if (csr != null) {
            this.m.removeView(csr.o());
        }
        r();
    }

    public final void l() {
        this.r = true;
    }

    public final void m() {
        this.m.removeView(this.g);
        a(true);
    }

    /* access modifiers changed from: 0000 */
    public final void n() {
        if (!this.t) {
            this.t = true;
            csr csr = this.c;
            if (csr != null) {
                this.m.removeView(csr.o());
                bgx bgx = this.f;
                if (bgx != null) {
                    this.c.a(bgx.d);
                    this.c.b(false);
                    this.f.c.addView(this.c.o(), this.f.a, this.f.b);
                    this.f = null;
                } else if (this.a.getApplicationContext() != null) {
                    this.c.a(this.a.getApplicationContext());
                }
                this.c = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.b;
            if (!(adOverlayInfoParcel == null || adOverlayInfoParcel.c == null)) {
                this.b.c.I_();
            }
        }
    }

    public final void o() {
        if (this.n) {
            this.n = false;
            s();
        }
    }

    public final void p() {
        this.m.a = true;
    }

    public final void q() {
        synchronized (this.o) {
            this.q = true;
            if (this.p != null) {
                cmd.a.removeCallbacks(this.p);
                cmd.a.post(this.p);
            }
        }
    }

    public void a(Bundle bundle) {
        this.a.requestWindowFeature(1);
        this.k = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.b = AdOverlayInfoParcel.a(this.a.getIntent());
            if (this.b != null) {
                if (this.b.m.c > 7500000) {
                    this.d = 3;
                }
                if (this.a.getIntent() != null) {
                    this.u = this.a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.b.o != null) {
                    this.l = this.b.o.a;
                } else {
                    this.l = false;
                }
                if (((Boolean) dpn.f().a(dsp.bP)).booleanValue() && this.l && this.b.o.e != -1) {
                    new bgy(this, 0).h();
                }
                if (bundle == null) {
                    if (this.b.c != null && this.u) {
                        this.b.c.g();
                    }
                    if (!(this.b.k == 1 || this.b.b == null)) {
                        this.b.b.e();
                    }
                }
                this.m = new bgw(this.a, this.b.n, this.b.m.a);
                this.m.setId(1000);
                int i2 = this.b.k;
                if (i2 == 1) {
                    b(false);
                } else if (i2 == 2) {
                    this.f = new bgx(this.b.d);
                    b(false);
                } else if (i2 == 3) {
                    b(true);
                } else {
                    throw new zzg("Could not determine ad overlay type.");
                }
            } else {
                throw new zzg("Could not get info for ad overlay.");
            }
        } catch (zzg e2) {
            e2.getMessage();
            cow.a(5);
            this.d = 3;
            this.a.finish();
        }
    }

    public final void g() {
        if (((Boolean) dpn.f().a(dsp.cX)).booleanValue()) {
            csr csr = this.c;
            if (csr == null || csr.D()) {
                cow.a(5);
            } else {
                bjl.g();
                cmj.b(this.c);
            }
        }
    }

    public final void h() {
        if (this.b.c != null) {
            this.b.c.f();
        }
        if (!((Boolean) dpn.f().a(dsp.cX)).booleanValue()) {
            csr csr = this.c;
            if (csr == null || csr.D()) {
                cow.a(5);
            } else {
                bjl.g();
                cmj.b(this.c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        if (r1.a.getResources().getConfiguration().orientation == 1) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
        if (r1.a.getResources().getConfiguration().orientation == 2) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012f A[SYNTHETIC, Splitter:B:58:0x012f] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0230  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(boolean r18) {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.r
            r2 = 1
            if (r0 != 0) goto L_0x000c
            android.app.Activity r0 = r1.a
            r0.requestWindowFeature(r2)
        L_0x000c:
            android.app.Activity r0 = r1.a
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0259
            boolean r3 = defpackage.bzo.h()
            if (r3 == 0) goto L_0x003e
            dsf<java.lang.Boolean> r3 = defpackage.dsp.cW
            dsn r4 = defpackage.dpn.f()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x003e
            defpackage.bjl.e()
            android.app.Activity r3 = r1.a
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            boolean r3 = defpackage.cmd.a(r3, r4)
            goto L_0x003f
        L_0x003e:
            r3 = 1
        L_0x003f:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.b
            bif r4 = r4.o
            r5 = 0
            if (r4 == 0) goto L_0x0050
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.b
            bif r4 = r4.o
            boolean r4 = r4.b
            if (r4 == 0) goto L_0x0050
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            boolean r6 = r1.l
            if (r6 == 0) goto L_0x0057
            if (r4 == 0) goto L_0x008d
        L_0x0057:
            if (r3 == 0) goto L_0x008d
            r3 = 1024(0x400, float:1.435E-42)
            r0.setFlags(r3, r3)
            dsf<java.lang.Boolean> r3 = defpackage.dsp.aO
            dsn r4 = defpackage.dpn.f()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x008d
            boolean r3 = defpackage.bzo.e()
            if (r3 == 0) goto L_0x008d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.b
            bif r3 = r3.o
            if (r3 == 0) goto L_0x008d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.b
            bif r3 = r3.o
            boolean r3 = r3.f
            if (r3 == 0) goto L_0x008d
            android.view.View r3 = r0.getDecorView()
            r4 = 4098(0x1002, float:5.743E-42)
            r3.setSystemUiVisibility(r4)
        L_0x008d:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.b
            csr r3 = r3.d
            r4 = 0
            if (r3 == 0) goto L_0x009d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.b
            csr r3 = r3.d
            cty r3 = r3.x()
            goto L_0x009e
        L_0x009d:
            r3 = r4
        L_0x009e:
            if (r3 == 0) goto L_0x00a5
            boolean r3 = r3.b()
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            r1.n = r5
            if (r3 == 0) goto L_0x00e8
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.b
            int r6 = r6.j
            cmj r7 = defpackage.bjl.g()
            int r7 = r7.a()
            if (r6 != r7) goto L_0x00ca
            android.app.Activity r6 = r1.a
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            if (r6 != r2) goto L_0x00c7
        L_0x00c6:
            r5 = 1
        L_0x00c7:
            r1.n = r5
            goto L_0x00e8
        L_0x00ca:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.b
            int r6 = r6.j
            cmj r7 = defpackage.bjl.g()
            int r7 = r7.b()
            if (r6 != r7) goto L_0x00e8
            android.app.Activity r6 = r1.a
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 != r7) goto L_0x00c7
            goto L_0x00c6
        L_0x00e8:
            boolean r5 = r1.n
            r6 = 46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Delay onShow to next orientation change: "
            r7.append(r6)
            r7.append(r5)
            r7.toString()
            r5 = 3
            defpackage.cow.a(r5)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.b
            int r6 = r6.j
            r1.a(r6)
            cmj r6 = defpackage.bjl.g()
            boolean r0 = r6.a(r0)
            if (r0 == 0) goto L_0x0114
            defpackage.cow.a(r5)
        L_0x0114:
            boolean r0 = r1.l
            if (r0 != 0) goto L_0x011d
            bgw r0 = r1.m
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0121
        L_0x011d:
            bgw r0 = r1.m
            int r5 = e
        L_0x0121:
            r0.setBackgroundColor(r5)
            android.app.Activity r0 = r1.a
            bgw r5 = r1.m
            r0.setContentView(r5)
            r1.r = r2
            if (r18 == 0) goto L_0x0203
            defpackage.bjl.f()     // Catch:{ Exception -> 0x01f5 }
            android.app.Activity r6 = r1.a     // Catch:{ Exception -> 0x01f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b     // Catch:{ Exception -> 0x01f5 }
            csr r0 = r0.d     // Catch:{ Exception -> 0x01f5 }
            if (r0 == 0) goto L_0x0144
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b     // Catch:{ Exception -> 0x01f5 }
            csr r0 = r0.d     // Catch:{ Exception -> 0x01f5 }
            cue r0 = r0.v()     // Catch:{ Exception -> 0x01f5 }
            r7 = r0
            goto L_0x0145
        L_0x0144:
            r7 = r4
        L_0x0145:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b     // Catch:{ Exception -> 0x01f5 }
            csr r0 = r0.d     // Catch:{ Exception -> 0x01f5 }
            if (r0 == 0) goto L_0x0155
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b     // Catch:{ Exception -> 0x01f5 }
            csr r0 = r0.d     // Catch:{ Exception -> 0x01f5 }
            java.lang.String r0 = r0.w()     // Catch:{ Exception -> 0x01f5 }
            r8 = r0
            goto L_0x0156
        L_0x0155:
            r8 = r4
        L_0x0156:
            r9 = 1
            r11 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b     // Catch:{ Exception -> 0x01f5 }
            coy r12 = r0.m     // Catch:{ Exception -> 0x01f5 }
            r13 = 0
            r14 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b     // Catch:{ Exception -> 0x01f5 }
            csr r0 = r0.d     // Catch:{ Exception -> 0x01f5 }
            if (r0 == 0) goto L_0x016e
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b     // Catch:{ Exception -> 0x01f5 }
            csr r0 = r0.d     // Catch:{ Exception -> 0x01f5 }
            bki r0 = r0.e()     // Catch:{ Exception -> 0x01f5 }
            r15 = r0
            goto L_0x016f
        L_0x016e:
            r15 = r4
        L_0x016f:
            dnh r16 = new dnh     // Catch:{ Exception -> 0x01f5 }
            r16.<init>()     // Catch:{ Exception -> 0x01f5 }
            r10 = r3
            csr r0 = defpackage.csy.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01f5 }
            r1.c = r0     // Catch:{ Exception -> 0x01f5 }
            csr r0 = r1.c
            cty r5 = r0.x()
            r6 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            bfr r7 = r0.p
            r8 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            bft r9 = r0.e
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            bhi r10 = r0.i
            r11 = 1
            r12 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            csr r0 = r0.d
            if (r0 == 0) goto L_0x01a3
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            csr r0 = r0.d
            cty r0 = r0.x()
            bkj r4 = r0.a()
        L_0x01a3:
            r13 = r4
            r14 = 0
            r15 = 0
            r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            csr r0 = r1.c
            cty r0 = r0.x()
            bgu r4 = new bgu
            r4.<init>(r1)
            r0.a(r4)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            java.lang.String r0 = r0.l
            if (r0 == 0) goto L_0x01c7
            csr r0 = r1.c
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.b
            java.lang.String r4 = r4.l
            r0.loadUrl(r4)
            goto L_0x01df
        L_0x01c7:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            java.lang.String r0 = r0.h
            if (r0 == 0) goto L_0x01ed
            csr r4 = r1.c
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            java.lang.String r5 = r0.f
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            java.lang.String r6 = r0.h
            r9 = 0
            java.lang.String r7 = "text/html"
            java.lang.String r8 = "UTF-8"
            r4.loadDataWithBaseURL(r5, r6, r7, r8, r9)
        L_0x01df:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            csr r0 = r0.d
            if (r0 == 0) goto L_0x0210
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            csr r0 = r0.d
            r0.b(r1)
            goto L_0x0210
        L_0x01ed:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L_0x01f5:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            defpackage.clu.a(r2, r0)
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Could not obtain webview for the overlay."
            r0.<init>(r2)
            throw r0
        L_0x0203:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.b
            csr r0 = r0.d
            r1.c = r0
            csr r0 = r1.c
            android.app.Activity r4 = r1.a
            r0.a(r4)
        L_0x0210:
            csr r0 = r1.c
            r0.a(r1)
            csr r0 = r1.c
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x022c
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x022c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            csr r4 = r1.c
            android.view.View r4 = r4.o()
            r0.removeView(r4)
        L_0x022c:
            boolean r0 = r1.l
            if (r0 == 0) goto L_0x0235
            csr r0 = r1.c
            r0.M()
        L_0x0235:
            bgw r0 = r1.m
            csr r4 = r1.c
            android.view.View r4 = r4.o()
            r5 = -1
            r0.addView(r4, r5, r5)
            if (r18 != 0) goto L_0x024a
            boolean r0 = r1.n
            if (r0 != 0) goto L_0x024a
            r17.s()
        L_0x024a:
            r1.a(r3)
            csr r0 = r1.c
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x0258
            r1.a(r3, r2)
        L_0x0258:
            return
        L_0x0259:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            goto L_0x0262
        L_0x0261:
            throw r0
        L_0x0262:
            goto L_0x0261
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgt.b(boolean):void");
    }
}
