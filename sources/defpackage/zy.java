package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zy reason: default package */
public final class zy {
    public final List<yv> a = new ArrayList();
    public PointF b;
    public boolean c;

    public zy(PointF pointF, boolean z, List<yv> list) {
        this.b = pointF;
        this.c = z;
        this.a.addAll(list);
    }

    public zy() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.a.size());
        sb.append("closed=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
