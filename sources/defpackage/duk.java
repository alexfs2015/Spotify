package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: duk reason: default package */
final class duk implements bgl<Object> {
    final /* synthetic */ duj a;
    private final /* synthetic */ ced b;

    duk(duj duj, ced ced) {
        this.a = duj;
        this.b = ced;
    }

    public final void zza(Object obj, Map<String, String> map) {
        csr csr = (csr) this.a.a.get();
        if (csr == null) {
            this.b.b("/loadHtml", this);
            return;
        }
        csr.x().a((ctz) new dul(this, map, this.b));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            csr.loadData(str, "text/html", "UTF-8");
        } else {
            csr.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
