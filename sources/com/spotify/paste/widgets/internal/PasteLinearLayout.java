package com.spotify.paste.widgets.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class PasteLinearLayout extends LinearLayout implements vfv, vhv, vhw {
    private static final int[] d = {16842914};
    private static final int[] e = {-16842910};
    private vfu a;
    private boolean b;
    private boolean c;

    public PasteLinearLayout(Context context) {
        this(context, null);
    }

    public PasteLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PasteLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        if (this.a == null) {
            this.a = new vfu(this);
        }
    }

    public final void a(b bVar) {
        this.a.a(bVar);
    }

    public final void a(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    public final b c() {
        return this.a.a;
    }

    public final void c(boolean z) {
        this.c = z;
        refreshDrawableState();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a();
        this.a.a();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        a();
        this.a.b();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        if (this.c) {
            for (int i2 = 0; i2 < onCreateDrawableState.length; i2++) {
                if (onCreateDrawableState[i2] == 16842910) {
                    onCreateDrawableState[i2] = -16842910;
                }
            }
            mergeDrawableStates(onCreateDrawableState, e);
        }
        return onCreateDrawableState;
    }
}
