package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aaa reason: default package */
public final class aaa implements zs {
    public final String a;
    public final List<zs> b;

    public aaa(String str, List<zs> list) {
        this.a = str;
        this.b = list;
    }

    public final xm a(xc xcVar, aac aac) {
        return new xn(xcVar, aac, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeGroup{name='");
        sb.append(this.a);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.b.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
