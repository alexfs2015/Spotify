package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hdn reason: default package */
public final class hdn {
    private final a a;

    /* renamed from: hdn$a */
    public interface a {
        hcm convertComponent(hcm hcm);
    }

    public hdn(a aVar) {
        this.a = (a) fbp.a(aVar);
    }

    private List<hcm> a(List<? extends hcm> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (hcm hcm : list) {
            List a2 = a(hcm.children());
            if (a2 != null) {
                hcm = hcm.toBuilder().a(a2).a();
                z = true;
            }
            hcm convertComponent = this.a.convertComponent(hcm);
            if (convertComponent != null) {
                hcm = convertComponent;
                z = true;
            }
            arrayList.add(hcm);
        }
        if (z) {
            return arrayList;
        }
        return null;
    }

    public final hcs a(hcs hcs) {
        List a2 = a(hcs.body());
        return a2 != null ? hcs.toBuilder().a(a2).a() : hcs;
    }
}
