package defpackage;

import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@cfp
/* renamed from: cvg reason: default package */
final class cvg extends WebViewClient {
    private final cvk a;
    private final cvp b;
    private final cvm c;
    private final cvo d;
    private final cvq e = new cvq();

    cvg(cvk cvk, cvp cvp, cvm cvm, cvo cvo) {
        this.a = cvk;
        this.b = cvp;
        this.c = cvm;
        this.d = cvo;
    }

    private final boolean a(cvh cvh) {
        return this.a.c(cvh);
    }

    private final WebResourceResponse b(cvh cvh) {
        return this.b.d(cvh);
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
            cml.a();
            this.c.b(new cvh(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            this.d.a(new cvh(str));
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        cvq.a(i, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        cvq.a(sslError);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return b(new cvh(webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return b(new cvh(str));
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
        return a(new cvh(webResourceRequest));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return a(new cvh(str));
    }
}
