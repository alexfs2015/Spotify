package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import java.util.List;

public abstract class ExpandableBehavior extends Behavior<View> {
    /* access modifiers changed from: private */
    public int a = 0;

    /* access modifiers changed from: protected */
    public abstract boolean a(View view, View view2, boolean z, boolean z2);

    public abstract boolean a(CoordinatorLayout coordinatorLayout, View view, View view2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final ezd ezd;
        if (!ip.B(view)) {
            List b = coordinatorLayout.b(view);
            int size = b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    ezd = null;
                    break;
                }
                View view2 = (View) b.get(i2);
                if (a(coordinatorLayout, view, view2)) {
                    ezd = (ezd) view2;
                    break;
                }
                i2++;
            }
            if (ezd != null && a(ezd.e())) {
                this.a = ezd.e() ? 1 : 2;
                final int i3 = this.a;
                view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.a == i3) {
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            ezd ezd = ezd;
                            expandableBehavior.a((View) ezd, view, ezd.e(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ezd ezd = (ezd) view2;
        if (!a(ezd.e())) {
            return false;
        }
        this.a = ezd.e() ? 1 : 2;
        return a((View) ezd, view, ezd.e(), true);
    }

    private boolean a(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i = this.a;
        return i == 0 || i == 2;
    }
}
