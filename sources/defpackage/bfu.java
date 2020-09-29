package defpackage;

import android.text.TextUtils;
import java.util.Map;

@cey
/* renamed from: bfu reason: default package */
public final class bfu implements bgl<csr> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        csr csr = (csr) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                cow.a(5);
            } else if (TextUtils.isEmpty(str4)) {
                cow.a(5);
            } else {
                try {
                    long b = bjl.l().b() + (Long.parseLong(str4) - bjl.l().a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    dtb j = csr.j();
                    dtc dtc = j.b;
                    dta dta = (dta) j.a.get(str3);
                    String[] strArr = {str2};
                    if (!(dtc == null || dta == null)) {
                        dtc.a(dta, b, strArr);
                    }
                    Map<String, dta> map2 = j.a;
                    dtc dtc2 = j.b;
                    map2.put(str2, dtc2 == null ? null : dtc2.a(b));
                } catch (NumberFormatException unused) {
                    cow.a(5);
                }
            }
        } else {
            String str5 = "value";
            if ("experiment".equals(str)) {
                String str6 = (String) map.get(str5);
                if (TextUtils.isEmpty(str6)) {
                    cow.a(5);
                    return;
                }
                dtc dtc3 = csr.j().b;
                if (dtc3 == null) {
                    cow.a(5);
                } else {
                    dtc3.a("e", str6);
                }
            } else {
                if ("extra".equals(str)) {
                    String str7 = (String) map.get("name");
                    String str8 = (String) map.get(str5);
                    if (TextUtils.isEmpty(str8)) {
                        cow.a(5);
                    } else if (TextUtils.isEmpty(str7)) {
                        cow.a(5);
                    } else {
                        dtc dtc4 = csr.j().b;
                        if (dtc4 == null) {
                            cow.a(5);
                            return;
                        }
                        dtc4.a(str7, str8);
                    }
                }
            }
        }
    }
}
