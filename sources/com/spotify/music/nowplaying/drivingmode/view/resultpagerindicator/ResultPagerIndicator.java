package com.spotify.music.nowplaying.drivingmode.view.resultpagerindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.music.R;

public class ResultPagerIndicator extends View implements e {
    private final int a;
    private final int b;
    private int c;
    private final Paint d;
    private final Paint e;

    public ResultPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ResultPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = vfj.b(8.0f, context.getResources());
        this.b = vfj.a(4.0f, context.getResources());
        this.d = new Paint();
        this.d.setAntiAlias(true);
        this.d.setStyle(Style.FILL);
        this.d.setColor(fr.c(context, R.color.white_30));
        this.e = new Paint();
        this.e.setAntiAlias(true);
        this.e.setStyle(Style.FILL);
        this.e.setColor(fr.c(context, R.color.white));
    }

    public final void a(int i) {
    }

    public final void a(int i, float f, int i2) {
    }

    public final void b(int i) {
        this.c = i;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setVisibility(8);
        setMeasuredDimension(0, 0);
    }
}
