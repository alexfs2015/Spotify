package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aam reason: default package */
public final class aam {
    public final List<zj> a = new ArrayList();
    public PointF b;
    public boolean c;

    public aam() {
    }

    public aam(PointF pointF, boolean z, List<zj> list) {
        this.b = pointF;
        this.c = z;
        this.a.addAll(list);
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
