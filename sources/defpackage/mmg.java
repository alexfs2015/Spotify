package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: mmg reason: default package */
public final class mmg implements vua<mmf> {
    private final wlc<orn> a;
    private final wlc<ohq<ohg>> b;
    private final wlc<ohq<ItemListConfiguration>> c;

    private mmg(wlc<orn> wlc, wlc<ohq<ohg>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mmg a(wlc<orn> wlc, wlc<ohq<ohg>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3) {
        return new mmg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mmf((orn) this.a.get(), (ohq) this.b.get(), (ohq) this.c.get());
    }
}
