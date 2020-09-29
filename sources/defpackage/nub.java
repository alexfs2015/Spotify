package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: nub reason: default package */
public final class nub implements vua<nua> {
    private final wlc<orn> a;
    private final wlc<ohq<ohc>> b;
    private final wlc<ohq<ItemListConfiguration>> c;
    private final wlc<LicenseLayoutProvider> d;

    private nub(wlc<orn> wlc, wlc<ohq<ohc>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3, wlc<LicenseLayoutProvider> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static nub a(wlc<orn> wlc, wlc<ohq<ohc>> wlc2, wlc<ohq<ItemListConfiguration>> wlc3, wlc<LicenseLayoutProvider> wlc4) {
        return new nub(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new nua((orn) this.a.get(), (ohq) this.b.get(), (ohq) this.c.get(), (LicenseLayoutProvider) this.d.get());
    }
}
