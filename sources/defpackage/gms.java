package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: gms reason: default package */
public final class gms extends Drawable {
    private final Paint a = new Paint(1);
    private final vhl b;
    private final vhl c;
    private final int d;
    private final int e;
    private final float f;
    private boolean g;

    public gms(vhl vhl, vhl vhl2, int i, int i2, float f2) {
        this.b = vhl;
        this.c = vhl2;
        this.d = i;
        this.e = i2;
        this.f = f2;
    }

    public final void a(boolean z) {
        this.g = z;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        float intrinsicWidth = ((float) this.b.getIntrinsicWidth()) / 2.0f;
        float intrinsicHeight = ((float) this.b.getIntrinsicHeight()) / 2.0f;
        canvas.save();
        canvas.translate(exactCenterX - intrinsicWidth, exactCenterY - intrinsicHeight);
        this.b.draw(canvas);
        canvas.restore();
        if (this.g) {
            float intrinsicWidth2 = ((float) this.c.getIntrinsicWidth()) / 2.0f;
            float intrinsicHeight2 = ((float) this.c.getIntrinsicHeight()) / 2.0f;
            float f2 = (exactCenterX + intrinsicWidth) - intrinsicWidth2;
            int i = this.d;
            float f3 = f2 + ((float) i);
            float f4 = ((exactCenterY + intrinsicHeight) - intrinsicHeight2) + ((float) i);
            this.a.setColor(0);
            this.a.setShadowLayer(this.f, 0.0f, 0.0f, this.e);
            canvas.drawCircle(f3, f4, intrinsicWidth2, this.a);
            canvas.translate(f3 - intrinsicWidth2, f4 - intrinsicHeight2);
            this.c.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight() + ((this.d + ((int) this.f)) << 1);
    }

    public final int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth() + ((this.d + ((int) this.f)) << 1);
    }

    public final int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        vhl vhl = this.b;
        vhl.setBounds(0, 0, vhl.getIntrinsicWidth(), this.b.getIntrinsicHeight());
        vhl vhl2 = this.c;
        vhl2.setBounds(0, 0, vhl2.getIntrinsicWidth(), this.c.getIntrinsicHeight());
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
