package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.util.LinkType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lto reason: default package */
public final class lto implements sgx {
    public final /* synthetic */ Object apply(Object obj) {
        gzz gzz = (gzz) obj;
        return gzz.toBuilder().a(a(gzz.body())).a();
    }

    private static List<? extends gzt> a(List<? extends gzt> list) {
        if (list.isEmpty()) {
            return list;
        }
        gzt gzt = null;
        ArrayList arrayList = new ArrayList(list.size());
        for (gzt gzt2 : list) {
            if (gzt2.componentId().category().equals(HubsComponentCategory.HEADER.mId)) {
                gzt = gzt2;
            }
            arrayList.add(a(gzt2, gzt).toBuilder().a(a(gzt2.children())).a());
        }
        return arrayList;
    }

    private static gzt a(gzt gzt, gzt gzt2) {
        a aVar;
        gzy target = gzt.target();
        if (target == null) {
            return gzt;
        }
        String uri = target.uri();
        if (uri == null) {
            return gzt;
        }
        String str = (String) fay.a(uri);
        a a = gzt.toBuilder().a((gzy) null);
        String str2 = "click";
        if (jst.a(str, LinkType.TRACK)) {
            String str3 = "";
            String str4 = (String) jtc.a(rzj.e(gzt), str3);
            if (gzt2 != null) {
                str3 = gzt2.id();
            }
            String a2 = rzj.a(str4, str3);
            boolean b = lla.b(gzt);
            aVar = a.a("preview_key", (Serializable) a2).a(str2, lss.a(str, str4, a2, b)).a("imageClick", lss.a(str, str4, a2, b)).a("rightAccessoryClick", lsg.a(str));
        } else if (sgq.a(str)) {
            aVar = a.a(str2, lso.a(str));
        } else {
            aVar = a.a(str2, lsm.a(str));
        }
        return aVar.a();
    }
}
