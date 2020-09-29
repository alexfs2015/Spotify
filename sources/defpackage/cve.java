package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: cve reason: default package */
final class cve implements bhc<cti> {
    private final /* synthetic */ cvd a;

    cve(cvd cvd) {
        this.a = cvd;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.a) {
                        if (this.a.x != parseInt) {
                            this.a.x = parseInt;
                            this.a.requestLayout();
                        }
                    }
                } catch (Exception unused) {
                    cpn.a(5);
                }
            }
        }
    }
}
