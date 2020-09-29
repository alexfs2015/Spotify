package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: yz reason: default package */
public final class yz extends yw<PointF> {
    private final PointF e = new PointF();
    private final float[] f = new float[2];
    private yy g;
    private PathMeasure h;

    public yz(List<? extends acl<PointF>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(acl acl, float f2) {
        yy yyVar = (yy) acl;
        Path path = yyVar.a;
        if (path == null) {
            return (PointF) acl.b;
        }
        if (this.d != null) {
            PointF pointF = (PointF) this.d.a(yyVar.e, yyVar.f.floatValue(), yyVar.b, yyVar.c, b(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.g != yyVar) {
            this.h = new PathMeasure(path, false);
            this.g = yyVar;
        }
        PathMeasure pathMeasure = this.h;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.f, null);
        PointF pointF2 = this.e;
        float[] fArr = this.f;
        pointF2.set(fArr[0], fArr[1]);
        return this.e;
    }
}
