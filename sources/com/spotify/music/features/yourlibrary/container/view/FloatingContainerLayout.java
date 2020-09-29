package com.spotify.music.features.yourlibrary.container.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.music.features.yourlibrary.container.view.ListenableScrollingViewBehavior.a;

public class FloatingContainerLayout extends FrameLayout implements e, a {
    public qsh a;
    public int b = -1;

    public final void a(int i) {
    }

    public final void a(int i, float f, int i2) {
    }

    public FloatingContainerLayout(Context context) {
        super(context);
    }

    public FloatingContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FloatingContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void b(int i) {
        this.b = i;
        animate().alpha(0.0f).setDuration(250).withEndAction(new Runnable() {
            public final void run() {
                FloatingContainerLayout.this.b();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        a();
        animate().alpha(1.0f).setDuration(250);
    }

    public final void a(View view) {
        int a2 = gaa.a(getContext().getResources());
        setPadding(0, 0, 0, (view.getBottom() - a2) - ((ViewGroup) view).getChildAt(0).getMinimumHeight());
    }

    public void a() {
        removeAllViews();
        fdh R_ = this.a.c(this.b).R_();
        while (R_.hasNext()) {
            addView((View) R_.next());
        }
    }
}
