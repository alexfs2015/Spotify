package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: hcf reason: default package */
public final class hcf {
    private static final hcj[] a = new hcj[0];
    private final a b;

    public hcf(a aVar) {
        this.b = aVar;
    }

    private static String a(String str, hcm hcm) {
        return hcm.logging().string(str, "");
    }

    private a a(hcm hcm) {
        return wbr.a(a("ubi:specification_id", hcm), a("ubi:specification_hash", hcm), a("ubi:generator_hash", hcm), a("ubi:app", hcm), this.b.ae_().toString()).a(b(hcm));
    }

    private static wbu a(hcj hcj) {
        a a2 = wbu.a();
        String str = "";
        a2.a = hcj.string("name", str);
        a2.b = hcj.string("id", str);
        a2.c = hcj.string("uri", str);
        a2.d = hcj.intValue("position");
        return a2.a();
    }

    private static List<wbu> b(hcm hcm) {
        hcj[] hcjArr = (hcj[]) jvi.a(hcm.logging().bundleArray("ubi:path"), a);
        if (hcjArr.length <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(hcjArr.length);
        for (hcj a2 : hcjArr) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }

    public final C0086a a(gwy gwy) {
        a a2 = a(gwy.b);
        String str = gwy.a;
        return ((str.hashCode() == 94750088 && str.equals("click")) ? (char) 0 : 65535) != 0 ? a2.b() : a2.a();
    }
}
