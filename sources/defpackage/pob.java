package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: pob reason: default package */
public final class pob {
    private static int a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static void a(hcm hcm, ViewGroup viewGroup, DisplayMetrics displayMetrics) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        hcj bundle = hcm.custom().bundle("margin");
        if (bundle != null) {
            marginLayoutParams.setMargins(a(displayMetrics, bundle.intValue("leading", 0)), a(displayMetrics, bundle.intValue("top", 0)), a(displayMetrics, bundle.intValue("trailing", 0)), a(displayMetrics, bundle.intValue("bottom", 0)));
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }
}
