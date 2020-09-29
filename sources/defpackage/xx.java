package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.PolystarShape.Type;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* renamed from: xx reason: default package */
public final class xx implements xu, xw, a {
    private final Path a = new Path();
    private final String b;
    private final xc c;
    private final Type d;
    private final yd<?, Float> e;
    private final yd<?, PointF> f;
    private final yd<?, Float> g;
    private final yd<?, Float> h;
    private final yd<?, Float> i;
    private final yd<?, Float> j;
    private final yd<?, Float> k;
    private yc l;
    private boolean m;

    /* renamed from: xx$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.airbnb.lottie.model.content.PolystarShape$Type[] r0 = com.airbnb.lottie.model.content.PolystarShape.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.Star     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.Polygon     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xx.AnonymousClass1.<clinit>():void");
        }
    }

    public xx(xc xcVar, aac aac, PolystarShape polystarShape) {
        this.c = xcVar;
        this.b = polystarShape.a;
        this.d = polystarShape.b;
        this.e = polystarShape.c.a();
        this.f = polystarShape.d.a();
        this.g = polystarShape.e.a();
        this.i = polystarShape.g.a();
        this.k = polystarShape.i.a();
        if (this.d == Type.Star) {
            this.h = polystarShape.f.a();
            this.j = polystarShape.h.a();
        } else {
            this.h = null;
            this.j = null;
        }
        aac.a(this.e);
        aac.a(this.f);
        aac.a(this.g);
        aac.a(this.i);
        aac.a(this.k);
        if (this.d == Type.Star) {
            aac.a(this.h);
            aac.a(this.j);
        }
        this.e.a((a) this);
        this.f.a((a) this);
        this.g.a((a) this);
        this.i.a((a) this);
        this.k.a((a) this);
        if (this.d == Type.Star) {
            this.h.a((a) this);
            this.j.a((a) this);
        }
    }

    public final void a(List<xm> list, List<xm> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            xm xmVar = (xm) list.get(i2);
            if (xmVar instanceof yc) {
                yc ycVar = (yc) xmVar;
                if (ycVar.a == ShapeTrimPath.Type.Simultaneously) {
                    this.l = ycVar;
                    this.l.a(this);
                }
            }
        }
    }

    public final Path e() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        double d3;
        double d4;
        double d5;
        if (this.m) {
            return this.a;
        }
        this.a.reset();
        int i2 = AnonymousClass1.a[this.d.ordinal()];
        double d6 = 0.0d;
        if (i2 == 1) {
            float floatValue = ((Float) this.e.d()).floatValue();
            yd<?, Float> ydVar = this.g;
            if (ydVar != null) {
                d6 = (double) ((Float) ydVar.d()).floatValue();
            }
            double radians = Math.toRadians(d6 - 90.0d);
            double d7 = (double) floatValue;
            Double.isNaN(d7);
            float f14 = (float) (6.283185307179586d / d7);
            float f15 = 2.0f;
            float f16 = f14 / 2.0f;
            float f17 = floatValue - ((float) ((int) floatValue));
            if (f17 != 0.0f) {
                double d8 = (double) ((1.0f - f17) * f16);
                Double.isNaN(d8);
                radians += d8;
            }
            float floatValue2 = ((Float) this.i.d()).floatValue();
            float floatValue3 = ((Float) this.h.d()).floatValue();
            yd<?, Float> ydVar2 = this.j;
            float floatValue4 = ydVar2 != null ? ((Float) ydVar2.d()).floatValue() / 100.0f : 0.0f;
            yd<?, Float> ydVar3 = this.k;
            float floatValue5 = ydVar3 != null ? ((Float) ydVar3.d()).floatValue() / 100.0f : 0.0f;
            if (f17 != 0.0f) {
                float f18 = ((floatValue2 - floatValue3) * f17) + floatValue3;
                double d9 = (double) f18;
                double cos = Math.cos(radians);
                Double.isNaN(d9);
                f3 = floatValue3;
                f2 = f18;
                f6 = (float) (d9 * cos);
                double sin = Math.sin(radians);
                Double.isNaN(d9);
                f5 = (float) (d9 * sin);
                this.a.moveTo(f6, f5);
                double d10 = (double) ((f14 * f17) / 2.0f);
                Double.isNaN(d10);
                d2 = radians + d10;
                f4 = floatValue2;
            } else {
                f3 = floatValue3;
                double d11 = (double) floatValue2;
                double cos2 = Math.cos(radians);
                Double.isNaN(d11);
                float f19 = (float) (cos2 * d11);
                double sin2 = Math.sin(radians);
                Double.isNaN(d11);
                f5 = (float) (d11 * sin2);
                this.a.moveTo(f19, f5);
                f4 = floatValue2;
                double d12 = (double) f16;
                Double.isNaN(d12);
                d2 = radians + d12;
                f6 = f19;
                f2 = 0.0f;
            }
            double ceil = Math.ceil(d7) * 2.0d;
            double d13 = d2;
            float f20 = f4;
            int i3 = 0;
            boolean z = false;
            while (true) {
                double d14 = (double) i3;
                if (d14 >= ceil) {
                    break;
                }
                float f21 = z ? f20 : f3;
                float f22 = (f2 == 0.0f || d14 != ceil - 2.0d) ? f16 : (f14 * f17) / f15;
                if (f2 == 0.0f || d14 != ceil - 1.0d) {
                    f8 = f14;
                    f7 = f22;
                } else {
                    f8 = f14;
                    f7 = f22;
                    f21 = f2;
                }
                double d15 = (double) f21;
                double cos3 = Math.cos(d13);
                Double.isNaN(d15);
                double d16 = d14;
                float f23 = (float) (d15 * cos3);
                double sin3 = Math.sin(d13);
                Double.isNaN(d15);
                float f24 = (float) (d15 * sin3);
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.a.lineTo(f23, f24);
                    f10 = f24;
                    f9 = f16;
                    f11 = floatValue5;
                    f12 = floatValue4;
                    f13 = f7;
                } else {
                    float f25 = f16;
                    f11 = floatValue5;
                    double atan2 = (double) ((float) (Math.atan2((double) f5, (double) f6) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    float f26 = f5;
                    f12 = floatValue4;
                    f10 = f24;
                    f9 = f25;
                    double atan22 = (double) ((float) (Math.atan2((double) f24, (double) f23) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f27 = z ? f12 : f11;
                    float f28 = (z ? f3 : f20) * f27 * 0.47829f;
                    float f29 = cos4 * f28;
                    float f30 = f28 * sin4;
                    float f31 = (z ? f20 : f3) * (z ? f11 : f12) * 0.47829f;
                    float f32 = cos5 * f31;
                    float f33 = f31 * sin5;
                    if (f17 != 0.0f) {
                        if (i3 == 0) {
                            f29 *= f17;
                            f30 *= f17;
                        } else if (d16 == ceil - 1.0d) {
                            f32 *= f17;
                            f33 *= f17;
                        }
                    }
                    this.a.cubicTo(f6 - f29, f26 - f30, f23 + f32, f10 + f33, f23, f10);
                    f13 = f7;
                }
                double d17 = (double) f13;
                Double.isNaN(d17);
                d13 += d17;
                z = !z;
                i3++;
                floatValue4 = f12;
                f6 = f23;
                f14 = f8;
                floatValue5 = f11;
                f5 = f10;
                f16 = f9;
                f15 = 2.0f;
            }
            PointF pointF = (PointF) this.f.d();
            this.a.offset(pointF.x, pointF.y);
            this.a.close();
        } else if (i2 == 2) {
            int floor = (int) Math.floor((double) ((Float) this.e.d()).floatValue());
            yd<?, Float> ydVar4 = this.g;
            if (ydVar4 != null) {
                d6 = (double) ((Float) ydVar4.d()).floatValue();
            }
            double radians2 = Math.toRadians(d6 - 90.0d);
            double d18 = (double) floor;
            Double.isNaN(d18);
            float f34 = (float) (6.283185307179586d / d18);
            float floatValue6 = ((Float) this.k.d()).floatValue() / 100.0f;
            float floatValue7 = ((Float) this.i.d()).floatValue();
            double d19 = (double) floatValue7;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d19);
            float f35 = (float) (d19 * cos6);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d19);
            float f36 = (float) (d19 * sin6);
            this.a.moveTo(f35, f36);
            double d20 = (double) f34;
            Double.isNaN(d20);
            double d21 = radians2 + d20;
            double ceil2 = Math.ceil(d18);
            int i4 = 0;
            while (((double) i4) < ceil2) {
                double cos7 = Math.cos(d21);
                Double.isNaN(d19);
                float f37 = (float) (cos7 * d19);
                double sin7 = Math.sin(d21);
                Double.isNaN(d19);
                double d22 = ceil2;
                float f38 = (float) (d19 * sin7);
                if (floatValue6 != 0.0f) {
                    d5 = d19;
                    d4 = d21;
                    double atan23 = (double) ((float) (Math.atan2((double) f36, (double) f35) - 1.5707963267948966d));
                    d3 = d20;
                    double atan24 = (double) ((float) (Math.atan2((double) f38, (double) f37) - 1.5707963267948966d));
                    float f39 = floatValue7 * floatValue6 * 0.25f;
                    this.a.cubicTo(f35 - (((float) Math.cos(atan23)) * f39), f36 - (((float) Math.sin(atan23)) * f39), f37 + (((float) Math.cos(atan24)) * f39), f38 + (f39 * ((float) Math.sin(atan24))), f37, f38);
                } else {
                    d4 = d21;
                    d3 = d20;
                    d5 = d19;
                    this.a.lineTo(f37, f38);
                }
                Double.isNaN(d3);
                d21 = d4 + d3;
                i4++;
                f36 = f38;
                f35 = f37;
                ceil2 = d22;
                d19 = d5;
                d20 = d3;
            }
            PointF pointF2 = (PointF) this.f.d();
            this.a.offset(pointF2.x, pointF2.y);
            this.a.close();
        }
        this.a.close();
        abw.a(this.a, this.l);
        this.m = true;
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final void a(yz yzVar, int i2, List<yz> list, yz yzVar2) {
        abv.a(yzVar, i2, list, yzVar2, this);
    }

    public final <T> void a(T t, abz<T> abz) {
        if (t == xf.o) {
            this.e.a(abz);
        } else if (t == xf.p) {
            this.g.a(abz);
        } else if (t == xf.h) {
            this.f.a(abz);
        } else {
            if (t == xf.q) {
                yd<?, Float> ydVar = this.h;
                if (ydVar != null) {
                    ydVar.a(abz);
                    return;
                }
            }
            if (t == xf.r) {
                this.i.a(abz);
                return;
            }
            if (t == xf.s) {
                yd<?, Float> ydVar2 = this.j;
                if (ydVar2 != null) {
                    ydVar2.a(abz);
                    return;
                }
            }
            if (t == xf.t) {
                this.k.a(abz);
            }
        }
    }

    public final void a() {
        this.m = false;
        this.c.invalidateSelf();
    }
}
