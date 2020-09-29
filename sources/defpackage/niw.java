package defpackage;

import java.util.List;

/* renamed from: niw reason: default package */
public final class niw implements nel {
    public final /* synthetic */ Object call(Object obj, Object obj2) {
        int i;
        gzz gzz = (gzz) obj;
        Integer num = (Integer) obj2;
        List body = gzz.body();
        if (!body.isEmpty() && num.intValue() < body.size() && num.intValue() >= 0) {
            gzq custom = gzz.custom();
            String str = "recentlyPlayed";
            gzq bundle = custom.bundle(str);
            if (bundle == null) {
                return gzz;
            }
            String str2 = "position";
            if (bundle != null) {
                i = bundle.intValue(str2, -1);
            } else {
                i = -1;
            }
            if (i == -1) {
                return gzz;
            }
            gzz = gzz.toBuilder().a(custom.toBuilder().a(str, bundle.toBuilder().a(str2, num.intValue()).a()).a()).a();
        }
        return gzz;
    }
}
