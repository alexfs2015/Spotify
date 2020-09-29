package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Collections;
import java.util.Map;

/* renamed from: pcl reason: default package */
public final class pcl implements a {
    private final fsf a;
    private final hbj b;
    private final pbm c;
    private final spi d;
    private final iww e;
    private final pcj f;
    private final kxm g;
    private final pcn h;
    private final kxs i;

    public pcl(fsf fsf, hbj hbj, spi spi, iww iww, pcj pcj, pbm pbm, kxm kxm, pcn pcn, kxs kxs) {
        this.a = fsf;
        this.b = hbj;
        this.d = spi;
        this.e = iww;
        this.f = pcj;
        this.c = pbm;
        this.g = kxm;
        this.h = pcn;
        this.i = kxs;
    }

    public final void a() {
        this.a.ap_();
    }

    public final void a(String str) {
        this.b.a(Collections.singletonList(str), sih.a(str).toString(), str);
        this.c.d();
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

    public final void a(String str, Map<String, String> map) {
        pcj pcj = this.f;
        pcj.b.a(pcj.a, ImmutableList.a(PlayerTrack.create(str, map)), true);
        this.c.k();
    }

    public final void e(String str) {
        this.d.a(str);
        this.c.e(str);
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.e.a(str, str3, (String) null, str2, str4, (String) null, jnu.a);
        this.c.c();
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
