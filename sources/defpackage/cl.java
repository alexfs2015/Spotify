package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: cl reason: default package */
final class cl {
    static final int[] a = {-16842910};
    static final int[] b = {16842908};
    static final int[] c = {16842919};
    static final int[] d = {16842912};
    static final int[] e = new int[0];
    private static final ThreadLocal<TypedValue> f = new ThreadLocal<>();
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        cp a2 = cp.a(context, (AttributeSet) null, iArr);
        try {
            int b2 = a2.b(0, 0);
            return b2;
        } finally {
            a2.a.recycle();
        }
    }

    public static ColorStateList b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        cp a2 = cp.a(context, (AttributeSet) null, iArr);
        try {
            ColorStateList e2 = a2.e(0);
            return e2;
        } finally {
            a2.a.recycle();
        }
    }

    public static int c(Context context, int i) {
        ColorStateList b2 = b(context, i);
        if (b2 != null && b2.isStateful()) {
            return b2.getColorForState(a, b2.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int a2 = a(context, i);
        return gd.c(a2, Math.round(((float) Color.alpha(a2)) * f2));
    }
}
