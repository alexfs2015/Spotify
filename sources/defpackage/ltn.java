package defpackage;

import com.spotify.mobile.android.util.LinkType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ltn reason: default package */
public final class ltn implements sgx {
    public final /* synthetic */ Object apply(Object obj) {
        gzz gzz = (gzz) obj;
        return gzz.toBuilder().a(a(gzz.body())).a();
    }

    private static List<? extends gzt> a(List<? extends gzt> list) {
        if (list.isEmpty()) {
            return list;
        }
        String str = null;
        ArrayList arrayList = new ArrayList(list.size());
        for (gzt gzt : list) {
            if ("header".equals(gzt.componentId().category())) {
                str = gzt.text().title();
            }
            arrayList.add(a(gzt, str).toBuilder().a(a(gzt.children())).a());
        }
        return arrayList;
    }

    private static gzt a(gzt gzt, String str) {
        a aVar;
        gzy target = gzt.target();
        if (target == null) {
            return gzt;
        }
        String uri = target.uri();
        if (uri == null) {
            return gzt;
        }
        String str2 = (String) fay.a(uri);
        a a = gzt.toBuilder().a((gzy) null);
        String str3 = "";
        String str4 = "click";
        if (jst.a(str2, LinkType.TRACK)) {
            String str5 = (String) jtc.a(rzj.e(gzt), str3);
            String a2 = rzj.a(str5, str);
            boolean b = lla.b(gzt);
            a a3 = a.a("preview_key", (Serializable) a2).a(str4, lss.a(str2, str5, a2, b));
            gzp a4 = lss.a(str2, str5, a2, b);
            aVar = a3.a("imageClick", a4).a("rightAccessoryClick", lsi.a(str2));
        } else if (lrz.a(uri)) {
            aVar = a.a(str4, lso.a(str2, (String) jtc.a(str, str3)));
        } else {
            aVar = a.a(str4, lso.a(str2));
        }
        return aVar.a();
    }
}
