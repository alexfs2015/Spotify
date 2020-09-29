package defpackage;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@cfp
/* renamed from: dtt reason: default package */
public final class dtt {
    public boolean a;
    public final Object b = new Object();
    public String c;
    private final List<dtr> d = new LinkedList();
    private final Map<String, String> e = new LinkedHashMap();
    private dtt f;

    public dtt(boolean z, String str, String str2) {
        this.a = z;
        this.e.put("action", str);
        this.e.put("ad_format", str2);
    }

    public final dtr a() {
        return a(bkc.l().b());
    }

    public final dtr a(long j) {
        if (!this.a) {
            return null;
        }
        return new dtr(j, null, null);
    }

    public final void a(dtt dtt) {
        synchronized (this.b) {
            this.f = dtt;
        }
    }

    public final void a(String str, String str2) {
        if (this.a && !TextUtils.isEmpty(str2)) {
            dtj a2 = bkc.i().a();
            if (a2 != null) {
                synchronized (this.b) {
                    dtn a3 = a2.a(str);
                    Map<String, String> map = this.e;
                    map.put(str, a3.a((String) map.get(str), str2));
                }
            }
        }
    }

    public final boolean a(dtr dtr, long j, String... strArr) {
        synchronized (this.b) {
            for (String dtr2 : strArr) {
                this.d.add(new dtr(j, dtr2, dtr));
            }
        }
        return true;
    }

    public final boolean a(dtr dtr, String... strArr) {
        if (!this.a || dtr == null) {
            return false;
        }
        return a(dtr, bkc.l().b(), strArr);
    }

    public final String b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.b) {
            for (dtr dtr : this.d) {
                long j = dtr.a;
                String str = dtr.b;
                dtr dtr2 = dtr.c;
                if (dtr2 != null && j > 0) {
                    long j2 = j - dtr2.a;
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

    /* access modifiers changed from: 0000 */
    public final Map<String, String> c() {
        synchronized (this.b) {
            dtj a2 = bkc.i().a();
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
}
