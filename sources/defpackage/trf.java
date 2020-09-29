package defpackage;

import android.animation.ValueAnimator;

/* renamed from: trf reason: default package */
public final class trf {
    public ValueAnimator a;

    public final void a() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a.removeAllUpdateListeners();
        }
    }
}
