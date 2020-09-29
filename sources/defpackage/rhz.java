package defpackage;

import java.util.List;

/* renamed from: rhz reason: default package */
public final class rhz extends a {
    private final List<? extends gzt> a;
    private final List<? extends gzt> b;

    public rhz(List<? extends gzt> list, List<? extends gzt> list2) {
        this.a = list;
        this.b = list2;
    }

    public final int a() {
        List<? extends gzt> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int b() {
        List<? extends gzt> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final boolean a(int i, int i2) {
        List<? extends gzt> list = this.a;
        gzt gzt = null;
        Object obj = list != null ? (gzt) list.get(i) : null;
        List<? extends gzt> list2 = this.b;
        if (list2 != null) {
            gzt = (gzt) list2.get(i2);
        }
        return (obj == null || gzt == null || obj.hashCode() != gzt.hashCode()) ? false : true;
    }

    public final boolean b(int i, int i2) {
        List<? extends gzt> list = this.a;
        String str = null;
        gzt gzt = list != null ? (gzt) list.get(i) : null;
        List<? extends gzt> list2 = this.b;
        gzt gzt2 = list2 != null ? (gzt) list2.get(i2) : null;
        gzw main = gzt != null ? gzt.images().main() : null;
        gzw main2 = gzt2 != null ? gzt2.images().main() : null;
        Object title = gzt != null ? gzt.text().title() : null;
        Object title2 = gzt2 != null ? gzt2.text().title() : null;
        Object subtitle = gzt != null ? gzt.text().subtitle() : null;
        Object subtitle2 = gzt2 != null ? gzt2.text().subtitle() : null;
        Object uri = main != null ? main.uri() : null;
        if (main2 != null) {
            str = main2.uri();
        }
        return a(title, title2) && a(subtitle, subtitle2) && a(uri, (Object) str);
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
