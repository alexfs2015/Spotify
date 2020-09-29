package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.util.LinkType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lxn reason: default package */
public final class lxn implements sre {
    private static hcm a(hcm hcm, hcm hcm2) {
        a aVar;
        hcr target = hcm.target();
        if (target == null) {
            return hcm;
        }
        String uri = target.uri();
        if (uri == null) {
            return hcm;
        }
        String str = (String) fbp.a(uri);
        a a = hcm.toBuilder().a((hcr) null);
        String str2 = "click";
        if (jva.a(str, LinkType.TRACK)) {
            String str3 = "";
            String str4 = (String) jvi.a(six.e(hcm), str3);
            if (hcm2 != null) {
                str3 = hcm2.id();
            }
            String a2 = six.a(str4, str3);
            boolean b = lpa.b(hcm);
            aVar = a.a("preview_key", (Serializable) a2).a(str2, lwr.a(str, str4, a2, b)).a("imageClick", lwr.a(str, str4, a2, b)).a("rightAccessoryClick", lwf.a(str));
        } else {
            aVar = sqx.a(str) ? a.a(str2, lwn.a(str)) : a.a(str2, lwl.a(str));
        }
        return aVar.a();
    }

    private static List<? extends hcm> a(List<? extends hcm> list) {
        if (list.isEmpty()) {
            return list;
        }
        hcm hcm = null;
        ArrayList arrayList = new ArrayList(list.size());
        for (hcm hcm2 : list) {
            if (hcm2.componentId().category().equals(HubsComponentCategory.HEADER.mId)) {
                hcm = hcm2;
            }
            arrayList.add(a(hcm2, hcm).toBuilder().a(a(hcm2.children())).a());
        }
        return arrayList;
    }

    public final /* synthetic */ Object apply(Object obj) {
        hcs hcs = (hcs) obj;
        return hcs.toBuilder().a(a(hcs.body())).a();
    }
}
