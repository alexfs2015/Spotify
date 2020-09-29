package defpackage;

import android.graphics.PointF;
import java.util.List;

/* renamed from: za reason: default package */
public final class za extends yw<PointF> {
    private final PointF e = new PointF();

    public za(List<acl<PointF>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(acl acl, float f) {
        if (acl.b == null || acl.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) acl.b;
        PointF pointF2 = (PointF) acl.c;
        if (this.d != null) {
            PointF pointF3 = (PointF) this.d.a(acl.e, acl.f.floatValue(), pointF, pointF2, f, b(), this.c);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.e.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.e;
    }
}
