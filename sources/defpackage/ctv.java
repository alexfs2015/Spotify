package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: ctv reason: default package */
final class ctv implements bhc<cti> {
    private final /* synthetic */ ctu a;

    ctv(ctu ctu) {
        this.a = ctu;
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
                    cpn.a(5);
                }
            }
        }
    }
}
