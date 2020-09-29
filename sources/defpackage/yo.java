package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: yo reason: default package */
public final class yo extends yd<zy, Path> {
    private final zy e = new zy();
    private final Path f = new Path();

    public yo(List<abx<zy>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(abx abx, float f2) {
        zy zyVar = (zy) abx.b;
        zy zyVar2 = (zy) abx.c;
        zy zyVar3 = this.e;
        if (zyVar3.b == null) {
            zyVar3.b = new PointF();
        }
        zyVar3.c = zyVar.c || zyVar2.c;
        if (zyVar.a.size() != zyVar2.a.size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(zyVar.a.size());
            sb.append("\tShape 2: ");
            sb.append(zyVar2.a.size());
            wz.b(sb.toString());
        }
        if (zyVar3.a.isEmpty()) {
            int min = Math.min(zyVar.a.size(), zyVar2.a.size());
            for (int i = 0; i < min; i++) {
                zyVar3.a.add(new yv());
            }
        }
        PointF pointF = zyVar.b;
        PointF pointF2 = zyVar2.b;
        float f3 = pointF.x;
        float f4 = f3 + ((pointF2.x - f3) * f2);
        float f5 = pointF.y;
        float f6 = f5 + ((pointF2.y - f5) * f2);
        if (zyVar3.b == null) {
            zyVar3.b = new PointF();
        }
        zyVar3.b.set(f4, f6);
        for (int size = zyVar3.a.size() - 1; size >= 0; size--) {
            yv yvVar = (yv) zyVar.a.get(size);
            yv yvVar2 = (yv) zyVar2.a.get(size);
            PointF pointF3 = yvVar.a;
            PointF pointF4 = yvVar.b;
            PointF pointF5 = yvVar.c;
            PointF pointF6 = yvVar2.a;
            PointF pointF7 = yvVar2.b;
            PointF pointF8 = yvVar2.c;
            yv yvVar3 = (yv) zyVar3.a.get(size);
            float f7 = pointF3.x;
            float f8 = f7 + ((pointF6.x - f7) * f2);
            float f9 = pointF3.y;
            yvVar3.a.set(f8, f9 + ((pointF6.y - f9) * f2));
            yv yvVar4 = (yv) zyVar3.a.get(size);
            float f10 = pointF4.x;
            float f11 = f10 + ((pointF7.x - f10) * f2);
            float f12 = pointF4.y;
            yvVar4.b.set(f11, f12 + ((pointF7.y - f12) * f2));
            yv yvVar5 = (yv) zyVar3.a.get(size);
            float f13 = pointF5.x;
            float f14 = f13 + ((pointF8.x - f13) * f2);
            float f15 = pointF5.y;
            yvVar5.c.set(f14, f15 + ((pointF8.y - f15) * f2));
        }
        abv.a(this.e, this.f);
        return this.f;
    }
}
