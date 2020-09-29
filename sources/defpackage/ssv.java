package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import com.spotify.base.java.logging.Logger;

/* renamed from: ssv reason: default package */
public final class ssv extends WebChromeClient {
    public final ssw a = new ssw();
    public final ssx b;
    private final b c;

    /* renamed from: ssv$a */
    public interface a {
        void onStartActivityForResult(Intent intent, int i);
    }

    /* renamed from: ssv$b */
    public interface b {
        void onCloseWindow();
    }

    public ssv(b bVar, a aVar) {
        this.c = bVar;
        this.b = new ssx(aVar);
    }

    public final void onCloseWindow(WebView webView) {
        this.c.onCloseWindow();
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        this.a.a(webView.getContext(), str2, jsResult);
        return true;
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        ssx ssx = this.b;
        Logger.b("onShowFileChooser", new Object[0]);
        Logger.b("setCurrentCallback %s", valueCallback);
        ssx.a((Uri[]) null);
        ssx.a = valueCallback;
        if (VERSION.SDK_INT >= 21) {
            ssx.a(fileChooserParams);
        } else {
            ssx.a((Uri[]) null);
        }
        return true;
    }
}
