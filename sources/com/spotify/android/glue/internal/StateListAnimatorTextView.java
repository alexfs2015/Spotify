package com.spotify.android.glue.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class StateListAnimatorTextView extends AppCompatTextView implements uue {
    private final uud a = new uud(this);

    public StateListAnimatorTextView(Context context) {
        super(context);
    }

    public StateListAnimatorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StateListAnimatorTextView(Context context, AttributeSet attributeSet, int i) {
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
