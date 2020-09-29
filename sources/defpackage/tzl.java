package defpackage;

import com.spotify.music.podcast.freetierlikes.tabs.TabsEpisodeListViewBinderImpl;

/* renamed from: tzl reason: default package */
public final class tzl implements wig<TabsEpisodeListViewBinderImpl> {
    private final wzi<ugx> a;
    private final wzi<tzg> b;
    private final wzi<tza> c;
    private final wzi<txa> d;
    private final wzi<a> e;
    private final wzi<krv> f;
    private final wzi<Boolean> g;
    private final wzi<sih> h;

    private tzl(wzi<ugx> wzi, wzi<tzg> wzi2, wzi<tza> wzi3, wzi<txa> wzi4, wzi<a> wzi5, wzi<krv> wzi6, wzi<Boolean> wzi7, wzi<sih> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static tzl a(wzi<ugx> wzi, wzi<tzg> wzi2, wzi<tza> wzi3, wzi<txa> wzi4, wzi<a> wzi5, wzi<krv> wzi6, wzi<Boolean> wzi7, wzi<sih> wzi8) {
        tzl tzl = new tzl(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return tzl;
    }

    public final /* synthetic */ Object get() {
        TabsEpisodeListViewBinderImpl tabsEpisodeListViewBinderImpl = new TabsEpisodeListViewBinderImpl((ugx) this.a.get(), (tzg) this.b.get(), (tza) this.c.get(), (txa) this.d.get(), wif.b(this.e), (krv) this.f.get(), ((Boolean) this.g.get()).booleanValue(), (sih) this.h.get());
        return tabsEpisodeListViewBinderImpl;
    }
}
