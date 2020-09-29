package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.OvershootInterpolator;

/* renamed from: ppi reason: default package */
public final class ppi extends SimpleOnGestureListener implements OnTouchListener {
    private final View a;
    private final View b;
    private final hw c;
    /* access modifiers changed from: private */
    public final a d;
    private float e;
    private float f;
    private final AnimatorListener g = new AnimatorListenerAdapter() {
        public final void onAnimationEnd(Animator animator) {
            ppi.this.d.a();
        }
    };

    /* renamed from: ppi$a */
    public interface a {
        void a();
    }

    /* renamed from: ppi$b */
    public static class b implements a {
        public void a() {
        }
    }

    public ppi(View view, View view2, a aVar) {
        this.a = view;
        this.b = view2;
        this.d = aVar;
        this.c = new hw(view.getContext(), this);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        if (f3 < 400.0f || rawY < 200.0f) {
            return false;
        }
        this.a.animate().translationY(this.a.getTranslationY() + ((rawY * Math.abs(f3)) / 100.0f)).setDuration(300).setListener(this.g).start();
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.c.a(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.e = motionEvent.getRawY();
            return true;
        } else if (action == 1) {
            if (this.f > ((float) this.b.getHeight()) / 2.0f) {
                this.d.a();
            } else {
                this.a.animate().setInterpolator(new OvershootInterpolator()).translationX(0.0f).translationY(0.0f).rotation(0.0f).setDuration(300).start();
            }
            this.f = 0.0f;
            return true;
        } else if (action != 2) {
            return false;
        } else {
            this.f = motionEvent.getRawY() - this.e;
            this.a.setTranslationX(0.0f);
            View view2 = this.a;
            float f2 = this.f;
            if (f2 <= 0.0f) {
                f2 = 0.0f;
            }
            view2.setTranslationY(f2);
            this.a.setRotation(0.0f);
            return true;
        }
    }
}
