package com.moat.analytics.mobile;

import android.util.Log;
import android.webkit.WebView;
import com.moat.analytics.mobile.base.exception.b;
import com.moat.analytics.mobile.base.functional.a;

class bg implements WebAdTracker {
    private final a<? extends be> a;
    private final ap b;

    bg(WebView webView, a aVar, ap apVar) {
        a<? extends be> a2;
        this.b = apVar;
        apVar.b();
        if (webView == null) {
            if (apVar.b()) {
                Log.e("MoatWebAdTracker", "WebView is null. Will not track.");
            }
            a2 = a.a();
        } else {
            bf bfVar = new bf(webView, webView, false, aVar, apVar);
            a2 = a.a(bfVar);
        }
        this.a = a2;
    }

    public boolean track() {
        boolean b2 = this.b.b();
        boolean z = false;
        try {
            if (this.a.c()) {
                z = ((be) this.a.b()).b();
            } else if (b2) {
                Log.e("MoatWebAdTracker", "Internal tracker not available. Not tracking.");
            }
        } catch (b e) {
            com.moat.analytics.mobile.base.exception.a.a(e);
        }
        if (b2) {
            StringBuilder sb = new StringBuilder("Attempt to start tracking ad was ");
            sb.append(z ? "" : "un");
            sb.append("successful.");
        }
        return z;
    }
}
