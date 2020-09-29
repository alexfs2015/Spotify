package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;

/* renamed from: fac reason: default package */
public final class fac extends Drawable implements gn {
    public boolean a;
    public float b;
    public Style c;
    private final Paint d;
    private final Matrix[] e;
    private final Matrix[] f;
    private final fad[] g;
    private final Matrix h;
    private final Path i;
    private final PointF j;
    private final fad k;
    private final Region l;
    private final Region m;
    private final float[] n;
    private final float[] o;
    private fae p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private float v;
    private float w;
    private PorterDuffColorFilter x;
    private Mode y;
    private ColorStateList z;

    public final int getOpacity() {
        return -3;
    }

    public fac() {
        this(null);
    }

    public fac(fae fae) {
        this.d = new Paint();
        this.e = new Matrix[4];
        this.f = new Matrix[4];
        this.g = new fad[4];
        this.h = new Matrix();
        this.i = new Path();
        this.j = new PointF();
        this.k = new fad();
        this.l = new Region();
        this.m = new Region();
        this.n = new float[2];
        this.o = new float[2];
        this.p = null;
        this.a = false;
        this.q = false;
        this.b = 1.0f;
        this.r = -16777216;
        this.s = 5;
        this.t = 10;
        this.u = 255;
        this.v = 1.0f;
        this.w = 0.0f;
        this.c = Style.FILL_AND_STROKE;
        this.y = Mode.SRC_IN;
        this.z = null;
        this.p = fae;
        for (int i2 = 0; i2 < 4; i2++) {
            this.e[i2] = new Matrix();
            this.f[i2] = new Matrix();
            this.g[i2] = new fad();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.z = colorStateList;
        a();
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.y = mode;
        a();
        invalidateSelf();
    }

    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public final void setAlpha(int i2) {
        this.u = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.l.set(bounds);
        b(bounds.width(), bounds.height(), this.i);
        this.m.setPath(this.i, this.l);
        this.l.op(this.m, Op.DIFFERENCE);
        return this.l;
    }

    public final void a(float f2) {
        this.b = f2;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.d.setColorFilter(this.x);
        int alpha = this.d.getAlpha();
        Paint paint = this.d;
        int i2 = this.u;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        this.d.setStrokeWidth(0.0f);
        this.d.setStyle(this.c);
        int i3 = this.s;
        if (i3 > 0 && this.a) {
            this.d.setShadowLayer((float) this.t, 0.0f, (float) i3, this.r);
        }
        if (this.p != null) {
            b(canvas.getWidth(), canvas.getHeight(), this.i);
            canvas.drawPath(this.i, this.d);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.d);
        }
        this.d.setAlpha(alpha);
    }

    private void a(int i2, int i3, Path path) {
        fab fab;
        int i4 = i2;
        int i5 = i3;
        Path path2 = path;
        path.rewind();
        if (this.p != null) {
            int i6 = 0;
            while (i6 < 4) {
                a(i6, i4, i5, this.j);
                int i7 = ((i6 - 1) + 4) % 4;
                a(i7, i4, i5, this.j);
                float f2 = this.j.x;
                float f3 = this.j.y;
                int i8 = i6 + 1;
                a(i8 % 4, i4, i5, this.j);
                float f4 = this.j.x;
                float f5 = this.j.y;
                a(i6, i4, i5, this.j);
                float f6 = this.j.x;
                float f7 = this.j.y;
                float f8 = f5 - f7;
                int i9 = i6;
                i6 = i8;
                int i10 = ((((float) Math.atan2((double) (f3 - f7), (double) (f2 - f6))) - ((float) Math.atan2((double) f8, (double) (f4 - f6)))) > 0.0f ? 1 : ((((float) Math.atan2((double) (f3 - f7), (double) (f2 - f6))) - ((float) Math.atan2((double) f8, (double) (f4 - f6)))) == 0.0f ? 0 : -1));
                float a2 = a(i7, i4, i5) + 1.5707964f;
                this.e[i9].reset();
                this.e[i9].setTranslate(this.j.x, this.j.y);
                this.e[i9].preRotate((float) Math.toDegrees((double) a2));
                this.n[0] = this.g[i9].c;
                this.n[1] = this.g[i9].d;
                this.e[i9].mapPoints(this.n);
                int i11 = i9;
                float a3 = a(i11, i4, i5);
                this.f[i11].reset();
                Matrix matrix = this.f[i11];
                float[] fArr = this.n;
                matrix.setTranslate(fArr[0], fArr[1]);
                this.f[i11].preRotate((float) Math.toDegrees((double) a3));
            }
            int i12 = 0;
            while (i12 < 4) {
                this.n[0] = this.g[i12].a;
                this.n[1] = this.g[i12].b;
                this.e[i12].mapPoints(this.n);
                if (i12 == 0) {
                    float[] fArr2 = this.n;
                    path2.moveTo(fArr2[0], fArr2[1]);
                } else {
                    float[] fArr3 = this.n;
                    path2.lineTo(fArr3[0], fArr3[1]);
                }
                this.g[i12].a(this.e[i12], path2);
                int i13 = i12 + 1;
                int i14 = i13 % 4;
                this.n[0] = this.g[i12].c;
                this.n[1] = this.g[i12].d;
                this.e[i12].mapPoints(this.n);
                this.o[0] = this.g[i14].a;
                this.o[1] = this.g[i14].b;
                this.e[i14].mapPoints(this.o);
                float[] fArr4 = this.n;
                float f9 = fArr4[0];
                float[] fArr5 = this.o;
                float hypot = (float) Math.hypot((double) (f9 - fArr5[0]), (double) (fArr4[1] - fArr5[1]));
                this.k.a(0.0f, 0.0f);
                if (i12 == 1) {
                    fab = this.p.f;
                } else if (i12 == 2) {
                    fab = this.p.g;
                } else if (i12 != 3) {
                    fab = this.p.e;
                } else {
                    fab = this.p.h;
                }
                fab.a(hypot, this.b, this.k);
                this.k.a(this.f[i12], path2);
                i12 = i13;
            }
            path.close();
        }
    }

    private static void a(int i2, int i3, int i4, PointF pointF) {
        if (i2 == 1) {
            pointF.set((float) i3, 0.0f);
        } else if (i2 == 2) {
            pointF.set((float) i3, (float) i4);
        } else if (i2 != 3) {
            pointF.set(0.0f, 0.0f);
        } else {
            pointF.set(0.0f, (float) i4);
        }
    }

    private float a(int i2, int i3, int i4) {
        int i5 = (i2 + 1) % 4;
        a(i2, i3, i4, this.j);
        float f2 = this.j.x;
        float f3 = this.j.y;
        a(i5, i3, i4, this.j);
        return (float) Math.atan2((double) (this.j.y - f3), (double) (this.j.x - f2));
    }

    private void b(int i2, int i3, Path path) {
        a(i2, i3, path);
        if (this.v != 1.0f) {
            this.h.reset();
            Matrix matrix = this.h;
            float f2 = this.v;
            matrix.setScale(f2, f2, (float) (i2 / 2), (float) (i3 / 2));
            path.transform(this.h);
        }
    }

    private void a() {
        ColorStateList colorStateList = this.z;
        if (colorStateList == null || this.y == null) {
            this.x = null;
        } else {
            this.x = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.y);
        }
    }
}
