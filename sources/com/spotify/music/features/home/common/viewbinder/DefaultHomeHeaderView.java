package com.spotify.music.features.home.common.viewbinder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.music.R;

public class DefaultHomeHeaderView extends View implements fvw, fwt {
    private static final fva c = $$Lambda$DefaultHomeHeaderView$paz1FrOylcKIn_e8KOkBikcTj6c.INSTANCE;
    private fva a;
    private final int b;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(float f) {
    }

    public final View b() {
        return this;
    }

    public final void c(int i) {
    }

    public DefaultHomeHeaderView(Context context) {
        this(context, null);
    }

    public DefaultHomeHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultHomeHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = c;
        this.b = gaa.a(context.getResources()) + (uuu.c(context, R.attr.actionBarSize) / 2);
        setLayoutParams(new LayoutParams(-1, this.b));
    }

    public final void a(int i, float f) {
        this.a.onScroll(f);
    }

    public final void a(fva fva) {
        this.a = (fva) fav.a(fva, c);
    }

    public final int a() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(this.b, 1073741824));
    }
}
