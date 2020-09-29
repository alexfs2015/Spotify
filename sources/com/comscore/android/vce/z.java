package com.comscore.android.vce;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.net.URL;
import java.util.Set;

class z extends x {
    am k;
    boolean l;
    /* access modifiers changed from: private */
    public String m = "InAppTrack";
    /* access modifiers changed from: private */
    public final ah<WebView> n;
    /* access modifiers changed from: private */
    public final String o;
    private int p;
    private boolean q;
    private final f r;

    z(p pVar, y yVar, am amVar, k kVar, a aVar, l lVar, s sVar, i iVar, Activity activity, WebView webView, f fVar, String str, boolean z) {
        WebView webView2 = webView;
        super(pVar, yVar, kVar, aVar, lVar, sVar, iVar, activity, webView);
        this.k = amVar;
        this.r = fVar;
        this.o = str;
        this.q = true;
        this.p = -2;
        this.n = new ah<>(webView2);
        this.l = true;
        this.e.a(-1);
        this.e.b(-1);
        a(this.n);
        if (z && this.f.f()) {
            a(webView2);
        }
        ab();
        if (this.q) {
            this.k.a(this);
            this.k.o();
            a(activity, webView2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void C() {
        aa();
        if (e()) {
            this.k.h();
        }
    }

    /* access modifiers changed from: 0000 */
    public void F() {
        Z();
        this.k.i();
    }

    /* access modifiers changed from: 0000 */
    public void H() {
        this.k.n();
    }

    /* access modifiers changed from: 0000 */
    public void P() {
        if (this.k.a()) {
            K();
        }
    }

    /* access modifiers changed from: 0000 */
    public String T() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public int U() {
        return this.p;
    }

    /* access modifiers changed from: 0000 */
    public void V() {
        Activity activity = (Activity) this.c.get();
        if (activity != null) {
            WebView webView = (WebView) this.n.get();
            if (webView != null) {
                if (this.l || !this.k.a() || !this.k.b()) {
                    this.l = false;
                    if (this.f.a((View) webView) && !this.r.b(this.o)) {
                        this.p = -2;
                        c(50);
                    }
                    a aVar = this.g;
                    String str = this.o;
                    y yVar = this.e;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.m);
                    sb.append("-inject-gg-load");
                    aVar.a(webView, str, yVar, sb.toString());
                    a aVar2 = this.g;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.m);
                    sb2.append("-unload-listener");
                    aVar2.a(webView, sb2.toString());
                    if (this.q) {
                        ab();
                    }
                    if (e()) {
                        L();
                        K();
                    }
                    return;
                }
                boolean d = this.f.d(activity);
                if (e() && d) {
                    L();
                    K();
                }
                if (!d) {
                    X();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void W() {
        Y();
    }

    /* access modifiers changed from: 0000 */
    public void X() {
        this.e.a(false);
        L();
    }

    /* access modifiers changed from: 0000 */
    public void Y() {
        if (this.p != -1 && this.r.b(this.o)) {
            this.p = -1;
            c(50);
            f fVar = this.r;
            String str = this.o;
            StringBuilder sb = new StringBuilder();
            sb.append(this.p);
            sb.append("-");
            sb.append(Q());
            fVar.a(str, sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void Z() {
        this.r.a(this.o);
    }

    /* access modifiers changed from: 0000 */
    public void a(float f) {
        a(f, f);
        G();
        L();
    }

    /* access modifiers changed from: 0000 */
    public void a(Activity activity, WebView webView) {
        b(activity, webView);
        a aVar = this.g;
        String str = this.o;
        y yVar = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        sb.append("-inject-gg-init");
        aVar.a(webView, str, yVar, sb.toString());
        this.i.a(new Runnable() {
            public void run() {
                try {
                    if (z.this.l) {
                        Activity activity = (Activity) z.this.c.get();
                        if (activity != null) {
                            WebView webView = (WebView) z.this.n.get();
                            if (webView != null) {
                                z.this.b(activity, webView);
                                a aVar = z.this.g;
                                String b = z.this.o;
                                y yVar = z.this.e;
                                StringBuilder sb = new StringBuilder();
                                sb.append(z.this.m);
                                sb.append("-inject-gg-init-1sec");
                                aVar.a(webView, b, yVar, sb.toString());
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }, c.l.intValue());
    }

    /* access modifiers changed from: 0000 */
    public void a(final WebView webView) {
        this.i.b(new Runnable() {
            public void run() {
                try {
                    if (!z.this.f.b(webView)) {
                        z.this.f.c(webView);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Set set) {
        String str;
        WebView webView = (WebView) this.n.get();
        if (webView == null) {
            return false;
        }
        try {
            str = new URL(webView.getUrl()).getHost();
        } catch (Exception unused) {
            str = "";
        }
        return str.length() <= 0 || set.contains(str);
    }

    /* access modifiers changed from: 0000 */
    public void aa() {
        if (!this.r.b(this.o)) {
            f fVar = this.r;
            String str = this.o;
            StringBuilder sb = new StringBuilder();
            sb.append(this.p);
            sb.append("-");
            sb.append(Q());
            fVar.a(str, sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (a(r0) == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (a(r0) != false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ab() {
        /*
            r3 = this;
            com.comscore.android.vce.a r0 = r3.g
            java.util.Set r0 = r0.g()
            int r1 = r0.size()
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L_0x0029
        L_0x0013:
            r3.q = r2
            goto L_0x0029
        L_0x0016:
            com.comscore.android.vce.a r0 = r3.g
            java.util.Set r0 = r0.h()
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x0029
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x0013
        L_0x0029:
            boolean r0 = r3.q
            if (r0 != 0) goto L_0x0030
            r3.q()
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.vce.z.ab():void");
    }

    /* access modifiers changed from: 0000 */
    public void b(Activity activity, WebView webView) {
        this.e.a(1);
        if (!this.f.a((View) webView)) {
            this.e.a(true);
            this.e.c(true);
            this.e.d(true);
        } else {
            this.e.a(false);
            this.e.c(false);
            this.e.d(false);
        }
        G();
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.k.p();
        ah<WebView> ahVar = this.n;
        if (ahVar != null) {
            ahVar.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(int i) {
        this.p = i;
    }

    /* access modifiers changed from: 0000 */
    public void e(int i) {
        this.e.b(i);
    }

    /* access modifiers changed from: 0000 */
    public boolean m() {
        return this.q;
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        o();
    }

    /* access modifiers changed from: 0000 */
    public void p() {
        this.e.a(1);
    }

    /* access modifiers changed from: 0000 */
    public void r() {
        this.p = -1;
        this.e.a(-1);
        L();
        this.l = true;
    }

    /* access modifiers changed from: 0000 */
    public void v() {
        this.k.i();
    }

    /* access modifiers changed from: 0000 */
    public void x() {
        if (e()) {
            this.k.h();
        }
    }
}
