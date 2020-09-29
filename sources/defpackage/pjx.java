package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Collections;
import java.util.Map;

/* renamed from: pjx reason: default package */
public final class pjx implements a {
    private final fsz a;
    private final hec b;
    private final piv c;
    private final szp d;
    private final izh e;
    private final pjv f;
    private final lav g;
    private final pjz h;
    private final lbb i;

    public pjx(fsz fsz, hec hec, szp szp, izh izh, pjv pjv, piv piv, lav lav, pjz pjz, lbb lbb) {
        this.a = fsz;
        this.b = hec;
        this.d = szp;
        this.e = izh;
        this.f = pjv;
        this.c = piv;
        this.g = lav;
        this.h = pjz;
        this.i = lbb;
    }

    public final void a() {
        this.a.ao_();
    }

    public final void a(String str) {
        this.b.a(Collections.singletonList(str), sso.a(str).toString(), str);
        this.c.d();
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.e.a(str, str3, (String) null, str2, str4, (String) null, jqg.a);
        this.c.c();
    }

    public final void a(String str, Map<String, String> map) {
        pjv pjv = this.f;
        pjv.b.a(pjv.a, ImmutableList.a(PlayerTrack.create(str, map)), true);
        this.c.k();
    }

    public final void b(String str) {
        this.g.a(str);
        this.c.a(true);
    }

    public final void c(String str) {
        this.h.a(str);
    }

    public final void d(String str) {
        this.g.b(str);
        this.c.a(false);
    }

    public final void e(String str) {
        this.d.a(str);
        this.c.e(str);
    }

    public final void f(String str) {
        this.i.a(str);
        this.c.i();
    }

    public final void g(String str) {
        this.i.b(str);
        this.c.j();
    }
}
