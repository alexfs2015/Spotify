package defpackage;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@cey
/* renamed from: dtc reason: default package */
public final class dtc {
    public boolean a;
    public final Object b = new Object();
    public String c;
    private final List<dta> d = new LinkedList();
    private final Map<String, String> e = new LinkedHashMap();
    private dtc f;

    public dtc(boolean z, String str, String str2) {
        this.a = z;
        this.e.put("action", str);
        this.e.put("ad_format", str2);
    }

    public final dta a() {
        return a(bjl.l().b());
    }

    public final dta a(long j) {
        if (!this.a) {
            return null;
        }
        return new dta(j, null, null);
    }

    public final void a(dtc dtc) {
        synchronized (this.b) {
            this.f = dtc;
        }
    }

    public final void a(String str, String str2) {
        if (this.a && !TextUtils.isEmpty(str2)) {
            dss a2 = bjl.i().a();
            if (a2 != null) {
                synchronized (this.b) {
                    dsw a3 = a2.a(str);
                    Map<String, String> map = this.e;
                    map.put(str, a3.a((String) map.get(str), str2));
                }
            }
        }
    }

    public final boolean a(dta dta, long j, String... strArr) {
        synchronized (this.b) {
            for (String dta2 : strArr) {
                this.d.add(new dta(j, dta2, dta));
            }
        }
        return true;
    }

    public final boolean a(dta dta, String... strArr) {
        if (!this.a || dta == null) {
            return false;
        }
        return a(dta, bjl.l().b(), strArr);
    }

    /* access modifiers changed from: 0000 */
    public final Map<String, String> c() {
        synchronized (this.b) {
            dss a2 = bjl.i().a();
            if (a2 != null) {
                if (this.f != null) {
                    Map<String, String> a3 = a2.a(this.e, this.f.c());
                    return a3;
                }
            }
            Map<String, String> map = this.e;
            return map;
        }
    }

    public final String b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.b) {
            for (dta dta : this.d) {
                long j = dta.a;
                String str = dta.b;
                dta dta2 = dta.c;
                if (dta2 != null && j > 0) {
                    long j2 = j - dta2.a;
                    sb2.append(str);
                    sb2.append('.');
                    sb2.append(j2);
                    sb2.append(',');
                }
            }
            this.d.clear();
            if (!TextUtils.isEmpty(this.c)) {
                sb2.append(this.c);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }
}
