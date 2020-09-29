package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: tqo reason: default package */
public final class tqo {
    public static float a(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    public static int a(Resources resources, int i, int i2) {
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        int a = (int) (((float) resources.getDisplayMetrics().widthPixels) * a(resources, i));
        return a < dimensionPixelSize ? a : dimensionPixelSize;
    }
}
