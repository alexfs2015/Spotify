package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.Interpolator;
import com.spotify.music.R;
import java.util.Locale;

/* renamed from: vft reason: default package */
public final class vft {
    public static Interpolator a(Context context) {
        TypedValue typedValue = new TypedValue();
        boolean z = true;
        if (context.getTheme().resolveAttribute(R.attr.pasteEasingCurveInHard, typedValue, true)) {
            if (typedValue.type != 1) {
                z = false;
            }
            fbp.a(z);
            return a(context, typedValue.resourceId);
        }
        StringBuilder sb = new StringBuilder("Failed to resolve the attribute: ");
        sb.append(R.attr.pasteEasingCurveInHard);
        throw new IllegalStateException(sb.toString());
    }

    private static Interpolator a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, a.a);
        try {
            float f = obtainStyledAttributes.getFloat(a.b, -1.0f);
            float f2 = obtainStyledAttributes.getFloat(a.d, -1.0f);
            float f3 = obtainStyledAttributes.getFloat(a.c, -1.0f);
            float f4 = obtainStyledAttributes.getFloat(a.e, -1.0f);
            if (f != -1.0f && f2 != -1.0f && f3 != -1.0f && f4 != -1.0f) {
                return je.a(f, f2, f3, f4);
            }
            throw new IllegalStateException(String.format(Locale.US, "Incorrectly defined easing curve style. All control points must be set: (%.1f, %.1f, %.1f, %.1f)", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
