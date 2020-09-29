package com.spotify.mobile.android.spotlets.player.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class MarqueeTextView extends TextView {
    public boolean isFocused() {
        return true;
    }

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

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        setTypeface(utw.a(context, attributeSet, i));
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

    public final void a(CharSequence charSequence, ColorStateList colorStateList) {
        if (!((CharSequence) fav.a(getText(), "")).equals(charSequence)) {
            setTextColor(colorStateList);
            setText(charSequence);
        }
    }
}
