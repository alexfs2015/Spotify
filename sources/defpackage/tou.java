package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;
import com.spotify.music.nowplaying.drivingmode.view.playpause.TransparentPlayPauseDrawable;
import com.spotify.music.nowplaying.drivingmode.view.playpause.TransparentPlayPauseDrawable.InnerShape;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: tou reason: default package */
public final class tou {
    public static int a(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static Drawable a(Context context) {
        int a = a(context, (int) R.dimen.driving_default_scalable_icon_size);
        TransparentPlayPauseDrawable transparentPlayPauseDrawable = new TransparentPlayPauseDrawable(context, R.color.cat_white, InnerShape.PAUSE, a);
        TransparentPlayPauseDrawable transparentPlayPauseDrawable2 = new TransparentPlayPauseDrawable(context, R.color.cat_white_70, InnerShape.PAUSE, a);
        TransparentPlayPauseDrawable transparentPlayPauseDrawable3 = new TransparentPlayPauseDrawable(context, R.color.cat_white, InnerShape.PLAY, a);
        TransparentPlayPauseDrawable transparentPlayPauseDrawable4 = new TransparentPlayPauseDrawable(context, R.color.cat_white_70, InnerShape.PLAY, a);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518, 16842919, 16842910}, transparentPlayPauseDrawable2);
        stateListDrawable.addState(new int[]{16843518, 16842910}, transparentPlayPauseDrawable);
        stateListDrawable.addState(new int[]{16842919, 16842910}, transparentPlayPauseDrawable4);
        stateListDrawable.addState(new int[]{16842910}, transparentPlayPauseDrawable3);
        stateListDrawable.addState(new int[]{16843518}, transparentPlayPauseDrawable);
        stateListDrawable.addState(new int[0], transparentPlayPauseDrawable3);
        return a(context, stateListDrawable, R.dimen.driving_play_pause_icon_padding_percent);
    }

    public static Drawable a(Context context, Drawable drawable, int i) {
        return a() ? drawable : new vgu(drawable, b(context, i));
    }

    private static Drawable a(Context context, boolean z) {
        return a(context, a(context, (int) R.dimen.driving_circled_voice_icon_size), b(context, R.dimen.driving_voice_icon_scale), z);
    }

    public static SpotifyIconDrawable a(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) i);
        spotifyIconDrawable.a(fr.c(context, i2));
        return spotifyIconDrawable;
    }

    public static SpotifyIconDrawable a(Context context, SpotifyIconV2 spotifyIconV2, int i, ColorStateList colorStateList) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) i);
        spotifyIconDrawable.a(colorStateList);
        return spotifyIconDrawable;
    }

    private static vgr a(Context context, int i, float f, boolean z) {
        vgr vgr = new vgr(new SpotifyIconDrawable(context, SpotifyIconV2.MIC, (float) i), f);
        vgr.a((float) vfj.b(2.0f, context.getResources()));
        if (z) {
            vgr.b(context.getResources().getColor(R.color.green));
            vgr.a(fr.c(context, R.color.white));
            vgr.c(context.getResources().getColor(R.color.green));
        } else {
            vgr.c(context.getResources().getColor(R.color.white));
            vgr.a(fr.c(context, R.color.pasteTransparent));
        }
        return vgr;
    }

    private static boolean a() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public static boolean a(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return PlayerTrackUtil.isAd(playerTrack) || PlayerTrackUtil.isInterruptionFromAds(playerTrack) || InterruptionUtil.isInterruptionUri(playerTrack.uri());
    }

    public static float b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    public static Drawable b(Context context) {
        return a(context, a(context, SpotifyIconV2.SKIP_FORWARD, a(context, (int) R.dimen.driving_default_scalable_icon_size), i(context)), R.dimen.driving_primary_button_icons_padding_percent);
    }

    public static Drawable c(Context context) {
        return a(context, a(context, SpotifyIconV2.SKIP_BACK, a(context, (int) R.dimen.driving_default_scalable_icon_size), i(context)), R.dimen.driving_primary_button_icons_padding_percent);
    }

    public static Drawable d(Context context) {
        return a(context, SpotifyIconV2.QUEUE, a(context, (int) R.dimen.driving_up_next_icon), (int) R.color.green_light);
    }

    public static Drawable e(Context context) {
        return a(context, SpotifyIconV2.BLUETOOTH, a(context, (int) R.dimen.std_14dp), (int) R.color.white);
    }

    public static Drawable f(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842913, -16842910}, a(context, false));
        stateListDrawable.addState(new int[]{16843518, 16842910}, a(context, true));
        int[] iArr = {16842919};
        vgr vgr = new vgr(new SpotifyIconDrawable(context, SpotifyIconV2.MIC, (float) a(context, (int) R.dimen.driving_circled_voice_icon_size)), b(context, R.dimen.driving_voice_icon_scale));
        vgr.a((float) vfj.b(2.0f, context.getResources()));
        vgr.b(context.getResources().getColor(R.color.black));
        vgr.a(fr.c(context, R.color.white));
        vgr.c(context.getResources().getColor(R.color.black));
        stateListDrawable.addState(iArr, vgr);
        return a(context, a(context, SpotifyIconV2.MIC, a(context, (int) R.dimen.driving_default_scalable_icon_size), (int) R.color.black), R.dimen.driving_secondary_button_icons_padding_percent);
    }

    public static Drawable g(Context context) {
        return a(context, a(context, SpotifyIconV2.X, a(context, (int) R.dimen.driving_default_scalable_icon_size), (int) R.color.white), R.dimen.driving_secondary_button_icons_padding_percent);
    }

    public static Drawable h(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(fr.c(context, R.color.white_10)));
        return stateListDrawable;
    }

    public static ColorStateList i(Context context) {
        return new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}, new int[]{16842919}}, new int[]{fr.c(context, R.color.glue_button_primary_white_background_default), fr.c(context, R.color.glue_button_primary_white_background_disabled), fr.c(context, R.color.glue_button_primary_white_background_pressed)});
    }
}
