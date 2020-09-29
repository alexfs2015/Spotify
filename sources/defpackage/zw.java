package defpackage;

import android.graphics.PointF;

/* renamed from: zw reason: default package */
public final class zw implements zs {
    public final String a;
    public final zp<PointF, PointF> b;
    public final zi c;
    public final ze d;

    public zw(String str, zp<PointF, PointF> zpVar, zi ziVar, ze zeVar) {
        this.a = str;
        this.b = zpVar;
        this.c = ziVar;
        this.d = zeVar;
    }

    public final xm a(xc xcVar, aac aac) {
        return new xy(xcVar, aac, this);
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
