package com.moat.analytics.mobile;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moat.analytics.mobile.base.exception.a;

class ae extends WebViewClient {
    final /* synthetic */ ad a;

    ae(ad adVar) {
        this.a = adVar;
    }

    public void onPageFinished(WebView webView, String str) {
        if (!this.a.i) {
            try {
                this.a.i = true;
                ad adVar = this.a;
                bf bfVar = new bf((View) this.a.g.get(), this.a.h, true, this.a.a, this.a.b);
                adVar.c = bfVar;
                this.a.c.b();
                this.a.a();
            } catch (Exception e) {
                a.a(e);
            }
        }
    }
}
