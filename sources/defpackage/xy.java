package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.List;

/* renamed from: xy reason: default package */
public final class xy implements xu, xw, a {
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final String c;
    private final xc d;
    private final yd<?, PointF> e;
    private final yd<?, PointF> f;
    private final yd<?, Float> g;
    private yc h;
    private boolean i;

    public final <T> void a(T t, abz<T> abz) {
    }

    public xy(xc xcVar, aac aac, zw zwVar) {
        this.c = zwVar.a;
        this.d = xcVar;
        this.e = zwVar.b.a();
        this.f = zwVar.c.a();
        this.g = zwVar.d.a();
        aac.a(this.e);
        aac.a(this.f);
        aac.a(this.g);
        this.e.a((a) this);
        this.f.a((a) this);
        this.g.a((a) this);
    }

    public final String b() {
        return this.c;
    }

    public final void a(List<xm> list, List<xm> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            xm xmVar = (xm) list.get(i2);
            if (xmVar instanceof yc) {
                yc ycVar = (yc) xmVar;
                if (ycVar.a == Type.Simultaneously) {
                    this.h = ycVar;
                    this.h.a(this);
                }
            }
        }
    }

    public final Path e() {
        if (this.i) {
            return this.a;
        }
        this.a.reset();
        PointF pointF = (PointF) this.f.d();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        yd<?, Float> ydVar = this.g;
        float floatValue = ydVar == null ? 0.0f : ((Float) ydVar.d()).floatValue();
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
        abw.a(this.a, this.h);
        this.i = true;
        return this.a;
    }

    public final void a(yz yzVar, int i2, List<yz> list, yz yzVar2) {
        abv.a(yzVar, i2, list, yzVar2, this);
    }

    public final void a() {
        this.i = false;
        this.d.invalidateSelf();
    }
}
