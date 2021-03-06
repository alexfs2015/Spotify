package com.spotify.android.glue.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;

public class StateListAnimatorRadioButton extends AppCompatRadioButton implements uue {
    private final uud a = new uud(this);

    public StateListAnimatorRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        uui.c(this).a();
    }

    public StateListAnimatorRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uui.c(this).a();
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
