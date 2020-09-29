package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: niw reason: default package */
public final class niw {
    private static int a(hcm hcm) {
        if (hcm == null) {
            return 0;
        }
        return Arrays.hashCode(new Object[]{hcm.componentId(), hcm.text(), hcm.metadata(), hcm.logging(), hcm.custom(), hcm.id(), hcm.events(), Integer.valueOf(a(hcm.children()))});
    }

    public static int a(hcs hcs) {
        if (hcs == null) {
            return 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(a(hcs.header())), Integer.valueOf(a(hcs.body())), Integer.valueOf(a(hcs.overlays())), Integer.valueOf(Arrays.hashCode(new Object[]{hcs.custom()}))});
    }

    private static int a(List<? extends hcm> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (hcm a : list) {
            arrayList.add(Integer.valueOf(a(a)));
        }
        return Arrays.hashCode(new Object[]{arrayList});
    }
}
