package defpackage;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@cfp
/* renamed from: cuf reason: default package */
public final class cuf extends cug {
    public cuf(cti cti, boolean z) {
        super(cti, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, null);
    }
}
