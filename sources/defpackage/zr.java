package defpackage;

import android.graphics.PointF;

/* renamed from: zr reason: default package */
public final class zr implements zs {
    public final String a;
    public final zp<PointF, PointF> b;
    public final zi c;
    public final boolean d;

    public zr(String str, zp<PointF, PointF> zpVar, zi ziVar, boolean z) {
        this.a = str;
        this.b = zpVar;
        this.c = ziVar;
        this.d = z;
    }

    public final xm a(xc xcVar, aac aac) {
        return new xp(xcVar, aac, this);
    }
}
