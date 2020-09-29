package defpackage;

import android.view.View;
import com.google.common.collect.Lists;
import com.spotify.playlist.models.Show;
import java.util.List;

/* renamed from: tws reason: default package */
public final class tws implements twr {
    private final twl a;
    private List<Show> b = Lists.a();
    private final twh c;
    private final twk d;
    private String e;

    tws(twl twl, twh twh, twk twk) {
        this.a = twl;
        this.c = twh;
        this.d = twk;
    }

    public final int a() {
        return this.b.size();
    }

    public final void a(int i) {
        Show show = (Show) this.b.get(i);
        this.a.a(show);
        this.c.a(show);
    }

    public final void a(int i, View view) {
        Show show = (Show) this.b.get(i);
        this.d.a(show, view, !fbo.a(this.e) && fbn.a(this.e, show.getUri()));
    }

    public final void a(String str) {
        this.e = str;
    }

    public final void a(List<Show> list) {
        this.b = list;
    }

    public final String b() {
        return this.e;
    }
}
