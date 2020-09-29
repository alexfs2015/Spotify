package defpackage;

import com.spotify.playlist.models.Show.MediaType;
import java.util.List;

/* renamed from: gvb reason: default package */
public final class gvb {
    public static String a(vlf vlf) {
        List artists = vlf.getArtists();
        if (artists != null && ((List) fbp.a(artists)).size() > 0) {
            return ((vku) ((List) fbp.a(artists)).get(0)).getUri();
        }
        return null;
    }

    public static boolean a(vkv vkv) {
        if (vkv == null) {
            return false;
        }
        return vkv.w() == MediaType.AUDIO || (vkv.w() == MediaType.VIDEO && vkv.r());
    }

    public static String b(vlf vlf) {
        if (vlf.getAlbum() == null) {
            return null;
        }
        return ((vkt) fbp.a(vlf.getAlbum())).getUri();
    }

    public static boolean c(vlf vlf) {
        if (vlf == null) {
            return false;
        }
        List artists = vlf.getArtists();
        return artists != null && ((List) fbp.a(artists)).size() > 0;
    }
}
