package defpackage;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@cey
/* renamed from: cto reason: default package */
public final class cto extends ctp {
    public cto(csr csr, boolean z) {
        super(csr, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, null);
    }
}
