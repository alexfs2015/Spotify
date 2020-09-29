package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Color;

/* renamed from: trg reason: default package */
abstract class trg implements AnimatorUpdateListener {
    private final uux a;

    /* access modifiers changed from: 0000 */
    public abstract void a(int i);

    trg(int i, float f) {
        int i2 = (int) (f * 255.0f);
        this.a = uuy.a(i, Color.argb(0, i2, i2, i2) + i);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        a(this.a.interpolate(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
