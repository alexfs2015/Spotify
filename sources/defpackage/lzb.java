package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;

/* renamed from: lzb reason: default package */
public final class lzb extends Drawable {
    int a;
    int b;
    boolean c;
    private Drawable d;
    private final Paint e = new Paint(1);
    private final Paint f = new Paint(1);
    private int g;
    private float h;
    private boolean i;
    private final PointF j = new PointF();
    private Path k;
    private final Rect l = new Rect();
    private Bitmap m;
    private ValueAnimator n;
    private final Callback o = new Callback() {
        public final void invalidateDrawable(Drawable drawable) {
            Callback callback = lzb.this.getCallback();
            if (callback != null) {
                callback.invalidateDrawable(lzb.this);
            }
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = lzb.this.getCallback();
            if (callback != null) {
                callback.scheduleDrawable(lzb.this, runnable, j);
            }
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = lzb.this.getCallback();
            if (callback != null) {
                callback.unscheduleDrawable(lzb.this, runnable);
            }
        }
    };

    public lzb(Context context) {
        this.h = (float) vfj.b(4.0f, context.getResources());
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        Float f2 = (Float) valueAnimator.getAnimatedValue();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha((int) (f2.floatValue() * 255.0f));
            this.f.setAlpha((int) (f2.floatValue() * 255.0f));
        }
    }

    public static void a(Rect rect) {
        float b2 = b(rect);
        RectF rectF = new RectF(0.0f, 0.0f, b2, b2);
        Matrix matrix = new Matrix();
        matrix.postRotate(25.0f);
        matrix.mapRect(rectF);
        rect.set(0, 0, Math.round(rectF.width() * 0.66396165f), Math.round(rectF.height() * 0.88528216f));
    }

    private float b() {
        return this.c ? -25.0f : 25.0f;
    }

    private static float b(Rect rect) {
        return Math.min(((float) rect.height()) * 0.73913044f, ((float) rect.width()) * 0.41463414f);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, this.a, this.b, TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.postRotate(25.0f);
        linearGradient.setLocalMatrix(matrix);
        this.e.setShader(linearGradient);
    }

    public final void a(Drawable drawable, boolean z) {
        boolean z2 = this.d == null;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.n.cancel();
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.d = drawable;
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.setCallback(this.o);
        }
        if (!z || !z2) {
            this.f.setAlpha(255);
        } else if (this.d != null) {
            this.n = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.n.setDuration(300).addUpdateListener(new $$Lambda$lzb$LbCjUp3GS5uaM4JLMzpccUmfcQ(this));
            this.n.start();
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        if (VERSION.SDK_INT >= 18) {
            if (this.k == null) {
                this.k = new Path();
                Path path = this.k;
                RectF rectF = new RectF(getBounds());
                float f2 = this.h;
                path.addRoundRect(rectF, f2, f2, Direction.CW);
            }
            Path path2 = this.k;
            if (path2 != null) {
                canvas.clipPath(path2);
            }
        }
        canvas.save();
        if (this.c) {
            canvas.translate((float) bounds.width(), 0.0f);
            canvas.scale((float) (-bounds.width()), (float) bounds.height());
        } else {
            canvas.scale((float) bounds.width(), (float) bounds.height());
        }
        canvas.drawRect(bounds, this.e);
        canvas.restore();
        Drawable drawable = this.d;
        if (drawable != null) {
            int round = Math.round(b(bounds));
            this.l.set(0, 0, round, round);
            if (!this.i) {
                Rect bounds2 = getBounds();
                float b2 = b(bounds2);
                RectF rectF2 = new RectF(0.0f, 0.0f, b2, b2);
                Matrix matrix = new Matrix();
                matrix.postRotate(b());
                matrix.mapRect(rectF2);
                float width = rectF2.width();
                this.j.set(this.c ? (-rectF2.left) - (width * 0.33603835f) : ((-rectF2.left) + ((float) bounds2.width())) - (width * 0.66396165f), ((-rectF2.top) + ((float) bounds2.height())) - (rectF2.height() * 0.88528216f));
                this.i = true;
            }
            canvas.save();
            canvas.translate(this.j.x, this.j.y);
            canvas.rotate(b());
            if (this.m == null) {
                float width2 = (((float) this.l.width()) * 0.05882353f) + (((float) this.l.width()) * 0.029411765f);
                int ceil = (int) Math.ceil((double) ((2.0f * width2) + ((float) this.l.width())));
                Paint paint = new Paint(1);
                paint.setColor(-16777216);
                paint.setShadowLayer(((float) this.l.width()) * 0.05882353f, 0.0f, ((float) this.l.width()) * 0.029411765f, -16777216);
                this.m = Bitmap.createBitmap(ceil, ceil, Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.m);
                canvas2.save();
                canvas2.translate(width2, width2);
                canvas2.drawRect(this.l, paint);
                canvas2.restore();
            }
            float f3 = -((((float) this.l.width()) * 0.05882353f) + (((float) this.l.width()) * 0.029411765f));
            canvas.drawBitmap(this.m, f3, f3, this.f);
            drawable.setBounds(this.l);
            drawable.draw(canvas);
            canvas.restore();
        }
        canvas.restoreToCount(save);
    }

    public final int getOpacity() {
        return this.g == 0 ? -2 : -3;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = false;
        this.k = null;
        this.m = null;
    }

    public final void setAlpha(int i2) {
        this.g = i2;
        this.e.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }
}
