package defpackage;

import com.spotify.music.R;
import com.spotify.music.follow.FollowManager.a;
import java.util.List;

/* renamed from: ndi reason: default package */
public final class ndi implements ror {
    public final xok a = new xok();
    public hcs b;
    private final nbs c;
    private final hhc d;
    private final ncu e;
    private final rom f;
    private final izh g;
    private final sej h;
    private final stl i;
    private final urm j;
    private final boolean k;

    public ndi(urm urm, nbs nbs, hhc hhc, ncu ncu, rom rom, izh izh, sej sej, stl stl, boolean z) {
        this.j = urm;
        this.c = (nbs) fbp.a(nbs);
        this.d = (hhc) fbp.a(hhc);
        this.e = (ncu) fbp.a(ncu);
        this.f = (rom) fbp.a(rom);
        this.g = (izh) fbp.a(izh);
        this.h = sej;
        this.i = stl;
        this.k = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ndz ndz, ros ros, ho hoVar) {
        this.b = (hcs) fbp.a(hoVar.a);
        if (this.b.body().isEmpty()) {
            ndz.b();
            return;
        }
        ndz.a(this.b);
        ros.a((roq) hoVar.b);
        if (this.k) {
            this.i.a(this.b);
        }
    }

    public final void a(String str) {
        this.j.a(str);
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.g.a(str, str2, (String) null, str3, str4, (String) null, jqg.a);
        this.f.a(str, null);
    }

    public final void a(String str, List<String> list) {
        this.h.a(sso.a(str), str, list);
    }

    public final void a(String str, boolean z) {
        nbu nbu = this.c.a;
        fbp.a(str);
        a a2 = nbu.a.a(str);
        if (!(a2 == null || a2.d == z)) {
            nbu.a.a(str, z);
        }
        if (z) {
            ncw ncw = this.e.a;
            ncw.a.a(ncw.b.a(R.string.freetier_artist_toastie_artist_followed, 3000));
        }
        this.f.a(!z, str, str);
    }

    public final void a(ndz ndz, ros ros) {
        fbp.a(ndz);
        if (this.b == null) {
            ndz.a();
        }
        this.a.a(this.c.a(this.b).a(wit.a(this.d.c())).a((xis<? super T>) new $$Lambda$ndi$25O6YLspg7C4llQwOEw5WqCmn7Q<Object>(this, ndz, ros), (xis<Throwable>) new $$Lambda$ndi$8YftmmkONV2TbrX6SpRmlQVcQs<Throwable>(ndz)));
    }

    public /* synthetic */ void a(boolean z) {
        CC.$default$a(this, z);
    }

    public final void b(String str) {
    }

    public final void b(String str, boolean z) {
        nbu nbu = this.c.a;
        fbp.a(str);
        a a2 = nbu.a.a(str);
        if (!(a2 == null || a2.e == z)) {
            nbu.a.b(str, z);
        }
        if (z) {
            ncu ncu = this.e;
            if (ncu.b.a(ncu.c) || uix.a(ncu.c)) {
                ncw ncw = ncu.a;
                ncw.a.a(ncw.b.a(R.string.freetier_education_toastie_artist_ban, 3000));
            }
        }
        this.f.b(!z, str, str);
    }

    public final void c(String str) {
    }
}
