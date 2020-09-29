package defpackage;

import android.view.animation.Interpolator;

/* renamed from: qtg reason: default package */
public final class qtg implements Interpolator {
    public final float getInterpolation(float f) {
        double d = (double) f;
        Double.isNaN(d);
        double pow = Math.pow(2.0d, -10.0d * d);
        Double.isNaN(d);
        return (float) ((pow * Math.sin(((d - 0.1875d) * 6.283185307179586d) / 0.75d)) + 1.0d);
    }
}
