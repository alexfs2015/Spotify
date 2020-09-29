package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aao reason: default package */
public final class aao implements aag {
    public final String a;
    public final List<aag> b;

    public aao(String str, List<aag> list) {
        this.a = str;
        this.b = list;
    }

    public final ya a(xq xqVar, aaq aaq) {
        return new yb(xqVar, aaq, this);
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
