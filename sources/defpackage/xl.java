package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xl reason: default package */
public abstract class xl implements xo, xu, defpackage.yd.a {
    final Paint a = new Paint(1);
    private final PathMeasure b = new PathMeasure();
    private final Path c = new Path();
    private final Path d = new Path();
    private final RectF e = new RectF();
    private final xc f;
    private final aac g;
    private final List<a> h = new ArrayList();
    private final float[] i;
    private final yd<?, Float> j;
    private final yd<?, Integer> k;
    private final List<yd<?, Float>> l;
    private final yd<?, Float> m;
    private yd<ColorFilter, ColorFilter> n;

    /* renamed from: xl$a */
    static final class a {
        final List<xw> a;
        final yc b;

        /* synthetic */ a(yc ycVar, byte b2) {
            this(ycVar);
        }

        private a(yc ycVar) {
            this.a = new ArrayList();
            this.b = ycVar;
        }
    }

    xl(xc xcVar, aac aac, Cap cap, Join join, float f2, zg zgVar, ze zeVar, List<ze> list, ze zeVar2) {
        this.f = xcVar;
        this.g = aac;
        this.a.setStyle(Style.STROKE);
        this.a.setStrokeCap(cap);
        this.a.setStrokeJoin(join);
        this.a.setStrokeMiter(f2);
        this.k = zgVar.a();
        this.j = zeVar.a();
        if (zeVar2 == null) {
            this.m = null;
        } else {
            this.m = zeVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.l.add(((ze) list.get(i2)).a());
        }
        aac.a(this.k);
        aac.a(this.j);
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            aac.a((yd) this.l.get(i3));
        }
        yd<?, Float> ydVar = this.m;
        if (ydVar != null) {
            aac.a(ydVar);
        }
        this.k.a((defpackage.yd.a) this);
        this.j.a((defpackage.yd.a) this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((yd) this.l.get(i4)).a((defpackage.yd.a) this);
        }
        yd<?, Float> ydVar2 = this.m;
        if (ydVar2 != null) {
            ydVar2.a((defpackage.yd.a) this);
        }
    }

    public final void a() {
        this.f.invalidateSelf();
    }

    public final void a(List<xm> list, List<xm> list2) {
        a aVar = null;
        yc ycVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            xm xmVar = (xm) list.get(size);
            if (xmVar instanceof yc) {
                yc ycVar2 = (yc) xmVar;
                if (ycVar2.a == Type.Individually) {
                    ycVar = ycVar2;
                }
            }
        }
        if (ycVar != null) {
            ycVar.a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            xm xmVar2 = (xm) list2.get(size2);
            if (xmVar2 instanceof yc) {
                yc ycVar3 = (yc) xmVar2;
                if (ycVar3.a == Type.Individually) {
                    if (aVar != null) {
                        this.h.add(aVar);
                    }
                    a aVar2 = new a(ycVar3, 0);
                    ycVar3.a(this);
                    aVar = aVar2;
                }
            }
            if (xmVar2 instanceof xw) {
                if (aVar == null) {
                    aVar = new a(ycVar, 0);
                }
                aVar.a.add((xw) xmVar2);
            }
        }
        if (aVar != null) {
            this.h.add(aVar);
        }
    }

    public void a(Canvas canvas, Matrix matrix, int i2) {
        String str = "StrokeContent#draw";
        wz.c(str);
        this.a.setAlpha(abv.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.k.d()).intValue())) / 100.0f) * 255.0f), 0, 255));
        this.a.setStrokeWidth(((Float) this.j.d()).floatValue() * abw.a(matrix));
        float f2 = 0.0f;
        if (this.a.getStrokeWidth() <= 0.0f) {
            wz.d(str);
            return;
        }
        String str2 = "StrokeContent#applyDashPattern";
        wz.c(str2);
        if (this.l.isEmpty()) {
            wz.d(str2);
        } else {
            float a2 = abw.a(matrix);
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                this.i[i3] = ((Float) ((yd) this.l.get(i3)).d()).floatValue();
                if (i3 % 2 == 0) {
                    float[] fArr = this.i;
                    if (fArr[i3] < 1.0f) {
                        fArr[i3] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.i;
                    if (fArr2[i3] < 0.1f) {
                        fArr2[i3] = 0.1f;
                    }
                }
                float[] fArr3 = this.i;
                fArr3[i3] = fArr3[i3] * a2;
            }
            yd<?, Float> ydVar = this.m;
            if (ydVar != null) {
                f2 = ((Float) ydVar.d()).floatValue();
            }
            this.a.setPathEffect(new DashPathEffect(this.i, f2));
            wz.d(str2);
        }
        yd<ColorFilter, ColorFilter> ydVar2 = this.n;
        if (ydVar2 != null) {
            this.a.setColorFilter((ColorFilter) ydVar2.d());
        }
        for (int i4 = 0; i4 < this.h.size(); i4++) {
            a aVar = (a) this.h.get(i4);
            if (aVar.b != null) {
                a(canvas, aVar, matrix);
            } else {
                String str3 = "StrokeContent#buildPath";
                wz.c(str3);
                this.c.reset();
                for (int size = aVar.a.size() - 1; size >= 0; size--) {
                    this.c.addPath(((xw) aVar.a.get(size)).e(), matrix);
                }
                wz.d(str3);
                String str4 = "StrokeContent#drawPath";
                wz.c(str4);
                canvas.drawPath(this.c, this.a);
                wz.d(str4);
            }
        }
        wz.d(str);
    }

    private void a(Canvas canvas, a aVar, Matrix matrix) {
        float f2;
        String str = "StrokeContent#applyTrimPath";
        wz.c(str);
        if (aVar.b == null) {
            wz.d(str);
            return;
        }
        this.c.reset();
        for (int size = aVar.a.size() - 1; size >= 0; size--) {
            this.c.addPath(((xw) aVar.a.get(size)).e(), matrix);
        }
        this.b.setPath(this.c, false);
        float length = this.b.getLength();
        while (this.b.nextContour()) {
            length += this.b.getLength();
        }
        float floatValue = (((Float) aVar.b.d.d()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) aVar.b.b.d()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) aVar.b.c.d()).floatValue() * length) / 100.0f) + floatValue;
        float f3 = 0.0f;
        for (int size2 = aVar.a.size() - 1; size2 >= 0; size2--) {
            this.d.set(((xw) aVar.a.get(size2)).e());
            this.d.transform(matrix);
            this.b.setPath(this.d, false);
            float length2 = this.b.getLength();
            float f4 = 1.0f;
            if (floatValue3 > length) {
                float f5 = floatValue3 - length;
                if (f5 < f3 + length2 && f3 < f5) {
                    f2 = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f4 = Math.min(f5 / length2, 1.0f);
                    abw.a(this.d, f2, f4, 0.0f);
                    canvas.drawPath(this.d, this.a);
                    f3 += length2;
                }
            }
            float f6 = f3 + length2;
            if (f6 >= floatValue2 && f3 <= floatValue3) {
                if (f6 > floatValue3 || floatValue2 >= f3) {
                    f2 = floatValue2 < f3 ? 0.0f : (floatValue2 - f3) / length2;
                    if (floatValue3 <= f6) {
                        f4 = (floatValue3 - f3) / length2;
                    }
                    abw.a(this.d, f2, f4, 0.0f);
                    canvas.drawPath(this.d, this.a);
                } else {
                    canvas.drawPath(this.d, this.a);
                }
            }
            f3 += length2;
        }
        wz.d(str);
    }

    public final void a(RectF rectF, Matrix matrix) {
        String str = "StrokeContent#getBounds";
        wz.c(str);
        this.c.reset();
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            a aVar = (a) this.h.get(i2);
            for (int i3 = 0; i3 < aVar.a.size(); i3++) {
                this.c.addPath(((xw) aVar.a.get(i3)).e(), matrix);
            }
        }
        this.c.computeBounds(this.e, false);
        float floatValue = ((Float) this.j.d()).floatValue();
        RectF rectF2 = this.e;
        float f2 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f2, this.e.top - f2, this.e.right + f2, this.e.bottom + f2);
        rectF.set(this.e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        wz.d(str);
    }

    public final void a(yz yzVar, int i2, List<yz> list, yz yzVar2) {
        abv.a(yzVar, i2, list, yzVar2, this);
    }

    public <T> void a(T t, abz<T> abz) {
        if (t == xf.d) {
            this.k.a(abz);
        } else if (t == xf.k) {
            this.j.a(abz);
        } else {
            if (t == xf.x) {
                if (abz == null) {
                    this.n = null;
                    return;
                }
                this.n = new ys(abz);
                this.n.a((defpackage.yd.a) this);
                this.g.a(this.n);
            }
        }
    }
}
