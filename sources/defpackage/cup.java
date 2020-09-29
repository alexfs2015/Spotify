package defpackage;

import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@cey
/* renamed from: cup reason: default package */
final class cup extends WebViewClient {
    private final cut a;
    private final cuy b;
    private final cuv c;
    private final cux d;
    private final cuz e = new cuz();

    cup(cut cut, cuy cuy, cuv cuv, cux cux) {
        this.a = cut;
        this.b = cuy;
        this.c = cuv;
        this.d = cux;
    }

    private final boolean a(cuq cuq) {
        return this.a.c(cuq);
    }

    private final WebResourceResponse b(cuq cuq) {
        return this.b.d(cuq);
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            this.d.a(new cuq(str));
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        cuz.a(i, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        cuz.a(sslError);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return b(new cuq(webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return b(new cuq(str));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return a(new cuq(webResourceRequest));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return a(new cuq(str));
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String str2 = "Loading resource: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            clu.a();
            this.c.b(new cuq(str));
        }
    }
}
