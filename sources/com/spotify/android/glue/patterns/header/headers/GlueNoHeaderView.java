package com.spotify.android.glue.patterns.header.headers;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class GlueNoHeaderView extends View implements fvw, fwt {
    public boolean a;

    public final int a() {
        return 0;
    }

    public final void a(int i, float f) {
    }

    public final View b() {
        return this;
    }

    public final void c(int i) {
    }

    public void draw(Canvas canvas) {
    }

    public GlueNoHeaderView(Context context) {
        super(context);
    }

    public GlueNoHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GlueNoHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (!this.a) {
            i3 = 0;
        } else {
            i3 = uuu.c(getContext(), 16843499);
            if (VERSION.SDK_INT >= 19) {
                i3 += gaa.a(getContext().getResources());
            }
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }
}
