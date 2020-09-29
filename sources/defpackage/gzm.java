package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gzm reason: default package */
public final class gzm {
    private static final gzq[] a = new gzq[0];
    private final a b;

    public gzm(a aVar) {
        this.b = aVar;
    }

    private a a(gzt gzt) {
        return voj.a(a("ubi:specification_id", gzt), a("ubi:specification_hash", gzt), a("ubi:generator_hash", gzt), a("ubi:app", gzt), this.b.ae_().toString()).a(b(gzt));
    }

    private static String a(String str, gzt gzt) {
        return gzt.logging().string(str, "");
    }

    private static List<vom> b(gzt gzt) {
        gzq[] gzqArr = (gzq[]) jtc.a(gzt.logging().bundleArray("ubi:path"), a);
        if (gzqArr.length <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(gzqArr.length);
        for (gzq a2 : gzqArr) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }

    private static vom a(gzq gzq) {
        a a2 = vom.a();
        String str = "";
        a2.a = gzq.string("name", str);
        a2.b = gzq.string("id", str);
        a2.c = gzq.string("uri", str);
        a2.d = gzq.intValue("position");
        return a2.a();
    }

    public final C0083a a(guy guy) {
        a a2 = a(guy.b);
        String str = guy.a;
        if (((str.hashCode() == 94750088 && str.equals("click")) ? (char) 0 : 65535) != 0) {
            return a2.b();
        }
        return a2.a();
    }
}
