package defpackage;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@cey
/* renamed from: ctp reason: default package */
public class ctp extends css {
    public ctp(csr csr, boolean z) {
        super(csr, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof csr)) {
            cow.a(5);
            return null;
        }
        csr csr = (csr) webView;
        if (this.g != null) {
            this.g.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.a(str, map);
        }
        if (csr.x() != null) {
            csr.x().m();
        }
        dsf<String> dsf = csr.v().c() ? dsp.K : csr.B() ? dsp.J : dsp.I;
        String str2 = (String) dpn.f().a(dsf);
        bjl.e();
        return cmd.c(csr.getContext(), csr.k().a, str2);
    }
}
