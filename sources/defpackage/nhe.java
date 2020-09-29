package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nhe reason: default package */
public final class nhe implements nel {
    public final /* synthetic */ Object call(Object obj, Object obj2) {
        gzz gzz = (gzz) obj;
        Integer num = (Integer) obj2;
        List body = gzz.body();
        if (!body.isEmpty() && num.intValue() < body.size() && num.intValue() >= 0) {
            int i = 0;
            Iterator it = gzz.body().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                gzt gzt = (gzt) it.next();
                if (gzt != null) {
                    if ("home:recentlyPlayedCarousel".equals(gzt.componentId().id())) {
                        break;
                    }
                }
                i++;
            }
            if (i == -1) {
                return gzz;
            }
            gzt gzt2 = (gzt) body.get(i);
            ArrayList arrayList = new ArrayList(body);
            arrayList.remove(i);
            arrayList.add(num.intValue(), gzt2);
            gzz = gzz.toBuilder().a((List<? extends gzt>) arrayList).a();
        }
        return gzz;
    }
}
