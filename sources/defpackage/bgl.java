package defpackage;

import android.text.TextUtils;
import java.util.Map;

@cfp
/* renamed from: bgl reason: default package */
public final class bgl implements bhc<cti> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        cti cti = (cti) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                cpn.a(5);
            } else if (TextUtils.isEmpty(str4)) {
                cpn.a(5);
            } else {
                try {
                    long b = bkc.l().b() + (Long.parseLong(str4) - bkc.l().a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    dts j = cti.j();
                    dtt dtt = j.b;
                    dtr dtr = (dtr) j.a.get(str3);
                    String[] strArr = {str2};
                    if (!(dtt == null || dtr == null)) {
                        dtt.a(dtr, b, strArr);
                    }
                    Map<String, dtr> map2 = j.a;
                    dtt dtt2 = j.b;
                    map2.put(str2, dtt2 == null ? null : dtt2.a(b));
                } catch (NumberFormatException unused) {
                    cpn.a(5);
                }
            }
        } else {
            String str5 = "value";
            if ("experiment".equals(str)) {
                String str6 = (String) map.get(str5);
                if (TextUtils.isEmpty(str6)) {
                    cpn.a(5);
                    return;
                }
                dtt dtt3 = cti.j().b;
                if (dtt3 == null) {
                    cpn.a(5);
                } else {
                    dtt3.a("e", str6);
                }
            } else {
                if ("extra".equals(str)) {
                    String str7 = (String) map.get("name");
                    String str8 = (String) map.get(str5);
                    if (TextUtils.isEmpty(str8)) {
                        cpn.a(5);
                    } else if (TextUtils.isEmpty(str7)) {
                        cpn.a(5);
                    } else {
                        dtt dtt4 = cti.j().b;
                        if (dtt4 == null) {
                            cpn.a(5);
                            return;
                        }
                        dtt4.a(str7, str8);
                    }
                }
            }
        }
    }
}
