package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: vfm reason: default package */
public final class vfm {
    private static final int[] a = {16842804, R.attr.fontLeading};

    public static int a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, a);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        obtainStyledAttributes.recycle();
        return dimensionPixelOffset;
    }

    public static int a(Context context, AttributeSet attributeSet, int i) {
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId >= 0) {
            i2 = a(context, resourceId);
        }
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelOffset;
    }

    public static void a(TextView textView, float f) {
        boolean z = true;
        if (jm.a(textView) <= 1 && (textView.getInputType() & -131073) == 0) {
            z = false;
        }
        if (z) {
            textView.setLineSpacing(f, 0.0f);
        }
    }
}
