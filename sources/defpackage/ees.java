package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

@cey
/* renamed from: ees reason: default package */
public final class ees extends cce {
    public final Context a;
    String b = c("description");
    long c = d("start_ticks");
    long d = d("end_ticks");
    String e = c("summary");
    String f = c("location");
    private final Map<String, String> g;

    public ees(csr csr, Map<String, String> map) {
        super(csr, "createCalendarEvent");
        this.g = map;
        this.a = csr.d();
    }

    private final String c(String str) {
        return TextUtils.isEmpty((CharSequence) this.g.get(str)) ? "" : (String) this.g.get(str);
    }

    private final long d(String str) {
        String str2 = (String) this.g.get(str);
        long j = -1;
        if (str2 == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
        }
        return j;
    }
}
