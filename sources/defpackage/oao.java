package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;

/* renamed from: oao reason: default package */
public final class oao implements wig<oan> {
    private final wzi<oyt> a;
    private final wzi<oou<oog>> b;
    private final wzi<oou<ItemListConfiguration>> c;
    private final wzi<LicenseLayoutProvider> d;

    private oao(wzi<oyt> wzi, wzi<oou<oog>> wzi2, wzi<oou<ItemListConfiguration>> wzi3, wzi<LicenseLayoutProvider> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static oao a(wzi<oyt> wzi, wzi<oou<oog>> wzi2, wzi<oou<ItemListConfiguration>> wzi3, wzi<LicenseLayoutProvider> wzi4) {
        return new oao(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new oan((oyt) this.a.get(), (oou) this.b.get(), (oou) this.c.get(), (LicenseLayoutProvider) this.d.get());
    }
}
