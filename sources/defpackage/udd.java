package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.spotify.music.R;

/* renamed from: udd reason: default package */
public final class udd extends Drawable {
    final udm a;
    final udk b;
    private final Paint c;
    private final Paint d;
    private Shader e;
    private final Matrix f;
    private final int g;
    private ValueAnimator h;
    private RectF i;
    private final int j;
    private final int k;

    public udd(Context context, TextPaint textPaint, int i2) {
        this(context, new udn(textPaint, context.getResources().getDimensionPixelSize(R.dimen.episode_card_corner_radius), i2), new udl(), context.getResources().getDimensionPixelSize(R.dimen.episode_card_corner_radius), new Matrix());
    }

    private udd(Context context, udm udm, udk udk, int i2, Matrix matrix) {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.j = fr.c(context, R.color.episode_card_gradient_start);
        this.k = fr.c(context, R.color.episode_card_gradient_end);
        this.g = i2;
        this.a = udm;
        this.a.a(100);
        this.b = udk;
        this.f = matrix;
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        invalidateSelf();
    }

    private void a(boolean z) {
        a();
        this.h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.h.setDuration(400);
        this.h.setInterpolator(fuh.b);
        this.h.addUpdateListener(new $$Lambda$udd$Kz8s1i4jRnclMrGspOlnMFI1Fc(this));
        if (z) {
            this.h.start();
        } else {
            this.h.end();
        }
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
    }

    public final void a(int i2, int i3, boolean z) {
        this.a.a(i2, i3);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{gd.c(i2, 0), i2}, new float[]{0.5f, 1.0f}, TileMode.CLAMP);
        this.e = linearGradient;
        this.d.setShader(this.e);
        this.e.setLocalMatrix(this.f);
        a(z);
    }

    public final void a(Bitmap bitmap, boolean z) {
        this.b.a(bitmap, getBounds());
        a(z);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{this.j, this.k}, new float[]{0.5f, 1.0f}, TileMode.CLAMP);
        this.e = linearGradient;
        this.d.setShader(this.e);
        this.e.setLocalMatrix(this.f);
    }

    public final void b(int i2, int i3, boolean z) {
        this.a.a(i2, i3);
        b();
        a(z);
    }

    public final void draw(Canvas canvas) {
        ValueAnimator valueAnimator = this.h;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        if (animatedFraction < 1.0f || !this.b.a()) {
            this.a.a(canvas, this.c, this.i, animatedFraction, (float) this.g);
        }
        if (this.b.a()) {
            this.b.a(canvas, this.c, this.i, animatedFraction, (float) this.g);
        }
        this.d.setAlpha((int) (animatedFraction * 255.0f));
        RectF rectF = this.i;
        int i2 = this.g;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.d);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i2) {
    }

    public final void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        Rect bounds = getBounds();
        this.i = new RectF(bounds);
        this.a.a(bounds);
        this.b.a(bounds);
        RectF rectF = this.i;
        this.f.reset();
        this.f.setScale(rectF.width(), rectF.height());
        this.e.setLocalMatrix(this.f);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
