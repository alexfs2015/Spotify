package defpackage;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@cfp
/* renamed from: cug reason: default package */
public class cug extends ctj {
    public cug(cti cti, boolean z) {
        super(cti, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof cti)) {
            cpn.a(5);
            return null;
        }
        cti cti = (cti) webView;
        if (this.g != null) {
            this.g.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.a(str, map);
        }
        if (cti.x() != null) {
            cti.x().m();
        }
        dsw<String> dsw = cti.v().c() ? dtg.K : cti.B() ? dtg.J : dtg.I;
        String str2 = (String) dqe.f().a(dsw);
        bkc.e();
        return cmu.c(cti.getContext(), cti.k().a, str2);
    }
}
