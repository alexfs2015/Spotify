package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;

/* renamed from: vhg reason: default package */
public final class vhg {
    public static Drawable a(int i, int i2) {
        return new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{vgp.a(i, 0.4f), i2});
    }

    public static Drawable a(Context context, int i) {
        return a(i, vgl.b(context, 16842836));
    }
}
