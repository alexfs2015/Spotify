package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: ym reason: default package */
public final class ym extends yi<PointF> {
    private final PointF e = new PointF();

    public ym(List<abx<PointF>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(abx abx, float f) {
        if (abx.b == null || abx.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) abx.b;
        PointF pointF2 = (PointF) abx.c;
        if (this.d != null) {
            PointF pointF3 = (PointF) this.d.a(abx.e, abx.f.floatValue(), pointF, pointF2, f, b(), this.c);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.e.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.e;
    }
}
