package defpackage;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: bjg reason: default package */
final class bjg extends WebViewClient {
    private final /* synthetic */ bjf a;

    bjg(bjf bjf) {
        this.a = bjf;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.a.g != null) {
            try {
                this.a.g.a(0);
            } catch (RemoteException e) {
                clu.b("#007 Could not call remote method.", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.a.d())) {
            return false;
        }
        String str2 = "#007 Could not call remote method.";
        if (str.startsWith((String) dpn.f().a(dsp.cs))) {
            if (this.a.g != null) {
                try {
                    this.a.g.a(3);
                } catch (RemoteException e) {
                    clu.b(str2, e);
                }
            }
            this.a.a(0);
            return true;
        }
        if (str.startsWith((String) dpn.f().a(dsp.ct))) {
            if (this.a.g != null) {
                try {
                    this.a.g.a(0);
                } catch (RemoteException e2) {
                    clu.b(str2, e2);
                }
            }
            this.a.a(0);
            return true;
        }
        if (str.startsWith((String) dpn.f().a(dsp.cu))) {
            if (this.a.g != null) {
                try {
                    this.a.g.c();
                } catch (RemoteException e3) {
                    clu.b(str2, e3);
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
                    clu.b(str2, e4);
                }
            }
            bjf.b(this.a, this.a.c(str));
            return true;
        }
    }
}
