package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class VisibilityAwareImageButton extends ImageButton {
    public int d;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }

    public void setVisibility(int i) {
        a(i, true);
    }
}
