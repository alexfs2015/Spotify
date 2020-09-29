package com.spotify.music.playlist.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.R;

public class SimpleHeaderView extends FrameLayout implements tvv {
    private static final fvu d = $$Lambda$SimpleHeaderView$3eobcXMer3ozB6dATjN68X68.INSTANCE;
    public final FrameLayout a;
    public fxe b;
    private fvu c;

    public SimpleHeaderView(Context context) {
        this(context, null);
    }

    public SimpleHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = d;
        LayoutInflater.from(context).inflate(R.layout.simple_header_view, this, true);
        this.a = (FrameLayout) findViewById(R.id.header_content);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(float f) {
    }

    private static void a(int i, float f, Drawable drawable) {
        if (drawable instanceof fww) {
            ((fww) drawable).a(i, f);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
                a(i, f, layerDrawable.getDrawable(i2));
            }
        }
    }

    public final int a() {
        return getMeasuredHeight();
    }

    public final void a(int i, float f) {
        setTranslationY((float) i);
        this.a.setTranslationY((float) (-i));
        fxe fxe = this.b;
        if (fxe instanceof fxh) {
            ((fxh) fxe).a(i, f);
        }
        a(i, f, getBackground());
        a(i, f, getForeground());
        this.c.onScroll(f);
    }

    public final View b() {
        return this;
    }

    public final int c() {
        return 0;
    }
}
