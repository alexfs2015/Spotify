package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: oto reason: default package */
public final class oto implements vua<otn> {
    private final wlc<LicenseLayoutProvider> a;
    private final wlc<hdb> b;
    private final wlc<orn> c;
    private final wlc<ohq<ItemListConfiguration>> d;

    private oto(wlc<LicenseLayoutProvider> wlc, wlc<hdb> wlc2, wlc<orn> wlc3, wlc<ohq<ItemListConfiguration>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static oto a(wlc<LicenseLayoutProvider> wlc, wlc<hdb> wlc2, wlc<orn> wlc3, wlc<ohq<ItemListConfiguration>> wlc4) {
        return new oto(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new otn((LicenseLayoutProvider) this.a.get(), (hdb) this.b.get(), (orn) this.c.get(), (ohq) this.d.get());
    }
}
