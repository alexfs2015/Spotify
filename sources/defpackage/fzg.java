package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: fzg reason: default package */
public final class fzg {
    private static final vrs a = new uvs(new vsf(3276801));

    private static float a(float f, float f2) {
        return Float.isNaN(f) ? f2 : f;
    }

    private static Drawable a(Context context, Drawable drawable, SpotifyIconV2 spotifyIconV2, float f, boolean z, boolean z2) {
        int b = z ? 0 : uuu.b(context, R.attr.pasteColorPlaceholderBackground);
        switch (spotifyIconV2) {
            case ARTIST:
            case USER:
                if (z2) {
                    return new uvd(drawable, a(f, 0.66f), b);
                }
                uva uva = new uva(drawable, a(f, 0.6f));
                uva.a(b);
                return uva;
            case TRACK:
            case STAR:
            case PLAYLIST:
            case PLAYLIST_FOLDER:
            case RUNNING:
                return new uvd(drawable, a(f, 0.66f), b);
            case FLAG:
            case TRENDING:
            case ALBUM:
            case RADIO:
            case BROWSE:
            case SHOWS:
            case EVENTS:
            case CHART_NEW:
            case MIX:
            case PODCASTS:
                return new uvd(drawable, a(f, 0.75f), b);
            case VIDEO:
                return new uvd(drawable, a(f, 0.33f), b);
            default:
                if (Float.isNaN(f)) {
                    return drawable;
                }
                return new uvd(drawable, f, b);
        }
    }

    private static SpotifyIconDrawable b(Context context, SpotifyIconV2 spotifyIconV2, float f) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, f);
        spotifyIconDrawable.a(uuu.b(context, R.attr.pasteColorPlaceholder));
        return spotifyIconDrawable;
    }

    private static Drawable b(Context context, SpotifyIconV2 spotifyIconV2) {
        int i;
        switch (spotifyIconV2) {
            case ARTIST:
                i = R.drawable.cat_placeholder_artist;
                break;
            case USER:
                i = R.drawable.cat_placeholder_user;
                break;
            case TRACK:
                i = R.drawable.cat_placeholder_track;
                break;
            case STAR:
                i = R.drawable.cat_placeholder_star;
                break;
            case PLAYLIST:
            case CHART_NEW:
                i = R.drawable.cat_placeholder_playlist;
                break;
            case RUNNING:
                i = R.drawable.cat_placeholder_running;
                break;
            case FLAG:
                i = R.drawable.cat_placeholder_flag;
                break;
            case ALBUM:
                i = R.drawable.cat_placeholder_album;
                break;
            case BROWSE:
                i = R.drawable.cat_placeholder_browse;
                break;
            case PODCASTS:
                i = R.drawable.cat_placeholder_podcast;
                break;
            case ADDFOLLOW:
                i = R.drawable.cat_placeholder_addfollow;
                break;
            case DISCOVER:
                i = R.drawable.cat_placeholder_discover;
                break;
            case TAG:
                i = R.drawable.cat_placeholder_genre;
                break;
            case SEARCH:
                i = R.drawable.cat_placeholder_search;
                break;
            case OFFLINE:
                i = R.drawable.cat_placeholder_offline;
                break;
            case WARNING:
                i = R.drawable.cat_placeholder_warning;
                break;
            case SHARE:
            case SHARE_ANDROID:
                i = R.drawable.cat_placeholder_share;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return null;
        }
        Bitmap a2 = a.a(String.valueOf(i));
        if (a2 != null) {
            return new BitmapDrawable(context.getResources(), a2);
        }
        Drawable a3 = fr.a(context, i);
        if (a3 instanceof BitmapDrawable) {
            a.a(String.valueOf(i), ((BitmapDrawable) a3).getBitmap());
        }
        return a3;
    }

    public static Drawable a(Context context, SpotifyIcon spotifyIcon) {
        return a(context, (Drawable) c(context, spotifyIcon), spotifyIcon.mIconV2, Float.NaN, true, false);
    }

    public static Drawable a(Context context, SpotifyIconV2 spotifyIconV2) {
        return a(context, (Drawable) b(context, spotifyIconV2, (float) uts.b(32.0f, context.getResources())), spotifyIconV2, Float.NaN, true, false);
    }

    public static Drawable a(Context context, SpotifyIcon spotifyIcon, boolean z) {
        return a(context, (Drawable) c(context, spotifyIcon), spotifyIcon.mIconV2, Float.NaN, true, true);
    }

    public static Drawable a(Context context, SpotifyIcon spotifyIcon, boolean z, boolean z2) {
        return a(context, (Drawable) c(context, spotifyIcon), spotifyIcon.mIconV2, Float.NaN, z, z2);
    }

    public static Drawable a(Context context, SpotifyIconV2 spotifyIconV2, float f, boolean z, boolean z2, float f2) {
        return a(context, (Drawable) b(context, spotifyIconV2, f2), spotifyIconV2, f, z, z2);
    }

    public static Drawable a(Context context, SpotifyIconV2 spotifyIconV2, float f) {
        return b(context, spotifyIconV2, Float.NaN, false, false, f);
    }

    public static Drawable b(Context context, SpotifyIconV2 spotifyIconV2, float f, boolean z, boolean z2, float f2) {
        Drawable drawable;
        Drawable b = b(context, spotifyIconV2);
        if (b == null) {
            Logger.d("No placeholder was pre-rendered for icon %s! Using createSpotifyIconDrawable.", spotifyIconV2);
            SpotifyIconDrawable b2 = b(context, spotifyIconV2, f2);
            b2.a(true);
            drawable = b2;
        } else {
            drawable = b;
        }
        return a(context, drawable, spotifyIconV2, f, z, z2);
    }

    public static Drawable a(Context context) {
        return b(context, SpotifyIcon.ARTIST_32);
    }

    public static Drawable b(Context context) {
        return a(context, SpotifyIcon.ALBUM_32, Float.NaN, true, false);
    }

    public static Drawable c(Context context) {
        return b(context, SpotifyIcon.PODCASTS_32);
    }

    public static Drawable d(Context context) {
        return b(context, SpotifyIcon.TRACK_32);
    }

    public static Drawable e(Context context) {
        return b(context, SpotifyIcon.PLAYLIST_32);
    }

    public static Drawable f(Context context) {
        return a(context, SpotifyIcon.USER_32, Float.NaN, false, false);
    }

    public static Drawable g(Context context) {
        return a(context, SpotifyIcon.ARTIST_32);
    }

    public static Drawable h(Context context) {
        return a(context, SpotifyIcon.ALBUM_32);
    }

    public static Drawable i(Context context) {
        return a(context, SpotifyIcon.TRACK_32);
    }

    public static Drawable j(Context context) {
        return a(context, SpotifyIcon.PLAYLIST_32);
    }

    public static Drawable k(Context context) {
        return a(context, SpotifyIcon.USER_32, false, false);
    }

    public static Drawable l(Context context) {
        return a(context, SpotifyIcon.OFFLINE_32, Float.NaN, true, true);
    }

    public static Drawable m(Context context) {
        return a(context, SpotifyIcon.VIDEO_32, false, true);
    }

    private static SpotifyIconDrawable c(Context context, SpotifyIcon spotifyIcon) {
        return b(context, spotifyIcon.mIconV2, (float) uts.b((float) spotifyIcon.mDefaultSize, context.getResources()));
    }

    public static Drawable b(Context context, SpotifyIcon spotifyIcon) {
        return a(context, spotifyIcon, Float.NaN, false, false);
    }

    private static Drawable a(Context context, SpotifyIcon spotifyIcon, float f, boolean z, boolean z2) {
        return b(context, spotifyIcon.mIconV2, f, z, z2, (float) uts.b((float) spotifyIcon.mDefaultSize, context.getResources()));
    }
}
