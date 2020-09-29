package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Color;

/* renamed from: udj reason: default package */
abstract class udj implements AnimatorUpdateListener {
    private final vgo a;

    udj(int i, float f) {
        int i2 = (int) (f * 255.0f);
        this.a = vgp.a(i, Color.argb(0, i2, i2, i2) + i);
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(int i);

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        a(this.a.interpolate(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
