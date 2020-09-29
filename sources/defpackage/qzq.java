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

/* renamed from: qzq reason: default package */
public final class qzq {
    private final Context a;
    private final int b;
    private final float c;
    private final Drawable[] d = new Drawable[Type.y.length];

    public qzq(Context context) {
        this.a = context;
        int b2 = uts.b(64.0f, this.a.getResources());
        this.b = uts.b(24.0f, this.a.getResources());
        this.c = ((float) this.b) / ((float) b2);
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

    private Drawable a(Type type) {
        switch (type) {
            case ALBUM:
            case GROUP_HEADER_ALBUM:
                return fzg.h(this.a);
            case ARTIST:
            case ARTIST_TWO_LINES:
            case GROUP_HEADER_ARTIST:
                return fzg.g(this.a);
            case PLAYLIST:
                return fzg.j(this.a);
            case TRACK_SHUFFLE_ONLY:
            case TRACK:
                return fzg.i(this.a);
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

    private Drawable a(SpotifyIconV2 spotifyIconV2) {
        return new LayerDrawable(new Drawable[]{new ColorDrawable(fr.c(this.a, R.color.gray_15)), new uvd(new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b), this.c)});
    }

    private Drawable b(SpotifyIconV2 spotifyIconV2) {
        uva uva = new uva(new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b), this.c);
        uva.a(fr.c(this.a, R.color.gray_15));
        return uva;
    }

    private Drawable c(SpotifyIconV2 spotifyIconV2) {
        return new LayerDrawable(new Drawable[]{GlueGradients.a(this.a, Style.AQUATIC, false), new uvd(new SpotifyIconDrawable(this.a, spotifyIconV2, (float) this.b), this.c)});
    }
}
