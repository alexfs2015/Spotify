package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: mjl reason: default package */
public final class mjl implements vua<mjk> {
    private final wlc<ohq<ohk>> a;
    private final wlc<ohq<ItemListConfiguration>> b;

    private mjl(wlc<ohq<ohk>> wlc, wlc<ohq<ItemListConfiguration>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mjl a(wlc<ohq<ohk>> wlc, wlc<ohq<ItemListConfiguration>> wlc2) {
        return new mjl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mjk((ohq) this.a.get(), (ohq) this.b.get());
    }
}
