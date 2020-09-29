package defpackage;

import android.content.res.Resources;

/* renamed from: uts reason: default package */
public final class uts {
    public static int a(float f, Resources resources) {
        return (int) (f * resources.getDisplayMetrics().density);
    }

    public static int b(float f, Resources resources) {
        int round = Math.round(resources.getDisplayMetrics().density * f);
        if (round != 0) {
            return round;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public static int c(float f, Resources resources) {
        return (int) (f * resources.getDisplayMetrics().scaledDensity);
    }
}
