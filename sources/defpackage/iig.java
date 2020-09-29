package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.OvershootInterpolator;

/* renamed from: iig reason: default package */
public final class iig extends SimpleOnGestureListener implements OnTouchListener {
    private final View a;
    private final hw b;
    /* access modifiers changed from: private */
    public final a c;
    private float d;
    private float e;
    private float f;
    private float g;
    private final float h;
    private final AnimatorListener i = new AnimatorListenerAdapter() {
        public final void onAnimationEnd(Animator animator) {
            iig.this.c.ai();
        }
    };

    /* renamed from: iig$a */
    public interface a {
        void a(int[] iArr);

        void ah();

        void ai();

        void c();
    }

    /* renamed from: iig$b */
    public static class b implements a {
        public void a(int[] iArr) {
        }

        public void ah() {
        }

        public void ai() {
        }

        public void c() {
        }
    }

    public iig(View view, a aVar) {
        this.a = view;
        this.h = ((float) this.a.getContext().getResources().getDisplayMetrics().widthPixels) / 3.0f;
        this.c = aVar;
        this.b = new hw(view.getContext(), this);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        float max = Math.max(Math.abs(f2), Math.abs(f3));
        float max2 = Math.max(Math.abs(rawX), Math.abs(rawY));
        if (max < 400.0f || max2 < 200.0f) {
            return false;
        }
        float translationX = this.a.getTranslationX() + ((rawX * Math.abs(f2)) / 100.0f);
        this.a.animate().translationX(translationX).translationY(this.a.getTranslationY() + ((rawY * Math.abs(f3)) / 100.0f)).setDuration(300).setListener(this.i).start();
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.c.a(new int[]{Math.round(motionEvent.getX()), Math.round(motionEvent.getY())});
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b.a(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c.c();
            this.d = motionEvent.getRawX();
            this.e = motionEvent.getRawY();
            return true;
        } else if (action == 1) {
            this.c.ah();
            float f2 = this.f;
            float f3 = f2 * f2;
            float f4 = this.g;
            if (Math.sqrt((double) (f3 + (f4 * f4))) > ((double) this.h)) {
                this.c.ai();
            } else {
                this.a.animate().setInterpolator(new OvershootInterpolator()).translationX(0.0f).translationY(0.0f).rotation(0.0f).setDuration(300).start();
            }
            this.f = 0.0f;
            this.g = 0.0f;
            return true;
        } else if (action != 2) {
            return false;
        } else {
            this.f = motionEvent.getRawX() - this.d;
            this.g = motionEvent.getRawY() - this.e;
            this.a.setTranslationX(this.f);
            this.a.setTranslationY(this.g);
            this.a.setRotation(this.f / 30.0f);
            return true;
        }
    }
}
