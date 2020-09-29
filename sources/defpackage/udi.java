package defpackage;

import android.animation.ValueAnimator;

/* renamed from: udi reason: default package */
public final class udi {
    public ValueAnimator a;

    public final void a() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a.removeAllUpdateListeners();
        }
    }
}
