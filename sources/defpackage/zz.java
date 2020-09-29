package defpackage;

import android.graphics.Path.FillType;

/* renamed from: zz reason: default package */
public final class zz implements zs {
    public final FillType a;
    public final String b;
    public final zd c;
    public final zg d;
    private final boolean e;

    public zz(String str, boolean z, FillType fillType, zd zdVar, zg zgVar) {
        this.b = str;
        this.e = z;
        this.a = fillType;
        this.c = zdVar;
        this.d = zgVar;
    }

    public final xm a(xc xcVar, aac aac) {
        return new xq(xcVar, aac, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
