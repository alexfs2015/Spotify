package com.google.android.material.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.spotify.music.R;

public class MaterialCardView extends CardView {
    private final ezn i;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray a = faj.a(context, attributeSet, a.bF, i2, 2132017999, new int[0]);
        this.i = new ezn(this);
        ezn ezn = this.i;
        ezn.b = a.getColor(a.bG, -1);
        ezn.c = a.getDimensionPixelSize(a.bH, 0);
        ezn.a();
        int i3 = ezn.a.f.left + ezn.c;
        int i4 = ezn.a.f.top + ezn.c;
        int i5 = ezn.a.f.right + ezn.c;
        int i6 = ezn.a.f.bottom + ezn.c;
        MaterialCardView materialCardView = ezn.a;
        materialCardView.f.set(i3, i4, i5, i6);
        CardView.a.d(materialCardView.h);
        a.recycle();
    }

    public final void a(float f) {
        super.a(f);
        this.i.a();
    }
}
