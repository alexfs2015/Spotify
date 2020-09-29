package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: olu reason: default package */
public final class olu implements wig<olt> {
    private final wzi<oyt> a;
    private final wzi<oou<ItemListConfiguration>> b;

    private olu(wzi<oyt> wzi, wzi<oou<ItemListConfiguration>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static olu a(wzi<oyt> wzi, wzi<oou<ItemListConfiguration>> wzi2) {
        return new olu(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new olt((oyt) this.a.get(), (oou) this.b.get());
    }
}
