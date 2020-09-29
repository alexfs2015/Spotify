package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: pdj reason: default package */
public final class pdj implements wig<pdi> {
    private final wzi<oyt> a;
    private final wzi<oou<ooo>> b;
    private final wzi<oou<ItemListConfiguration>> c;
    private final wzi<oou<ook>> d;
    private final wzi<oou<ool>> e;

    private pdj(wzi<oyt> wzi, wzi<oou<ooo>> wzi2, wzi<oou<ItemListConfiguration>> wzi3, wzi<oou<ook>> wzi4, wzi<oou<ool>> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static pdj a(wzi<oyt> wzi, wzi<oou<ooo>> wzi2, wzi<oou<ItemListConfiguration>> wzi3, wzi<oou<ook>> wzi4, wzi<oou<ool>> wzi5) {
        pdj pdj = new pdj(wzi, wzi2, wzi3, wzi4, wzi5);
        return pdj;
    }

    public final /* synthetic */ Object get() {
        pdi pdi = new pdi((oyt) this.a.get(), (oou) this.b.get(), (oou) this.c.get(), (oou) this.d.get(), (oou) this.e.get());
        return pdi;
    }
}
