package defpackage;

import android.graphics.PointF;

/* renamed from: zl reason: default package */
public final class zl implements zp<PointF, PointF> {
    private final ze a;
    private final ze b;

    public zl(ze zeVar, ze zeVar2) {
        this.a = zeVar;
        this.b = zeVar2;
    }

    public final yd<PointF, PointF> a() {
        return new yp(this.a.a(), this.b.a());
    }
}
