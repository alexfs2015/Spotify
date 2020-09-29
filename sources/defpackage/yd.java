package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.List;

/* renamed from: yd reason: default package */
public final class yd implements yi, yk, a {
    private final Path a = new Path();
    private final String b;
    private final xq c;
    private final yr<?, PointF> d;
    private final yr<?, PointF> e;
    private final aaf f;
    private yq g;
    private boolean h;

    public yd(xq xqVar, aaq aaq, aaf aaf) {
        this.b = aaf.a;
        this.c = xqVar;
        this.d = aaf.c.a();
        this.e = aaf.b.a();
        this.f = aaf;
        aaq.a(this.d);
        aaq.a(this.e);
        this.d.a((a) this);
        this.e.a((a) this);
    }

    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    public final <T> void a(T t, acn<T> acn) {
        if (t == xt.g) {
            this.d.a(acn);
            return;
        }
        if (t == xt.h) {
            this.e.a(acn);
        }
    }

    public final void a(List<ya> list, List<ya> list2) {
        for (int i = 0; i < list.size(); i++) {
            ya yaVar = (ya) list.get(i);
            if (yaVar instanceof yq) {
                yq yqVar = (yq) yaVar;
                if (yqVar.a == Type.Simultaneously) {
                    this.g = yqVar;
                    this.g.a(this);
                }
            }
        }
    }

    public final void a(zn znVar, int i, List<zn> list, zn znVar2) {
        acj.a(znVar, i, list, znVar2, this);
    }

    public final String b() {
        return this.b;
    }

    public final Path e() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        PointF pointF = (PointF) this.d.d();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.a.reset();
        if (this.f.d) {
            float f6 = -f3;
            this.a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            float f11 = f6;
            this.a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f12 = f4 + 0.0f;
            this.a.cubicTo(f12, f3, f2, f10, f2, 0.0f);
            this.a.cubicTo(f2, f9, f12, f11, 0.0f, f11);
        } else {
            float f13 = -f3;
            this.a.moveTo(0.0f, f13);
            float f14 = f4 + 0.0f;
            float f15 = 0.0f - f5;
            this.a.cubicTo(f14, f13, f2, f15, f2, 0.0f);
            float f16 = f5 + 0.0f;
            this.a.cubicTo(f2, f16, f14, f3, 0.0f, f3);
            float f17 = 0.0f - f4;
            float f18 = -f2;
            this.a.cubicTo(f17, f3, f18, f16, f18, 0.0f);
            float f19 = f13;
            this.a.cubicTo(f18, f15, f17, f19, 0.0f, f19);
        }
        PointF pointF2 = (PointF) this.e.d();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        ack.a(this.a, this.g);
        this.h = true;
        return this.a;
    }
}
