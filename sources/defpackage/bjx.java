package defpackage;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: bjx reason: default package */
final class bjx extends WebViewClient {
    private final /* synthetic */ bjw a;

    bjx(bjw bjw) {
        this.a = bjw;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.a.g != null) {
            try {
                this.a.g.a(0);
            } catch (RemoteException e) {
                cml.b("#007 Could not call remote method.", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.a.d())) {
            return false;
        }
        String str2 = "#007 Could not call remote method.";
        if (str.startsWith((String) dqe.f().a(dtg.cs))) {
            if (this.a.g != null) {
                try {
                    this.a.g.a(3);
                } catch (RemoteException e) {
                    cml.b(str2, e);
                }
            }
            this.a.a(0);
            return true;
        }
        if (str.startsWith((String) dqe.f().a(dtg.ct))) {
            if (this.a.g != null) {
                try {
                    this.a.g.a(0);
                } catch (RemoteException e2) {
                    cml.b(str2, e2);
                }
            }
            this.a.a(0);
            return true;
        }
        if (str.startsWith((String) dqe.f().a(dtg.cu))) {
            if (this.a.g != null) {
                try {
                    this.a.g.c();
                } catch (RemoteException e3) {
                    cml.b(str2, e3);
                }
            }
            this.a.a(this.a.b(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.a.g != null) {
                try {
                    this.a.g.b();
                } catch (RemoteException e4) {
                    cml.b(str2, e4);
                }
            }
            bjw.b(this.a, this.a.c(str));
            return true;
        }
    }
}
