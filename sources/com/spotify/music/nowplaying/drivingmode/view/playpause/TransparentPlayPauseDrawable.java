package com.spotify.music.nowplaying.drivingmode.view.playpause;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class TransparentPlayPauseDrawable extends Drawable {
    private final Paint a = new Paint(1);
    private final Paint b = new Paint(1);
    private final InnerShape c;
    private final int d;

    public enum InnerShape {
        PLAY,
        PAUSE
    }

    public TransparentPlayPauseDrawable(Context context, int i, InnerShape innerShape, int i2) {
        this.d = i2;
        this.c = innerShape;
        this.b.setColor(context.getResources().getColor(i));
        this.a.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
    }

    public final void draw(Canvas canvas) {
        float width = (float) getBounds().width();
        float height = (float) getBounds().height();
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        float min = Math.min(width, height) / 2.0f;
        canvas.drawCircle(f, f2, min, this.b);
        if (this.c == InnerShape.PLAY) {
            int i = (int) f;
            int i2 = (int) f2;
            this.a.setPathEffect(new CornerPathEffect(0.08f * min));
            int i3 = (int) (0.29f * min);
            int i4 = (int) (min * 0.07f);
            int i5 = (i - i3) + i4;
            Point point = new Point(i5, (i2 - i3) - i4);
            Point point2 = new Point(i5, i2 + i3 + i4);
            int i6 = i + i3;
            double d2 = (double) i4;
            Double.isNaN(d2);
            Point point3 = new Point(i6 + ((int) (d2 * 1.5d)), i2);
            Path path = new Path();
            path.setFillType(FillType.EVEN_ODD);
            path.moveTo((float) point.x, (float) point.y);
            path.lineTo((float) point2.x, (float) point2.y);
            path.lineTo((float) point3.x, (float) point3.y);
            path.lineTo((float) point.x, (float) point.y);
            path.close();
            canvas.drawPath(path, this.a);
            return;
        }
        int i7 = (int) f;
        int i8 = (int) f2;
        int i9 = (int) (0.27f * min);
        int i10 = i7 - i9;
        int i11 = (int) (0.12f * min);
        int i12 = i7 - i11;
        int i13 = i11 + i7;
        int i14 = i7 + i9;
        int i15 = (int) (0.35f * min);
        float f3 = (float) (i8 + i15);
        float f4 = (float) (i8 - i15);
        RectF rectF = new RectF((float) i10, f3, (float) i12, f4);
        RectF rectF2 = new RectF((float) i13, f3, (float) i14, f4);
        float f5 = min * 0.03f;
        canvas.drawRoundRect(rectF, f5, f5, this.a);
        canvas.drawRoundRect(rectF2, f5, f5, this.a);
    }

    public final int getIntrinsicHeight() {
        return this.d;
    }

    public final int getIntrinsicWidth() {
        return this.d;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
