package defpackage;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dms reason: default package */
final class dms implements ValueCallback<String> {
    private final /* synthetic */ dmr a;

    dms(dmr dmr) {
        this.a = dmr;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        float x;
        float y;
        float width;
        int height;
        String str = (String) obj;
        dmp dmp = this.a.d;
        dmj dmj = this.a.a;
        WebView webView = this.a.b;
        boolean z = this.a.c;
        synchronized (dmj.a) {
            dmj.d--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (dmp.n || TextUtils.isEmpty(webView.getTitle())) {
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
                dmj.a(optString, z, x, y, width, (float) height);
            }
            if (dmj.a()) {
                dmp.d.b(dmj);
            }
        } catch (JSONException unused) {
            cpn.a(3);
        } catch (Throwable th) {
            cpn.a(3);
            dmp.e.a(th, "ContentFetchTask.processWebViewContent");
        }
    }
}
