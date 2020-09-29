package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: duz reason: default package */
public final class duz implements bhc<Object> {
    private final WeakReference<duv> a;
    private final String b;

    public duz(duv duv, String str) {
        this.a = new WeakReference<>(duv);
        this.b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.b.equals(str)) {
            try {
                Integer.parseInt((String) map.get("eventType"));
            } catch (Exception e) {
                cml.a("Parse Scion log event type error", e);
            }
            if ("_ai".equals(str2)) {
                duv duv = (duv) this.a.get();
                if (duv != null) {
                    duv.y();
                }
            } else if ("_ac".equals(str2)) {
                duv duv2 = (duv) this.a.get();
                if (duv2 != null) {
                    duv2.z();
                }
            }
        }
    }
}
