package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: ogh reason: default package */
public final class ogh implements vua<ogg> {
    private final wlc<orn> a;
    private final wlc<ohq<ohk>> b;
    private final wlc<ohq<ItemListConfiguration>> c;
    private final wlc<ohq<ohc>> d;

    private ogh(wlc<orn> wlc, wlc<ohq<ohk>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3, wlc<ohq<ohc>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ogh a(wlc<orn> wlc, wlc<ohq<ohk>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3, wlc<ohq<ohc>> wlc4) {
        return new ogh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ogg((orn) this.a.get(), (ohq) this.b.get(), (ohq) this.c.get(), (ohq) this.d.get());
    }
}
