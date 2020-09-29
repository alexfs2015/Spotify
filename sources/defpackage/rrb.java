package defpackage;

import java.util.List;

/* renamed from: rrb reason: default package */
public final class rrb extends a {
    private final List<? extends hcm> a;
    private final List<? extends hcm> b;

    public rrb(List<? extends hcm> list, List<? extends hcm> list2) {
        this.a = list;
        this.b = list2;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final int a() {
        List<? extends hcm> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final boolean a(int i, int i2) {
        List<? extends hcm> list = this.a;
        hcm hcm = null;
        Object obj = list != null ? (hcm) list.get(i) : null;
        List<? extends hcm> list2 = this.b;
        if (list2 != null) {
            hcm = (hcm) list2.get(i2);
        }
        return (obj == null || hcm == null || obj.hashCode() != hcm.hashCode()) ? false : true;
    }

    public final int b() {
        List<? extends hcm> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final boolean b(int i, int i2) {
        List<? extends hcm> list = this.a;
        String str = null;
        hcm hcm = list != null ? (hcm) list.get(i) : null;
        List<? extends hcm> list2 = this.b;
        hcm hcm2 = list2 != null ? (hcm) list2.get(i2) : null;
        hcp main = hcm != null ? hcm.images().main() : null;
        hcp main2 = hcm2 != null ? hcm2.images().main() : null;
        Object title = hcm != null ? hcm.text().title() : null;
        Object title2 = hcm2 != null ? hcm2.text().title() : null;
        Object subtitle = hcm != null ? hcm.text().subtitle() : null;
        Object subtitle2 = hcm2 != null ? hcm2.text().subtitle() : null;
        Object uri = main != null ? main.uri() : null;
        if (main2 != null) {
            str = main2.uri();
        }
        return a(title, title2) && a(subtitle, subtitle2) && a(uri, (Object) str);
    }
}
