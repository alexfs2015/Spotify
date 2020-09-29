package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;

/* renamed from: uvp reason: default package */
public final class uvp {
    public static Drawable a(Context context, int i) {
        return a(i, uuu.b(context, 16842836));
    }

    public static Drawable a(int i, int i2) {
        return new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{uuy.a(i, 0.4f), i2});
    }
}
