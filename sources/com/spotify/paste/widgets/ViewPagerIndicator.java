package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.music.R;

public class ViewPagerIndicator extends View implements e {
    public e a;
    private final int b;
    private final int c;
    private float d;
    private final Paint e;
    private final Paint f;
    private ViewPager g;

    public ViewPagerIndicator(Context context) {
        this(context, null);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteDefaultsViewPagerIndicatorStyle);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vgk.a(ViewPagerIndicator.class, this);
        int b2 = vfj.b(10.0f, context.getResources());
        int a2 = vfj.a(6.0f, context.getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.Y, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(a.ab, b2);
        this.c = obtainStyledAttributes.getDimensionPixelOffset(a.ac, a2);
        int color = obtainStyledAttributes.getColor(a.aa, -7829368);
        int color2 = obtainStyledAttributes.getColor(a.Z, -1);
        obtainStyledAttributes.recycle();
        this.e = new Paint();
        this.e.setAntiAlias(true);
        this.e.setStyle(Style.FILL);
        this.e.setColor(color);
        this.f = new Paint();
        this.f.setAntiAlias(true);
        this.f.setStyle(Style.FILL);
        this.f.setColor(color2);
    }

    public final void a(int i) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public final void a(int i, float f2, int i2) {
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        this.d = ((float) i) + f2;
        postInvalidate();
        e eVar = this.a;
        if (eVar != null) {
            eVar.a(i, f2, i2);
        }
    }

    public final void a(ViewPager viewPager) {
        ViewPager viewPager2 = this.g;
        if (viewPager2 != null) {
            viewPager2.b((e) this);
        }
        this.g = viewPager;
        this.g.a((e) this);
        this.d = (float) this.g.c;
        invalidate();
    }

    public final void b(int i) {
        this.d = (float) i;
        postInvalidate();
        e eVar = this.a;
        if (eVar != null) {
            eVar.b(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        ViewPager viewPager = this.g;
        if (viewPager != null) {
            sf sfVar = viewPager.b;
            if (sfVar != null) {
                int b2 = sfVar.b();
                if (b2 > 1) {
                    int save = canvas.save();
                    canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                    float f2 = ((float) this.b) / 2.0f;
                    for (int i = 0; i < b2; i++) {
                        canvas.drawCircle(((float) ((this.b + this.c) * i)) + f2, f2, f2, this.e);
                    }
                    canvas.drawCircle((this.d * ((float) (this.b + this.c))) + f2, f2, f2, this.f);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            androidx.viewpager.widget.ViewPager r4 = r3.g
            r5 = 0
            if (r4 == 0) goto L_0x000e
            sf r4 = r4.b
            if (r4 == 0) goto L_0x000e
            int r4 = r4.b()
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            r0 = 1
            if (r4 > r0) goto L_0x001b
            r4 = 8
            r3.setVisibility(r4)
            r3.setMeasuredDimension(r5, r5)
            return
        L_0x001b:
            int r1 = r3.b
            int r2 = r4 * r1
            int r4 = r4 - r0
            int r0 = r3.c
            int r4 = r4 * r0
            int r2 = r2 + r4
            int r4 = r3.getPaddingLeft()
            int r0 = r3.getPaddingRight()
            int r4 = r4 + r0
            int r2 = r2 + r4
            int r4 = r3.getPaddingTop()
            int r0 = r3.getPaddingBottom()
            int r4 = r4 + r0
            int r1 = r1 + r4
            r3.setVisibility(r5)
            r3.setMeasuredDimension(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.widgets.ViewPagerIndicator.onMeasure(int, int):void");
    }
}
