package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: fam reason: default package */
public final class fam {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = ab.a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    public static Drawable b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable b = ab.b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }
}
