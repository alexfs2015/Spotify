package defpackage;

import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;

/* renamed from: cnc reason: default package */
public class cnc extends cnb {
    public ctj a(cti cti, boolean z) {
        return new cuf(cti, z);
    }

    public final Set<String> a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    public final boolean a(Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    public boolean a(Context context, WebSettings webSettings) {
        super.a(context, webSettings);
        return ((Boolean) cou.a(context, new cnd(context, webSettings))).booleanValue();
    }

    public final boolean a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    public final boolean b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    public final boolean c(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
