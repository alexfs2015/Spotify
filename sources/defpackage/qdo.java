package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: qdo reason: default package */
public final class qdo implements wig<qdn> {
    private final wzi<oyt> a;
    private final wzi<oou<ook>> b;
    private final wzi<oou<ItemListConfiguration>> c;

    private qdo(wzi<oyt> wzi, wzi<oou<ook>> wzi2, wzi<oou<ItemListConfiguration>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qdo a(wzi<oyt> wzi, wzi<oou<ook>> wzi2, wzi<oou<ItemListConfiguration>> wzi3) {
        return new qdo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qdn((oyt) this.a.get(), (oou) this.b.get(), (oou) this.c.get());
    }
}
