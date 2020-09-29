package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.List;

/* renamed from: ym reason: default package */
public final class ym implements yi, yk, a {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final xq d;
    private final yr<?, PointF> e;
    private final yr<?, PointF> f;
    private final yr<?, Float> g;
    private yq h;
    private boolean i;

    public ym(xq xqVar, aaq aaq, aak aak) {
        this.c = aak.a;
        this.d = xqVar;
        this.e = aak.b.a();
        this.f = aak.c.a();
        this.g = aak.d.a();
        aaq.a(this.e);
        aaq.a(this.f);
        aaq.a(this.g);
        this.e.a((a) this);
        this.f.a((a) this);
        this.g.a((a) this);
    }

    public final void a() {
        this.i = false;
        this.d.invalidateSelf();
    }

    public final <T> void a(T t, acn<T> acn) {
    }

    public final void a(List<ya> list, List<ya> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ya yaVar = (ya) list.get(i2);
            if (yaVar instanceof yq) {
                yq yqVar = (yq) yaVar;
                if (yqVar.a == Type.Simultaneously) {
                    this.h = yqVar;
                    this.h.a(this);
                }
            }
        }
    }

    public final void a(zn znVar, int i2, List<zn> list, zn znVar2) {
        acj.a(znVar, i2, list, znVar2, this);
    }

    public final String b() {
        return this.c;
    }

    public final Path e() {
        if (this.i) {
            return this.a;
        }
        this.a.reset();
        PointF pointF = (PointF) this.f.d();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        yr<?, Float> yrVar = this.g;
        float floatValue = yrVar == null ? 0.0f : ((Float) yrVar.d()).floatValue();
        float min = Math.min(f2, f3);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF pointF2 = (PointF) this.e.d();
        this.a.moveTo(pointF2.x + f2, (pointF2.y - f3) + floatValue);
        this.a.lineTo(pointF2.x + f2, (pointF2.y + f3) - floatValue);
        if (floatValue > 0.0f) {
            float f4 = floatValue * 2.0f;
            this.b.set((pointF2.x + f2) - f4, (pointF2.y + f3) - f4, pointF2.x + f2, pointF2.y + f3);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f2) + floatValue, pointF2.y + f3);
        if (floatValue > 0.0f) {
            float f5 = floatValue * 2.0f;
            this.b.set(pointF2.x - f2, (pointF2.y + f3) - f5, (pointF2.x - f2) + f5, pointF2.y + f3);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f2, (pointF2.y - f3) + floatValue);
        if (floatValue > 0.0f) {
            float f6 = floatValue * 2.0f;
            this.b.set(pointF2.x - f2, pointF2.y - f3, (pointF2.x - f2) + f6, (pointF2.y - f3) + f6);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f2) - floatValue, pointF2.y - f3);
        if (floatValue > 0.0f) {
            float f7 = floatValue * 2.0f;
            this.b.set((pointF2.x + f2) - f7, pointF2.y - f3, pointF2.x + f2, (pointF2.y - f3) + f7);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        ack.a(this.a, this.h);
        this.i = true;
        return this.a;
    }
}
