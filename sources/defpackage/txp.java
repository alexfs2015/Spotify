package defpackage;

import android.content.Context;
import com.spotify.music.podcastentityrow.PlaySourceProvider;

/* renamed from: txp reason: default package */
public final class txp implements wig<txo> {
    private final wzi<Context> a;
    private final wzi<jor<ufx>> b;
    private final wzi<uia> c;
    private final wzi<txq> d;
    private final wzi<ufg> e;
    private final wzi<uil> f;
    private final wzi<PlaySourceProvider> g;
    private final wzi<sso> h;

    private txp(wzi<Context> wzi, wzi<jor<ufx>> wzi2, wzi<uia> wzi3, wzi<txq> wzi4, wzi<ufg> wzi5, wzi<uil> wzi6, wzi<PlaySourceProvider> wzi7, wzi<sso> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static txp a(wzi<Context> wzi, wzi<jor<ufx>> wzi2, wzi<uia> wzi3, wzi<txq> wzi4, wzi<ufg> wzi5, wzi<uil> wzi6, wzi<PlaySourceProvider> wzi7, wzi<sso> wzi8) {
        txp txp = new txp(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return txp;
    }

    public final /* synthetic */ Object get() {
        txo txo = new txo((Context) this.a.get(), (jor) this.b.get(), (uia) this.c.get(), (txq) this.d.get(), (ufg) this.e.get(), (uil) this.f.get(), (PlaySourceProvider) this.g.get(), (sso) this.h.get());
        return txo;
    }
}
