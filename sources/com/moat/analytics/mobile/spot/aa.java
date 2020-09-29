package com.moat.analytics.mobile.spot;

import android.webkit.WebView;

class aa extends b implements WebAdTracker {
    aa(WebView webView) {
        super(webView, false, false);
        p.a(3, "WebAdTracker", (Object) this, "In initialization method.");
        super.a(webView);
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        sb.append(" created for ");
        sb.append(e());
        p.a("[SUCCESS] ", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return "WebAdTracker";
    }
}
