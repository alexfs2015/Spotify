package defpackage;

import android.view.View;
import com.google.common.collect.Lists;
import com.spotify.playlist.models.Show;
import java.util.List;

/* renamed from: ksq reason: default package */
public final class ksq implements twr {
    private final twl a;
    private final List<Show> b = Lists.a();
    private final twh c;
    private final twk d;
    private final ksp e = new ksp();
    private final ksb f;
    private final kry g;
    private String h;

    ksq(twl twl, twh twh, twk twk, ksb ksb, kry kry) {
        this.a = twl;
        this.c = twh;
        this.d = twk;
        this.f = ksb;
        this.g = kry;
    }

    public final int a() {
        return this.b.size();
    }

    public final void a(int i) {
        Show show = (Show) this.b.get(i);
        if (show instanceof ksp) {
            this.g.c();
            this.f.a();
            return;
        }
        this.a.a(show);
        this.c.a(show);
    }

    public final void a(int i, View view) {
        Show show = (Show) this.b.get(i);
        this.d.a(show, view, !fbo.a(this.h) && fbn.a(this.h, show.getUri()));
    }

    public final void a(String str) {
        this.h = str;
    }

    public final void a(List<Show> list) {
        this.b.clear();
        if (!list.isEmpty()) {
            this.b.add(this.e);
            this.b.addAll(list);
        }
    }

    public final String b() {
        return this.h;
    }
}
