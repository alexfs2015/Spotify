package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: oeo reason: default package */
public final class oeo implements vua<oen> {
    private final wlc<orn> a;
    private final wlc<ohq<ItemListConfiguration>> b;

    private oeo(wlc<orn> wlc, wlc<ohq<ItemListConfiguration>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oeo a(wlc<orn> wlc, wlc<ohq<ItemListConfiguration>> wlc2) {
        return new oeo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oen((orn) this.a.get(), (ohq) this.b.get());
    }
}
