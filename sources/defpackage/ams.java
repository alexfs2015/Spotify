package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ams reason: default package */
public class ams extends anm {
    private static final String f = ams.class.getName();
    private boolean g;

    private ams(Context context, String str, String str2) {
        super(context, str);
        this.a = str2;
    }

    public static ams a(Context context, String str, String str2) {
        anm.a(context);
        return new ams(context, str, str2);
    }

    /* access modifiers changed from: protected */
    public final Bundle a(String str) {
        Bundle d = ank.d(Uri.parse(str).getQuery());
        String str2 = "bridge_args";
        String string = d.getString(str2);
        d.remove(str2);
        String str3 = "Unable to parse bridge_args JSON";
        if (!ank.a(string)) {
            try {
                d.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", amk.a(new JSONObject(string)));
            } catch (JSONException e) {
                ank.a(f, str3, (Throwable) e);
            }
        }
        String str4 = "method_results";
        String string2 = d.getString(str4);
        d.remove(str4);
        if (!ank.a(string2)) {
            if (ank.a(string2)) {
                string2 = "{}";
            }
            try {
                d.putBundle("com.facebook.platform.protocol.RESULT_ARGS", amk.a(new JSONObject(string2)));
            } catch (JSONException e2) {
                ank.a(f, str3, (Throwable) e2);
            }
        }
        d.remove("version");
        d.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", anf.a());
        return d;
    }

    public void cancel() {
        WebView webView = this.c;
        if (!this.e || this.d || webView == null || !webView.isShown()) {
            super.cancel();
        } else if (!this.g) {
            this.g = true;
            StringBuilder sb = new StringBuilder("javascript:");
            sb.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            webView.loadUrl(sb.toString());
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public final void run() {
                    ams.super.cancel();
                }
            }, 1500);
        }
    }
}
