package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: phk reason: default package */
public final class phk {
    public static void a(gzt gzt, ViewGroup viewGroup, DisplayMetrics displayMetrics) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
        gzq bundle = gzt.custom().bundle("margin");
        if (bundle != null) {
            marginLayoutParams.setMargins(a(displayMetrics, bundle.intValue("leading", 0)), a(displayMetrics, bundle.intValue("top", 0)), a(displayMetrics, bundle.intValue("trailing", 0)), a(displayMetrics, bundle.intValue("bottom", 0)));
            viewGroup.setLayoutParams(marginLayoutParams);
        }
    }

    private static int a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }
}
