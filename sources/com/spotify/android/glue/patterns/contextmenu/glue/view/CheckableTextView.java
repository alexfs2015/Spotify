package com.spotify.android.glue.patterns.contextmenu.glue.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.spotify.android.glue.internal.StateListAnimatorTextView;

public class CheckableTextView extends StateListAnimatorTextView implements Checkable {
    private static final int[] b = {16842912};
    private boolean a;

    public CheckableTextView(Context context) {
        this(context, null);
    }

    public CheckableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gap.a(this, context, attributeSet, i);
    }

    public boolean isChecked() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    public void toggle() {
        setChecked(!this.a);
    }
}
