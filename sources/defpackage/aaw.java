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

/* renamed from: aaw reason: default package */
public final class aaw extends aaq {
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
    private final Map<zm, List<yb>> l = new HashMap();
    private final ze m;
    private final xq n;
    private final xo o;
    private yr<Integer, Integer> p;
    private yr<Integer, Integer> q;
    private yr<Float, Float> r;
    private yr<Float, Float> s;

    aaw(xq xqVar, Layer layer) {
        super(xqVar, layer);
        this.n = xqVar;
        this.o = layer.b;
        this.m = layer.q.a();
        this.m.a((a) this);
        a((yr<?, ?>) this.m);
        aab aab = layer.r;
        if (!(aab == null || aab.a == null)) {
            this.p = aab.a.a();
            this.p.a((a) this);
            a(this.p);
        }
        if (!(aab == null || aab.b == null)) {
            this.q = aab.b.a();
            this.q.a((a) this);
            a(this.q);
        }
        if (!(aab == null || aab.c == null)) {
            this.r = aab.c.a();
            this.r.a((a) this);
            a(this.r);
        }
        if (aab != null && aab.d != null) {
            this.s = aab.d.a();
            this.s.a((a) this);
            a(this.s);
        }
    }

    private static void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private void a(zk zkVar, zl zlVar, Matrix matrix, Canvas canvas) {
        zh zhVar;
        float a = ack.a(matrix);
        xq xqVar = this.n;
        T t = zlVar.a;
        T t2 = zlVar.c;
        Typeface typeface = null;
        if (xqVar.getCallback() == null) {
            zhVar = null;
        } else {
            if (xqVar.f == null) {
                xqVar.f = new zh(xqVar.getCallback(), null);
            }
            zhVar = xqVar.f;
        }
        if (zhVar != null) {
            zq<String> zqVar = zhVar.a;
            zqVar.a = t;
            zqVar.b = t2;
            typeface = (Typeface) zhVar.b.get(zhVar.a);
            if (typeface == null) {
                typeface = (Typeface) zhVar.c.get(t);
                if (typeface == null) {
                    StringBuilder sb = new StringBuilder("fonts/");
                    sb.append(t);
                    sb.append(zhVar.e);
                    typeface = Typeface.createFromAsset(zhVar.d, sb.toString());
                    zhVar.c.put(t, typeface);
                }
                boolean contains = t2.contains("Italic");
                boolean contains2 = t2.contains("Bold");
                int i2 = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
                if (typeface.getStyle() != i2) {
                    typeface = Typeface.create(typeface, i2);
                }
                zhVar.b.put(zhVar.a, typeface);
            }
        }
        if (typeface != null) {
            String str = zkVar.a;
            xq xqVar2 = this.n;
            this.j.setTypeface(typeface);
            Paint paint = this.j;
            double d = zkVar.c;
            double a2 = (double) ack.a();
            Double.isNaN(a2);
            paint.setTextSize((float) (d * a2));
            this.k.setTypeface(this.j.getTypeface());
            this.k.setTextSize(this.j.getTextSize());
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                this.g[0] = charAt;
                if (zkVar.i) {
                    a(this.g, this.j, canvas);
                    a(this.g, this.k, canvas);
                } else {
                    a(this.g, this.k, canvas);
                    a(this.g, this.j, canvas);
                }
                char[] cArr = this.g;
                cArr[0] = charAt;
                float measureText = this.j.measureText(cArr, 0, 1);
                float f = ((float) zkVar.d) / 10.0f;
                yr<Float, Float> yrVar = this.s;
                if (yrVar != null) {
                    f += ((Float) yrVar.d()).floatValue();
                }
                canvas.translate(measureText + (f * a), 0.0f);
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

    public final <T> void a(T t, acn<T> acn) {
        super.a(t, acn);
        if (t == xt.a) {
            yr<Integer, Integer> yrVar = this.p;
            if (yrVar != null) {
                yrVar.a(acn);
                return;
            }
        }
        if (t == xt.b) {
            yr<Integer, Integer> yrVar2 = this.q;
            if (yrVar2 != null) {
                yrVar2.a(acn);
                return;
            }
        }
        if (t == xt.k) {
            yr<Float, Float> yrVar3 = this.r;
            if (yrVar3 != null) {
                yrVar3.a(acn);
                return;
            }
        }
        if (t == xt.l) {
            yr<Float, Float> yrVar4 = this.s;
            if (yrVar4 != null) {
                yrVar4.a(acn);
            }
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
        zk zkVar = (zk) this.m.d();
        zl zlVar = (zl) this.o.d.get(zkVar.b);
        if (zlVar == null) {
            canvas.restore();
            return;
        }
        yr<Integer, Integer> yrVar = this.p;
        if (yrVar != null) {
            this.j.setColor(((Integer) yrVar.d()).intValue());
        } else {
            this.j.setColor(zkVar.f);
        }
        yr<Integer, Integer> yrVar2 = this.q;
        if (yrVar2 != null) {
            this.k.setColor(((Integer) yrVar2.d()).intValue());
        } else {
            this.k.setColor(zkVar.g);
        }
        int intValue = (((Integer) this.f.e.d()).intValue() * 255) / 100;
        this.j.setAlpha(intValue);
        this.k.setAlpha(intValue);
        yr<Float, Float> yrVar3 = this.r;
        if (yrVar3 != null) {
            this.k.setStrokeWidth(((Float) yrVar3.d()).floatValue());
        } else {
            float a = ack.a(matrix);
            Paint paint = this.k;
            double d = zkVar.h;
            double a2 = (double) ack.a();
            Double.isNaN(a2);
            double d2 = d * a2;
            double d3 = (double) a;
            Double.isNaN(d3);
            paint.setStrokeWidth((float) (d2 * d3));
        }
        if (this.n.e()) {
            float f = ((float) zkVar.c) / 100.0f;
            float a3 = ack.a(matrix);
            String str2 = zkVar.a;
            int i3 = 0;
            while (i3 < str2.length()) {
                zm zmVar = (zm) this.o.e.a(zm.a(str2.charAt(i3), zlVar.a, zlVar.c), null);
                if (zmVar != null) {
                    if (this.l.containsKey(zmVar)) {
                        str = str2;
                        list = (List) this.l.get(zmVar);
                    } else {
                        List<aao> list2 = zmVar.a;
                        int size = list2.size();
                        list = new ArrayList(size);
                        int i4 = 0;
                        while (i4 < size) {
                            String str3 = str2;
                            list.add(new yb(this.n, this, (aao) list2.get(i4)));
                            i4++;
                            str2 = str3;
                        }
                        str = str2;
                        this.l.put(zmVar, list);
                    }
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        Path e = ((yb) list.get(i5)).e();
                        e.computeBounds(this.h, false);
                        this.i.set(matrix2);
                        this.i.preTranslate(0.0f, ((float) (-zkVar.e)) * ack.a());
                        this.i.preScale(f, f);
                        e.transform(this.i);
                        if (zkVar.i) {
                            a(e, this.j, canvas2);
                            a(e, this.k, canvas2);
                        } else {
                            a(e, this.k, canvas2);
                            a(e, this.j, canvas2);
                        }
                    }
                    float a4 = ((float) zmVar.b) * f * ack.a() * a3;
                    float f2 = ((float) zkVar.d) / 10.0f;
                    yr<Float, Float> yrVar4 = this.s;
                    if (yrVar4 != null) {
                        f2 += ((Float) yrVar4.d()).floatValue();
                    }
                    canvas2.translate(a4 + (f2 * a3), 0.0f);
                } else {
                    str = str2;
                }
                i3++;
                str2 = str;
            }
        } else {
            a(zkVar, zlVar, matrix2, canvas2);
        }
        canvas.restore();
    }
}
