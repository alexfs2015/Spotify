package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.R;
import java.util.List;
import java.util.Locale;

/* renamed from: mtm reason: default package */
public final class mtm {
    public static List<mtq> a(sbo sbo) {
        String str;
        a g = ImmutableList.g();
        a a = sbo.a();
        if (!a.b().isEmpty()) {
            ImmutableList<sbe> b = a.b();
            a aVar = new a();
            for (sbe sbe : b) {
                aVar.c(new mtp(sbe.b(), sbe.d(), sbe.c()));
            }
            g.c(new a(aVar.a()));
        }
        for (sbg sbg : sbo.b().b()) {
            a g2 = ImmutableList.g();
            List h = sbg.h();
            String c = (h == null || h.isEmpty()) ? null : ((sbc) h.get(0)).c();
            String str2 = "";
            if (h == null || h.isEmpty()) {
                str = str2;
            } else {
                int size = h.size();
                StringBuilder sb = new StringBuilder(size * 16);
                for (int i = 0; i < size; i++) {
                    sb.append(((sbc) h.get(i)).b());
                    if (i != size - 1) {
                        sb.append(", ");
                    }
                }
                str = sb.toString();
            }
            String c2 = sbg.c();
            if (c2 != null) {
                str2 = c2;
            }
            a c3 = g2.c(new c(str, str2, mtn.b(sbg.e()), c));
            sbd g3 = sbg.g();
            String c4 = g3.c();
            String b2 = g3.b();
            String b3 = sbg.b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b3.substring(0, 1).toUpperCase(Locale.getDefault()));
            sb2.append(b3.substring(1));
            b bVar = new b(b2, sb2.toString(), g3.d(), R.plurals.feed_number_of_songs, c4, mtn.a(sbg.f()));
            g.b((Iterable<? extends E>) c3.c(bVar).b((Iterable<? extends E>) sbg.g().d() <= 1 ? ImmutableList.d() : ImmutableList.a(new d(sbg.b(), R.string.feed_view_full_entity))).a());
        }
        return g.a();
    }
}
