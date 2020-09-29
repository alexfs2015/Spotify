package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* renamed from: cmt reason: default package */
public final class cmt extends cmr {
    public final WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, i, str3, map, inputStream);
        return webResourceResponse;
    }

    public final css a(csr csr, boolean z) {
        return new ctq(csr, z);
    }

    public final CookieManager c(Context context) {
        if (e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            clu.a("Failed to obtain CookieManager.", th);
            bjl.i().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final int f() {
        return 16974374;
    }
}
