package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {
    private eyn a;
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
            this.a = new eyn(v);
        }
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.a(i2);
            this.b = 0;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.b(v, i);
    }

    public boolean b(int i) {
        eyn eyn = this.a;
        if (eyn != null) {
            return eyn.a(i);
        }
        this.b = i;
        return false;
    }

    public int b() {
        eyn eyn = this.a;
        if (eyn != null) {
            return eyn.b;
        }
        return 0;
    }
}
