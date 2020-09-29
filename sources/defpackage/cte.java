package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: cte reason: default package */
final class cte implements bgl<csr> {
    private final /* synthetic */ ctd a;

    cte(ctd ctd) {
        this.a = ctd;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.a) {
                        if (this.a.B != parseInt) {
                            this.a.B = parseInt;
                            this.a.requestLayout();
                        }
                    }
                } catch (Exception unused) {
                    cow.a(5);
                }
            }
        }
    }
}
