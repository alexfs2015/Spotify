package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.spotify.music.R;

/* renamed from: gab reason: default package */
public final class gab {
    public static int a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return 0;
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static int b(Context context) {
        int a = a(context);
        return gaa.b(context) ? a + gaa.a(context.getResources()) : a;
    }

    public static Drawable c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarStyle});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{R.attr.background});
        Drawable drawable = obtainStyledAttributes2.getDrawable(0);
        obtainStyledAttributes2.recycle();
        return (Drawable) fay.a(drawable);
    }

    public static void a(View view, Context context) {
        if (VERSION.SDK_INT >= 19) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = gaa.a(context.getResources());
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
