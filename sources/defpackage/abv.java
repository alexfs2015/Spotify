package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: abv reason: default package */
public final class abv {
    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(zy zyVar, Path path) {
        path.reset();
        PointF pointF = zyVar.b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        for (int i = 0; i < zyVar.a.size(); i++) {
            yv yvVar = (yv) zyVar.a.get(i);
            PointF pointF3 = yvVar.a;
            PointF pointF4 = yvVar.b;
            PointF pointF5 = yvVar.c;
            if (!pointF3.equals(pointF2) || !pointF4.equals(pointF5)) {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path.lineTo(pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
        }
        if (zyVar.c) {
            path.close();
        }
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(0, Math.min(255, i));
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void a(yz yzVar, int i, List<yz> list, yz yzVar2, xu xuVar) {
        if (yzVar.c(xuVar.b(), i)) {
            list.add(yzVar2.a(xuVar.b()).a((za) xuVar));
        }
    }

    static int a(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }
}
