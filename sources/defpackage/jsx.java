package defpackage;

import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.List;

/* renamed from: jsx reason: default package */
public final class jsx {
    public static String a(uzc uzc) {
        List artists = uzc.getArtists();
        uyq album = uzc.getAlbum();
        String str = "";
        String name = (artists == null || artists.size() <= 0 || ((uyr) artists.get(0)).getName() == null) ? str : ((uyr) artists.get(0)).getName();
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

    public static String b(uzc uzc) {
        List artists = uzc.getArtists();
        if (artists == null) {
            return "";
        }
        return fau.a(", ").a((Iterable<?>) Lists.a(artists, new Function<uyr, String>() {
            public final /* synthetic */ Object apply(Object obj) {
                return ((uyr) obj).getName();
            }
        }));
    }

    public static String a(List<String> list) {
        return fau.a(", ").a((Iterable<?>) list);
    }
}
