package com.spotify.music.libs.connect.access.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;

public class PressableConnectCardView extends CardView implements uue {
    private final uud i = new uud(this);

    public PressableConnectCardView(Context context) {
        super(context);
    }

    public PressableConnectCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PressableConnectCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final void a(b bVar) {
        this.i.a(bVar);
    }

    public final b c() {
        return this.i.a;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.i.b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.i.a();
    }
}
