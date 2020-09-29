package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aai reason: default package */
public final class aai extends aac {
    private final char[] g = new char[1];
    private final RectF h = new RectF();
    private final Matrix i = new Matrix();
    private final Paint j = new Paint(1) {
        {
            setStyle(Style.FILL);
        }
    };
    private final Paint k = new Paint(1) {
        {
            setStyle(Style.STROKE);
        }
    };
    private final Map<yy, List<xn>> l = new HashMap();
    private final yq m;
    private final xc n;
    private final xa o;
    private yd<Integer, Integer> p;
    private yd<Integer, Integer> q;
    private yd<Float, Float> r;
    private yd<Float, Float> s;

    aai(xc xcVar, Layer layer) {
        super(xcVar, layer);
        this.n = xcVar;
        this.o = layer.b;
        this.m = layer.q.a();
        this.m.a((a) this);
        a((yd<?, ?>) this.m);
        zn znVar = layer.r;
        if (!(znVar == null || znVar.a == null)) {
            this.p = znVar.a.a();
            this.p.a((a) this);
            a(this.p);
        }
        if (!(znVar == null || znVar.b == null)) {
            this.q = znVar.b.a();
            this.q.a((a) this);
            a(this.q);
        }
        if (!(znVar == null || znVar.c == null)) {
            this.r = znVar.c.a();
            this.r.a((a) this);
            a(this.r);
        }
        if (znVar != null && znVar.d != null) {
            this.s = znVar.d.a();
            this.s.a((a) this);
            a(this.s);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        String str;
        List list;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        canvas.save();
        if (!this.n.e()) {
            canvas.setMatrix(matrix);
        }
        yw ywVar = (yw) this.m.d();
        yx yxVar = (yx) this.o.d.get(ywVar.b);
        if (yxVar == null) {
            canvas.restore();
            return;
        }
        yd<Integer, Integer> ydVar = this.p;
        if (ydVar != null) {
            this.j.setColor(((Integer) ydVar.d()).intValue());
        } else {
            this.j.setColor(ywVar.f);
        }
        yd<Integer, Integer> ydVar2 = this.q;
        if (ydVar2 != null) {
            this.k.setColor(((Integer) ydVar2.d()).intValue());
        } else {
            this.k.setColor(ywVar.g);
        }
        int intValue = (((Integer) this.f.e.d()).intValue() * 255) / 100;
        this.j.setAlpha(intValue);
        this.k.setAlpha(intValue);
        yd<Float, Float> ydVar3 = this.r;
        if (ydVar3 != null) {
            this.k.setStrokeWidth(((Float) ydVar3.d()).floatValue());
        } else {
            float a = abw.a(matrix);
            Paint paint = this.k;
            double d = ywVar.h;
            double a2 = (double) abw.a();
            Double.isNaN(a2);
            double d2 = d * a2;
            double d3 = (double) a;
            Double.isNaN(d3);
            paint.setStrokeWidth((float) (d2 * d3));
        }
        if (this.n.e()) {
            float f = ((float) ywVar.c) / 100.0f;
            float a3 = abw.a(matrix);
            String str2 = ywVar.a;
            int i3 = 0;
            while (i3 < str2.length()) {
                yy yyVar = (yy) this.o.e.a(yy.a(str2.charAt(i3), yxVar.a, yxVar.c), null);
                if (yyVar != null) {
                    if (this.l.containsKey(yyVar)) {
                        str = str2;
                        list = (List) this.l.get(yyVar);
                    } else {
                        List<aaa> list2 = yyVar.a;
                        int size = list2.size();
                        list = new ArrayList(size);
                        int i4 = 0;
                        while (i4 < size) {
                            String str3 = str2;
                            list.add(new xn(this.n, this, (aaa) list2.get(i4)));
                            i4++;
                            str2 = str3;
                        }
                        str = str2;
                        this.l.put(yyVar, list);
                    }
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        Path e = ((xn) list.get(i5)).e();
                        e.computeBounds(this.h, false);
                        this.i.set(matrix2);
                        this.i.preTranslate(0.0f, ((float) (-ywVar.e)) * abw.a());
                        this.i.preScale(f, f);
                        e.transform(this.i);
                        if (ywVar.i) {
                            a(e, this.j, canvas2);
                            a(e, this.k, canvas2);
                        } else {
                            a(e, this.k, canvas2);
                            a(e, this.j, canvas2);
                        }
                    }
                    float a4 = ((float) yyVar.b) * f * abw.a() * a3;
                    float f2 = ((float) ywVar.d) / 10.0f;
                    yd<Float, Float> ydVar4 = this.s;
                    if (ydVar4 != null) {
                        f2 += ((Float) ydVar4.d()).floatValue();
                    }
                    canvas2.translate(a4 + (f2 * a3), 0.0f);
                } else {
                    str = str2;
                }
                i3++;
                str2 = str;
            }
        } else {
            a(ywVar, yxVar, matrix2, canvas2);
        }
        canvas.restore();
    }

    private void a(yw ywVar, yx yxVar, Matrix matrix, Canvas canvas) {
        yt ytVar;
        float a = abw.a(matrix);
        xc xcVar = this.n;
        T t = yxVar.a;
        T t2 = yxVar.c;
        Typeface typeface = null;
        if (xcVar.getCallback() == null) {
            ytVar = null;
        } else {
            if (xcVar.f == null) {
                xcVar.f = new yt(xcVar.getCallback(), null);
            }
            ytVar = xcVar.f;
        }
        if (ytVar != null) {
            zc<String> zcVar = ytVar.a;
            zcVar.a = t;
            zcVar.b = t2;
            typeface = (Typeface) ytVar.b.get(ytVar.a);
            if (typeface == null) {
                typeface = (Typeface) ytVar.c.get(t);
                if (typeface == null) {
                    StringBuilder sb = new StringBuilder("fonts/");
                    sb.append(t);
                    sb.append(ytVar.e);
                    typeface = Typeface.createFromAsset(ytVar.d, sb.toString());
                    ytVar.c.put(t, typeface);
                }
                boolean contains = t2.contains("Italic");
                boolean contains2 = t2.contains("Bold");
                int i2 = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
                if (typeface.getStyle() != i2) {
                    typeface = Typeface.create(typeface, i2);
                }
                ytVar.b.put(ytVar.a, typeface);
            }
        }
        if (typeface != null) {
            String str = ywVar.a;
            xc xcVar2 = this.n;
            this.j.setTypeface(typeface);
            Paint paint = this.j;
            double d = ywVar.c;
            double a2 = (double) abw.a();
            Double.isNaN(a2);
            paint.setTextSize((float) (d * a2));
            this.k.setTypeface(this.j.getTypeface());
            this.k.setTextSize(this.j.getTextSize());
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                this.g[0] = charAt;
                if (ywVar.i) {
                    a(this.g, this.j, canvas);
                    a(this.g, this.k, canvas);
                } else {
                    a(this.g, this.k, canvas);
                    a(this.g, this.j, canvas);
                }
                char[] cArr = this.g;
                cArr[0] = charAt;
                float measureText = this.j.measureText(cArr, 0, 1);
                float f = ((float) ywVar.d) / 10.0f;
                yd<Float, Float> ydVar = this.s;
                if (ydVar != null) {
                    f += ((Float) ydVar.d()).floatValue();
                }
                canvas.translate(measureText + (f * a), 0.0f);
            }
        }
    }

    private static void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private static void a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    public final <T> void a(T t, abz<T> abz) {
        super.a(t, abz);
        if (t == xf.a) {
            yd<Integer, Integer> ydVar = this.p;
            if (ydVar != null) {
                ydVar.a(abz);
                return;
            }
        }
        if (t == xf.b) {
            yd<Integer, Integer> ydVar2 = this.q;
            if (ydVar2 != null) {
                ydVar2.a(abz);
                return;
            }
        }
        if (t == xf.k) {
            yd<Float, Float> ydVar3 = this.r;
            if (ydVar3 != null) {
                ydVar3.a(abz);
                return;
            }
        }
        if (t == xf.l) {
            yd<Float, Float> ydVar4 = this.s;
            if (ydVar4 != null) {
                ydVar4.a(abz);
            }
        }
    }
}
