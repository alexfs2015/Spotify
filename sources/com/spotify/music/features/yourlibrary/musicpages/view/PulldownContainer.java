package com.spotify.music.features.yourlibrary.musicpages.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PulldownContainer extends LinearLayout implements ii {
    public RecyclerView a;
    public int b;
    public boolean c;
    private View d;
    private ig e;
    private int f;
    private int g;
    private ValueAnimator h;

    public PulldownContainer(Context context) {
        super(context);
        a();
    }

    public PulldownContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public PulldownContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        this.e = new ig(this);
        this.e.a(true);
    }

    private void a(int i) {
        View view = null;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            view = getChildAt(i2);
            view.offsetTopAndBottom(i);
        }
        if (view != null && i >= 0) {
            b(view, i);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue() - this.d.getTop();
        this.g = this.d.getTop() + this.b;
        a(intValue);
    }

    private void b() {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
    }

    private static void b(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public void a(int i, int i2) {
        b();
        if (this.d.getTop() != i) {
            this.h = ValueAnimator.ofInt(new int[]{this.d.getTop(), i});
            this.h.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PulldownContainer.this.a(valueAnimator);
                }
            });
            this.h.setDuration((long) i2);
            this.h.start();
        }
    }

    public final void a(View view, int i) {
        this.e.b(i);
        float f2 = ((float) (-this.d.getTop())) / ((float) this.b);
        int i2 = this.f;
        boolean z = true;
        if (i2 != 0 ? f2 >= 0.2f && (f2 > 0.8f || i2 >= 0) : f2 >= 0.5f) {
            z = false;
        }
        if (!z) {
            f2 = 1.0f - f2;
        }
        int i3 = (int) (f2 * 200.0f);
        if (z) {
            a(0, i3);
        } else {
            a(-this.b, i3);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public final void a(View view, int i, int i2, int[] iArr, int i3) {
        b();
        if ((view instanceof RecyclerView) && ((LinearLayoutManager) fbp.a(((RecyclerView) view).d())).k() == 0 && !this.c) {
            this.f = i2;
            int i4 = i2 - iArr[1];
            int min = i2 > 0 ? Math.min(i4, this.d.getTop() + this.b) : Math.max(i4, this.d.getTop());
            iArr[1] = iArr[1] + min;
            a(-min);
            this.g = this.d.getTop() + this.b;
        }
        if (i2 != iArr[1]) {
            this.e.a(i, i2, iArr, (int[]) null, i3);
        }
        if (i3 != 1 || iArr[1] != 0) {
            return;
        }
        if ((i2 < 0 && this.d.getTop() == 0) || (i2 > 0 && this.d.getTop() == (-this.b))) {
            ip.f(view, 1);
        }
    }

    public final boolean a(View view, View view2, int i, int i2) {
        b();
        this.e.a(i, i2);
        return true;
    }

    public final void b(View view, View view2, int i, int i2) {
    }

    public int getNestedScrollAxes() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.d;
        if (view == null) {
            view = getChildAt(0);
        }
        this.d = view;
        int i5 = this.b;
        if (i5 == 0) {
            i5 = this.d.getMeasuredHeight();
        }
        this.b = i5;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.d.getLayoutParams();
        int i6 = marginLayoutParams.topMargin;
        int i7 = this.b;
        if (i6 != (-i7)) {
            marginLayoutParams.topMargin = -i7;
            this.d.setLayoutParams(marginLayoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
        a((this.g - this.b) - this.d.getTop());
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return false;
    }

    public void onStopNestedScroll(View view) {
        this.e.b(0);
    }
}
