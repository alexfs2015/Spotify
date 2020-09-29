package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: yk reason: default package */
public final class yk extends abx<PointF> {
    Path a;

    public yk(xa xaVar, abx<PointF> abx) {
        super(xaVar, abx.b, abx.c, abx.d, abx.e, abx.f);
        boolean z = (this.c == null || this.b == null || !((PointF) this.b).equals(((PointF) this.c).x, ((PointF) this.c).y)) ? false : true;
        if (this.c != null && !z) {
            this.a = abw.a((PointF) this.b, (PointF) this.c, abx.g, abx.h);
        }
    }
}
