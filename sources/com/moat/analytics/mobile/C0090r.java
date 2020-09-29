package com.moat.analytics.mobile;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moat.analytics.mobile.base.functional.a;

/* renamed from: com.moat.analytics.mobile.r reason: case insensitive filesystem */
class C0090r implements p {
    private final bi a;
    private final ap b;

    C0090r(Context context, ap apVar) {
        this.b = apVar;
        this.a = new bk(context);
    }

    public boolean a(String str, WebView webView, q qVar) {
        boolean b2 = this.b.b();
        String str2 = "MoatJavaScriptBridge";
        if (!webView.getSettings().getJavaScriptEnabled()) {
            if (b2) {
                Log.e(str2, "JavaScript is not enabled in the given WebView. Can't track.");
            }
            return false;
        }
        Pair a2 = this.a.a(webView);
        bj bjVar = (bj) a2.first;
        a aVar = (a) a2.second;
        if (bjVar == bj.FAIL) {
            if (b2) {
                Log.e(str2, "Could not wrap existing WebViewClient transparently.");
            }
            return false;
        }
        t tVar = new t(str, qVar, this.b);
        tVar.a(webView);
        if (aVar.c()) {
            webView.setWebViewClient(new u((WebViewClient) aVar.b(), tVar));
        } else {
            webView.setWebViewClient(tVar);
        }
        return true;
    }
}
