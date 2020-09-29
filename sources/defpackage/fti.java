package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

/* renamed from: fti reason: default package */
final class fti {
    private static final a a = new a(6);

    /* renamed from: fti$a */
    static class a extends dt<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(6);
        }

        static int a(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    static void a(Drawable drawable, ColorStateList colorStateList, int[] iArr) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (drawable.mutate() == drawable) {
            Mode mode = Mode.SRC_IN;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                int colorForState = colorStateList.getColorForState(iArr, 0);
                porterDuffColorFilter = (PorterDuffColorFilter) a.a(Integer.valueOf(a.a(colorForState, mode)));
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
                    PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) a.a(Integer.valueOf(a.a(colorForState, mode)), porterDuffColorFilter);
                }
            }
            drawable.setColorFilter(porterDuffColorFilter);
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }
}
