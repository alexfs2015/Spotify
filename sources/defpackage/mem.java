package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: mem reason: default package */
public final class mem implements wig<mel> {
    private final wzi<oyt> a;
    private final wzi<oou<ook>> b;
    private final wzi<oou<ItemListConfiguration>> c;

    private mem(wzi<oyt> wzi, wzi<oou<ook>> wzi2, wzi<oou<ItemListConfiguration>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static mem a(wzi<oyt> wzi, wzi<oou<ook>> wzi2, wzi<oou<ItemListConfiguration>> wzi3) {
        return new mem(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mel((oyt) this.a.get(), (oou) this.b.get(), (oou) this.c.get());
    }
}
