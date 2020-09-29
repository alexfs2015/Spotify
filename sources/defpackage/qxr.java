package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;

/* renamed from: qxr reason: default package */
public final class qxr {
    private static final ImmutableList<Integer> a;
    private static final int b;

    static {
        ImmutableList<Integer> a2 = ImmutableList.a(Integer.valueOf(R.color.user_overlay_orange), Integer.valueOf(R.color.user_overlay_sunflower), Integer.valueOf(R.color.user_overlay_electric_seafoam), Integer.valueOf(R.color.user_overlay_salmon), Integer.valueOf(R.color.user_overlay_storm));
        a = a2;
        b = a2.size();
    }

    public static int a(Context context, String str) {
        return TextUtils.isEmpty(str) ? fr.c(context, ((Integer) a.get(0)).intValue()) : fr.c(context, ((Integer) a.get(str.length() % b)).intValue());
    }

    public static ColorFilter b(Context context, String str) {
        int a2 = a(context, str);
        int c = fr.c(context, R.color.user_duotone_dark);
        int red = Color.red(c);
        int green = Color.green(c);
        int blue = Color.blue(c);
        ColorMatrix colorMatrix = new ColorMatrix(new float[]{((float) (Color.red(a2) - red)) / 255.0f, 0.0f, 0.0f, 0.0f, (float) red, 0.0f, ((float) (Color.green(a2) - green)) / 255.0f, 0.0f, 0.0f, (float) green, 0.0f, 0.0f, ((float) (Color.blue(a2) - blue)) / 255.0f, 0.0f, (float) blue, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f});
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(0.0f);
        colorMatrix2.postConcat(colorMatrix);
        return new ColorMatrixColorFilter(colorMatrix2);
    }
}
