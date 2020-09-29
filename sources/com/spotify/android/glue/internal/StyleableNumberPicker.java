package com.spotify.android.glue.internal;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.spotify.music.R;
import java.lang.reflect.Field;

public class StyleableNumberPicker extends NumberPicker {
    public StyleableNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextView) {
                gap.a((TextView) childAt, context, attributeSet, R.attr.pasteDefaultsTextStyle);
            }
        }
        try {
            Field declaredField = NumberPicker.class.getDeclaredField("mSelectorWheelPaint");
            declaredField.setAccessible(true);
            Paint paint = (Paint) declaredField.get(this);
            Typeface a = vfn.a(context, attributeSet, R.attr.pasteDefaultsTextStyle);
            if (a != null) {
                paint.setTypeface(a);
            }
        } catch (Exception | IllegalAccessException | NoSuchFieldException unused) {
        }
    }
}
