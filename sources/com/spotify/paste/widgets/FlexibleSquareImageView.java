package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.appcompat.widget.AppCompatImageView;

public class FlexibleSquareImageView extends AppCompatImageView implements vfv {
    private final vfu a;
    private float b;

    public FlexibleSquareImageView(Context context) {
        this(context, null);
    }

    public FlexibleSquareImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexibleSquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new vfu(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.z, i, 0);
        fbp.a(obtainStyledAttributes.hasValue(a.A));
        this.b = obtainStyledAttributes.getFraction(a.A, 1, 1, 1.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(b bVar) {
        this.a.a(bVar);
    }

    public final b c() {
        return this.a.a;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.b();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int max = (int) Math.max(((float) MeasureSpec.getSize(i)) * this.b, (float) getSuggestedMinimumWidth());
        setMeasuredDimension(max, max);
    }
}
