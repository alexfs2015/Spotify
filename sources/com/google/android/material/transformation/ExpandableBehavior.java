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

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean a(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i = this.a;
        return i == 0 || i == 2;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(View view, View view2, boolean z, boolean z2);

    public final boolean a(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final ezu ezu;
        if (!ip.B(view)) {
            List b = coordinatorLayout.b(view);
            int size = b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    ezu = null;
                    break;
                }
                View view2 = (View) b.get(i2);
                if (a(coordinatorLayout, view, view2)) {
                    ezu = (ezu) view2;
                    break;
                }
                i2++;
            }
            if (ezu != null && a(ezu.e())) {
                this.a = ezu.e() ? 1 : 2;
                final int i3 = this.a;
                view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.a == i3) {
                            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                            ezu ezu = ezu;
                            expandableBehavior.a((View) ezu, view, ezu.e(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }

    public abstract boolean a(CoordinatorLayout coordinatorLayout, View view, View view2);

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ezu ezu = (ezu) view2;
        if (!a(ezu.e())) {
            return false;
        }
        this.a = ezu.e() ? 1 : 2;
        return a((View) ezu, view, ezu.e(), true);
    }
}
