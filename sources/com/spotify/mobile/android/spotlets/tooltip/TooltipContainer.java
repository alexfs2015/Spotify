package com.spotify.mobile.android.spotlets.tooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.spotify.music.R;

public class TooltipContainer extends FrameLayout {
    /* access modifiers changed from: private */
    public final jdp a;
    private final int b;
    private final int c;
    private boolean d;
    private MotionEvent e;
    private ViewGroup f;
    private boolean g;
    private boolean h;
    /* access modifiers changed from: private */
    public AnimatorSet i;
    private final jdo j;
    private final OnAttachStateChangeListener k;

    public TooltipContainer(Context context) {
        this(context, null, 0);
    }

    public TooltipContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TooltipContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = true;
        this.j = new jdo() {
        };
        this.k = new OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
                TooltipContainer.this.a();
            }
        };
        this.b = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_distance_from_view);
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = new jdp(context);
        jdp jdp = this.a;
        addView(jdp, -1, -2);
        jdp.a(true);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int top = this.a.getTop();
        int measuredHeight = this.a.getMeasuredHeight();
        this.a.layout(i2, top, this.a.getMeasuredWidth() + i2, measuredHeight + top);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.e = MotionEvent.obtain(motionEvent);
        } else if (action == 2) {
            MotionEvent motionEvent2 = this.e;
            if (motionEvent2 != null && Math.abs(motionEvent2.getY() - motionEvent.getY()) > ((float) this.c)) {
                this.g = true;
                this.h = true;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.g = false;
            this.h = false;
            MotionEvent motionEvent2 = this.e;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.e = null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void a() {
        MotionEvent motionEvent = this.e;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.e = null;
        }
        this.f = null;
        if (!this.d) {
            this.d = true;
            this.a.a = new a() {
                public final void a() {
                    TooltipContainer.this.i = null;
                    TooltipContainer.this.a.a(true);
                    TooltipContainer.this.a.a = null;
                }
            };
            jdp jdp = this.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    jdp.a(jdp.this, floatValue);
                    jdp.b(jdp.this, floatValue);
                    jdp.this.invalidate();
                }
            });
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f});
            PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.5f});
            PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.25f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(jdp.b, new PropertyValuesHolder[]{ofFloat2, ofFloat3, ofFloat4});
            ofPropertyValuesHolder.setDuration(100);
            ofPropertyValuesHolder.setStartDelay(100);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofPropertyValuesHolder});
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (jdp.this.a != null) {
                        jdp.this.a.a();
                    }
                    if (jdp.this.f.b()) {
                        jdp.this.f.c();
                        jdp.this.f = Optional.e();
                    }
                }
            });
            animatorSet.start();
            this.i = animatorSet;
        }
    }
}
