package defpackage;

import android.graphics.PointF;

/* renamed from: aak reason: default package */
public final class aak implements aag {
    public final String a;
    public final aad<PointF, PointF> b;
    public final zw c;
    public final zs d;

    public aak(String str, aad<PointF, PointF> aad, zw zwVar, zs zsVar) {
        this.a = str;
        this.b = aad;
        this.c = zwVar;
        this.d = zsVar;
    }

    public final ya a(xq xqVar, aaq aaq) {
        return new ym(xqVar, aaq, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RectangleShape{position=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
