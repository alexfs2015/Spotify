package com.spotify.mobile.android.spotlets.player.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class MarqueeTextView extends AppCompatTextView {
    public MarqueeTextView(Context context) {
        super(context);
        a(context, null, 16842884);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 16842884);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Typeface a = vfn.a(context, attributeSet, i);
        if (a != null) {
            setTypeface(a);
        }
    }

    public final void a(CharSequence charSequence, ColorStateList colorStateList) {
        String str = "";
        if (!((CharSequence) fbm.a(getText(), "")).equals(charSequence)) {
            setTextColor(colorStateList);
            setText(charSequence);
        }
    }

    public boolean isFocused() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            super.onWindowFocusChanged(z);
        }
    }
}
