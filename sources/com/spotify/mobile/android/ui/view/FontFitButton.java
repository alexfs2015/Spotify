package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RemoteViews.RemoteView;

@RemoteView
public class FontFitButton extends FontFitTextView {
    public FontFitButton(Context context) {
        this(context, null);
    }

    public FontFitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842824);
    }

    public FontFitButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CharSequence getAccessibilityClassName() {
        return FontFitButton.class.getName();
    }
}
