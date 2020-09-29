package defpackage;

import android.content.Context;
import com.google.common.collect.Lists;
import com.spotify.playlist.models.Show;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: tvz reason: default package */
public final class tvz implements tvy {
    private final Context a;

    public tvz(Context context) {
        this.a = context;
    }

    private static String a(vlf vlf) {
        List artists = vlf.getArtists();
        return artists == null ? "" : fbl.a(", ").a((Iterable<?>) Lists.a(artists, $$Lambda$rlyBJOgWUgAuxnjB0TqaT8Uk0.INSTANCE));
    }

    public final String a(vle vle, boolean z, boolean z2) {
        vlf b = vle.b();
        vkv a2 = vle.a();
        String str = "";
        if (b != null) {
            ArrayList a3 = Lists.a();
            vlg addedBy = b.getAddedBy();
            String str2 = " • ";
            if (z2 && addedBy != null) {
                String c = addedBy.c();
                if (!fbo.a(c)) {
                    a3.add(c);
                    a3.add(str2);
                }
            }
            if (z) {
                vkt album = b.getAlbum();
                String a4 = a(b);
                String name = (album == null || album.getName() == null) ? str : album.getName();
                StringBuilder sb = new StringBuilder();
                sb.append(a4);
                if (fbo.a(a4) || fbo.a(name)) {
                    str2 = str;
                }
                sb.append(str2);
                sb.append(name);
                a3.add(sb.toString());
            } else {
                a3.add(a(b));
            }
            if (vgi.a(this.a)) {
                Collections.reverse(a3);
            }
            return fbl.a(str).a((Iterable<?>) a3);
        } else if (a2 == null) {
            return str;
        } else {
            Show t = a2.t();
            return t != null ? t.a() : str;
        }
    }
}
