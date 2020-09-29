package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class SuppressLayoutTextView extends AppCompatTextView {
    private boolean a;

    public SuppressLayoutTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(CharSequence charSequence) {
        this.a = true;
        setText(charSequence);
        this.a = false;
    }

    public void requestLayout() {
        if (!this.a) {
            super.requestLayout();
        }
    }
}
