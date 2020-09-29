package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: cun reason: default package */
final class cun implements bgl<csr> {
    private final /* synthetic */ cum a;

    cun(cum cum) {
        this.a = cum;
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
                    cow.a(5);
                }
            }
        }
    }
}
