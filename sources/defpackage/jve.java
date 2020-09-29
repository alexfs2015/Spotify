package defpackage;

import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.List;

/* renamed from: jve reason: default package */
public final class jve {
    public static String a(List<String> list) {
        return fbl.a(", ").a((Iterable<?>) list);
    }

    public static String a(vlf vlf) {
        List artists = vlf.getArtists();
        vkt album = vlf.getAlbum();
        String str = "";
        String name = (artists == null || artists.size() <= 0 || ((vku) artists.get(0)).getName() == null) ? str : ((vku) artists.get(0)).getName();
        String name2 = (album == null || album.getName() == null) ? str : album.getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(name2)) {
            str = " • ";
        }
        sb.append(str);
        sb.append(name2);
        return sb.toString();
    }

    public static String b(vlf vlf) {
        List artists = vlf.getArtists();
        return artists == null ? "" : fbl.a(", ").a((Iterable<?>) Lists.a(artists, new Function<vku, String>() {
            public final /* synthetic */ Object apply(Object obj) {
                return ((vku) obj).getName();
            }
        }));
    }
}
