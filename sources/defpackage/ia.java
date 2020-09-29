package defpackage;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: ia reason: default package */
public final class ia {
    public static int a(MarginLayoutParams marginLayoutParams) {
        return VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }

    public static void a(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    public static int b(MarginLayoutParams marginLayoutParams) {
        return VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }

    public static void b(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }

    public static void c(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.resolveLayoutDirection(i);
        }
    }
}
