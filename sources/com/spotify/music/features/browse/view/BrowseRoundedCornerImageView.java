package com.spotify.music.features.browse.view;

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

@Deprecated
public class BrowseRoundedCornerImageView extends StateListAnimatorImageView {
    public final int a;
    public int b;
    private Paint c;
    private RectF d;
    private Bitmap e;
    private final Xfermode f;
    private int g;
    private int h;

    public BrowseRoundedCornerImageView(Context context) {
        this(context, null);
    }

    public BrowseRoundedCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseRoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = uts.a(4.0f, getResources());
        this.f = new PorterDuffXfermode(Mode.DST_ATOP);
        this.c = new Paint(1);
        setLayerType(2, null);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g = i;
        this.h = i2;
        this.d = new RectF(0.0f, 0.0f, (float) i, (float) i2);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e == null) {
            this.e = Bitmap.createBitmap(this.g, this.h, Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.e);
            this.c.setXfermode(null);
            RectF rectF = this.d;
            int i = this.b;
            canvas2.drawRoundRect(rectF, (float) i, (float) i, this.c);
        }
        this.c.setXfermode(this.f);
        canvas.drawBitmap(this.e, 0.0f, 0.0f, this.c);
    }
}
