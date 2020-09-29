package defpackage;

import android.view.View;
import com.google.common.collect.Lists;
import com.spotify.playlist.models.Show;
import java.util.List;

/* renamed from: kph reason: default package */
public final class kph implements tkz {
    private final tkt a;
    private final List<Show> b = Lists.a();
    private final tkp c;
    private final tks d;
    private final kpg e = new kpg();
    private final kos f;
    private final kop g;
    private String h;

    kph(tkt tkt, tkp tkp, tks tks, kos kos, kop kop) {
        this.a = tkt;
        this.c = tkp;
        this.d = tks;
        this.f = kos;
        this.g = kop;
    }

    public final void a(List<Show> list) {
        this.b.clear();
        if (!list.isEmpty()) {
            this.b.add(this.e);
            this.b.addAll(list);
        }
    }

    public final int a() {
        return this.b.size();
    }

    public final void a(int i, View view) {
        Show show = (Show) this.b.get(i);
        this.d.a(show, view, !fax.a(this.h) && faw.a(this.h, show.getUri()));
    }

    public final void a(String str) {
        this.h = str;
    }

    public final String b() {
        return this.h;
    }

    public final void a(int i) {
        Show show = (Show) this.b.get(i);
        if (show instanceof kpg) {
            this.g.c();
            this.f.a();
            return;
        }
        this.a.a(show);
        this.c.a(show);
    }
}
