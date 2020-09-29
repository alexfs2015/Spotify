package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class PasteConstraintLayout extends ConstraintLayout implements uue {
    private uud b;

    public PasteConstraintLayout(Context context) {
        this(context, null);
    }

    public PasteConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PasteConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        b();
        this.b.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        b();
        this.b.b();
    }

    private void b() {
        if (this.b == null) {
            this.b = new uud(this);
        }
    }

    public final void a(b bVar) {
        this.b.a(bVar);
    }

    public final b c() {
        return this.b.a;
    }
}
