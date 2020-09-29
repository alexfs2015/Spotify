package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: yl reason: default package */
public final class yl extends yi<PointF> {
    private final PointF e = new PointF();
    private final float[] f = new float[2];
    private yk g;
    private PathMeasure h;

    public yl(List<? extends abx<PointF>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(abx abx, float f2) {
        yk ykVar = (yk) abx;
        Path path = ykVar.a;
        if (path == null) {
            return (PointF) abx.b;
        }
        if (this.d != null) {
            PointF pointF = (PointF) this.d.a(ykVar.e, ykVar.f.floatValue(), ykVar.b, ykVar.c, b(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.g != ykVar) {
            this.h = new PathMeasure(path, false);
            this.g = ykVar;
        }
        PathMeasure pathMeasure = this.h;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.f, null);
        PointF pointF2 = this.e;
        float[] fArr = this.f;
        pointF2.set(fArr[0], fArr[1]);
        return this.e;
    }
}
