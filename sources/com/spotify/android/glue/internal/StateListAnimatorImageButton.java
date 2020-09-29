package com.spotify.android.glue.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;

public class StateListAnimatorImageButton extends AppCompatImageButton implements uue {
    private final uud a = new uud(this);

    public StateListAnimatorImageButton(Context context) {
        super(context);
        uui.c(this).b(this).a();
    }

    public StateListAnimatorImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        uui.c(this).b(this).a();
    }

    public StateListAnimatorImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uui.c(this).b(this).a();
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
