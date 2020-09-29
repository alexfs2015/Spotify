package com.spotify.paste.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable, uue {
    private static final int[] c = {16842912};
    private boolean a;
    private final uud b = new uud(this);

    public CheckableImageButton(Context context) {
        super(context);
        uui.c(this).a();
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        uui.c(this).a();
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.a != z) {
            this.a = z;
            refreshDrawableState();
        }
    }

    public boolean isChecked() {
        return this.a;
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public final void a(b bVar) {
        this.b.a(bVar);
    }

    public final b c() {
        return this.b.a;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.b.b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.b.a();
    }
}
