package defpackage;

import android.os.Build.VERSION;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@cfp
/* renamed from: cvf reason: default package */
public class cvf extends WebView implements cvk, cvm, cvo, cvp {
    private final List<cvk> a = new CopyOnWriteArrayList();
    final List<cvp> b = new CopyOnWriteArrayList();
    final cuu c;
    protected final WebViewClient d;
    private final List<cvm> e = new CopyOnWriteArrayList();
    private final List<cvo> f = new CopyOnWriteArrayList();

    public cvf(cuu cuu) {
        super(cuu);
        this.c = cuu;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        bkc.g().a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            cml.a("Unable to enable Javascript.", e2);
        }
        setLayerType(1, null);
        this.d = new cvg(this, this, this, this);
        super.setWebViewClient(this.d);
    }

    public void a(cvh cvh) {
        for (cvo a2 : this.f) {
            a2.a(cvh);
        }
    }

    public final void a(cvk cvk) {
        this.a.add(cvk);
    }

    public final void a(cvm cvm) {
        this.e.add(cvm);
    }

    public final void a(cvo cvo) {
        this.f.add(cvo);
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            cml.a();
        }
    }

    public final void b(cvh cvh) {
        for (cvm b2 : this.e) {
            b2.b(cvh);
        }
    }

    public void b(String str) {
        cvl.a(this, str);
    }

    public final boolean c(cvh cvh) {
        for (cvk c2 : this.a) {
            if (c2.c(cvh)) {
                return true;
            }
        }
        return false;
    }

    public final WebResourceResponse d(cvh cvh) {
        for (cvp d2 : this.b) {
            WebResourceResponse d3 = d2.d(cvh);
            if (d3 != null) {
                return d3;
            }
        }
        return null;
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
            bkc.i().a(e2, "CoreWebView.loadUrl");
            cml.b("#007 Could not call remote method.", e2);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }
}
