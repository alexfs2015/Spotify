package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: pus reason: default package */
public final class pus implements vua<pur> {
    private final wlc<orn> a;
    private final wlc<ohq<ohg>> b;
    private final wlc<ohq<ItemListConfiguration>> c;

    private pus(wlc<orn> wlc, wlc<ohq<ohg>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pus a(wlc<orn> wlc, wlc<ohq<ohg>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3) {
        return new pus(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new pur((orn) this.a.get(), (ohq) this.b.get(), (ohq) this.c.get());
    }
}
