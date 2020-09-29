package com.spotify.music.spotlets.scannables.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;

public final class ViewfinderView extends View {
    private static final byte[] a = {0, 63, 116, -106, -75, -47, -24, -8, -1, -11, -23, -34, -45, -55, -65, -73, -80, -84, -86, -84, -80, -73, -65, -55, -45, -34, -23, -11, -1, -8, -24, -47, -75, -106, 116, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private final Paint b = new Paint(1);
    private final Paint c;
    private final RectF d = new RectF();
    private final float e;
    private final PorterDuffXfermode f = new PorterDuffXfermode(Mode.CLEAR);
    private final gcb g = new gcb();
    private Rect h;
    private long i;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b.setColor(Color.argb(PlaybackSpeed.PLAYBACK_SPEED_150, 0, 0, 0));
        this.b.setStyle(Style.FILL);
        this.c = new Paint(1);
        this.e = TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        this.c.setStrokeWidth(this.e * 2.0f);
        this.c.setStyle(Style.STROKE);
        this.c.setColor(-1);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        this.d.left = ((float) this.h.left) - (this.c.getStrokeWidth() / 2.0f);
        this.d.top = ((float) this.h.top) - (this.c.getStrokeWidth() / 2.0f);
        this.d.right = ((float) this.h.right) + (this.c.getStrokeWidth() / 2.0f);
        this.d.bottom = ((float) this.h.bottom) + (this.c.getStrokeWidth() / 2.0f);
        canvas2.drawPaint(this.b);
        canvas2.drawRoundRect(this.d, 6.0f, 6.0f, this.c);
        this.d.left = (float) this.h.left;
        this.d.top = (float) this.h.top;
        this.d.right = (float) this.h.right;
        this.d.bottom = (float) this.h.bottom;
        this.c.setXfermode(this.f);
        this.c.setStyle(Style.FILL);
        canvas2.drawRoundRect(this.d, 6.0f, 6.0f, this.c);
        this.c.setXfermode(null);
        this.c.setStyle(Style.STROKE);
        float f2 = this.e;
        int i2 = (int) (40.0f * f2);
        int i3 = ((this.h.left + this.h.right) - i2) / 2;
        int i4 = ((this.h.left + this.h.right) + i2) / 2;
        int i5 = this.h.bottom + ((int) (this.e * 20.0f));
        int i6 = i5 + ((int) (f2 * 35.0f));
        long a2 = jtp.a.a();
        if (this.i == 0) {
            this.i = a2;
        }
        float f3 = ((float) ((int) (a2 - this.i))) * 5.0E-4f;
        float f4 = 0.5f;
        float f5 = ((float) (i5 + i6)) * 0.5f;
        int i7 = 0;
        while (i7 < 6) {
            float f6 = ((float) i3) + (((float) (i4 - i3)) * (((float) i7) + f4) * 0.16666667f);
            float f7 = ((float) (i6 - i5)) * f4;
            double d2 = (double) ((((((float) (5 - i7)) * 0.04f) + f3) % 1.0f) * 60.0f);
            double floor = Math.floor(d2);
            Double.isNaN(d2);
            double d3 = d2 - floor;
            float f8 = f5;
            int abs = (int) Math.abs(floor);
            byte[] bArr = a;
            float f9 = f7 * (((((float) (bArr[abs] & 255)) + (((float) ((bArr[abs + 1] & 255) - (bArr[abs] & 255))) * ((float) d3))) * 0.003921569f * 0.95f) + 0.05f);
            canvas.drawLine(f6, f8 - f9, f6, f8 + f9, this.c);
            i7++;
            f5 = f8;
            f4 = 0.5f;
        }
        postInvalidateDelayed(80, i3, i5, i4, i6);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6 = i2 / 10;
        this.h = new Rect(i6, i3 / 8, i2 - i6, i3 - (i3 / 3));
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
