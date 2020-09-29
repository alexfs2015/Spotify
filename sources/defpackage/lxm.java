package defpackage;

import com.spotify.mobile.android.util.LinkType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lxm reason: default package */
public final class lxm implements sre {
    private static hcm a(hcm hcm, String str) {
        a aVar;
        hcr target = hcm.target();
        if (target == null) {
            return hcm;
        }
        String uri = target.uri();
        if (uri == null) {
            return hcm;
        }
        String str2 = (String) fbp.a(uri);
        a a = hcm.toBuilder().a((hcr) null);
        String str3 = "";
        String str4 = "click";
        if (jva.a(str2, LinkType.TRACK)) {
            String str5 = (String) jvi.a(six.e(hcm), str3);
            String a2 = six.a(str5, str);
            boolean b = lpa.b(hcm);
            aVar = a.a("preview_key", (Serializable) a2).a(str4, lwr.a(str2, str5, a2, b)).a("imageClick", lwr.a(str2, str5, a2, b)).a("rightAccessoryClick", lwh.a(str2));
        } else {
            aVar = lvy.a(uri) ? a.a(str4, lwn.a(str2, (String) jvi.a(str, str3))) : a.a(str4, lwn.a(str2));
        }
        return aVar.a();
    }

    private static List<? extends hcm> a(List<? extends hcm> list) {
        if (list.isEmpty()) {
            return list;
        }
        String str = null;
        ArrayList arrayList = new ArrayList(list.size());
        for (hcm hcm : list) {
            if ("header".equals(hcm.componentId().category())) {
                str = hcm.text().title();
            }
            arrayList.add(a(hcm, str).toBuilder().a(a(hcm.children())).a());
        }
        return arrayList;
    }

    public final /* synthetic */ Object apply(Object obj) {
        hcs hcs = (hcs) obj;
        return hcs.toBuilder().a(a(hcs.body())).a();
    }
}
