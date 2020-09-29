package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;

public class HideBottomViewOnScrollBehavior<V extends View> extends Behavior<V> {
    private int a = 0;
    private int b = 2;
    /* access modifiers changed from: private */
    public ViewPropertyAnimator c;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.c = null;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.b = 2;
        a(v, 0, 225, eyu.d);
    }

    public final void a(V v, int i) {
        if (this.b == 1 || i <= 0) {
            if (this.b != 2 && i < 0) {
                a(v);
            }
            return;
        }
        b(v);
    }

    public final boolean a(int i) {
        return i == 2;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.a = v.getMeasuredHeight();
        return super.a(coordinatorLayout, v, i);
    }

    /* access modifiers changed from: protected */
    public void b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.b = 1;
        a(v, this.a, 175, eyu.c);
    }
}
