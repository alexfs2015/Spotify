package defpackage;

import android.view.animation.Interpolator;

/* renamed from: fux reason: default package */
public final class fux {
    public static final Interpolator a = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
}
