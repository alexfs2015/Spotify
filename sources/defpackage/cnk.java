package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* renamed from: cnk reason: default package */
public final class cnk extends cni {
    public final WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, i, str3, map, inputStream);
        return webResourceResponse;
    }

    public final ctj a(cti cti, boolean z) {
        return new cuh(cti, z);
    }

    public final CookieManager c(Context context) {
        if (e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            cml.a("Failed to obtain CookieManager.", th);
            bkc.i().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final int f() {
        return 16974374;
    }
}
