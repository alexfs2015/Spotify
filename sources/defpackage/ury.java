package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: ury reason: default package */
public final class ury {
    public static Drawable a(Context context) {
        return a((Context) fay.a(context), 16, 1, 0.6f);
    }

    public static Drawable b(Context context) {
        return b((Context) fay.a(context), 16, 1, 0.6f);
    }

    public static Drawable c(Context context) {
        return a((Context) fay.a(context), SpotifyIcon.CHEVRON_UP_24, context.getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size));
    }

    public static uva a(Context context, int i, int i2, float f) {
        return a((Context) fay.a(context), i, i2, SpotifyIcon.PLAY_32, f);
    }

    public static uva b(Context context, int i, int i2, float f) {
        return a((Context) fay.a(context), i, i2, SpotifyIcon.PAUSE_32, f);
    }

    public static Drawable d(Context context) {
        return a((Context) fay.a(context), SpotifyIcon.SKIP_BACK_32, uts.b(24.0f, context.getResources()));
    }

    public static Drawable e(Context context) {
        return b((Context) fay.a(context), SpotifyIcon.SKIP_BACK_32, uts.b(24.0f, context.getResources()));
    }

    public static Drawable f(Context context) {
        return a((Context) fay.a(context), SpotifyIcon.SKIP_FORWARD_32, uts.b(24.0f, context.getResources()));
    }

    public static Drawable g(Context context) {
        return b((Context) fay.a(context), SpotifyIcon.SKIP_FORWARD_32, uts.b(24.0f, context.getResources()));
    }

    public static Drawable h(Context context) {
        return a((Context) fay.a(context), SpotifyIcon.SHUFFLE_32, s(context), (int) R.color.cat_white, (int) R.color.cat_white_70);
    }

    public static Drawable i(Context context) {
        return a(context, a((Context) fay.a(context), SpotifyIcon.SHUFFLE_32, s(context), (int) R.color.cat_medium_green, (int) R.color.cat_light_green));
    }

    public static Drawable j(Context context) {
        return b((Context) fay.a(context), SpotifyIcon.SHUFFLE_32, s(context));
    }

    public static Drawable k(Context context) {
        return a((Context) fay.a(context), SpotifyIcon.REPEAT_32, s(context), (int) R.color.cat_white, (int) R.color.cat_white_70);
    }

    public static Drawable l(Context context) {
        return a(context, a((Context) fay.a(context), SpotifyIcon.REPEAT_32, s(context), (int) R.color.cat_medium_green, (int) R.color.cat_light_green));
    }

    public static Drawable m(Context context) {
        return a(context, a((Context) fay.a(context), SpotifyIcon.REPEATONCE_32, s(context), (int) R.color.cat_medium_green, (int) R.color.cat_light_green));
    }

    public static Drawable n(Context context) {
        return b((Context) fay.a(context), SpotifyIcon.REPEAT_32, s(context));
    }

    public static Drawable o(Context context) {
        return a((Context) fay.a(context), SpotifyIcon.QUEUE_24, uts.b(24.0f, context.getResources()));
    }

    public static Drawable p(Context context) {
        return a((Context) fay.a(context), SpotifyIcon.SLEEPTIMER_32, s(context), (int) R.color.cat_white, (int) R.color.cat_white_70);
    }

    public static Drawable q(Context context) {
        float dimensionPixelSize = (float) ((Context) fay.a(context)).getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context, SpotifyIconV2.HEART, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(context, SpotifyIconV2.HEART, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable5 = new SpotifyIconDrawable(context, SpotifyIconV2.HEART, dimensionPixelSize);
        spotifyIconDrawable.a(fr.c(context, R.color.cat_medium_green));
        spotifyIconDrawable2.a(fr.c(context, R.color.cat_light_green));
        spotifyIconDrawable3.a(fr.c(context, R.color.cat_white_70));
        spotifyIconDrawable4.a(fr.c(context, R.color.cat_white));
        spotifyIconDrawable5.a(fr.c(context, R.color.cat_white_40));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842910}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16843518, 16842919, 16842910}, spotifyIconDrawable2);
        stateListDrawable.addState(new int[]{16843518}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919, 16842910}, spotifyIconDrawable3);
        stateListDrawable.addState(new int[]{-16842910}, spotifyIconDrawable5);
        stateListDrawable.addState(new int[0], spotifyIconDrawable4);
        return stateListDrawable;
    }

    public static Drawable r(Context context) {
        float dimensionPixelSize = (float) ((Context) fay.a(context)).getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.BAN_ACTIVE, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN_ACTIVE, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable5 = new SpotifyIconDrawable(context, SpotifyIconV2.BAN, dimensionPixelSize);
        spotifyIconDrawable.a(fr.c(context, R.color.cat_medium_red));
        spotifyIconDrawable2.a(fr.c(context, R.color.cat_light_red));
        spotifyIconDrawable3.a(fr.c(context, R.color.cat_white_70));
        spotifyIconDrawable4.a(fr.c(context, R.color.cat_white));
        spotifyIconDrawable5.a(fr.c(context, R.color.cat_white_40));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842910}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919, 16842910}, spotifyIconDrawable2);
        stateListDrawable.addState(new int[]{16843518}, spotifyIconDrawable);
        stateListDrawable.addState(new int[]{16842919}, spotifyIconDrawable3);
        stateListDrawable.addState(new int[]{-16842910}, spotifyIconDrawable5);
        stateListDrawable.addState(new int[0], spotifyIconDrawable4);
        return stateListDrawable;
    }

    public static Drawable a(Context context, SpotifyIcon spotifyIcon, int i, int i2, int i3) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) fay.a(context), spotifyIcon, (float) i);
        spotifyIconDrawable.a(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{fr.c(context, i3), fr.c(context, i2)}));
        return spotifyIconDrawable;
    }

    public static int s(Context context) {
        return ((Context) fay.a(context)).getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size);
    }

    public static Drawable a(Context context, SpotifyIcon spotifyIcon, int i) {
        return a((Context) fay.a(context), spotifyIcon, i, fr.b(context, (int) R.color.btn_now_playing_white));
    }

    public static Drawable b(Context context, SpotifyIcon spotifyIcon, int i) {
        return a((Context) fay.a(context), spotifyIcon, i, fr.b(context, (int) R.color.btn_now_playing_gray_disabled));
    }

    private static Drawable a(Context context, SpotifyIcon spotifyIcon, int i, ColorStateList colorStateList) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) fay.a(context), spotifyIcon, (float) i);
        spotifyIconDrawable.a(colorStateList);
        return spotifyIconDrawable;
    }

    public static Drawable a(Context context, SpotifyIconV2 spotifyIconV2) {
        float dimensionPixelSize = (float) ((Context) fay.a(context)).getResources().getDimensionPixelSize(R.dimen.player_side_action_button_drawable_size);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, spotifyIconV2, dimensionPixelSize);
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context, spotifyIconV2, dimensionPixelSize);
        spotifyIconDrawable3.a(fr.c(context, R.color.cat_white_70));
        spotifyIconDrawable.a(fr.c(context, R.color.cat_white));
        spotifyIconDrawable2.a(fr.c(context, R.color.cat_white_40));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, spotifyIconDrawable2);
        stateListDrawable.addState(new int[]{16842919}, spotifyIconDrawable3);
        stateListDrawable.addState(new int[0], spotifyIconDrawable);
        return stateListDrawable;
    }

    public static Drawable a(Context context, Drawable drawable) {
        Drawable drawable2 = (Drawable) fay.a(fr.a((Context) fay.a(context), (int) R.drawable.selected_icon_indicator_dot));
        int intrinsicWidth = (drawable.getIntrinsicWidth() - drawable2.getIntrinsicWidth()) / 2;
        int intrinsicHeight = drawable.getIntrinsicHeight() + uts.b(6.0f, context.getResources());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerInset(1, intrinsicWidth, intrinsicHeight, intrinsicWidth, 0);
        return layerDrawable;
    }

    private static uva a(Context context, int i, int i2, SpotifyIcon spotifyIcon, float f) {
        return a(context, i, i2, spotifyIcon, R.color.btn_now_playing_white, f);
    }

    public static uva a(Context context, int i, int i2, SpotifyIcon spotifyIcon, int i3, float f) {
        return a((Context) fay.a(context), i, i2, spotifyIcon, i3, i3, f);
    }

    private static uva a(Context context, int i, int i2, SpotifyIcon spotifyIcon, int i3, int i4, float f) {
        ColorStateList b = fr.b((Context) fay.a(context), i3);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIcon, (float) uts.b((float) i, context.getResources()));
        spotifyIconDrawable.a(b);
        return a(context, i2, fr.b(context, i4), (Drawable) spotifyIconDrawable, f);
    }

    private static uva a(Context context, int i, ColorStateList colorStateList, Drawable drawable, float f) {
        uva uva = new uva(drawable, f);
        uva.a((float) uts.b((float) i, ((Context) fay.a(context)).getResources()));
        uva.b(colorStateList);
        uva.a(fr.c(context, R.color.pasteTransparent));
        return uva;
    }
}
