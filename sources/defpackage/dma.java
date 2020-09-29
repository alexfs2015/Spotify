package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: dma reason: default package */
final class dma implements Runnable {
    final /* synthetic */ dls a;
    final /* synthetic */ WebView b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dly d;
    private ValueCallback<String> e = new dmb(this);

    dma(dly dly, dls dls, WebView webView, boolean z) {
        this.d = dly;
        this.a = dls;
        this.b = webView;
        this.c = z;
    }

    public final void run() {
        if (this.b.getSettings().getJavaScriptEnabled()) {
            try {
                this.b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.e);
            } catch (Throwable unused) {
                this.e.onReceiveValue("");
            }
        }
    }
}
