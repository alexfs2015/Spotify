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

@cfp
/* renamed from: ctu reason: default package */
final class ctu extends WebView implements OnGlobalLayoutListener, DownloadListener, cti {
    private int A;
    /* access modifiers changed from: private */
    public int B;
    private dtr C;
    private dtr D;
    private dtr E;
    private dts F;
    private WeakReference<OnClickListener> G;
    private bhk H;
    private boolean I;
    private cpb J;
    private int K = -1;
    private int L = -1;
    private int M = -1;
    private int N = -1;
    private Map<String, cst> O;
    private final WindowManager P;
    private final dny Q;
    private final cuu a;
    private final dio b;
    private final cpp c;
    private final bjv d;
    private final bkz e;
    private final DisplayMetrics f;
    private final float g;
    private boolean h = false;
    private boolean i = false;
    private ctj j;
    private bhk k;
    private cuv l;
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
    private ctx w;
    private boolean x;
    private boolean y;
    private dur z;

    private ctu(cuu cuu, cuv cuv, String str, boolean z2, dio dio, cpp cpp, dtt dtt, bjv bjv, bkz bkz, dny dny) {
        super(cuu);
        this.a = cuu;
        this.l = cuv;
        this.m = str;
        this.p = z2;
        this.s = -1;
        this.b = dio;
        this.c = cpp;
        this.d = bjv;
        this.e = bkz;
        this.P = (WindowManager) getContext().getSystemService("window");
        bkc.e();
        this.f = cmu.a(this.P);
        this.g = this.f.density;
        this.Q = dny;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            cml.a("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        bkc.e().a((Context) cuu, cpp.a, settings);
        bkc.g().a(getContext(), settings);
        setDownloadListener(this);
        S();
        if (caf.c()) {
            addJavascriptInterface(cua.a(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.J = new cpb(this.a.a, this, this, null);
        X();
        this.F = new dts(new dtt(true, "make_wv", this.m));
        this.F.b.a(dtt);
        this.D = dtm.a(this.F.b);
        this.F.a("native:view_create", this.D);
        this.E = null;
        this.C = null;
        bkc.g().b((Context) cuu);
        bkc.i().e();
    }

    private final boolean O() {
        int i2;
        int i3;
        boolean z2 = false;
        if (!this.j.b() && !this.j.c()) {
            return false;
        }
        dqe.a();
        DisplayMetrics displayMetrics = this.f;
        int b2 = cpc.b(displayMetrics, displayMetrics.widthPixels);
        dqe.a();
        DisplayMetrics displayMetrics2 = this.f;
        int b3 = cpc.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity activity = this.a.a;
        if (activity == null || activity.getWindow() == null) {
            i3 = b2;
            i2 = b3;
        } else {
            bkc.e();
            int[] a2 = cmu.a(activity);
            dqe.a();
            int b4 = cpc.b(this.f, a2[0]);
            dqe.a();
            i2 = cpc.b(this.f, a2[1]);
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
        new ccv(this).a(b2, b3, i3, i2, this.f.density, this.P.getDefaultDisplay().getRotation());
        return z2;
    }

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
            clv r0 = defpackage.bkc.i()     // Catch:{ all -> 0x0023 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctu.P():void");
    }

    private final synchronized Boolean Q() {
        return this.r;
    }

    private final void R() {
        dtm.a(this.F.b, this.D, "aeh2");
    }

    private final synchronized void S() {
        if (!this.p) {
            if (!this.l.c()) {
                if (VERSION.SDK_INT < 18) {
                    cpn.a(3);
                    T();
                    return;
                }
                cpn.a(3);
                U();
                return;
            }
        }
        cpn.a(3);
        U();
    }

    private final synchronized void T() {
        if (!this.q) {
            bkc.g().c((View) this);
        }
        this.q = true;
    }

    private final synchronized void U() {
        if (this.q) {
            bkc.g().b((View) this);
        }
        this.q = false;
    }

    private final synchronized void V() {
        if (!this.I) {
            this.I = true;
            bkc.i().f();
        }
    }

    private final synchronized void W() {
        this.O = null;
    }

    private final void X() {
        dts dts = this.F;
        if (dts != null) {
            dtt dtt = dts.b;
            if (!(dtt == null || bkc.i().a() == null)) {
                bkc.i().a().a(dtt);
            }
        }
    }

    static ctu a(Context context, cuv cuv, String str, boolean z2, boolean z3, dio dio, cpp cpp, dtt dtt, bjv bjv, bkz bkz, dny dny) {
        Context context2 = context;
        ctu ctu = new ctu(new cuu(context), cuv, str, z2, dio, cpp, dtt, bjv, bkz, dny);
        return ctu;
    }

    private final void a(Boolean bool) {
        synchronized (this) {
            this.r = bool;
        }
        bkc.i().a(bool);
    }

    private final synchronized void c(String str) {
        if (!D()) {
            loadUrl(str);
        } else {
            cpn.a(5);
        }
    }

    private final synchronized void d(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            bkc.i().a(e2, "AdWebViewImpl.loadUrlUnsafe");
            cpn.a(5);
        }
    }

    private final synchronized void e(String str) {
        if (!D()) {
            evaluateJavascript(str, null);
        } else {
            cpn.a(5);
        }
    }

    private final void f(String str) {
        String str2 = "javascript:";
        if (caf.e()) {
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

    public final dio A() {
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

    public final synchronized void E() {
        cml.a();
        V();
        cmu.a.post(new ctw(this));
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

    public final void J() {
        if (this.E == null) {
            this.E = dtm.a(this.F.b);
            this.F.a("native:view_load", this.E);
        }
    }

    public final OnClickListener K() {
        return (OnClickListener) this.G.get();
    }

    public final synchronized dur L() {
        return this.z;
    }

    public final void M() {
        setBackgroundColor(0);
    }

    public final void N() {
        cml.a();
    }

    public final cry a() {
        return null;
    }

    public final void a(int i2) {
        if (i2 == 0) {
            dtm.a(this.F.b, this.D, "aebb2");
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

    public final void a(Context context) {
        this.a.setBaseContext(context);
        this.J.a = this.a.a;
    }

    public final void a(bhj bhj) {
        this.j.a(bhj);
    }

    public final synchronized void a(bhk bhk) {
        this.k = bhk;
    }

    public final synchronized void a(ctx ctx) {
        if (this.w != null) {
            cml.a("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.w = ctx;
        }
    }

    public final synchronized void a(cuv cuv) {
        this.l = cuv;
        requestLayout();
    }

    public final void a(dlx dlx) {
        synchronized (this) {
            this.x = dlx.a;
        }
        f(dlx.a);
    }

    public final synchronized void a(dur dur) {
        this.z = dur;
    }

    public final synchronized void a(String str) {
        if (str == null) {
            str = "";
        }
        this.v = str;
    }

    public final void a(String str, bhc<? super cti> bhc) {
        ctj ctj = this.j;
        if (ctj != null) {
            ctj.a(str, bhc);
        }
    }

    public final void a(String str, cag<bhc<? super cti>> cag) {
        ctj ctj = this.j;
        if (ctj != null) {
            synchronized (ctj.c) {
                List<bhc> list = (List) ctj.b.get(str);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (bhc bhc : list) {
                        if (cag.a(bhc)) {
                            arrayList.add(bhc);
                        }
                    }
                    list.removeAll(arrayList);
                }
            }
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        if (!D()) {
            if (((Boolean) dqe.f().a(dtg.az)).booleanValue()) {
                str2 = cuj.a(str2, cuj.a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        cpn.a(5);
    }

    public final void a(String str, Map<String, ?> map) {
        try {
            a(str, bkc.e().a(map));
        } catch (JSONException unused) {
            cpn.a(5);
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
        cpn.a(3);
        f(sb.toString());
    }

    public final void a(boolean z2) {
        this.j.e = z2;
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

    public final synchronized ctx b() {
        return this.w;
    }

    public final synchronized void b(int i2) {
        this.s = i2;
        if (this.k != null) {
            this.k.a(this.s);
        }
    }

    public final synchronized void b(bhk bhk) {
        this.H = bhk;
    }

    public final void b(String str) {
        f(str);
    }

    public final void b(String str, bhc<? super cti> bhc) {
        ctj ctj = this.j;
        if (ctj != null) {
            synchronized (ctj.c) {
                List list = (List) ctj.b.get(str);
                if (list != null) {
                    list.remove(bhc);
                }
            }
        }
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
            new ccv(this).b(z2 ? "expanded" : "default");
        }
    }

    public final dtr c() {
        return this.D;
    }

    public final synchronized void c(boolean z2) {
        if (this.k != null) {
            this.k.a(this.j.b(), z2);
        } else {
            this.n = z2;
        }
    }

    public final Activity d() {
        return this.a.a;
    }

    public final synchronized void d(boolean z2) {
        this.t = z2;
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
            bkc.z();
            css.a(this);
            W();
            this.o = true;
            cml.a();
            cml.a();
            d("about:blank");
        }
    }

    public final bkz e() {
        return this.e;
    }

    public final synchronized void e(boolean z2) {
        this.A += z2 ? 1 : -1;
        if (this.A <= 0 && this.k != null) {
            this.k.q();
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
            defpackage.cpn.b(r2, r0)     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctu.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public final void f() {
        bhk t2 = t();
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
                    bkc.z();
                    css.a(this);
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

    public final dts j() {
        return this.F;
    }

    public final cpp k() {
        return this.c;
    }

    public final int l() {
        return getMeasuredHeight();
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!D()) {
            super.loadData(str, str2, str3);
        } else {
            cpn.a(5);
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!D()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            cpn.a(5);
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!D()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                bkc.i().a(e2, "AdWebViewImpl.loadUrl");
                cpn.a(5);
            }
        } else {
            cpn.a(5);
        }
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
                    bkc.A();
                    crb.a((View) this, d2);
                }
                OnScrollChangedListener e2 = this.j.e();
                if (e2 != null) {
                    bkc.A();
                    crb.a((View) this, e2);
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
                    bkc.g().a(getViewTreeObserver(), d2);
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

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            bkc.e();
            cmu.a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            sb.toString();
            cpn.a(3);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!D()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                ctj ctj = this.j;
                if (!(ctj == null || ctj.f == null)) {
                    this.j.f.a();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) dqe.f().a(dtg.aw)).booleanValue()) {
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
        bhk t2 = t();
        if (t2 != null && O2) {
            t2.o();
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
            cuv r0 = r7.l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.d()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0021
            goto L_0x01d6
        L_0x0021:
            cuv r0 = r7.l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.e()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x006d
            ctx r0 = r7.b()     // Catch:{ all -> 0x01db }
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
            cuv r0 = r7.l     // Catch:{ all -> 0x01db }
            boolean r0 = r0.b()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00bf
            dsw<java.lang.Boolean> r0 = defpackage.dtg.ck     // Catch:{ all -> 0x01db }
            dte r1 = defpackage.dqe.f()     // Catch:{ all -> 0x01db }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x01db }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01db }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x00ba
            boolean r0 = defpackage.caf.c()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x008e
            goto L_0x00ba
        L_0x008e:
            java.lang.String r0 = "/contentHeight"
            ctv r1 = new ctv     // Catch:{ all -> 0x01db }
            r1.<init>(r7)     // Catch:{ all -> 0x01db }
            r7.a(r0, r1)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "="
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
            cuv r0 = r7.l     // Catch:{ all -> 0x01db }
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
            cuv r2 = r7.l     // Catch:{ all -> 0x01db }
            int r2 = r2.b     // Catch:{ all -> 0x01db }
            r3 = 1
            if (r2 > r0) goto L_0x010a
            cuv r2 = r7.l     // Catch:{ all -> 0x01db }
            int r2 = r2.a     // Catch:{ all -> 0x01db }
            if (r2 <= r5) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r2 = 0
            goto L_0x010b
        L_0x010a:
            r2 = 1
        L_0x010b:
            dsw<java.lang.Boolean> r4 = defpackage.dtg.df     // Catch:{ all -> 0x01db }
            dte r6 = defpackage.dqe.f()     // Catch:{ all -> 0x01db }
            java.lang.Object r4 = r6.a(r4)     // Catch:{ all -> 0x01db }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01db }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01db }
            if (r4 == 0) goto L_0x0143
            cuv r4 = r7.l     // Catch:{ all -> 0x01db }
            int r4 = r4.b     // Catch:{ all -> 0x01db }
            float r4 = (float) r4     // Catch:{ all -> 0x01db }
            float r6 = r7.g     // Catch:{ all -> 0x01db }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01db }
            float r6 = r7.g     // Catch:{ all -> 0x01db }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x013f
            cuv r0 = r7.l     // Catch:{ all -> 0x01db }
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
            cuv r0 = r7.l     // Catch:{ all -> 0x01db }
            int r0 = r0.b     // Catch:{ all -> 0x01db }
            float r0 = (float) r0     // Catch:{ all -> 0x01db }
            float r4 = r7.g     // Catch:{ all -> 0x01db }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01db }
            cuv r4 = r7.l     // Catch:{ all -> 0x01db }
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
            defpackage.cpn.a(r8)     // Catch:{ all -> 0x01db }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01db }
            if (r8 == r2) goto L_0x01a1
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01db }
        L_0x01a1:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01db }
            boolean r8 = r7.h     // Catch:{ all -> 0x01db }
            if (r8 != 0) goto L_0x01d4
            dny r8 = r7.Q     // Catch:{ all -> 0x01db }
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
            dny r8 = r7.Q     // Catch:{ all -> 0x01db }
            com.google.android.gms.internal.ads.zzhu$zza$zzb r9 = com.google.android.gms.internal.ads.zzhu.zza.zzb.BANNER_SIZE_VALID     // Catch:{ all -> 0x01db }
            r8.a(r9)     // Catch:{ all -> 0x01db }
            r7.i = r3     // Catch:{ all -> 0x01db }
        L_0x01c9:
            cuv r8 = r7.l     // Catch:{ all -> 0x01db }
            int r8 = r8.b     // Catch:{ all -> 0x01db }
            cuv r9 = r7.l     // Catch:{ all -> 0x01db }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctu.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!D()) {
            try {
                super.onPause();
            } catch (Exception e2) {
                cml.a("Could not pause webview.", e2);
            }
        }
    }

    public final void onResume() {
        if (!D()) {
            try {
                super.onResume();
            } catch (Exception e2) {
                cml.a("Could not resume webview.", e2);
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
            dio dio = this.b;
            if (dio != null) {
                dio.a(motionEvent);
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

    public final void q() {
        if (this.C == null) {
            dtm.a(this.F.b, this.D, "aes2");
            this.C = dtm.a(this.F.b);
            this.F.a("native:view_show", this.C);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.c.a);
        a("onshow", (Map<String, ?>) hashMap);
    }

    public final void r() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(bkc.D().b()));
        hashMap.put("app_volume", String.valueOf(bkc.D().a()));
        hashMap.put("device_volume", String.valueOf(cnl.a(getContext())));
        a("volume", (Map<String, ?>) hashMap);
    }

    public final Context s() {
        return this.a.b;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.G = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof ctj) {
            this.j = (ctj) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!D()) {
            try {
                super.stopLoading();
            } catch (Exception e2) {
                cml.a("Could not stop loading webview.", e2);
            }
        }
    }

    public final synchronized bhk t() {
        return this.k;
    }

    public final synchronized bhk u() {
        return this.H;
    }

    public final synchronized cuv v() {
        return this.l;
    }

    public final synchronized String w() {
        return this.m;
    }

    public final /* synthetic */ cup x() {
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
}
