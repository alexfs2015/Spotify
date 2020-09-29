package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ndh reason: default package */
public final class ndh {
    public static int a(gzz gzz) {
        if (gzz == null) {
            return 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(a(gzz.header())), Integer.valueOf(a(gzz.body())), Integer.valueOf(a(gzz.overlays())), Integer.valueOf(Arrays.hashCode(new Object[]{gzz.custom()}))});
    }

    private static int a(gzt gzt) {
        if (gzt == null) {
            return 0;
        }
        return Arrays.hashCode(new Object[]{gzt.componentId(), gzt.text(), gzt.metadata(), gzt.logging(), gzt.custom(), gzt.id(), gzt.events(), Integer.valueOf(a(gzt.children()))});
    }

    private static int a(List<? extends gzt> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (gzt a : list) {
            arrayList.add(Integer.valueOf(a(a)));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }
}
