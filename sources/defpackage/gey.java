package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gey reason: default package */
public final class gey {
    private final List<gex> a;

    /* renamed from: gey$a */
    public static class a {
        public final Map<String, gex> a = new HashMap();

        public a(Context context, gei gei, gej gej, gdm gdm, gfa gfa) {
            geu geu;
            Context applicationContext = context.getApplicationContext();
            a((gex) new gfi());
            gfd gfd = new gfd();
            if (VERSION.SDK_INT < 24) {
                geu = new gff(gei, new gev(gej));
            } else {
                geu = new gfe(gei, new get(applicationContext, gej));
            }
            a((gex) new gfb(gfd, new gfc(gei, geu)));
            a((gex) new gew(gdm));
            a((gex) new gfg());
            a((gex) new ges(applicationContext, gej));
            a((gex) new gez(gfa));
        }

        private a a(gex gex) {
            this.a.put(gex.a(), gex);
            return this;
        }

        public final a a(List<gex> list) {
            HashMap hashMap = new HashMap();
            for (gex gex : list) {
                hashMap.put(gex.a(), gex);
            }
            this.a.putAll(hashMap);
            return this;
        }
    }

    public /* synthetic */ gey(List list, byte b) {
        this(list);
    }

    private gey(List<gex> list) {
        this.a = list;
    }

    public final List<gex> a() {
        return new ArrayList(this.a);
    }
}
