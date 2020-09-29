package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: maj reason: default package */
public final class maj implements vua<mai> {
    private final wlc<orn> a;
    private final wlc<ohq<ohg>> b;
    private final wlc<ohq<ItemListConfiguration>> c;

    private maj(wlc<orn> wlc, wlc<ohq<ohg>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static maj a(wlc<orn> wlc, wlc<ohq<ohg>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3) {
        return new maj(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mai((orn) this.a.get(), (ohq) this.b.get(), (ohq) this.c.get());
    }
}
