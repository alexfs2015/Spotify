package defpackage;

import android.os.Build.VERSION;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@cey
/* renamed from: cuo reason: default package */
public class cuo extends WebView implements cut, cuv, cux, cuy {
    private final List<cut> a = new CopyOnWriteArrayList();
    final List<cuy> b = new CopyOnWriteArrayList();
    final cud c;
    protected final WebViewClient d;
    private final List<cuv> e = new CopyOnWriteArrayList();
    private final List<cux> f = new CopyOnWriteArrayList();

    public cuo(cud cud) {
        super(cud);
        this.c = cud;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        bjl.g().a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            clu.a("Unable to enable Javascript.", e2);
        }
        setLayerType(1, null);
        this.d = new cup(this, this, this, this);
        super.setWebViewClient(this.d);
    }

    public void a(cuq cuq) {
        for (cux a2 : this.f) {
            a2.a(cuq);
        }
    }

    public final void a(cut cut) {
        this.a.add(cut);
    }

    public final void a(cuv cuv) {
        this.e.add(cuv);
    }

    public final void a(cux cux) {
        this.f.add(cux);
    }

    public final void b(cuq cuq) {
        for (cuv b2 : this.e) {
            b2.b(cuq);
        }
    }

    public void b(String str) {
        cuu.a(this, str);
    }

    public final boolean c(cuq cuq) {
        for (cut c2 : this.a) {
            if (c2.c(cuq)) {
                return true;
            }
        }
        return false;
    }

    public final WebResourceResponse d(cuq cuq) {
        for (cuy d2 : this.b) {
            WebResourceResponse d3 = d2.d(cuq);
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
            bjl.i().a(e2, "CoreWebView.loadUrl");
            clu.b("#007 Could not call remote method.", e2);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            clu.a();
        }
    }
}
