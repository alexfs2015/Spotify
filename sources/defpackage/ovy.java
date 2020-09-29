package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: ovy reason: default package */
public final class ovy implements vua<ovx> {
    private final wlc<orn> a;
    private final wlc<ohq<ohk>> b;
    private final wlc<ohq<ItemListConfiguration>> c;
    private final wlc<ohq<ohg>> d;
    private final wlc<ohq<ohh>> e;

    private ovy(wlc<orn> wlc, wlc<ohq<ohk>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3, wlc<ohq<ohg>> wlc4, wlc<ohq<ohh>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ovy a(wlc<orn> wlc, wlc<ohq<ohk>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3, wlc<ohq<ohg>> wlc4, wlc<ohq<ohh>> wlc5) {
        ovy ovy = new ovy(wlc, wlc2, wlc3, wlc4, wlc5);
        return ovy;
    }

    public final /* synthetic */ Object get() {
        ovx ovx = new ovx((orn) this.a.get(), (ohq) this.b.get(), (ohq) this.c.get(), (ohq) this.d.get(), (ohq) this.e.get());
        return ovx;
    }
}
