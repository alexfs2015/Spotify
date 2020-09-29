package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import com.spotify.music.R;

/* renamed from: mw reason: default package */
public final class mw {
    private static final int a = 2131100226;

    static Drawable a(Context context) {
        return c(context, R.drawable.mr_cast_mute_button);
    }

    static Drawable b(Context context) {
        return c(context, R.drawable.mr_cast_checkbox);
    }

    static Drawable c(Context context) {
        return d(context, R.attr.mediaRouteDefaultIconDrawable);
    }

    static Drawable d(Context context) {
        return d(context, R.attr.mediaRouteTvIconDrawable);
    }

    static Drawable e(Context context) {
        return d(context, R.attr.mediaRouteSpeakerIconDrawable);
    }

    static Drawable f(Context context) {
        return d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
    }

    private static Drawable c(Context context, int i) {
        Drawable f = gm.f(fr.a(context, i));
        if (k(context)) {
            gm.a(f, fr.c(context, a));
        }
        return f;
    }

    private static Drawable d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable f = gm.f(obtainStyledAttributes.getDrawable(0));
        if (k(context)) {
            gm.a(f, fr.c(context, a));
        }
        obtainStyledAttributes.recycle();
        return f;
    }

    public static Context g(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, l(context));
        int a2 = a((Context) contextThemeWrapper, (int) R.attr.mediaRouteTheme);
        return a2 != 0 ? new ContextThemeWrapper(contextThemeWrapper, a2) : contextThemeWrapper;
    }

    static Context a(Context context, int i, boolean z) {
        if (i == 0) {
            i = a(context, !z ? R.attr.dialogTheme : R.attr.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return a((Context) contextThemeWrapper, (int) R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, l(contextThemeWrapper)) : contextThemeWrapper;
    }

    static int h(Context context) {
        int a2 = a(context, (int) R.attr.mediaRouteTheme);
        return a2 == 0 ? l(context) : a2;
    }

    static int a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static float i(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static int b(Context context, int i) {
        if (gd.b(-1, a(context, i, (int) R.attr.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    static int j(Context context) {
        int a2 = a(context, 0, (int) R.attr.colorPrimary);
        return gd.b(a2, a(context, 0, 16842801)) < 3.0d ? a(context, 0, (int) R.attr.colorAccent) : a2;
    }

    static void a(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(fr.c(context, k(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
    }

    static void a(Context context, View view, View view2, boolean z) {
        int i;
        int a2 = a(context, 0, (int) R.attr.colorPrimary);
        int a3 = a(context, 0, (int) R.attr.colorPrimaryDark);
        if (!z || b(context, 0) != -570425344) {
            i = a2;
            a2 = a3;
        } else {
            i = -1;
        }
        view.setBackgroundColor(i);
        view2.setBackgroundColor(a2);
        view.setTag(Integer.valueOf(i));
        view2.setTag(Integer.valueOf(a2));
    }

    static void a(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int b = b(context, 0);
        if (Color.alpha(b) != 255) {
            b = gd.a(b, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b, b);
    }

    static void a(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int i;
        int i2;
        if (k(context)) {
            i2 = fr.c(context, R.color.mr_cast_progressbar_progress_and_thumb_light);
            i = fr.c(context, R.color.mr_cast_progressbar_background_light);
        } else {
            i2 = fr.c(context, R.color.mr_cast_progressbar_progress_and_thumb_dark);
            i = fr.c(context, R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(i2, i);
    }

    static void a(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(fr.c(context, k(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), Mode.SRC_IN);
        }
    }

    private static boolean k(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    private static int a(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    private static int l(Context context) {
        return k(context) ? b(context, 0) == -570425344 ? 2132017751 : 2132017752 : b(context, 0) == -570425344 ? 2132017753 : 2132017750;
    }
}
