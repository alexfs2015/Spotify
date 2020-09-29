package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hau reason: default package */
public final class hau {
    private final a a;

    /* renamed from: hau$a */
    public interface a {
        gzt convertComponent(gzt gzt);
    }

    public hau(a aVar) {
        this.a = (a) fay.a(aVar);
    }

    public final gzz a(gzz gzz) {
        List a2 = a(gzz.body());
        return a2 != null ? gzz.toBuilder().a(a2).a() : gzz;
    }

    private List<gzt> a(List<? extends gzt> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (gzt gzt : list) {
            List a2 = a(gzt.children());
            if (a2 != null) {
                gzt = gzt.toBuilder().a(a2).a();
                z = true;
            }
            gzt convertComponent = this.a.convertComponent(gzt);
            if (convertComponent != null) {
                gzt = convertComponent;
                z = true;
            }
            arrayList.add(gzt);
        }
        if (z) {
            return arrayList;
        }
        return null;
    }
}
