package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;

/* renamed from: njb reason: default package */
public final class njb implements vua<nja> {
    private final wlc<ndd> a;
    private final wlc<njl> b;
    private final wlc<wud<RecentlyPlayedItems>> c;
    private final wlc<vit<gzz>> d;
    private final wlc<vit<gzz>> e;
    private final wlc<wud<String>> f;
    private final wlc<niy> g;
    private final wlc<Boolean> h;

    private njb(wlc<ndd> wlc, wlc<njl> wlc2, wlc<wud<RecentlyPlayedItems>> wlc3, wlc<vit<gzz>> wlc4, wlc<vit<gzz>> wlc5, wlc<wud<String>> wlc6, wlc<niy> wlc7, wlc<Boolean> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static njb a(wlc<ndd> wlc, wlc<njl> wlc2, wlc<wud<RecentlyPlayedItems>> wlc3, wlc<vit<gzz>> wlc4, wlc<vit<gzz>> wlc5, wlc<wud<String>> wlc6, wlc<niy> wlc7, wlc<Boolean> wlc8) {
        njb njb = new njb(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return njb;
    }

    public final /* synthetic */ Object get() {
        nja nja = new nja((ndd) this.a.get(), (njl) this.b.get(), (wud) this.c.get(), (vit) this.d.get(), (vit) this.e.get(), (wud) this.f.get(), (niy) this.g.get(), ((Boolean) this.h.get()).booleanValue());
        return nja;
    }
}
