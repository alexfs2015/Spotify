package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        cp a2 = cp.a(context, attributeSet, a.cd);
        this.a = a2.c(a.cg);
        this.b = a2.a(a.ce);
        this.c = a2.g(a.cf, 0);
        a2.a.recycle();
    }
}
