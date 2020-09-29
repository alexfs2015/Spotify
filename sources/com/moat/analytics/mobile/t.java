package com.moat.analytics.mobile;

import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moat.analytics.mobile.base.exception.a;

class t extends WebViewClient {
    private final String a;
    private final q b;
    private final ap c;

    private t(String str, q qVar, ap apVar) {
        this.c = apVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        this.a = sb.toString();
        this.b = qVar;
    }

    /* access modifiers changed from: private */
    public void a(WebView webView) {
        try {
            if (this.c.a() != ar.OFF) {
                this.c.b();
                webView.loadUrl(String.format("javascript:(function() { window.__zMoatInit__ = window.__zMoatInit__ || true;window.MoatMAK = window.MoatMAK || %s; })()", new Object[]{this.b.a()}));
            }
        } catch (Exception e) {
            if (this.c.b()) {
                Log.e("MoatJavaScriptBridge", "Failed to initialize communication (did not set environment variables).", e);
            }
        }
    }

    private void a(WebView webView, String str) {
        if (this.c.a() != ar.OFF) {
            bd a2 = this.b.a(str.substring(this.a.length()));
            if (!a2.a()) {
                String b2 = a2.b();
                StringBuilder sb = new StringBuilder("javascript:");
                sb.append(b2);
                webView.loadUrl(sb.toString());
            }
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            str = "";
        }
        try {
            if (!str.startsWith(this.a)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            a(webView, str);
            return true;
        } catch (Exception e) {
            a.a(e);
            return false;
        }
    }
}
