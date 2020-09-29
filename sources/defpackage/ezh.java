package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: ezh reason: default package */
public class ezh extends Drawable {
    final Rect a = new Rect();
    public float b;
    private Paint c = new Paint(1);
    private RectF d = new RectF();
    private a e = new a(this, 0);
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private ColorStateList k;
    private int l;
    private boolean m = true;

    /* renamed from: ezh$a */
    class a extends ConstantState {
        public final int getChangingConfigurations() {
            return 0;
        }

        private a() {
        }

        /* synthetic */ a(ezh ezh, byte b) {
            this();
        }

        public final Drawable newDrawable() {
            return ezh.this;
        }
    }

    public ezh() {
        this.c.setStyle(Style.STROKE);
    }

    public ConstantState getConstantState() {
        return this.e;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
    }

    public final void a(float f2) {
        if (this.f != f2) {
            this.f = f2;
            this.c.setStrokeWidth(f2 * 1.3333f);
            this.m = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.m) {
            Paint paint = this.c;
            Rect rect = this.a;
            copyBounds(rect);
            float height = this.f / ((float) rect.height());
            LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{gd.a(this.g, this.l), gd.a(this.h, this.l), gd.a(gd.c(this.h, 0), this.l), gd.a(gd.c(this.j, 0), this.l), gd.a(this.j, this.l), gd.a(this.i, this.l)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
            paint.setShader(linearGradient);
            this.m = false;
        }
        float strokeWidth = this.c.getStrokeWidth() / 2.0f;
        RectF rectF = this.d;
        copyBounds(this.a);
        rectF.set(this.a);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.b, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.c);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(int i2) {
        this.c.setAlpha(i2);
        invalidateSelf();
    }

    public final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.l = colorStateList.getColorForState(getState(), this.l);
        }
        this.k = colorStateList;
        this.m = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f > 0.0f ? -3 : -2;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.m = true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.l);
            if (colorForState != this.l) {
                this.m = true;
                this.l = colorForState;
            }
        }
        if (this.m) {
            invalidateSelf();
        }
        return this.m;
    }
}
