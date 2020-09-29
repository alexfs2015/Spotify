package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: cp reason: default package */
public final class cp {
    public final TypedArray a;
    private final Context b;
    private TypedValue c;

    public static cp a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new cp(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static cp a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new cp(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static cp a(Context context, int i, int[] iArr) {
        return new cp(context, context.obtainStyledAttributes(i, iArr));
    }

    private cp(Context context, TypedArray typedArray) {
        this.b = context;
        this.a = typedArray;
    }

    public final Drawable a(int i) {
        if (this.a.hasValue(i)) {
            int resourceId = this.a.getResourceId(i, 0);
            if (resourceId != 0) {
                return ab.b(this.b, resourceId);
            }
        }
        return this.a.getDrawable(i);
    }

    public final Drawable b(int i) {
        if (this.a.hasValue(i)) {
            int resourceId = this.a.getResourceId(i, 0);
            if (resourceId != 0) {
                return bq.b().a(this.b, resourceId, true);
            }
        }
        return null;
    }

    public final Typeface a(int i, int i2, a aVar) {
        int resourceId = this.a.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return gb.a(this.b, resourceId, this.c, i2, aVar);
    }

    public final CharSequence c(int i) {
        return this.a.getText(i);
    }

    public final String d(int i) {
        return this.a.getString(i);
    }

    public final boolean a(int i, boolean z) {
        return this.a.getBoolean(i, z);
    }

    public final int a(int i, int i2) {
        return this.a.getInt(i, i2);
    }

    public final float a(int i, float f) {
        return this.a.getFloat(i, f);
    }

    public final int b(int i, int i2) {
        return this.a.getColor(i, 0);
    }

    public final ColorStateList e(int i) {
        if (this.a.hasValue(i)) {
            int resourceId = this.a.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a2 = ab.a(this.b, resourceId);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return this.a.getColorStateList(i);
    }

    public final int c(int i, int i2) {
        return this.a.getInteger(i, i2);
    }

    public final float b(int i, float f) {
        return this.a.getDimension(i, 0.0f);
    }

    public final int d(int i, int i2) {
        return this.a.getDimensionPixelOffset(i, i2);
    }

    public final int e(int i, int i2) {
        return this.a.getDimensionPixelSize(i, i2);
    }

    public final int f(int i, int i2) {
        return this.a.getLayoutDimension(i, i2);
    }

    public final int g(int i, int i2) {
        return this.a.getResourceId(i, i2);
    }

    public final boolean f(int i) {
        return this.a.hasValue(i);
    }
}
