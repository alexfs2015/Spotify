package defpackage;

import android.content.Context;
import com.google.common.collect.Lists;
import com.spotify.playlist.models.Show;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: tkh reason: default package */
public final class tkh implements tkg {
    private final Context a;

    public tkh(Context context) {
        this.a = context;
    }

    public final String a(uzb uzb, boolean z, boolean z2) {
        uzc b = uzb.b();
        uys a2 = uzb.a();
        String str = "";
        if (b != null) {
            ArrayList a3 = Lists.a();
            uzd addedBy = b.getAddedBy();
            String str2 = " • ";
            if (z2 && addedBy != null) {
                String c = addedBy.c();
                if (!fax.a(c)) {
                    a3.add(c);
                    a3.add(str2);
                }
            }
            if (z) {
                uyq album = b.getAlbum();
                String a4 = a(b);
                String name = (album == null || album.getName() == null) ? str : album.getName();
                StringBuilder sb = new StringBuilder();
                sb.append(a4);
                if (fax.a(a4) || fax.a(name)) {
                    str2 = str;
                }
                sb.append(str2);
                sb.append(name);
                a3.add(sb.toString());
            } else {
                a3.add(a(b));
            }
            if (uur.a(this.a)) {
                Collections.reverse(a3);
            }
            return fau.a(str).a((Iterable<?>) a3);
        } else if (a2 == null) {
            return str;
        } else {
            Show t = a2.t();
            return t != null ? t.a() : str;
        }
    }

    private static String a(uzc uzc) {
        List artists = uzc.getArtists();
        if (artists == null) {
            return "";
        }
        return fau.a(", ").a((Iterable<?>) Lists.a(artists, $$Lambda$Dc46FolFMpzssrTXSyttCO7zS2M.INSTANCE));
    }
}
