package defpackage;

import java.util.List;

/* renamed from: nos reason: default package */
public final class nos implements nka {
    public final /* synthetic */ Object call(Object obj, Object obj2) {
        hcs hcs = (hcs) obj;
        Integer num = (Integer) obj2;
        List body = hcs.body();
        if (!body.isEmpty() && num.intValue() < body.size() && num.intValue() >= 0) {
            hcj custom = hcs.custom();
            String str = "recentlyPlayed";
            hcj bundle = custom.bundle(str);
            if (bundle == null) {
                return hcs;
            }
            String str2 = "position";
            if ((bundle != null ? bundle.intValue(str2, -1) : -1) == -1) {
                return hcs;
            }
            hcs = hcs.toBuilder().a(custom.toBuilder().a(str, bundle.toBuilder().a(str2, num.intValue()).a()).a()).a();
        }
        return hcs;
    }
}
