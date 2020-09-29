package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: opz reason: default package */
public final class opz implements vua<opy> {
    private final wlc<orn> a;
    private final wlc<ohq<ohk>> b;
    private final wlc<ohq<ItemListConfiguration>> c;
    private final wlc<ohq<ohc>> d;
    private final wlc<ohq<ohh>> e;

    private opz(wlc<orn> wlc, wlc<ohq<ohk>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3, wlc<ohq<ohc>> wlc4, wlc<ohq<ohh>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static opz a(wlc<orn> wlc, wlc<ohq<ohk>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3, wlc<ohq<ohc>> wlc4, wlc<ohq<ohh>> wlc5) {
        opz opz = new opz(wlc, wlc2, wlc3, wlc4, wlc5);
        return opz;
    }

    public final /* synthetic */ Object get() {
        opy opy = new opy((orn) this.a.get(), (ohq) this.b.get(), (ohq) this.c.get(), (ohq) this.d.get(), (ohq) this.e.get());
        return opy;
    }
}
