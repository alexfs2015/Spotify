package com.spotify.paste.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable, vfv {
    private static final int[] c = {16842912};
    private boolean a;
    private final vfu b = new vfu(this);

    public CheckableImageButton(Context context) {
        super(context);
        vfz.c(this).a();
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vfz.c(this).a();
    }

    public final void a(b bVar) {
        this.b.a(bVar);
    }

    public final b c() {
        return this.b.a;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.b.a();
    }

    public boolean isChecked() {
        return this.a;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.b.b();
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setChecked(boolean z) {
        if (this.a != z) {
            this.a = z;
            refreshDrawableState();
        }
    }

    public void toggle() {
        setChecked(!isChecked());
    }
}
