package com.spotify.music.homecomponents.card;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;

public class StateListAnimatorCardView extends CardView implements uue {
    private uud i;

    public StateListAnimatorCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StateListAnimatorCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }

    private void b() {
        if (this.i == null) {
            this.i = new uud(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        b();
        this.i.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        b();
        this.i.b();
    }

    public final void a(b bVar) {
        this.i.a(bVar);
    }

    public final b c() {
        return this.i.a;
    }
}
