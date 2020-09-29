package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yf reason: default package */
public final class yf implements yc, yi, a {
    private final String a;
    private final aaq b;
    private final ds<LinearGradient> c = new ds<>();
    private final ds<RadialGradient> d = new ds<>();
    private final Matrix e = new Matrix();
    private final Path f = new Path();
    private final Paint g = new Paint(1);
    private final RectF h = new RectF();
    private final List<yk> i = new ArrayList();
    private final GradientType j;
    private final yr<aah, aah> k;
    private final yr<Integer, Integer> l;
    private final yr<PointF, PointF> m;
    private final yr<PointF, PointF> n;
    private yr<ColorFilter, ColorFilter> o;
    private final xq p;
    private final int q;

    public yf(xq xqVar, aaq aaq, aai aai) {
        this.b = aaq;
        this.a = aai.g;
        this.p = xqVar;
        this.j = aai.a;
        this.f.setFillType(aai.b);
        this.q = (int) (xqVar.a.a() / 32.0f);
        this.k = aai.c.a();
        this.k.a((a) this);
        aaq.a(this.k);
        this.l = aai.d.a();
        this.l.a((a) this);
        aaq.a(this.l);
        this.m = aai.e.a();
        this.m.a((a) this);
        aaq.a(this.m);
        this.n = aai.f.a();
        this.n.a((a) this);
        aaq.a(this.n);
    }

    private int c() {
        int round = Math.round(this.m.c * ((float) this.q));
        int round2 = Math.round(this.n.c * ((float) this.q));
        int round3 = Math.round(this.k.c * ((float) this.q));
        int i2 = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    public final void a() {
        this.p.invalidateSelf();
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        Shader shader;
        Matrix matrix2 = matrix;
        String str = "GradientFillContent#draw";
        xn.c(str);
        this.f.reset();
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            this.f.addPath(((yk) this.i.get(i3)).e(), matrix2);
        }
        this.f.computeBounds(this.h, false);
        if (this.j == GradientType.Linear) {
            long c2 = (long) c();
            shader = (LinearGradient) this.c.a(c2, null);
            if (shader == 0) {
                PointF pointF = (PointF) this.m.d();
                PointF pointF2 = (PointF) this.n.d();
                aah aah = (aah) this.k.d();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, aah.b, aah.a, TileMode.CLAMP);
                this.c.b(c2, linearGradient);
                shader = linearGradient;
            }
        } else {
            long c3 = (long) c();
            shader = (RadialGradient) this.d.a(c3, null);
            if (shader == 0) {
                PointF pointF3 = (PointF) this.m.d();
                PointF pointF4 = (PointF) this.n.d();
                aah aah2 = (aah) this.k.d();
                int[] iArr = aah2.b;
                float[] fArr = aah2.a;
                float f2 = pointF3.x;
                float f3 = pointF3.y;
                long j2 = c3;
                RadialGradient radialGradient = new RadialGradient(f2, f3, (float) Math.hypot((double) (pointF4.x - f2), (double) (pointF4.y - f3)), iArr, fArr, TileMode.CLAMP);
                this.d.b(j2, radialGradient);
                shader = radialGradient;
            }
        }
        this.e.set(matrix2);
        shader.setLocalMatrix(this.e);
        this.g.setShader(shader);
        yr<ColorFilter, ColorFilter> yrVar = this.o;
        if (yrVar != null) {
            this.g.setColorFilter((ColorFilter) yrVar.d());
        }
        this.g.setAlpha(acj.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.l.d()).intValue())) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        xn.d(str);
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(((yk) this.i.get(i2)).e(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final <T> void a(T t, acn<T> acn) {
        if (t == xt.x) {
            if (acn == null) {
                this.o = null;
                return;
            }
            this.o = new zg(acn);
            this.o.a((a) this);
            this.b.a(this.o);
        }
    }

    public final void a(List<ya> list, List<ya> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ya yaVar = (ya) list2.get(i2);
            if (yaVar instanceof yk) {
                this.i.add((yk) yaVar);
            }
        }
    }

    public final void a(zn znVar, int i2, List<zn> list, zn znVar2) {
        acj.a(znVar, i2, list, znVar2, this);
    }

    public final String b() {
        return this.a;
    }
}
