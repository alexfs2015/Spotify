package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import com.comscore.streaming.ContentType;

/* renamed from: ezj reason: default package */
public final class ezj {
    private static final boolean h = (VERSION.SDK_INT < 18);
    private static final Paint i = null;
    private boolean A;
    private boolean B;
    private Bitmap C;
    private Paint D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int[] I;
    private boolean J;
    private final TextPaint K;
    private final TextPaint L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private int Q;
    private float R;
    private float S;
    private float T;
    private int U;
    public float a;
    public float b = 15.0f;
    public ColorStateList c;
    public Typeface d;
    public Typeface e;
    public CharSequence f;
    public TimeInterpolator g;
    private final View j;
    private boolean k;
    private final Rect l;
    private final Rect m;
    private final RectF n;
    private int o = 16;
    private int p = 16;
    private float q = 15.0f;
    private ColorStateList r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private Typeface y;
    private CharSequence z;

    public ezj(View view) {
        this.j = view;
        this.K = new TextPaint(129);
        this.L = new TextPaint(this.K);
        this.m = new Rect();
        this.l = new Rect();
        this.n = new RectF();
    }

    public final void a(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        b();
    }

    public final void a(ColorStateList colorStateList) {
        if (this.c != colorStateList) {
            this.c = colorStateList;
            b();
        }
    }

    public final void b(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            b();
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (!a(this.l, i2, i3, i4, i5)) {
            this.l.set(i2, i3, i4, i5);
            this.J = true;
            d();
        }
    }

    public final void b(int i2, int i3, int i4, int i5) {
        if (!a(this.m, i2, i3, i4, i5)) {
            this.m.set(i2, i3, i4, i5);
            this.J = true;
            d();
        }
    }

    private float c() {
        if (this.f == null) {
            return 0.0f;
        }
        a(this.L);
        TextPaint textPaint = this.L;
        CharSequence charSequence = this.f;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float a() {
        a(this.L);
        return -this.L.ascent();
    }

    public final void a(RectF rectF) {
        float f2;
        boolean b2 = b(this.f);
        Rect rect = this.m;
        if (!b2) {
            f2 = (float) rect.left;
        } else {
            f2 = ((float) rect.right) - c();
        }
        rectF.left = f2;
        rectF.top = (float) this.m.top;
        rectF.right = !b2 ? rectF.left + c() : (float) this.m.right;
        rectF.bottom = ((float) this.m.top) + a();
    }

    private void a(TextPaint textPaint) {
        textPaint.setTextSize(this.q);
        textPaint.setTypeface(this.d);
    }

    private void d() {
        this.k = this.m.width() > 0 && this.m.height() > 0 && this.l.width() > 0 && this.l.height() > 0;
    }

    public final void a(int i2) {
        if (this.o != i2) {
            this.o = i2;
            b();
        }
    }

    public final void b(int i2) {
        if (this.p != i2) {
            this.p = i2;
            b();
        }
    }

    public final void c(int i2) {
        cp a2 = cp.a(this.j.getContext(), i2, a.cM);
        if (a2.f(a.cQ)) {
            this.c = a2.e(a.cQ);
        }
        if (a2.f(a.cN)) {
            this.q = (float) a2.e(a.cN, (int) this.q);
        }
        this.Q = a2.a(a.cT, 0);
        this.O = a2.a(a.cU, 0.0f);
        this.P = a2.a(a.cV, 0.0f);
        this.N = a2.a(a.cW, 0.0f);
        a2.a.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.d = e(i2);
        }
        b();
    }

    public final void d(int i2) {
        cp a2 = cp.a(this.j.getContext(), i2, a.cM);
        if (a2.f(a.cQ)) {
            this.r = a2.e(a.cQ);
        }
        if (a2.f(a.cN)) {
            this.b = (float) a2.e(a.cN, (int) this.b);
        }
        this.U = a2.a(a.cT, 0);
        this.S = a2.a(a.cU, 0.0f);
        this.T = a2.a(a.cV, 0.0f);
        this.R = a2.a(a.cW, 0.0f);
        a2.a.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.e = e(i2);
        }
        b();
    }

    private Typeface e(int i2) {
        TypedArray obtainStyledAttributes = this.j.getContext().obtainStyledAttributes(i2, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(float f2) {
        float a2 = gw.a(f2, 0.0f, 1.0f);
        if (a2 != this.a) {
            this.a = a2;
            f();
        }
    }

    public final boolean a(int[] iArr) {
        this.I = iArr;
        if (!e()) {
            return false;
        }
        b();
        return true;
    }

    private boolean e() {
        ColorStateList colorStateList = this.c;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.r;
            if (colorStateList2 == null || !colorStateList2.isStateful()) {
                return false;
            }
        }
        return true;
    }

    private void f() {
        b(this.a);
    }

    private void b(float f2) {
        c(f2);
        this.w = a(this.u, this.v, f2, this.g);
        this.x = a(this.s, this.t, f2, this.g);
        d(a(this.b, this.q, f2, this.M));
        if (this.c != this.r) {
            this.K.setColor(a(g(), h(), f2));
        } else {
            this.K.setColor(h());
        }
        this.K.setShadowLayer(a(this.R, this.N, f2, (TimeInterpolator) null), a(this.S, this.O, f2, (TimeInterpolator) null), a(this.T, this.P, f2, (TimeInterpolator) null), a(this.U, this.Q, f2));
        ip.d(this.j);
    }

    private int g() {
        int[] iArr = this.I;
        if (iArr != null) {
            return this.r.getColorForState(iArr, 0);
        }
        return this.r.getDefaultColor();
    }

    private int h() {
        int[] iArr = this.I;
        if (iArr != null) {
            return this.c.getColorForState(iArr, 0);
        }
        return this.c.getDefaultColor();
    }

    private void i() {
        float f2 = this.H;
        e(this.q);
        CharSequence charSequence = this.z;
        float f3 = 0.0f;
        float measureText = charSequence != null ? this.K.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int a2 = hx.a(this.p, this.A ? 1 : 0);
        int i2 = a2 & ContentType.LONG_FORM_ON_DEMAND;
        if (i2 == 48) {
            this.t = ((float) this.m.top) - this.K.ascent();
        } else if (i2 != 80) {
            this.t = ((float) this.m.centerY()) + (((this.K.descent() - this.K.ascent()) / 2.0f) - this.K.descent());
        } else {
            this.t = (float) this.m.bottom;
        }
        int i3 = a2 & 8388615;
        if (i3 == 1) {
            this.v = ((float) this.m.centerX()) - (measureText / 2.0f);
        } else if (i3 != 5) {
            this.v = (float) this.m.left;
        } else {
            this.v = ((float) this.m.right) - measureText;
        }
        e(this.b);
        CharSequence charSequence2 = this.z;
        if (charSequence2 != null) {
            f3 = this.K.measureText(charSequence2, 0, charSequence2.length());
        }
        int a3 = hx.a(this.o, this.A ? 1 : 0);
        int i4 = a3 & ContentType.LONG_FORM_ON_DEMAND;
        if (i4 == 48) {
            this.s = ((float) this.l.top) - this.K.ascent();
        } else if (i4 != 80) {
            this.s = ((float) this.l.centerY()) + (((this.K.descent() - this.K.ascent()) / 2.0f) - this.K.descent());
        } else {
            this.s = (float) this.l.bottom;
        }
        int i5 = a3 & 8388615;
        if (i5 == 1) {
            this.u = ((float) this.l.centerX()) - (f3 / 2.0f);
        } else if (i5 != 5) {
            this.u = (float) this.l.left;
        } else {
            this.u = ((float) this.l.right) - f3;
        }
        k();
        d(f2);
    }

    private void c(float f2) {
        this.n.left = a((float) this.l.left, (float) this.m.left, f2, this.g);
        this.n.top = a(this.s, this.t, f2, this.g);
        this.n.right = a((float) this.l.right, (float) this.m.right, f2, this.g);
        this.n.bottom = a((float) this.l.bottom, (float) this.m.bottom, f2, this.g);
    }

    public final void a(Canvas canvas) {
        float f2;
        int save = canvas.save();
        if (this.z != null && this.k) {
            float f3 = this.w;
            float f4 = this.x;
            boolean z2 = this.B && this.C != null;
            if (z2) {
                f2 = this.E * this.G;
            } else {
                this.K.ascent();
                f2 = 0.0f;
                this.K.descent();
            }
            if (z2) {
                f4 += f2;
            }
            float f5 = f4;
            float f6 = this.G;
            if (f6 != 1.0f) {
                canvas.scale(f6, f6, f3, f5);
            }
            if (z2) {
                canvas.drawBitmap(this.C, f3, f5, this.D);
            } else {
                CharSequence charSequence = this.z;
                canvas.drawText(charSequence, 0, charSequence.length(), f3, f5, this.K);
            }
        }
        canvas.restoreToCount(save);
    }

    private boolean b(CharSequence charSequence) {
        boolean z2 = true;
        if (ip.f(this.j) != 1) {
            z2 = false;
        }
        return (z2 ? hh.d : hh.c).a(charSequence, 0, charSequence.length());
    }

    private void d(float f2) {
        e(f2);
        this.B = h && this.G != 1.0f;
        if (this.B) {
            j();
        }
        ip.d(this.j);
    }

    private void e(float f2) {
        boolean z2;
        float f3;
        boolean z3;
        if (this.f != null) {
            float width = (float) this.m.width();
            float width2 = (float) this.l.width();
            boolean z4 = true;
            if (a(f2, this.q)) {
                float f4 = this.q;
                this.G = 1.0f;
                Typeface typeface = this.y;
                Typeface typeface2 = this.d;
                if (typeface != typeface2) {
                    this.y = typeface2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                f3 = f4;
                z2 = z3;
            } else {
                f3 = this.b;
                Typeface typeface3 = this.y;
                Typeface typeface4 = this.e;
                if (typeface3 != typeface4) {
                    this.y = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (a(f2, this.b)) {
                    this.G = 1.0f;
                } else {
                    this.G = f2 / this.b;
                }
                float f5 = this.q / this.b;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
            }
            if (width > 0.0f) {
                z2 = this.H != f3 || this.J || z2;
                this.H = f3;
                this.J = false;
            }
            if (this.z == null || z2) {
                this.K.setTextSize(this.H);
                this.K.setTypeface(this.y);
                TextPaint textPaint = this.K;
                if (this.G == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.f, this.K, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.z)) {
                    this.z = ellipsize;
                    this.A = b(this.z);
                }
            }
        }
    }

    private void j() {
        if (this.C == null && !this.l.isEmpty() && !TextUtils.isEmpty(this.z)) {
            b(0.0f);
            this.E = this.K.ascent();
            this.F = this.K.descent();
            TextPaint textPaint = this.K;
            CharSequence charSequence = this.z;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.F - this.E);
            if (round > 0 && round2 > 0) {
                this.C = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                Canvas canvas = new Canvas(this.C);
                CharSequence charSequence2 = this.z;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.K.descent(), this.K);
                if (this.D == null) {
                    this.D = new Paint(3);
                }
            }
        }
    }

    public final void b() {
        if (this.j.getHeight() > 0 && this.j.getWidth() > 0) {
            i();
            f();
        }
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f)) {
            this.f = charSequence;
            this.z = null;
            k();
            b();
        }
    }

    private void k() {
        Bitmap bitmap = this.C;
        if (bitmap != null) {
            bitmap.recycle();
            this.C = null;
        }
    }

    private static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return eyd.a(f2, f3, f4);
    }

    private static boolean a(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }
}
