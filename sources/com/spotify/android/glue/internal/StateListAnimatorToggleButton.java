package com.spotify.android.glue.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class StateListAnimatorToggleButton extends ToggleButton implements vfv {
    private final vfu a = new vfu(this);

    public StateListAnimatorToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vfz.c(this).a();
    }

    public StateListAnimatorToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vfz.c(this).a();
    }

    public final void a(b bVar) {
        this.a.a(bVar);
    }

    public final b c() {
        return this.a.a;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.b();
    }
}
