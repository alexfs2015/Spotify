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

/* renamed from: xz reason: default package */
public abstract class xz implements yc, yi, defpackage.yr.a {
    final Paint a = new Paint(1);
    private final PathMeasure b = new PathMeasure();
    private final Path c = new Path();
    private final Path d = new Path();
    private final RectF e = new RectF();
    private final xq f;
    private final aaq g;
    private final List<a> h = new ArrayList();
    private final float[] i;
    private final yr<?, Float> j;
    private final yr<?, Integer> k;
    private final List<yr<?, Float>> l;
    private final yr<?, Float> m;
    private yr<ColorFilter, ColorFilter> n;

    /* renamed from: xz$a */
    static final class a {
        final List<yk> a;
        final yq b;

        private a(yq yqVar) {
            this.a = new ArrayList();
            this.b = yqVar;
        }

        /* synthetic */ a(yq yqVar, byte b2) {
            this(yqVar);
        }
    }

    xz(xq xqVar, aaq aaq, Cap cap, Join join, float f2, zu zuVar, zs zsVar, List<zs> list, zs zsVar2) {
        this.f = xqVar;
        this.g = aaq;
        this.a.setStyle(Style.STROKE);
        this.a.setStrokeCap(cap);
        this.a.setStrokeJoin(join);
        this.a.setStrokeMiter(f2);
        this.k = zuVar.a();
        this.j = zsVar.a();
        if (zsVar2 == null) {
            this.m = null;
        } else {
            this.m = zsVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.l.add(((zs) list.get(i2)).a());
        }
        aaq.a(this.k);
        aaq.a(this.j);
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            aaq.a((yr) this.l.get(i3));
        }
        yr<?, Float> yrVar = this.m;
        if (yrVar != null) {
            aaq.a(yrVar);
        }
        this.k.a((defpackage.yr.a) this);
        this.j.a((defpackage.yr.a) this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((yr) this.l.get(i4)).a((defpackage.yr.a) this);
        }
        yr<?, Float> yrVar2 = this.m;
        if (yrVar2 != null) {
            yrVar2.a((defpackage.yr.a) this);
        }
    }

    private void a(Canvas canvas, a aVar, Matrix matrix) {
        float f2;
        String str = "StrokeContent#applyTrimPath";
        xn.c(str);
        if (aVar.b == null) {
            xn.d(str);
            return;
        }
        this.c.reset();
        for (int size = aVar.a.size() - 1; size >= 0; size--) {
            this.c.addPath(((yk) aVar.a.get(size)).e(), matrix);
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
            this.d.set(((yk) aVar.a.get(size2)).e());
            this.d.transform(matrix);
            this.b.setPath(this.d, false);
            float length2 = this.b.getLength();
            float f4 = 1.0f;
            if (floatValue3 > length) {
                float f5 = floatValue3 - length;
                if (f5 < f3 + length2 && f3 < f5) {
                    f2 = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f4 = Math.min(f5 / length2, 1.0f);
                    ack.a(this.d, f2, f4, 0.0f);
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
                    ack.a(this.d, f2, f4, 0.0f);
                    canvas.drawPath(this.d, this.a);
                } else {
                    canvas.drawPath(this.d, this.a);
                }
            }
            f3 += length2;
        }
        xn.d(str);
    }

    public final void a() {
        this.f.invalidateSelf();
    }

    public void a(Canvas canvas, Matrix matrix, int i2) {
        String str = "StrokeContent#draw";
        xn.c(str);
        this.a.setAlpha(acj.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.k.d()).intValue())) / 100.0f) * 255.0f), 0, 255));
        this.a.setStrokeWidth(((Float) this.j.d()).floatValue() * ack.a(matrix));
        float f2 = 0.0f;
        if (this.a.getStrokeWidth() <= 0.0f) {
            xn.d(str);
            return;
        }
        String str2 = "StrokeContent#applyDashPattern";
        xn.c(str2);
        if (this.l.isEmpty()) {
            xn.d(str2);
        } else {
            float a2 = ack.a(matrix);
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                this.i[i3] = ((Float) ((yr) this.l.get(i3)).d()).floatValue();
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
            yr<?, Float> yrVar = this.m;
            if (yrVar != null) {
                f2 = ((Float) yrVar.d()).floatValue();
            }
            this.a.setPathEffect(new DashPathEffect(this.i, f2));
            xn.d(str2);
        }
        yr<ColorFilter, ColorFilter> yrVar2 = this.n;
        if (yrVar2 != null) {
            this.a.setColorFilter((ColorFilter) yrVar2.d());
        }
        for (int i4 = 0; i4 < this.h.size(); i4++) {
            a aVar = (a) this.h.get(i4);
            if (aVar.b != null) {
                a(canvas, aVar, matrix);
            } else {
                String str3 = "StrokeContent#buildPath";
                xn.c(str3);
                this.c.reset();
                for (int size = aVar.a.size() - 1; size >= 0; size--) {
                    this.c.addPath(((yk) aVar.a.get(size)).e(), matrix);
                }
                xn.d(str3);
                String str4 = "StrokeContent#drawPath";
                xn.c(str4);
                canvas.drawPath(this.c, this.a);
                xn.d(str4);
            }
        }
        xn.d(str);
    }

    public final void a(RectF rectF, Matrix matrix) {
        String str = "StrokeContent#getBounds";
        xn.c(str);
        this.c.reset();
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            a aVar = (a) this.h.get(i2);
            for (int i3 = 0; i3 < aVar.a.size(); i3++) {
                this.c.addPath(((yk) aVar.a.get(i3)).e(), matrix);
            }
        }
        this.c.computeBounds(this.e, false);
        float floatValue = ((Float) this.j.d()).floatValue();
        RectF rectF2 = this.e;
        float f2 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f2, this.e.top - f2, this.e.right + f2, this.e.bottom + f2);
        rectF.set(this.e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        xn.d(str);
    }

    public <T> void a(T t, acn<T> acn) {
        if (t == xt.d) {
            this.k.a(acn);
        } else if (t == xt.k) {
            this.j.a(acn);
        } else {
            if (t == xt.x) {
                if (acn == null) {
                    this.n = null;
                    return;
                }
                this.n = new zg(acn);
                this.n.a((defpackage.yr.a) this);
                this.g.a(this.n);
            }
        }
    }

    public final void a(List<ya> list, List<ya> list2) {
        a aVar = null;
        yq yqVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            ya yaVar = (ya) list.get(size);
            if (yaVar instanceof yq) {
                yq yqVar2 = (yq) yaVar;
                if (yqVar2.a == Type.Individually) {
                    yqVar = yqVar2;
                }
            }
        }
        if (yqVar != null) {
            yqVar.a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            ya yaVar2 = (ya) list2.get(size2);
            if (yaVar2 instanceof yq) {
                yq yqVar3 = (yq) yaVar2;
                if (yqVar3.a == Type.Individually) {
                    if (aVar != null) {
                        this.h.add(aVar);
                    }
                    a aVar2 = new a(yqVar3, 0);
                    yqVar3.a(this);
                    aVar = aVar2;
                }
            }
            if (yaVar2 instanceof yk) {
                if (aVar == null) {
                    aVar = new a(yqVar, 0);
                }
                aVar.a.add((yk) yaVar2);
            }
        }
        if (aVar != null) {
            this.h.add(aVar);
        }
    }

    public final void a(zn znVar, int i2, List<zn> list, zn znVar2) {
        acj.a(znVar, i2, list, znVar2, this);
    }
}
