package com.spotify.paste.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import androidx.appcompat.widget.AppCompatImageView;

public class SquareImageView extends AppCompatImageView implements uue {
    private final uud a = new uud(this);

    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = false;
        boolean z2 = MeasureSpec.getSize(i) == 0 || getLayoutParams().width == -2;
        if (MeasureSpec.getSize(i2) == 0 || getLayoutParams().height == -2) {
            z = true;
        }
        if (z2) {
            i = MeasureSpec.makeMeasureSpec(getDefaultSize(getSuggestedMinimumWidth(), i2), 1073741824);
        } else if (z) {
            i2 = MeasureSpec.makeMeasureSpec(getDefaultSize(getSuggestedMinimumHeight(), i), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void a(b bVar) {
        this.a.a(bVar);
    }

    public final b c() {
        return this.a.a;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.b();
    }
}
