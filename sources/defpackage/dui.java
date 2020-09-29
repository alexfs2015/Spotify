package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: dui reason: default package */
public final class dui implements bgl<Object> {
    private final WeakReference<due> a;
    private final String b;

    public dui(due due, String str) {
        this.a = new WeakReference<>(due);
        this.b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.b.equals(str)) {
            try {
                Integer.parseInt((String) map.get("eventType"));
            } catch (Exception e) {
                clu.a("Parse Scion log event type error", e);
            }
            if ("_ai".equals(str2)) {
                due due = (due) this.a.get();
                if (due != null) {
                    due.y();
                }
            } else if ("_ac".equals(str2)) {
                due due2 = (due) this.a.get();
                if (due2 != null) {
                    due2.z();
                }
            }
        }
    }
}
