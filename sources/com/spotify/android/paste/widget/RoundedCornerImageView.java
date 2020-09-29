package com.spotify.android.paste.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import com.spotify.android.glue.internal.StateListAnimatorImageView;
import com.spotify.music.R;

@Deprecated
public class RoundedCornerImageView extends StateListAnimatorImageView {
    private final int a;
    private Paint b;
    private RectF c;
    private Bitmap d;
    private final Xfermode e;
    private int f;
    private int g;
    private int h;

    public RoundedCornerImageView(Context context) {
        this(context, null);
    }

    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = uts.a(4.0f, getResources());
        this.e = new PorterDuffXfermode(Mode.DST_ATOP);
        this.b = new Paint(1);
        this.b.setColor(fr.c(getContext(), R.color.cat_black_60));
        setLayerType(2, null);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g = i;
        this.h = i2;
        this.c = new RectF(0.0f, 0.0f, (float) i, (float) i2);
    }

    public final void a(boolean z) {
        this.f = z ? this.a : 0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d == null) {
            this.d = Bitmap.createBitmap(this.g, this.h, Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.d);
            this.b.setXfermode(null);
            RectF rectF = this.c;
            int i = this.f;
            canvas2.drawRoundRect(rectF, (float) i, (float) i, this.b);
        }
        this.b.setXfermode(this.e);
        canvas.drawBitmap(this.d, 0.0f, 0.0f, this.b);
    }
}
