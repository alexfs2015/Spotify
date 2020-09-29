package defpackage;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: dmr reason: default package */
final class dmr implements Runnable {
    final /* synthetic */ dmj a;
    final /* synthetic */ WebView b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dmp d;
    private ValueCallback<String> e = new dms(this);

    dmr(dmp dmp, dmj dmj, WebView webView, boolean z) {
        this.d = dmp;
        this.a = dmj;
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
