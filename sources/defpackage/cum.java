package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@cey
/* renamed from: cum reason: default package */
final class cum extends cur implements OnGlobalLayoutListener, DownloadListener, csr, dzp {
    private dta A;
    private dtb B;
    private WeakReference<OnClickListener> C;
    private bgt D;
    private cok E;
    private int F = -1;
    private int G = -1;
    private int H = -1;
    private int I = -1;
    private float J;
    private Map<String, csc> K;
    private final WindowManager L;
    cuf a;
    private final dhx e;
    private final coy f;
    private final bje g;
    private final bki h;
    private bgt i;
    private cue j;
    private String k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private boolean p = true;
    private boolean q = false;
    private String r = "";
    private ctg s;
    private boolean t;
    private boolean u;
    private dua v;
    private int w;
    /* access modifiers changed from: private */
    public int x;
    private dta y;
    private dta z;

    private final synchronized void S() {
        if (!this.n) {
            bjl.g().c((View) this);
        }
        this.n = true;
    }

    private final synchronized void T() {
        if (this.n) {
            bjl.g().b((View) this);
        }
        this.n = false;
    }

    private final synchronized void U() {
        this.K = null;
    }

    static cum a(Context context, cue cue, String str, boolean z2, boolean z3, dhx dhx, coy coy, dtc dtc, bje bje, bki bki, dnh dnh) {
        Context context2 = context;
        cum cum = new cum(new cud(context), cue, str, z2, dhx, coy, dtc, bje, bki);
        return cum;
    }

    private final void g(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        dzq.a((dzp) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    public final dhx A() {
        return this.e;
    }

    public final synchronized boolean B() {
        return this.m;
    }

    public final synchronized int C() {
        return this.o;
    }

    public final synchronized boolean F() {
        return this.p;
    }

    public final synchronized boolean G() {
        return this.q;
    }

    public final synchronized boolean H() {
        return this.w > 0;
    }

    public final void I() {
        this.E.a();
    }

    public final OnClickListener K() {
        return (OnClickListener) this.C.get();
    }

    public final synchronized dua L() {
        return this.v;
    }

    public final void M() {
        setBackgroundColor(0);
    }

    public final crh a() {
        return null;
    }

    public final void a(bgs bgs) {
        this.a.a(bgs);
    }

    public final synchronized void a(bgt bgt) {
        this.i = bgt;
    }

    public final synchronized void a(ctg ctg) {
        if (this.s != null) {
            clu.a("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.s = ctg;
        }
    }

    public final synchronized void a(cue cue) {
        this.j = cue;
        requestLayout();
    }

    public final void a(dlg dlg) {
        synchronized (this) {
            this.t = dlg.a;
        }
        g(dlg.a);
    }

    public final synchronized void a(dua dua) {
        this.v = dua;
    }

    public final synchronized void a(String str) {
        if (str == null) {
            str = "";
        }
        this.r = str;
    }

    public final void a(String str, bgl<? super csr> bgl) {
        cuf cuf = this.a;
        if (cuf != null) {
            cuf.a(str, bgl);
        }
    }

    public final void a(String str, bzp<bgl<? super csr>> bzp) {
        cuf cuf = this.a;
        if (cuf != null) {
            cuf.a(str, bzp);
        }
    }

    public final void a(String str, String str2) {
        dzq.a((dzp) this, str, str2);
    }

    public final synchronized void a(String str, String str2, String str3) {
        if (((Boolean) dpn.f().a(dsp.az)).booleanValue()) {
            str2 = cts.a(str2, cts.a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    public final void a(String str, Map map) {
        dzq.a((dzp) this, str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        dzq.b(this, str, jSONObject);
    }

    public final synchronized ctg b() {
        return this.s;
    }

    public final synchronized void b(int i2) {
        this.o = i2;
        if (this.i != null) {
            this.i.a(this.o);
        }
    }

    public final synchronized void b(bgt bgt) {
        this.D = bgt;
    }

    public final void b(String str, bgl<? super csr> bgl) {
        cuf cuf = this.a;
        if (cuf != null) {
            cuf.b(str, bgl);
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        dzq.a((dzp) this, str, jSONObject);
    }

    public final synchronized void b(boolean z2) {
        boolean z3 = z2 != this.m;
        this.m = z2;
        R();
        if (z3) {
            new cce(this).b(z2 ? "expanded" : "default");
        }
    }

    public final dta c() {
        return this.z;
    }

    public final synchronized void c(boolean z2) {
        if (this.i != null) {
            this.i.a(this.a.b(), z2);
        } else {
            this.l = z2;
        }
    }

    public final synchronized void d(boolean z2) {
        this.p = z2;
    }

    public final bki e() {
        return this.h;
    }

    public final synchronized void e(boolean z2) {
        this.w += z2 ? 1 : -1;
        if (this.w <= 0 && this.i != null) {
            this.i.q();
        }
    }

    public final void f() {
        bgt t2 = t();
        if (t2 != null) {
            t2.p();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void f(boolean z2) {
        if (!z2) {
            V();
            this.E.b();
            if (this.i != null) {
                this.i.a();
                this.i.k();
                this.i = null;
            }
        }
        this.a.k();
        bjl.z();
        csb.a(this);
        U();
    }

    public final synchronized String g() {
        return this.r;
    }

    public final dtb j() {
        return this.B;
    }

    public final coy k() {
        return this.f;
    }

    public final int l() {
        return getMeasuredHeight();
    }

    public final int m() {
        return getMeasuredWidth();
    }

    public final WebView n() {
        return this;
    }

    public final View o() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!D()) {
            this.E.c();
        }
        boolean z2 = this.t;
        if (this.a != null && this.a.c()) {
            if (!this.u) {
                OnGlobalLayoutListener d = this.a.d();
                if (d != null) {
                    bjl.A();
                    cqk.a((View) this, d);
                }
                OnScrollChangedListener e2 = this.a.e();
                if (e2 != null) {
                    bjl.A();
                    cqk.a((View) this, e2);
                }
                this.u = true;
            }
            P();
            z2 = true;
        }
        g(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!D()) {
                this.E.d();
            }
            super.onDetachedFromWindow();
            if (this.u && this.a != null && this.a.c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.a.d();
                if (d != null) {
                    bjl.g().a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e2 = this.a.e();
                if (e2 != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e2);
                }
                this.u = false;
            }
        }
        g(false);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) dpn.f().a(dsp.aw)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean P = P();
        bgt t2 = t();
        if (t2 != null && P) {
            t2.o();
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e2) {
            clu.a("Could not pause webview.", e2);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e2) {
            clu.a("Could not resume webview.", e2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a.c()) {
            synchronized (this) {
                if (this.v != null) {
                    this.v.a(motionEvent);
                }
            }
        } else {
            dhx dhx = this.e;
            if (dhx != null) {
                dhx.a(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        Q();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f.a);
        dzq.a((dzp) this, "onhide", (Map) hashMap);
    }

    public final void r() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(bjl.D().b()));
        hashMap.put("app_volume", String.valueOf(bjl.D().a()));
        hashMap.put("device_volume", String.valueOf(cmu.a(getContext())));
        dzq.a((dzp) this, "volume", (Map) hashMap);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.C = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e2) {
            clu.a("Could not stop loading webview.", e2);
        }
    }

    public final synchronized bgt t() {
        return this.i;
    }

    public final synchronized bgt u() {
        return this.D;
    }

    public final synchronized cue v() {
        return this.j;
    }

    public final synchronized String w() {
        return this.k;
    }

    public final /* synthetic */ cty x() {
        return this.a;
    }

    public final synchronized void x_() {
        this.q = true;
        if (this.g != null) {
            this.g.x_();
        }
    }

    public final WebViewClient y() {
        return this.d;
    }

    public final synchronized void y_() {
        this.q = false;
        if (this.g != null) {
            this.g.y_();
        }
    }

    public final synchronized boolean z() {
        return this.l;
    }

    private cum(cud cud, cue cue, String str, boolean z2, dhx dhx, coy coy, dtc dtc, bje bje, bki bki) {
        super(cud);
        this.j = cue;
        this.k = str;
        this.m = z2;
        this.o = -1;
        this.e = dhx;
        this.f = coy;
        this.g = bje;
        this.h = bki;
        this.L = (WindowManager) getContext().getSystemService("window");
        this.E = new cok(this.c.a, this, this, null);
        bjl.e().a((Context) cud, coy.a, getSettings());
        setDownloadListener(this);
        this.J = this.c.getResources().getDisplayMetrics().density;
        R();
        if (bzo.c()) {
            addJavascriptInterface(ctj.a(this), "googleAdsJsInterface");
        }
        V();
        this.B = new dtb(new dtc(true, "make_wv", this.k));
        this.B.b.a(dtc);
        this.z = dsv.a(this.B.b);
        this.B.a("native:view_create", this.z);
        this.A = null;
        this.y = null;
        bjl.g().b((Context) cud);
    }

    private final boolean P() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.a.b() && !this.a.c()) {
            return false;
        }
        bjl.e();
        DisplayMetrics a2 = cmd.a(this.L);
        dpn.a();
        int b = col.b(a2, a2.widthPixels);
        dpn.a();
        int b2 = col.b(a2, a2.heightPixels);
        Activity activity = this.c.a;
        if (activity == null || activity.getWindow() == null) {
            i3 = b;
            i2 = b2;
        } else {
            bjl.e();
            int[] a3 = cmd.a(activity);
            dpn.a();
            i3 = col.b(a2, a3[0]);
            dpn.a();
            i2 = col.b(a2, a3[1]);
        }
        if (this.G == b && this.F == b2 && this.H == i3 && this.I == i2) {
            return false;
        }
        if (!(this.G == b && this.F == b2)) {
            z2 = true;
        }
        this.G = b;
        this.F = b2;
        this.H = i3;
        this.I = i2;
        new cce(this).a(b, b2, i3, i2, a2.density, this.L.getDefaultDisplay().getRotation());
        return z2;
    }

    public final synchronized void b(String str) {
        if (!D()) {
            super.b(str);
        } else {
            cow.a(5);
        }
    }

    public final void a(int i2) {
        if (i2 == 0) {
            dsv.a(this.B.b, this.z, "aebb2");
        }
        Q();
        if (this.B.b != null) {
            this.B.b.a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.f.a);
        dzq.a((dzp) this, "onhide", (Map) hashMap);
    }

    private final void Q() {
        dsv.a(this.B.b, this.z, "aeh2");
    }

    public final void q() {
        if (this.y == null) {
            dsv.a(this.B.b, this.z, "aes2");
            this.y = dsv.a(this.B.b);
            this.B.a("native:view_show", this.y);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f.a);
        dzq.a((dzp) this, "onshow", (Map) hashMap);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            bjl.e();
            cmd.a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            sb.toString();
            cow.a(3);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ac A[SYNTHETIC, Splitter:B:97:0x01ac] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:104:0x01c2=Splitter:B:104:0x01c2, B:52:0x00b8=Splitter:B:52:0x00b8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.D()     // Catch:{ all -> 0x01c7 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x01c2
            boolean r0 = r7.m     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x01c2
            cue r0 = r7.j     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01c2
        L_0x0021:
            cue r0 = r7.j     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x006d
            ctg r0 = r7.b()     // Catch:{ all -> 0x01c7 }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.e()     // Catch:{ all -> 0x01c7 }
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x003f:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c7 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c7 }
            float r1 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01c7 }
            float r2 = (float) r8     // Catch:{ all -> 0x01c7 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01c7 }
            if (r9 != 0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            float r9 = (float) r2     // Catch:{ all -> 0x01c7 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01c7 }
            r9 = r2
            goto L_0x0060
        L_0x0058:
            if (r8 != 0) goto L_0x0060
            if (r1 == 0) goto L_0x0060
            float r8 = (float) r1     // Catch:{ all -> 0x01c7 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01c7 }
            r8 = r1
        L_0x0060:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01c7 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01c7 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x006d:
            cue r0 = r7.j     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.b()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x00bd
            dsf<java.lang.Boolean> r0 = defpackage.dsp.ck     // Catch:{ all -> 0x01c7 }
            dsn r1 = defpackage.dpn.f()     // Catch:{ all -> 0x01c7 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x00b8
            boolean r0 = defpackage.bzo.c()     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x008e
            goto L_0x00b8
        L_0x008e:
            java.lang.String r0 = "/contentHeight"
            cun r1 = new cun     // Catch:{ all -> 0x01c7 }
            r1.<init>(r7)     // Catch:{ all -> 0x01c7 }
            r7.a(r0, r1)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.b(r0)     // Catch:{ all -> 0x01c7 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c7 }
            int r0 = r7.x     // Catch:{ all -> 0x01c7 }
            r1 = -1
            if (r0 == r1) goto L_0x00af
            int r9 = r7.x     // Catch:{ all -> 0x01c7 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r0 = r7.J     // Catch:{ all -> 0x01c7 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01c7 }
            goto L_0x00b3
        L_0x00af:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c7 }
        L_0x00b3:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x00b8:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x00bd:
            cue r0 = r7.j     // Catch:{ all -> 0x01c7 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x00dc
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch:{ all -> 0x01c7 }
            r8.<init>()     // Catch:{ all -> 0x01c7 }
            android.view.WindowManager r9 = r7.L     // Catch:{ all -> 0x01c7 }
            android.view.Display r9 = r9.getDefaultDisplay()     // Catch:{ all -> 0x01c7 }
            r9.getMetrics(r8)     // Catch:{ all -> 0x01c7 }
            int r9 = r8.widthPixels     // Catch:{ all -> 0x01c7 }
            int r8 = r8.heightPixels     // Catch:{ all -> 0x01c7 }
            r7.setMeasuredDimension(r9, r8)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x00dc:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01c7 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c7 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01c7 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c7 }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x00fc
            if (r0 != r3) goto L_0x00f8
            goto L_0x00fc
        L_0x00f8:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00fd
        L_0x00fc:
            r0 = r8
        L_0x00fd:
            if (r2 == r4) goto L_0x0101
            if (r2 != r3) goto L_0x0102
        L_0x0101:
            r5 = r9
        L_0x0102:
            cue r2 = r7.j     // Catch:{ all -> 0x01c7 }
            int r2 = r2.b     // Catch:{ all -> 0x01c7 }
            r3 = 1
            if (r2 > r0) goto L_0x0112
            cue r2 = r7.j     // Catch:{ all -> 0x01c7 }
            int r2 = r2.a     // Catch:{ all -> 0x01c7 }
            if (r2 <= r5) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r2 = 0
            goto L_0x0113
        L_0x0112:
            r2 = 1
        L_0x0113:
            dsf<java.lang.Boolean> r4 = defpackage.dsp.df     // Catch:{ all -> 0x01c7 }
            dsn r6 = defpackage.dpn.f()     // Catch:{ all -> 0x01c7 }
            java.lang.Object r4 = r6.a(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01c7 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01c7 }
            if (r4 == 0) goto L_0x014a
            cue r4 = r7.j     // Catch:{ all -> 0x01c7 }
            int r4 = r4.b     // Catch:{ all -> 0x01c7 }
            float r4 = (float) r4     // Catch:{ all -> 0x01c7 }
            float r6 = r7.J     // Catch:{ all -> 0x01c7 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01c7 }
            float r6 = r7.J     // Catch:{ all -> 0x01c7 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            cue r0 = r7.j     // Catch:{ all -> 0x01c7 }
            int r0 = r0.a     // Catch:{ all -> 0x01c7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01c7 }
            float r4 = r7.J     // Catch:{ all -> 0x01c7 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01c7 }
            float r5 = r7.J     // Catch:{ all -> 0x01c7 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            if (r2 == 0) goto L_0x014a
            r2 = r3
        L_0x014a:
            r0 = 8
            if (r2 == 0) goto L_0x01ac
            cue r2 = r7.j     // Catch:{ all -> 0x01c7 }
            int r2 = r2.b     // Catch:{ all -> 0x01c7 }
            float r2 = (float) r2     // Catch:{ all -> 0x01c7 }
            float r3 = r7.J     // Catch:{ all -> 0x01c7 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01c7 }
            cue r3 = r7.j     // Catch:{ all -> 0x01c7 }
            int r3 = r3.a     // Catch:{ all -> 0x01c7 }
            float r3 = (float) r3     // Catch:{ all -> 0x01c7 }
            float r4 = r7.J     // Catch:{ all -> 0x01c7 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01c7 }
            float r8 = (float) r8     // Catch:{ all -> 0x01c7 }
            float r4 = r7.J     // Catch:{ all -> 0x01c7 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01c7 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c7 }
            float r4 = r7.J     // Catch:{ all -> 0x01c7 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01c7 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c7 }
            r5.<init>(r4)     // Catch:{ all -> 0x01c7 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01c7 }
            r5.append(r2)     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01c7 }
            r5.append(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01c7 }
            r5.append(r8)     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01c7 }
            r5.append(r9)     // Catch:{ all -> 0x01c7 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01c7 }
            r5.toString()     // Catch:{ all -> 0x01c7 }
            r8 = 5
            defpackage.cow.a(r8)     // Catch:{ all -> 0x01c7 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01c7 }
            if (r8 == r0) goto L_0x01a7
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01c7 }
        L_0x01a7:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x01ac:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01c7 }
            if (r8 == r0) goto L_0x01b5
            r7.setVisibility(r1)     // Catch:{ all -> 0x01c7 }
        L_0x01b5:
            cue r8 = r7.j     // Catch:{ all -> 0x01c7 }
            int r8 = r8.b     // Catch:{ all -> 0x01c7 }
            cue r9 = r7.j     // Catch:{ all -> 0x01c7 }
            int r9 = r9.a     // Catch:{ all -> 0x01c7 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x01c2:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r7)
            return
        L_0x01c7:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cum.onMeasure(int, int):void");
    }

    public final void a(Context context) {
        this.c.setBaseContext(context);
        this.E.a = this.c.a;
    }

    public final Activity d() {
        return this.c.a;
    }

    public final Context s() {
        return this.c.b;
    }

    private final synchronized void R() {
        if (!this.m) {
            if (!this.j.c()) {
                if (VERSION.SDK_INT < 18) {
                    cow.a(3);
                    S();
                    return;
                }
                cow.a(3);
                T();
                return;
            }
        }
        cow.a(3);
        T();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            cuf cuf = this.a;
            if (!(cuf == null || cuf.i == null)) {
                this.a.i.a();
            }
        }
    }

    public final void J() {
        if (this.A == null) {
            this.A = dsv.a(this.B.b);
            this.B.a("native:view_load", this.A);
        }
    }

    public final void N() {
        clu.a();
    }

    private final void V() {
        dtb dtb = this.B;
        if (dtb != null) {
            dtc dtc = dtb.b;
            if (!(dtc == null || bjl.i().a() == null)) {
                bjl.i().a().a(dtc);
            }
        }
    }

    public final void a(boolean z2) {
        this.a.g = z2;
    }

    public final void a(boolean z2, int i2) {
        cuf cuf = this.a;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!cuf.a.B() || cuf.a.v().c()) ? cuf.b : null, cuf.c, cuf.h, cuf.a, z2, i2, cuf.a.k());
        cuf.a(adOverlayInfoParcel);
    }

    public final void a(boolean z2, int i2, String str) {
        cuf cuf = this.a;
        boolean B2 = cuf.a.B();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!B2 || cuf.a.v().c()) ? cuf.b : null, B2 ? null : new cuj(cuf.a, cuf.c), cuf.d, cuf.e, cuf.h, cuf.a, z2, i2, str, cuf.a.k());
        cuf.a(adOverlayInfoParcel);
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        cuf cuf = this.a;
        boolean B2 = cuf.a.B();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!B2 || cuf.a.v().c()) ? cuf.b : null, B2 ? null : new cuj(cuf.a, cuf.c), cuf.d, cuf.e, cuf.h, cuf.a, z2, i2, str, str2, cuf.a.k());
        cuf.a(adOverlayInfoParcel);
    }
}
