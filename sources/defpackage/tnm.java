package defpackage;

import com.spotify.music.podcast.freetierlikes.tabs.TabsEpisodeListViewBinderImpl;

/* renamed from: tnm reason: default package */
public final class tnm implements vua<TabsEpisodeListViewBinderImpl> {
    private final wlc<tuu> a;
    private final wlc<tnh> b;
    private final wlc<tnb> c;
    private final wlc<tli> d;
    private final wlc<a> e;
    private final wlc<kom> f;
    private final wlc<Boolean> g;

    private tnm(wlc<tuu> wlc, wlc<tnh> wlc2, wlc<tnb> wlc3, wlc<tli> wlc4, wlc<a> wlc5, wlc<kom> wlc6, wlc<Boolean> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static tnm a(wlc<tuu> wlc, wlc<tnh> wlc2, wlc<tnb> wlc3, wlc<tli> wlc4, wlc<a> wlc5, wlc<kom> wlc6, wlc<Boolean> wlc7) {
        tnm tnm = new tnm(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return tnm;
    }

    public final /* synthetic */ Object get() {
        TabsEpisodeListViewBinderImpl tabsEpisodeListViewBinderImpl = new TabsEpisodeListViewBinderImpl((tuu) this.a.get(), (tnh) this.b.get(), (tnb) this.c.get(), (tli) this.d.get(), vtz.b(this.e), (kom) this.f.get(), ((Boolean) this.g.get()).booleanValue());
        return tabsEpisodeListViewBinderImpl;
    }
}
