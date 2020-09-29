package defpackage;

import android.graphics.PointF;

/* renamed from: zz reason: default package */
public final class zz implements aad<PointF, PointF> {
    private final zs a;
    private final zs b;

    public zz(zs zsVar, zs zsVar2) {
        this.a = zsVar;
        this.b = zsVar2;
    }

    public final yr<PointF, PointF> a() {
        return new zd(this.a.a(), this.b.a());
    }
}
