package defpackage;

import com.spotify.playlist.models.Show.MediaType;
import java.util.List;

/* renamed from: gtc reason: default package */
public final class gtc {
    public static String a(uzc uzc) {
        List artists = uzc.getArtists();
        if (artists != null && ((List) fay.a(artists)).size() > 0) {
            return ((uyr) ((List) fay.a(artists)).get(0)).getUri();
        }
        return null;
    }

    public static String b(uzc uzc) {
        if (uzc.getAlbum() == null) {
            return null;
        }
        return ((uyq) fay.a(uzc.getAlbum())).getUri();
    }

    public static boolean c(uzc uzc) {
        if (uzc == null) {
            return false;
        }
        List artists = uzc.getArtists();
        if (artists != null && ((List) fay.a(artists)).size() > 0) {
            return true;
        }
        return false;
    }

    public static boolean a(uys uys) {
        if (uys == null) {
            return false;
        }
        if (uys.w() == MediaType.AUDIO || (uys.w() == MediaType.VIDEO && uys.r())) {
            return true;
        }
        return false;
    }
}
