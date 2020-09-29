package com.spotify.music.slate.container.view.card;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.OvershootInterpolator;

public final class CardInteractionHandler extends SimpleOnGestureListener implements OnTouchListener {
    public boolean a = true;
    private final View b;
    private final hw c;
    /* access modifiers changed from: private */
    public final a d;
    private float e;
    private float f;
    private float g;
    private float h;
    private final float i;
    /* access modifiers changed from: private */
    public SwipeDirection j;
    private final AnimatorListener k = new AnimatorListenerAdapter() {
        public final void onAnimationEnd(Animator animator) {
            CardInteractionHandler.this.d.a(CardInteractionHandler.this.j);
        }
    };

    public enum SwipeDirection {
        LEFT,
        RIGHT
    }

    public interface a {
        void a(double d, float f, SwipeDirection swipeDirection);

        void a(SwipeDirection swipeDirection);

        void aE_();

        void b();
    }

    public static class b implements a {
        public final void a(double d, float f, SwipeDirection swipeDirection) {
        }

        public void a(SwipeDirection swipeDirection) {
        }

        public void aE_() {
        }

        public void b() {
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public CardInteractionHandler(View view, a aVar) {
        this.b = view;
        this.i = ((float) this.b.getContext().getResources().getDisplayMetrics().widthPixels) / 3.0f;
        this.d = aVar;
        this.c = new hw(view.getContext(), this);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        this.j = rawX < 0.0f ? SwipeDirection.LEFT : SwipeDirection.RIGHT;
        float max = Math.max(Math.abs(f2), Math.abs(f3));
        float max2 = Math.max(Math.abs(rawX), Math.abs(rawY));
        if (max < 400.0f || max2 < 200.0f || !this.a) {
            return false;
        }
        this.b.animate().translationX(this.b.getTranslationX() + ((rawX * Math.abs(f2)) / 100.0f)).translationY(this.b.getTranslationY() + ((rawY * Math.abs(f3)) / 100.0f)).setDuration(300).setListener(this.k).start();
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.c.a(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d.aE_();
            this.e = motionEvent.getRawX();
            this.f = motionEvent.getRawY();
            return true;
        } else if (action == 1) {
            this.d.b();
            float f2 = this.g;
            float f3 = f2 * f2;
            float f4 = this.h;
            if (Math.sqrt((double) (f3 + (f4 * f4))) <= ((double) this.i) || !this.a) {
                this.b.animate().setInterpolator(new OvershootInterpolator()).translationX(0.0f).translationY(0.0f).rotation(0.0f).setDuration(300).start();
            } else if (this.g < 0.0f) {
                this.d.a(SwipeDirection.LEFT);
            } else {
                this.d.a(SwipeDirection.RIGHT);
            }
            this.g = 0.0f;
            this.h = 0.0f;
            return true;
        } else if (action != 2) {
            return false;
        } else {
            this.g = motionEvent.getRawX() - this.e;
            this.h = motionEvent.getRawY() - this.f;
            this.b.setTranslationX(this.g);
            this.b.setTranslationY(this.h);
            this.b.setRotation(this.g / 30.0f);
            float f5 = this.g;
            float f6 = f5 * f5;
            float f7 = this.h;
            double sqrt = Math.sqrt((double) (f6 + (f7 * f7)));
            float f8 = this.i;
            if (sqrt < ((double) f8)) {
                this.d.a(sqrt, f8, this.g < 0.0f ? SwipeDirection.LEFT : SwipeDirection.RIGHT);
            }
            return true;
        }
    }
}
