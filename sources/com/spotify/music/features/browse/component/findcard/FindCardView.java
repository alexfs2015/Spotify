package com.spotify.music.features.browse.component.findcard;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class FindCardView extends FrameLayout {
    public final lvc a;
    public final TextView b;
    public boolean c;
    private final Rect d;

    public FindCardView(Context context) {
        this(context, null);
    }

    public FindCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FindCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Rect(0, 0, 0, 0);
        LayoutInflater.from(context).inflate(R.layout.browse_category_card, this);
        this.a = new lvc(context);
        setBackground(this.a);
        this.b = (TextView) findViewById(16908308);
    }

    public final void a(Drawable drawable, boolean z) {
        this.a.a(drawable, z);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.d.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        lvc.a(this.d);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.b.getLayoutParams();
        int a2 = ia.a(marginLayoutParams);
        int i3 = marginLayoutParams.topMargin;
        int i4 = marginLayoutParams.bottomMargin;
        int width = this.d.width();
        ia.b(marginLayoutParams, width);
        this.b.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - a2) - width, 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - i3) - i4, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.b;
        if (textView != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) textView.getLayoutParams();
            int a2 = ia.a(marginLayoutParams);
            int i5 = marginLayoutParams.topMargin;
            if (this.c) {
                a2 = ia.b(marginLayoutParams);
            }
            TextView textView2 = this.b;
            textView2.layout(a2, i5, textView2.getMeasuredWidth() + a2, this.b.getMeasuredHeight() + i5);
        }
    }
}
