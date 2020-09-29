package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: paz reason: default package */
public final class paz implements wig<pay> {
    private final wzi<LicenseLayoutProvider> a;
    private final wzi<hfx> b;
    private final wzi<oyt> c;
    private final wzi<oou<ItemListConfiguration>> d;
    private final wzi<heg> e;

    private paz(wzi<LicenseLayoutProvider> wzi, wzi<hfx> wzi2, wzi<oyt> wzi3, wzi<oou<ItemListConfiguration>> wzi4, wzi<heg> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static paz a(wzi<LicenseLayoutProvider> wzi, wzi<hfx> wzi2, wzi<oyt> wzi3, wzi<oou<ItemListConfiguration>> wzi4, wzi<heg> wzi5) {
        paz paz = new paz(wzi, wzi2, wzi3, wzi4, wzi5);
        return paz;
    }

    public final /* synthetic */ Object get() {
        pay pay = new pay((LicenseLayoutProvider) this.a.get(), (hfx) this.b.get(), (oyt) this.c.get(), (oou) this.d.get(), (heg) this.e.get());
        return pay;
    }
}
