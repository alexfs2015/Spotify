package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: uub reason: default package */
final class uub extends ValueAnimator {
    /* access modifiers changed from: private */
    public final uua a;
    private final AnimatorUpdateListener b = new AnimatorUpdateListener() {
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            uub.this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    };

    uub(uua uua) {
        this.a = uua;
        addUpdateListener(this.b);
    }

    public final void start() {
        this.a.a();
        super.start();
    }
}
