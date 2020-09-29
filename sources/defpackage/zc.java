package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: zc reason: default package */
public final class zc extends yr<aam, Path> {
    private final aam e = new aam();
    private final Path f = new Path();

    public zc(List<acl<aam>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(acl acl, float f2) {
        aam aam = (aam) acl.b;
        aam aam2 = (aam) acl.c;
        aam aam3 = this.e;
        if (aam3.b == null) {
            aam3.b = new PointF();
        }
        aam3.c = aam.c || aam2.c;
        if (aam.a.size() != aam2.a.size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(aam.a.size());
            sb.append("\tShape 2: ");
            sb.append(aam2.a.size());
            xn.b(sb.toString());
        }
        if (aam3.a.isEmpty()) {
            int min = Math.min(aam.a.size(), aam2.a.size());
            for (int i = 0; i < min; i++) {
                aam3.a.add(new zj());
            }
        }
        PointF pointF = aam.b;
        PointF pointF2 = aam2.b;
        float f3 = pointF.x;
        float f4 = f3 + ((pointF2.x - f3) * f2);
        float f5 = pointF.y;
        float f6 = f5 + ((pointF2.y - f5) * f2);
        if (aam3.b == null) {
            aam3.b = new PointF();
        }
        aam3.b.set(f4, f6);
        for (int size = aam3.a.size() - 1; size >= 0; size--) {
            zj zjVar = (zj) aam.a.get(size);
            zj zjVar2 = (zj) aam2.a.get(size);
            PointF pointF3 = zjVar.a;
            PointF pointF4 = zjVar.b;
            PointF pointF5 = zjVar.c;
            PointF pointF6 = zjVar2.a;
            PointF pointF7 = zjVar2.b;
            PointF pointF8 = zjVar2.c;
            zj zjVar3 = (zj) aam3.a.get(size);
            float f7 = pointF3.x;
            float f8 = f7 + ((pointF6.x - f7) * f2);
            float f9 = pointF3.y;
            zjVar3.a.set(f8, f9 + ((pointF6.y - f9) * f2));
            zj zjVar4 = (zj) aam3.a.get(size);
            float f10 = pointF4.x;
            float f11 = f10 + ((pointF7.x - f10) * f2);
            float f12 = pointF4.y;
            zjVar4.b.set(f11, f12 + ((pointF7.y - f12) * f2));
            zj zjVar5 = (zj) aam3.a.get(size);
            float f13 = pointF5.x;
            float f14 = f13 + ((pointF8.x - f13) * f2);
            float f15 = pointF5.y;
            zjVar5.c.set(f14, f15 + ((pointF8.y - f15) * f2));
        }
        acj.a(this.e, this.f);
        return this.f;
    }
}
