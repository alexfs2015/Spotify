package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {
    private eze a;
    private int b = 0;
    private int c = 0;

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new eze(v);
        }
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.a(i2);
            this.b = 0;
        }
        return true;
    }

    public int b() {
        eze eze = this.a;
        if (eze != null) {
            return eze.b;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.b(v, i);
    }

    public boolean b(int i) {
        eze eze = this.a;
        if (eze != null) {
            return eze.a(i);
        }
        this.b = i;
        return false;
    }
}
