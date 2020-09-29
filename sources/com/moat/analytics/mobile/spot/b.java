package com.moat.analytics.mobile.spot;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.moat.analytics.mobile.spot.a.a.a;
import java.lang.ref.WeakReference;

abstract class b {
    j a;
    final String b;
    final boolean c;
    boolean d;
    boolean e;
    private WeakReference<View> f;
    private WeakReference<WebView> g;
    private final z h;
    private final boolean i;

    b(View view, boolean z, boolean z2) {
        String str;
        p.a(3, "BaseTracker", (Object) this, "Initializing.");
        if (z) {
            StringBuilder sb = new StringBuilder("m");
            sb.append(hashCode());
            str = sb.toString();
        } else {
            str = "";
        }
        this.b = str;
        this.f = new WeakReference<>(view);
        this.i = z;
        this.c = z2;
        this.d = false;
        this.e = false;
        this.h = new z();
    }

    private void g() {
        String str;
        a.a(this.g);
        String str2 = "BaseTracker";
        p.a(3, str2, (Object) this, "Attempting bridge installation.");
        if (this.g.get() != null) {
            if (!this.i && !this.c) {
                this.a = new j((WebView) this.g.get(), a.WEBVIEW);
            }
            boolean z = this.a.a;
            StringBuilder sb = new StringBuilder("Bridge ");
            sb.append(z ? "" : "not ");
            sb.append("installed.");
            str = sb.toString();
        } else {
            this.a = null;
            str = "Bridge not installed, WebView is null.";
        }
        p.a(3, str2, (Object) this, str);
    }

    /* access modifiers changed from: 0000 */
    public abstract String a();

    /* access modifiers changed from: 0000 */
    public void a(WebView webView) {
        if (webView != null) {
            this.g = new WeakReference<>(webView);
            if (this.a == null) {
                g();
            }
            j jVar = this.a;
            if (jVar != null && jVar.a) {
                this.a.a(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(j jVar) {
        this.a = jVar;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        String str = "BaseTracker";
        p.a(3, str, (Object) this, "Attempting to start impression.");
        if (!this.e) {
            boolean b2 = this.a.b(this);
            StringBuilder sb = new StringBuilder("Impression ");
            sb.append(b2 ? "" : "not ");
            sb.append("started.");
            p.a(3, str, (Object) this, sb.toString());
            if (!b2) {
                return b2;
            }
            this.d = true;
            this.e = true;
            return b2;
        }
        p.a(3, str, (Object) this, "startTracking failed, tracker already started");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a());
        sb2.append(" already started");
        p.a("[INFO] ", sb2.toString());
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        String str = "BaseTracker";
        p.a(3, str, (Object) this, "Attempting to stop impression.");
        this.d = false;
        boolean c2 = this.a.c(this);
        StringBuilder sb = new StringBuilder("Impression tracking ");
        sb.append(c2 ? "" : "not ");
        sb.append("stopped.");
        p.a(3, str, (Object) this, sb.toString());
        return c2;
    }

    public void changeTargetView(View view) {
        String str;
        StringBuilder sb = new StringBuilder("changing view to ");
        if (view != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(view.getClass().getSimpleName());
            sb2.append("@");
            sb2.append(view.hashCode());
            str = sb2.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        p.a(3, "BaseTracker", (Object) this, sb.toString());
        this.f = new WeakReference<>(view);
    }

    /* access modifiers changed from: 0000 */
    public View d() {
        return (View) this.f.get();
    }

    /* access modifiers changed from: 0000 */
    public String e() {
        if (d() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(d().getClass().getSimpleName());
        sb.append("@");
        sb.append(d().hashCode());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public String f() {
        this.h.a(this.b, d());
        return this.h.a;
    }

    @Deprecated
    public void setActivity(Activity activity) {
    }

    public void startTracking() {
        boolean z;
        String str = "BaseTracker";
        try {
            p.a(3, str, (Object) this, "In startTracking method.");
            z = b();
        } catch (Exception e2) {
            m.a(e2);
            z = false;
        }
        StringBuilder sb = new StringBuilder("Attempt to start tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        p.a(3, str, (Object) this, sb.toString());
        String str2 = z ? "[SUCCESS] " : "[ERROR] ";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a());
        sb2.append(" startTracking ");
        sb2.append(z ? "succeeded" : "failed");
        sb2.append(" for ");
        sb2.append(e());
        p.a(str2, sb2.toString());
    }

    public void stopTracking() {
        boolean z;
        String str = "BaseTracker";
        try {
            p.a(3, str, (Object) this, "In stopTracking method.");
            z = c();
        } catch (Exception e2) {
            m.a(e2);
            z = false;
        }
        StringBuilder sb = new StringBuilder("Attempt to stop tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        p.a(3, str, (Object) this, sb.toString());
        String str2 = z ? "[SUCCESS] " : "[ERROR] ";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a());
        sb2.append(" stopTracking ");
        sb2.append(z ? "succeeded" : "failed");
        sb2.append(" for ");
        sb2.append(e());
        p.a(str2, sb2.toString());
    }
}
