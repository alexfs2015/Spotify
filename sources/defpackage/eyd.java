package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: eyd reason: default package */
public final class eyd {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new kt();
    public static final TimeInterpolator c = new ks();
    public static final TimeInterpolator d = new ku();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
