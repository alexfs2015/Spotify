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
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: ctd reason: default package */
final class ctd extends WebView implements OnGlobalLayoutListener, DownloadListener, csr {
    private int A;
    /* access modifiers changed from: private */
    public int B;
    private dta C;
    private dta D;
    private dta E;
    private dtb F;
    private WeakReference<OnClickListener> G;
    private bgt H;
    private boolean I;
    private cok J;
    private int K = -1;
    private int L = -1;
    private int M = -1;
    private int N = -1;
    private Map<String, csc> O;
    private final WindowManager P;
    private final dnh Q;
    private final cud a;
    private final dhx b;
    private final coy c;
    private final bje d;
    private final bki e;
    private final DisplayMetrics f;
    private final float g;
    private boolean h = false;
    private boolean i = false;
    private css j;
    private bgt k;
    private cue l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Boolean r;
    private int s;
    private boolean t = true;
    private boolean u = false;
    private String v = "";
    private ctg w;
    private boolean x;
    private boolean y;
    private dua z;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        a(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void P() {
        /*
            r2 = this;
            monitor-enter(r2)
            cle r0 = defpackage.bjl.i()     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r0.b()     // Catch:{ all -> 0x0023 }
            r2.r = r0     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r2.r     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001c }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001c }
            r2.a(r0)     // Catch:{ IllegalStateException -> 0x001c }
            monitor-exit(r2)
            return
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            r2.a(r0)     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.P():void");
    }

    private final synchronized Boolean Q() {
        return this.r;
    }

    private final synchronized void T() {
        if (!this.q) {
            bjl.g().c((View) this);
        }
        this.q = true;
    }

    private final synchronized void U() {
        if (this.q) {
            bjl.g().b((View) this);
        }
        this.q = false;
    }

    private final synchronized void V() {
        if (!this.I) {
            this.I = true;
            bjl.i().f();
        }
    }

    private final synchronized void W() {
        this.O = null;
    }

    static ctd a(Context context, cue cue, String str, boolean z2, boolean z3, dhx dhx, coy coy, dtc dtc, bje bje, bki bki, dnh dnh) {
        Context context2 = context;
        ctd ctd = new ctd(new cud(context), cue, str, z2, dhx, coy, dtc, bje, bki, dnh);
        return ctd;
    }

    private final void a(Boolean bool) {
        synchronized (this) {
            this.r = bool;
        }
        bjl.i().a(bool);
    }

    private final void f(String str) {
        String str2 = "javascript:";
        if (bzo.e()) {
            if (Q() == null) {
                P();
            }
            if (Q().booleanValue()) {
                e(str);
                return;
            }
            String valueOf = String.valueOf(str);
            c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        String valueOf2 = String.valueOf(str);
        c(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
    }

    private final void f(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    public final dhx A() {
        return this.b;
    }

    public final synchronized boolean B() {
        return this.p;
    }

    public final synchronized int C() {
        return this.s;
    }

    public final synchronized boolean D() {
        return this.o;
    }

    public final synchronized boolean F() {
        return this.t;
    }

    public final synchronized boolean G() {
        return this.u;
    }

    public final synchronized boolean H() {
        return this.A > 0;
    }

    public final void I() {
        this.J.a();
    }

    public final OnClickListener K() {
        return (OnClickListener) this.G.get();
    }

    public final synchronized dua L() {
        return this.z;
    }

    public final void M() {
        setBackgroundColor(0);
    }

    public final crh a() {
        return null;
    }

    public final void a(bgs bgs) {
        this.j.a(bgs);
    }

    public final synchronized void a(bgt bgt) {
        this.k = bgt;
    }

    public final synchronized void a(ctg ctg) {
        if (this.w != null) {
            clu.a("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.w = ctg;
        }
    }

    public final synchronized void a(cue cue) {
        this.l = cue;
        requestLayout();
    }

    public final void a(dlg dlg) {
        synchronized (this) {
            this.x = dlg.a;
        }
        f(dlg.a);
    }

    public final synchronized void a(dua dua) {
        this.z = dua;
    }

    public final synchronized void a(String str) {
        if (str == null) {
            str = "";
        }
        this.v = str;
    }

    public final void a(String str, bgl<? super csr> bgl) {
        css css = this.j;
        if (css != null) {
            css.a(str, bgl);
        }
    }

    public final void a(boolean z2, int i2) {
        this.j.a(z2, i2);
    }

    public final void a(boolean z2, int i2, String str) {
        this.j.a(z2, i2, str);
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        this.j.a(z2, i2, str, str2);
    }

    public final synchronized ctg b() {
        return this.w;
    }

    public final synchronized void b(int i2) {
        this.s = i2;
        if (this.k != null) {
            this.k.a(this.s);
        }
    }

    public final synchronized void b(bgt bgt) {
        this.H = bgt;
    }

    public final void b(String str) {
        f(str);
    }

    public final void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        f(sb.toString());
    }

    public final synchronized void b(boolean z2) {
        boolean z3 = z2 != this.p;
        this.p = z2;
        S();
        if (z3) {
            new cce(this).b(z2 ? "expanded" : "default");
        }
    }

    public final dta c() {
        return this.D;
    }

    public final synchronized void c(boolean z2) {
        if (this.k != null) {
            this.k.a(this.j.b(), z2);
        } else {
            this.n = z2;
        }
    }

    public final synchronized void d(boolean z2) {
        this.t = z2;
    }

    public final bki e() {
        return this.e;
    }

    public final synchronized void e(boolean z2) {
        this.A += z2 ? 1 : -1;
        if (this.A <= 0 && this.k != null) {
            this.k.q();
        }
    }

    public final void f() {
        bgt t2 = t();
        if (t2 != null) {
            t2.p();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.o) {
                    this.j.k();
                    bjl.z();
                    csb.a(this);
                    W();
                    V();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized String g() {
        return this.v;
    }

    public final dtb j() {
        return this.F;
    }

    public final coy k() {
        return this.c;
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
            this.J.c();
        }
        boolean z2 = this.x;
        if (this.j != null && this.j.c()) {
            if (!this.y) {
                OnGlobalLayoutListener d2 = this.j.d();
                if (d2 != null) {
                    bjl.A();
                    cqk.a((View) this, d2);
                }
                OnScrollChangedListener e2 = this.j.e();
                if (e2 != null) {
                    bjl.A();
                    cqk.a((View) this, e2);
                }
                this.y = true;
            }
            O();
            z2 = true;
        }
        f(z2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!D()) {
                this.J.d();
            }
            super.onDetachedFromWindow();
            if (this.y && this.j != null && this.j.c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d2 = this.j.d();
                if (d2 != null) {
                    bjl.g().a(getViewTreeObserver(), d2);
                }
                OnScrollChangedListener e2 = this.j.e();
                if (e2 != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e2);
                }
                this.y = false;
            }
        }
        f(false);
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
        boolean O2 = O();
        bgt t2 = t();
        if (t2 != null && O2) {
            t2.o();
        }
    }

    public final void onPause() {
        if (!D()) {
            try {
                super.onPause();
            } catch (Exception e2) {
                clu.a("Could not pause webview.", e2);
            }
        }
    }

    public final void onResume() {
        if (!D()) {
            try {
                super.onResume();
            } catch (Exception e2) {
                clu.a("Could not resume webview.", e2);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j.c()) {
            synchronized (this) {
                if (this.z != null) {
                    this.z.a(motionEvent);
                }
            }
        } else {
            dhx dhx = this.b;
            if (dhx != null) {
                dhx.a(motionEvent);
            }
        }
        if (D()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        R();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.c.a);
        a("onhide", (Map<String, ?>) hashMap);
    }

    public final void r() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(bjl.D().b()));
        hashMap.put("app_volume", String.valueOf(bjl.D().a()));
        hashMap.put("device_volume", String.valueOf(cmu.a(getContext())));
        a("volume", (Map<String, ?>) hashMap);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.G = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof css) {
            this.j = (css) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!D()) {
            try {
                super.stopLoading();
            } catch (Exception e2) {
                clu.a("Could not stop loading webview.", e2);
            }
        }
    }

    public final synchronized bgt t() {
        return this.k;
    }

    public final synchronized bgt u() {
        return this.H;
    }

    public final synchronized cue v() {
        return this.l;
    }

    public final synchronized String w() {
        return this.m;
    }

    public final /* synthetic */ cty x() {
        return this.j;
    }

    public final synchronized void x_() {
        this.u = true;
        if (this.d != null) {
            this.d.x_();
        }
    }

    public final WebViewClient y() {
        return this.j;
    }

    public final synchronized void y_() {
        this.u = false;
        if (this.d != null) {
            this.d.y_();
        }
    }

    public final synchronized boolean z() {
        return this.n;
    }

    private ctd(cud cud, cue cue, String str, boolean z2, dhx dhx, coy coy, dtc dtc, bje bje, bki bki, dnh dnh) {
        super(cud);
        this.a = cud;
        this.l = cue;
        this.m = str;
        this.p = z2;
        this.s = -1;
        this.b = dhx;
        this.c = coy;
        this.d = bje;
        this.e = bki;
        this.P = (WindowManager) getContext().getSystemService("window");
        bjl.e();
        this.f = cmd.a(this.P);
        this.g = this.f.density;
        this.Q = dnh;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            clu.a("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        bjl.e().a((Context) cud, coy.a, settings);
        bjl.g().a(getContext(), settings);
        setDownloadListener(this);
        S();
        if (bzo.c()) {
            addJavascriptInterface(ctj.a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.J = new cok(this.a.a, this, this, null);
        X();
        this.F = new dtb(new dtc(true, "make_wv", this.m));
        this.F.b.a(dtc);
        this.D = dsv.a(this.F.b);
        this.F.a("native:view_create", this.D);
        this.E = null;
        this.C = null;
        bjl.g().b((Context) cud);
        bjl.i().e();
    }

    private final boolean O() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.j.b() && !this.j.c()) {
            return false;
        }
        dpn.a();
        DisplayMetrics displayMetrics = this.f;
        int b2 = col.b(displayMetrics, displayMetrics.widthPixels);
        dpn.a();
        DisplayMetrics displayMetrics2 = this.f;
        int b3 = col.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity activity = this.a.a;
        if (activity == null || activity.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            bjl.e();
            int[] a2 = cmd.a(activity);
            dpn.a();
            int b4 = col.b(this.f, a2[0]);
            dpn.a();
            i2 = col.b(this.f, a2[1]);
            i3 = b4;
        }
        if (this.L == b2 && this.K == b3 && this.M == i3 && this.N == i2) {
            return false;
        }
        if (!(this.L == b2 && this.K == b3)) {
            z2 = true;
        }
        this.L = b2;
        this.K = b3;
        this.M = i3;
        this.N = i2;
        new cce(this).a(b2, b3, i3, i2, this.f.density, this.P.getDefaultDisplay().getRotation());
        return z2;
    }

    public final void a(String str, Map<String, ?> map) {
        try {
            a(str, bjl.e().a(map));
        } catch (JSONException unused) {
            cow.a(5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.D()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            r0 = 0
            defpackage.cow.b(r2, r0)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r3.onReceiveValue(r0)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    private final synchronized void c(String str) {
        if (!D()) {
            loadUrl(str);
        } else {
            cow.a(5);
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!D()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                bjl.i().a(e2, "AdWebViewImpl.loadUrl");
                cow.a(5);
            }
        } else {
            cow.a(5);
        }
    }

    private final synchronized void d(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            bjl.i().a(e2, "AdWebViewImpl.loadUrlUnsafe");
            cow.a(5);
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!D()) {
            super.loadData(str, str2, str3);
        } else {
            cow.a(5);
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!D()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            cow.a(5);
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        if (!D()) {
            if (((Boolean) dpn.f().a(dsp.az)).booleanValue()) {
                str2 = cts.a(str2, cts.a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        cow.a(5);
    }

    private final synchronized void e(String str) {
        if (!D()) {
            evaluateJavascript(str, null);
        } else {
            cow.a(5);
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        cow.a(3);
        f(sb.toString());
    }

    public final void a(int i2) {
        if (i2 == 0) {
            dsv.a(this.F.b, this.D, "aebb2");
        }
        R();
        if (this.F.b != null) {
            this.F.b.a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.c.a);
        a("onhide", (Map<String, ?>) hashMap);
    }

    private final void R() {
        dsv.a(this.F.b, this.D, "aeh2");
    }

    public final void q() {
        if (this.C == null) {
            dsv.a(this.F.b, this.D, "aes2");
            this.C = dsv.a(this.F.b);
            this.F.a("native:view_show", this.C);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.c.a);
        a("onshow", (Map<String, ?>) hashMap);
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
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d5, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b3 A[SYNTHETIC, Splitter:B:100:0x01b3] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0148  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:110:0x01d6=Splitter:B:110:0x01d6, B:52:0x00ba=Splitter:B:52:0x00ba} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.D()     // Catch:{ all -> 0x01db }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r7.p     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x01d6
            cue r0 = r7.l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.d()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0021
            goto L_0x01d6
        L_0x0021:
            cue r0 = r7.l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.e()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x006d
            ctg r0 = r7.b()     // Catch:{ all -> 0x01db }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.e()     // Catch:{ all -> 0x01db }
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x003f:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01db }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01db }
            float r1 = (float) r9     // Catch:{ all -> 0x01db }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01db }
            float r2 = (float) r8     // Catch:{ all -> 0x01db }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01db }
            if (r9 != 0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            float r9 = (float) r2     // Catch:{ all -> 0x01db }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01db }
            r9 = r2
            goto L_0x0060
        L_0x0058:
            if (r8 != 0) goto L_0x0060
            if (r1 == 0) goto L_0x0060
            float r8 = (float) r1     // Catch:{ all -> 0x01db }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01db }
            r8 = r1
        L_0x0060:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01db }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01db }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x006d:
            cue r0 = r7.l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.b()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00bf
            dsf<java.lang.Boolean> r0 = defpackage.dsp.ck     // Catch:{ all -> 0x01db }
            dsn r1 = defpackage.dpn.f()     // Catch:{ all -> 0x01db }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01db }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01db }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x00ba
            boolean r0 = defpackage.bzo.c()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x008e
            goto L_0x00ba
        L_0x008e:
            java.lang.String r0 = "/contentHeight"
            cte r1 = new cte     // Catch:{ all -> 0x01db }
            r1.<init>(r7)     // Catch:{ all -> 0x01db }
            r7.a(r0, r1)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.f(r0)     // Catch:{ all -> 0x01db }
            android.util.DisplayMetrics r0 = r7.f     // Catch:{ all -> 0x01db }
            float r0 = r0.density     // Catch:{ all -> 0x01db }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01db }
            int r1 = r7.B     // Catch:{ all -> 0x01db }
            r2 = -1
            if (r1 == r2) goto L_0x00b1
            int r9 = r7.B     // Catch:{ all -> 0x01db }
            float r9 = (float) r9     // Catch:{ all -> 0x01db }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01db }
            goto L_0x00b5
        L_0x00b1:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01db }
        L_0x00b5:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x00ba:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x00bf:
            cue r0 = r7.l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.c()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00d4
            android.util.DisplayMetrics r8 = r7.f     // Catch:{ all -> 0x01db }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01db }
            android.util.DisplayMetrics r9 = r7.f     // Catch:{ all -> 0x01db }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01db }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x00d4:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01db }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01db }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01db }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01db }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x00f4
            if (r0 != r3) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00f5
        L_0x00f4:
            r0 = r8
        L_0x00f5:
            if (r2 == r4) goto L_0x00f9
            if (r2 != r3) goto L_0x00fa
        L_0x00f9:
            r5 = r9
        L_0x00fa:
            cue r2 = r7.l     // Catch:{ all -> 0x01db }
            int r2 = r2.b     // Catch:{ all -> 0x01db }
            r3 = 1
            if (r2 > r0) goto L_0x010a
            cue r2 = r7.l     // Catch:{ all -> 0x01db }
            int r2 = r2.a     // Catch:{ all -> 0x01db }
            if (r2 <= r5) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r2 = 0
            goto L_0x010b
        L_0x010a:
            r2 = 1
        L_0x010b:
            dsf<java.lang.Boolean> r4 = defpackage.dsp.df     // Catch:{ all -> 0x01db }
            dsn r6 = defpackage.dpn.f()     // Catch:{ all -> 0x01db }
            java.lang.Object r4 = r6.a(r4)     // Catch:{ all -> 0x01db }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01db }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01db }
            if (r4 == 0) goto L_0x0143
            cue r4 = r7.l     // Catch:{ all -> 0x01db }
            int r4 = r4.b     // Catch:{ all -> 0x01db }
            float r4 = (float) r4     // Catch:{ all -> 0x01db }
            float r6 = r7.g     // Catch:{ all -> 0x01db }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01db }
            float r6 = r7.g     // Catch:{ all -> 0x01db }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x013f
            cue r0 = r7.l     // Catch:{ all -> 0x01db }
            int r0 = r0.a     // Catch:{ all -> 0x01db }
            float r0 = (float) r0     // Catch:{ all -> 0x01db }
            float r4 = r7.g     // Catch:{ all -> 0x01db }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01db }
            float r5 = r7.g     // Catch:{ all -> 0x01db }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x013f
            r0 = 1
            goto L_0x0140
        L_0x013f:
            r0 = 0
        L_0x0140:
            if (r2 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r0 = r2
        L_0x0144:
            r2 = 8
            if (r0 == 0) goto L_0x01b3
            cue r0 = r7.l     // Catch:{ all -> 0x01db }
            int r0 = r0.b     // Catch:{ all -> 0x01db }
            float r0 = (float) r0     // Catch:{ all -> 0x01db }
            float r4 = r7.g     // Catch:{ all -> 0x01db }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01db }
            cue r4 = r7.l     // Catch:{ all -> 0x01db }
            int r4 = r4.a     // Catch:{ all -> 0x01db }
            float r4 = (float) r4     // Catch:{ all -> 0x01db }
            float r5 = r7.g     // Catch:{ all -> 0x01db }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01db }
            float r8 = (float) r8     // Catch:{ all -> 0x01db }
            float r5 = r7.g     // Catch:{ all -> 0x01db }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01db }
            float r9 = (float) r9     // Catch:{ all -> 0x01db }
            float r5 = r7.g     // Catch:{ all -> 0x01db }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01db }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            r6.<init>(r5)     // Catch:{ all -> 0x01db }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01db }
            r6.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01db }
            r6.append(r4)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01db }
            r6.append(r8)     // Catch:{ all -> 0x01db }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01db }
            r6.append(r9)     // Catch:{ all -> 0x01db }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01db }
            r6.toString()     // Catch:{ all -> 0x01db }
            r8 = 5
            defpackage.cow.a(r8)     // Catch:{ all -> 0x01db }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01db }
            if (r8 == r2) goto L_0x01a1
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01db }
        L_0x01a1:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01db }
            boolean r8 = r7.h     // Catch:{ all -> 0x01db }
            if (r8 != 0) goto L_0x01d4
            dnh r8 = r7.Q     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.zzhu$zza$zzb r9 = com.google.android.gms.internal.ads.zzhu.zza.zzb.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01db }
            r8.a(r9)     // Catch:{ all -> 0x01db }
            r7.h = r3     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x01b3:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01db }
            if (r8 == r2) goto L_0x01bc
            r7.setVisibility(r1)     // Catch:{ all -> 0x01db }
        L_0x01bc:
            boolean r8 = r7.i     // Catch:{ all -> 0x01db }
            if (r8 != 0) goto L_0x01c9
            dnh r8 = r7.Q     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.zzhu$zza$zzb r9 = com.google.android.gms.internal.ads.zzhu.zza.zzb.BANNER_SIZE_VALID     // Catch:{ all -> 0x01db }
            r8.a(r9)     // Catch:{ all -> 0x01db }
            r7.i = r3     // Catch:{ all -> 0x01db }
        L_0x01c9:
            cue r8 = r7.l     // Catch:{ all -> 0x01db }
            int r8 = r8.b     // Catch:{ all -> 0x01db }
            cue r9 = r7.l     // Catch:{ all -> 0x01db }
            int r9 = r9.a     // Catch:{ all -> 0x01db }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01db }
        L_0x01d4:
            monitor-exit(r7)
            return
        L_0x01d6:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r7)
            return
        L_0x01db:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.onMeasure(int, int):void");
    }

    public final void a(Context context) {
        this.a.setBaseContext(context);
        this.J.a = this.a.a;
    }

    public final Activity d() {
        return this.a.a;
    }

    public final Context s() {
        return this.a.b;
    }

    private final synchronized void S() {
        if (!this.p) {
            if (!this.l.c()) {
                if (VERSION.SDK_INT < 18) {
                    cow.a(3);
                    T();
                    return;
                }
                cow.a(3);
                U();
                return;
            }
        }
        cow.a(3);
        U();
    }

    public final synchronized void destroy() {
        X();
        this.J.b();
        if (this.k != null) {
            this.k.a();
            this.k.k();
            this.k = null;
        }
        this.j.k();
        if (!this.o) {
            bjl.z();
            csb.a(this);
            W();
            this.o = true;
            clu.a();
            clu.a();
            d("about:blank");
        }
    }

    public final synchronized void E() {
        clu.a();
        V();
        cmd.a.post(new ctf(this));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!D()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                css css = this.j;
                if (!(css == null || css.f == null)) {
                    this.j.f.a();
                }
            }
        }
    }

    public final void J() {
        if (this.E == null) {
            this.E = dsv.a(this.F.b);
            this.F.a("native:view_load", this.E);
        }
    }

    public final void N() {
        clu.a();
    }

    private final void X() {
        dtb dtb = this.F;
        if (dtb != null) {
            dtc dtc = dtb.b;
            if (!(dtc == null || bjl.i().a() == null)) {
                bjl.i().a().a(dtc);
            }
        }
    }

    public final void a(boolean z2) {
        this.j.e = z2;
    }

    public final void b(String str, bgl<? super csr> bgl) {
        css css = this.j;
        if (css != null) {
            synchronized (css.c) {
                List list = (List) css.b.get(str);
                if (list != null) {
                    list.remove(bgl);
                }
            }
        }
    }

    public final void a(String str, bzp<bgl<? super csr>> bzp) {
        css css = this.j;
        if (css != null) {
            synchronized (css.c) {
                List<bgl> list = (List) css.b.get(str);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (bgl bgl : list) {
                        if (bzp.a(bgl)) {
                            arrayList.add(bgl);
                        }
                    }
                    list.removeAll(arrayList);
                }
            }
        }
    }
}
