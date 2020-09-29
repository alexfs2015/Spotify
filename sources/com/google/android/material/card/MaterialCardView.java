package com.google.android.material.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.spotify.music.R;

public class MaterialCardView extends CardView {
    private final eyw i;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray a = ezs.a(context, attributeSet, a.bF, i2, 2132017996, new int[0]);
        this.i = new eyw(this);
        eyw eyw = this.i;
        eyw.b = a.getColor(a.bG, -1);
        eyw.c = a.getDimensionPixelSize(a.bH, 0);
        eyw.a();
        int i3 = eyw.a.f.left + eyw.c;
        int i4 = eyw.a.f.top + eyw.c;
        int i5 = eyw.a.f.right + eyw.c;
        int i6 = eyw.a.f.bottom + eyw.c;
        MaterialCardView materialCardView = eyw.a;
        materialCardView.f.set(i3, i4, i5, i6);
        CardView.a.d(materialCardView.h);
        a.recycle();
    }

    public final void a(float f) {
        super.a(f);
        this.i.a();
    }
}
