package defpackage;

import android.view.animation.Interpolator;

/* renamed from: fvr reason: default package */
public final class fvr {
    public static final Interpolator a = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
}
