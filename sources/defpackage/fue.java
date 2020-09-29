package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import com.spotify.music.R;

/* renamed from: fue reason: default package */
public final class fue {
    private static final int[] a = new int[0];
    private static final int[] b = {-16842910};
    private static final int[] c = {16842908};
    private static final int[] d = {16842919};
    private final int e;
    private final int f;

    public fue(Context context) {
        float a2 = a(context, R.attr.pastePressedDimFraction, 0.3f);
        float a3 = a(context, R.attr.pasteDisabledDimFraction, 0.6f);
        int b2 = vgl.b(context, R.attr.pasteDimOverlayColor);
        this.e = gd.c(b2, (int) (a2 * 255.0f));
        this.f = gd.c(b2, (int) (a3 * 255.0f));
    }

    private static float a(Context context, int i, float f2) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.getFraction(1.0f, 1.0f) : f2;
    }

    public final ColorStateList a(int i) {
        return new ColorStateList(new int[][]{b, d, c, a}, new int[]{gd.a(this.f, i), gd.a(this.e, i), gd.a(this.e, i), i});
    }
}
