package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: dvb reason: default package */
final class dvb implements bhc<Object> {
    final /* synthetic */ dva a;
    private final /* synthetic */ ceu b;

    dvb(dva dva, ceu ceu) {
        this.a = dva;
        this.b = ceu;
    }

    public final void zza(Object obj, Map<String, String> map) {
        cti cti = (cti) this.a.a.get();
        if (cti == null) {
            this.b.b("/loadHtml", this);
            return;
        }
        cti.x().a((cuq) new dvc(this, map, this.b));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            cti.loadData(str, "text/html", "UTF-8");
        } else {
            cti.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
