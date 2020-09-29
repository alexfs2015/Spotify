package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.android.glue.gradients.GlueGradients;
import com.spotify.android.glue.gradients.GlueGradients.Style;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: rim reason: default package */
public final class rim {
    private final Context a;
    private final int b;
    private final float c;
    private final Drawable[] d = new Drawable[Type.y.length];

    public rim(Context context) {
        this.a = context;
        int b2 = vfj.b(64.0f, this.a.getResources());
        this.b = vfj.b(24.0f, this.a.getResources());
        this.c = ((float) this.b) / ((float) b2);
    }

    private Drawable a(SpotifyIconV2 spotifyIconV2) {
        return new LayerDrawable(new Drawable[]{new ColorDrawable(fr.c(this.a, R.color.gray_15)), new vgu(new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b), this.c)});
    }

    private Drawable a(Type type) {
        switch (type) {
            case ALBUM:
            case GROUP_HEADER_ALBUM:
                return gaa.h(this.a);
            case ARTIST:
            case ARTIST_TWO_LINES:
            case GROUP_HEADER_ARTIST:
                return gaa.g(this.a);
            case PLAYLIST:
                return gaa.j(this.a);
            case TRACK_SHUFFLE_ONLY:
            case TRACK:
                return gaa.i(this.a);
            case FAVORITE_SONGS:
                return c(SpotifyIconV2.HEART_ACTIVE);
            case FAVORITE_SONGS_EMPTY:
                return a(SpotifyIconV2.HEART_ACTIVE);
            case CREATE_PLAYLIST_BUTTON:
                return a(SpotifyIconV2.PLUS_2PX);
            case ADD_ARTISTS_BUTTON:
                return b(SpotifyIconV2.PLUS_2PX);
            case BANNED_TRACKS:
                return a(SpotifyIconV2.BAN_ACTIVE);
            case BANNED_ARTISTS:
                return b(SpotifyIconV2.BAN_ACTIVE);
            case FOLDER:
                return a(SpotifyIconV2.PLAYLIST_FOLDER);
            default:
                return null;
        }
    }

    private Drawable b(SpotifyIconV2 spotifyIconV2) {
        vgr vgr = new vgr(new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b), this.c);
        vgr.a(fr.c(this.a, R.color.gray_15));
        return vgr;
    }

    private Drawable c(SpotifyIconV2 spotifyIconV2) {
        return new LayerDrawable(new Drawable[]{GlueGradients.a(this.a, Style.AQUATIC, false), new vgu(new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b), this.c)});
    }

    public final Drawable a(MusicItem musicItem) {
        Type c2 = musicItem.a();
        Drawable drawable = this.d[c2.ordinal()];
        if (drawable != null) {
            return drawable;
        }
        Drawable a2 = a(c2);
        this.d[c2.ordinal()] = a2;
        return a2;
    }
}