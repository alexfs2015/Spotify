package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: mqz reason: default package */
public final class mqz implements wig<mqy> {
    private final wzi<oyt> a;
    private final wzi<oou<ook>> b;
    private final wzi<oou<ItemListConfiguration>> c;

    private mqz(wzi<oyt> wzi, wzi<oou<ook>> wzi2, wzi<oou<ItemListConfiguration>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mqz a(wzi<oyt> wzi, wzi<oou<ook>> wzi2, wzi<oou<ItemListConfiguration>> wzi3) {
        return new mqz(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mqy((oyt) this.a.get(), (oou) this.b.get(), (oou) this.c.get());
    }
}
