package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class FontFitTextView extends AppCompatTextView {
    private float a;
    private int b;

    public FontFitTextView(Context context) {
        super(context);
        a(context, null, -1);
    }

    public FontFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, -1);
    }

    public FontFitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        if (i == -1) {
            i = 16842884;
        }
        setTypeface(utw.a(context, attributeSet, i));
        this.a = getTextSize();
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, a.m, 0, 0);
            try {
                this.b = obtainStyledAttributes.getDimensionPixelSize(a.n, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void a(String str, int i) {
        if (i > 0 && !str.isEmpty()) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            if (paddingLeft > 2) {
                Paint paint = new Paint();
                paint.set(getPaint());
                paint.setTextSize(this.a);
                float f = (float) paddingLeft;
                if (paint.measureText(str) <= f) {
                    setTextSize(0, this.a);
                    return;
                }
                float f2 = this.a;
                float f3 = 2.0f;
                while (f2 - f3 > 0.5f) {
                    float f4 = (f2 + f3) / 2.0f;
                    paint.setTextSize(f4);
                    if (paint.measureText(str) >= f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
                int i2 = this.b;
                if (f3 < ((float) i2)) {
                    f3 = (float) i2;
                }
                setTextSize(0, f3);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a(getText().toString(), getMeasuredWidth());
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a(charSequence.toString(), getWidth());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            a(getText().toString(), i);
        }
    }
}
