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

/* renamed from: sio reason: default package */
public final class sio extends WebChromeClient {
    public final sip a = new sip();
    public final siq b;
    private final b c;

    /* renamed from: sio$a */
    public interface a {
        void onStartActivityForResult(Intent intent, int i);
    }

    /* renamed from: sio$b */
    public interface b {
        void onCloseWindow();
    }

    public sio(b bVar, a aVar) {
        this.c = bVar;
        this.b = new siq(aVar);
    }

    public final void onCloseWindow(WebView webView) {
        this.c.onCloseWindow();
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        this.a.a(webView.getContext(), str2, jsResult);
        return true;
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        siq siq = this.b;
        Logger.b("onShowFileChooser", new Object[0]);
        Logger.b("setCurrentCallback %s", valueCallback);
        siq.a((Uri[]) null);
        siq.a = valueCallback;
        if (VERSION.SDK_INT >= 21) {
            siq.a(fileChooserParams);
        } else {
            siq.a((Uri[]) null);
        }
        return true;
    }
}
