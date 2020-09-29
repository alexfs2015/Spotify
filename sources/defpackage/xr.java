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

/* renamed from: xr reason: default package */
public final class xr implements xo, xu, a {
    private final String a;
    private final aac b;
    private final ds<LinearGradient> c = new ds<>();
    private final ds<RadialGradient> d = new ds<>();
    private final Matrix e = new Matrix();
    private final Path f = new Path();
    private final Paint g = new Paint(1);
    private final RectF h = new RectF();
    private final List<xw> i = new ArrayList();
    private final GradientType j;
    private final yd<zt, zt> k;
    private final yd<Integer, Integer> l;
    private final yd<PointF, PointF> m;
    private final yd<PointF, PointF> n;
    private yd<ColorFilter, ColorFilter> o;
    private final xc p;
    private final int q;

    public xr(xc xcVar, aac aac, zu zuVar) {
        this.b = aac;
        this.a = zuVar.g;
        this.p = xcVar;
        this.j = zuVar.a;
        this.f.setFillType(zuVar.b);
        this.q = (int) (xcVar.a.a() / 32.0f);
        this.k = zuVar.c.a();
        this.k.a((a) this);
        aac.a(this.k);
        this.l = zuVar.d.a();
        this.l.a((a) this);
        aac.a(this.l);
        this.m = zuVar.e.a();
        this.m.a((a) this);
        aac.a(this.m);
        this.n = zuVar.f.a();
        this.n.a((a) this);
        aac.a(this.n);
    }

    public final void a() {
        this.p.invalidateSelf();
    }

    public final void a(List<xm> list, List<xm> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            xm xmVar = (xm) list2.get(i2);
            if (xmVar instanceof xw) {
                this.i.add((xw) xmVar);
            }
        }
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        Shader shader;
        Matrix matrix2 = matrix;
        String str = "GradientFillContent#draw";
        wz.c(str);
        this.f.reset();
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            this.f.addPath(((xw) this.i.get(i3)).e(), matrix2);
        }
        this.f.computeBounds(this.h, false);
        if (this.j == GradientType.Linear) {
            long c2 = (long) c();
            shader = (LinearGradient) this.c.a(c2, null);
            if (shader == 0) {
                PointF pointF = (PointF) this.m.d();
                PointF pointF2 = (PointF) this.n.d();
                zt ztVar = (zt) this.k.d();
                LinearGradient linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, ztVar.b, ztVar.a, TileMode.CLAMP);
                this.c.b(c2, linearGradient);
                shader = linearGradient;
            }
        } else {
            long c3 = (long) c();
            shader = (RadialGradient) this.d.a(c3, null);
            if (shader == 0) {
                PointF pointF3 = (PointF) this.m.d();
                PointF pointF4 = (PointF) this.n.d();
                zt ztVar2 = (zt) this.k.d();
                int[] iArr = ztVar2.b;
                float[] fArr = ztVar2.a;
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
        yd<ColorFilter, ColorFilter> ydVar = this.o;
        if (ydVar != null) {
            this.g.setColorFilter((ColorFilter) ydVar.d());
        }
        this.g.setAlpha(abv.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.l.d()).intValue())) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f, this.g);
        wz.d(str);
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(((xw) this.i.get(i2)).e(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final String b() {
        return this.a;
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

    public final void a(yz yzVar, int i2, List<yz> list, yz yzVar2) {
        abv.a(yzVar, i2, list, yzVar2, this);
    }

    public final <T> void a(T t, abz<T> abz) {
        if (t == xf.x) {
            if (abz == null) {
                this.o = null;
                return;
            }
            this.o = new ys(abz);
            this.o.a((a) this);
            this.b.a(this.o);
        }
    }
}
