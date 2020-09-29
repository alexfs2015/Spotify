package com.spotify.android.glue.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class StateListAnimatorImageView extends AppCompatImageView implements vfv {
    private final vfu a = new vfu(this);

    public StateListAnimatorImageView(Context context) {
        super(context);
    }

    public StateListAnimatorImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StateListAnimatorImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
