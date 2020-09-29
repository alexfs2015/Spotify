package defpackage;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dmb reason: default package */
final class dmb implements ValueCallback<String> {
    private final /* synthetic */ dma a;

    dmb(dma dma) {
        this.a = dma;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        float x;
        float y;
        float width;
        int height;
        String str = (String) obj;
        dly dly = this.a.d;
        dls dls = this.a.a;
        WebView webView = this.a.b;
        boolean z = this.a.c;
        synchronized (dls.a) {
            dls.d--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (dly.n || TextUtils.isEmpty(webView.getTitle())) {
                    x = webView.getX();
                    y = webView.getY();
                    width = (float) webView.getWidth();
                    height = webView.getHeight();
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    optString = sb.toString();
                    x = webView.getX();
                    y = webView.getY();
                    width = (float) webView.getWidth();
                    height = webView.getHeight();
                }
                dls.a(optString, z, x, y, width, (float) height);
            }
            if (dls.a()) {
                dly.d.b(dls);
            }
        } catch (JSONException unused) {
            cow.a(3);
        } catch (Throwable th) {
            cow.a(3);
            dly.e.a(th, "ContentFetchTask.processWebViewContent");
        }
    }
}
