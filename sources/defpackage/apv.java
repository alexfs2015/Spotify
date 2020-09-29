package defpackage;

import android.content.res.TypedArray;
import android.graphics.RectF;

/* renamed from: apv reason: default package */
public final class apv {
    final float[] a = new float[4];
    final int[] b = new int[4];
    int c = 0;
    int d = -1;
    int e = 1291845631;
    int f = 0;
    int g = 0;
    int h = 0;
    float i = 1.0f;
    float j = 1.0f;
    float k = 0.0f;
    float l = 0.5f;
    float m = 20.0f;
    public boolean n = true;
    boolean o = true;
    boolean p = true;
    int q = -1;
    int r = 1;
    long s = 1000;
    long t;
    private RectF u = new RectF();

    /* renamed from: apv$a */
    public static class a extends b<a> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ b a() {
            return this;
        }
    }

    /* renamed from: apv$b */
    public static abstract class b<T extends b<T>> {
        final apv a = new apv();

        private static float a(float f, float f2, float f3) {
            return Math.min(1.0f, Math.max(0.0f, f3));
        }

        private T a(int i) {
            this.a.c = i;
            return a();
        }

        private T b(int i) {
            this.a.f = i;
            return a();
        }

        /* access modifiers changed from: protected */
        public abstract T a();

        public T a(TypedArray typedArray) {
            if (typedArray.hasValue(defpackage.apu.a.e)) {
                this.a.n = typedArray.getBoolean(defpackage.apu.a.e, this.a.n);
                a();
            }
            if (typedArray.hasValue(defpackage.apu.a.b)) {
                this.a.o = typedArray.getBoolean(defpackage.apu.a.b, this.a.o);
                a();
            }
            if (typedArray.hasValue(defpackage.apu.a.c)) {
                int a2 = (int) (a(0.0f, 1.0f, typedArray.getFloat(defpackage.apu.a.c, 0.3f)) * 255.0f);
                apv apv = this.a;
                apv.e = (a2 << 24) | (apv.e & 16777215);
                a();
            }
            if (typedArray.hasValue(defpackage.apu.a.m)) {
                int a3 = (int) (a(0.0f, 1.0f, typedArray.getFloat(defpackage.apu.a.m, 1.0f)) * 255.0f);
                apv apv2 = this.a;
                apv2.d = (a3 << 24) | (16777215 & apv2.d);
                a();
            }
            if (typedArray.hasValue(defpackage.apu.a.i)) {
                long j = (long) typedArray.getInt(defpackage.apu.a.i, (int) this.a.s);
                if (j >= 0) {
                    this.a.s = j;
                    a();
                } else {
                    StringBuilder sb = new StringBuilder("Given a negative duration: ");
                    sb.append(j);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.p)) {
                this.a.q = typedArray.getInt(defpackage.apu.a.p, this.a.q);
                a();
            }
            if (typedArray.hasValue(defpackage.apu.a.q)) {
                long j2 = (long) typedArray.getInt(defpackage.apu.a.q, (int) this.a.t);
                if (j2 >= 0) {
                    this.a.t = j2;
                    a();
                } else {
                    StringBuilder sb2 = new StringBuilder("Given a negative repeat delay: ");
                    sb2.append(j2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.r)) {
                this.a.r = typedArray.getInt(defpackage.apu.a.r, this.a.r);
                a();
            }
            if (typedArray.hasValue(defpackage.apu.a.g)) {
                int i = typedArray.getInt(defpackage.apu.a.g, this.a.c);
                if (i == 1) {
                    a(1);
                } else if (i == 2) {
                    a(2);
                } else if (i != 3) {
                    a(0);
                } else {
                    a(3);
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.s)) {
                if (typedArray.getInt(defpackage.apu.a.s, this.a.f) != 1) {
                    b(0);
                } else {
                    b(1);
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.h)) {
                float f = typedArray.getFloat(defpackage.apu.a.h, this.a.l);
                if (f >= 0.0f) {
                    this.a.l = f;
                    a();
                } else {
                    StringBuilder sb3 = new StringBuilder("Given invalid dropoff value: ");
                    sb3.append(f);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.k)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(defpackage.apu.a.k, this.a.g);
                if (dimensionPixelSize >= 0) {
                    this.a.g = dimensionPixelSize;
                    a();
                } else {
                    StringBuilder sb4 = new StringBuilder("Given invalid width: ");
                    sb4.append(dimensionPixelSize);
                    throw new IllegalArgumentException(sb4.toString());
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.j)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(defpackage.apu.a.j, this.a.h);
                if (dimensionPixelSize2 >= 0) {
                    this.a.h = dimensionPixelSize2;
                    a();
                } else {
                    StringBuilder sb5 = new StringBuilder("Given invalid height: ");
                    sb5.append(dimensionPixelSize2);
                    throw new IllegalArgumentException(sb5.toString());
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.o)) {
                float f2 = typedArray.getFloat(defpackage.apu.a.o, this.a.k);
                if (f2 >= 0.0f) {
                    this.a.k = f2;
                    a();
                } else {
                    StringBuilder sb6 = new StringBuilder("Given invalid intensity value: ");
                    sb6.append(f2);
                    throw new IllegalArgumentException(sb6.toString());
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.u)) {
                float f3 = typedArray.getFloat(defpackage.apu.a.u, this.a.i);
                if (f3 >= 0.0f) {
                    this.a.i = f3;
                    a();
                } else {
                    StringBuilder sb7 = new StringBuilder("Given invalid width ratio: ");
                    sb7.append(f3);
                    throw new IllegalArgumentException(sb7.toString());
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.l)) {
                float f4 = typedArray.getFloat(defpackage.apu.a.l, this.a.j);
                if (f4 >= 0.0f) {
                    this.a.j = f4;
                    a();
                } else {
                    StringBuilder sb8 = new StringBuilder("Given invalid height ratio: ");
                    sb8.append(f4);
                    throw new IllegalArgumentException(sb8.toString());
                }
            }
            if (typedArray.hasValue(defpackage.apu.a.t)) {
                this.a.m = typedArray.getFloat(defpackage.apu.a.t, this.a.m);
                a();
            }
            return a();
        }

        public final apv b() {
            apv apv = this.a;
            if (apv.f != 1) {
                apv.b[0] = apv.e;
                apv.b[1] = apv.d;
                apv.b[2] = apv.d;
                apv.b[3] = apv.e;
            } else {
                apv.b[0] = apv.d;
                apv.b[1] = apv.d;
                apv.b[2] = apv.e;
                apv.b[3] = apv.e;
            }
            apv apv2 = this.a;
            if (apv2.f != 1) {
                apv2.a[0] = Math.max(((1.0f - apv2.k) - apv2.l) / 2.0f, 0.0f);
                apv2.a[1] = Math.max(((1.0f - apv2.k) - 0.001f) / 2.0f, 0.0f);
                apv2.a[2] = Math.min(((apv2.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                apv2.a[3] = Math.min(((apv2.k + 1.0f) + apv2.l) / 2.0f, 1.0f);
            } else {
                apv2.a[0] = 0.0f;
                apv2.a[1] = Math.min(apv2.k, 1.0f);
                apv2.a[2] = Math.min(apv2.k + apv2.l, 1.0f);
                apv2.a[3] = 1.0f;
            }
            return this.a;
        }
    }

    /* renamed from: apv$c */
    public static class c extends b<c> {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ b a() {
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ b a(TypedArray typedArray) {
            super.a(typedArray);
            if (typedArray.hasValue(defpackage.apu.a.d)) {
                int color = typedArray.getColor(defpackage.apu.a.d, this.a.e);
                this.a.e = (color & 16777215) | (this.a.e & -16777216);
            }
            if (typedArray.hasValue(defpackage.apu.a.n)) {
                this.a.d = typedArray.getColor(defpackage.apu.a.n, this.a.d);
            }
            return this;
        }
    }

    apv() {
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i2) {
        int i3 = this.g;
        return i3 > 0 ? i3 : Math.round(this.i * ((float) i2));
    }

    /* access modifiers changed from: 0000 */
    public final int b(int i2) {
        int i3 = this.h;
        return i3 > 0 ? i3 : Math.round(this.j * ((float) i2));
    }
}
