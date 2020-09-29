package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nna reason: default package */
public final class nna implements nka {
    public final /* synthetic */ Object call(Object obj, Object obj2) {
        hcs hcs = (hcs) obj;
        Integer num = (Integer) obj2;
        List body = hcs.body();
        if (!body.isEmpty() && num.intValue() < body.size() && num.intValue() >= 0) {
            int i = 0;
            Iterator it = hcs.body().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                hcm hcm = (hcm) it.next();
                if (hcm != null) {
                    if ("home:recentlyPlayedCarousel".equals(hcm.componentId().id())) {
                        break;
                    }
                }
                i++;
            }
            if (i == -1) {
                return hcs;
            }
            hcm hcm2 = (hcm) body.get(i);
            ArrayList arrayList = new ArrayList(body);
            arrayList.remove(i);
            arrayList.add(num.intValue(), hcm2);
            hcs = hcs.toBuilder().a((List<? extends hcm>) arrayList).a();
        }
        return hcs;
    }
}
