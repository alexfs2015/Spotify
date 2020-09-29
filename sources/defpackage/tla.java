package defpackage;

import android.view.View;
import com.google.common.collect.Lists;
import com.spotify.playlist.models.Show;
import java.util.List;

/* renamed from: tla reason: default package */
public final class tla implements tkz {
    private final tkt a;
    private List<Show> b = Lists.a();
    private final tkp c;
    private final tks d;
    private String e;

    tla(tkt tkt, tkp tkp, tks tks) {
        this.a = tkt;
        this.c = tkp;
        this.d = tks;
    }

    public final void a(List<Show> list) {
        this.b = list;
    }

    public final int a() {
        return this.b.size();
    }

    public final void a(int i, View view) {
        Show show = (Show) this.b.get(i);
        this.d.a(show, view, !fax.a(this.e) && faw.a(this.e, show.getUri()));
    }

    public final void a(String str) {
        this.e = str;
    }

    public final String b() {
        return this.e;
    }

    public final void a(int i) {
        Show show = (Show) this.b.get(i);
        this.a.a(show);
        this.c.a(show);
    }
}
