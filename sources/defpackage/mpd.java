package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.R;
import java.util.List;
import java.util.Locale;

/* renamed from: mpd reason: default package */
public final class mpd {
    public static List<mph> a(rsh rsh) {
        String str;
        ImmutableList immutableList;
        a g = ImmutableList.g();
        a a = rsh.a();
        if (!a.b().isEmpty()) {
            ImmutableList<rrx> b = a.b();
            a aVar = new a();
            for (rrx rrx : b) {
                aVar.c(new mpg(rrx.b(), rrx.d(), rrx.c()));
            }
            g.c(new a(aVar.a()));
        }
        for (rrz rrz : rsh.b().b()) {
            a g2 = ImmutableList.g();
            List h = rrz.h();
            String c = (h == null || h.isEmpty()) ? null : ((rrv) h.get(0)).c();
            String str2 = "";
            if (h == null || h.isEmpty()) {
                str = str2;
            } else {
                int size = h.size();
                StringBuilder sb = new StringBuilder(size * 16);
                for (int i = 0; i < size; i++) {
                    sb.append(((rrv) h.get(i)).b());
                    if (i != size - 1) {
                        sb.append(", ");
                    }
                }
                str = sb.toString();
            }
            String c2 = rrz.c();
            if (c2 != null) {
                str2 = c2;
            }
            a c3 = g2.c(new c(str, str2, mpe.b(rrz.e()), c));
            rrw g3 = rrz.g();
            String c4 = g3.c();
            String b2 = g3.b();
            String b3 = rrz.b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b3.substring(0, 1).toUpperCase(Locale.getDefault()));
            sb2.append(b3.substring(1));
            b bVar = new b(b2, sb2.toString(), g3.d(), R.plurals.feed_number_of_songs, c4, mpe.a(rrz.f()));
            a c5 = c3.c(bVar);
            if (rrz.g().d() <= 1) {
                immutableList = ImmutableList.d();
            } else {
                immutableList = ImmutableList.a(new d(rrz.b(), R.string.feed_view_full_entity));
            }
            g.b((Iterable<? extends E>) c5.b((Iterable<? extends E>) immutableList).a());
        }
        return g.a();
    }
}
