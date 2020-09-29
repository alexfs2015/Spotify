package defpackage;

import android.content.Context;
import com.spotify.music.podcastentityrow.PlaySourceProvider;

/* renamed from: uik reason: default package */
public final class uik implements wig<uij> {
    private final wzi<Context> a;
    private final wzi<ugf> b;
    private final wzi<Boolean> c;
    private final wzi<uia> d;
    private final wzi<uif> e;
    private final wzi<ugi> f;
    private final wzi<uil> g;
    private final wzi<jor<ufx>> h;
    private final wzi<uez> i;
    private final wzi<ufg> j;
    private final wzi<uey> k;
    private final wzi<uex> l;
    private final wzi<PlaySourceProvider> m;
    private final wzi<sso> n;

    private uik(wzi<Context> wzi, wzi<ugf> wzi2, wzi<Boolean> wzi3, wzi<uia> wzi4, wzi<uif> wzi5, wzi<ugi> wzi6, wzi<uil> wzi7, wzi<jor<ufx>> wzi8, wzi<uez> wzi9, wzi<ufg> wzi10, wzi<uey> wzi11, wzi<uex> wzi12, wzi<PlaySourceProvider> wzi13, wzi<sso> wzi14) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
        this.l = wzi12;
        this.m = wzi13;
        this.n = wzi14;
    }

    public static uik a(wzi<Context> wzi, wzi<ugf> wzi2, wzi<Boolean> wzi3, wzi<uia> wzi4, wzi<uif> wzi5, wzi<ugi> wzi6, wzi<uil> wzi7, wzi<jor<ufx>> wzi8, wzi<uez> wzi9, wzi<ufg> wzi10, wzi<uey> wzi11, wzi<uex> wzi12, wzi<PlaySourceProvider> wzi13, wzi<sso> wzi14) {
        uik uik = new uik(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12, wzi13, wzi14);
        return uik;
    }

    public final /* synthetic */ Object get() {
        uij uij = new uij((Context) this.a.get(), wif.b(this.b), ((Boolean) this.c.get()).booleanValue(), (uia) this.d.get(), (uif) this.e.get(), (ugi) this.f.get(), (uil) this.g.get(), (jor) this.h.get(), (uez) this.i.get(), (ufg) this.j.get(), (uey) this.k.get(), (uex) this.l.get(), (PlaySourceProvider) this.m.get(), (sso) this.n.get());
        return uij;
    }
}
