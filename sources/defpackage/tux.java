package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: tux reason: default package */
public final class tux implements a {
    private final wzi<a> a;
    private final wzi<omc> b;
    private final wzi<a> c;
    private final wzi<tva> d;

    public tux(wzi<a> wzi, wzi<omc> wzi2, wzi<a> wzi3, wzi<tva> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ tvc a(ItemListConfiguration itemListConfiguration) {
        tuw tuw = new tuw((a) a(this.a.get(), 1), (omc) a(this.b.get(), 2), (a) a(this.c.get(), 3), (tva) a(this.d.get(), 4), (ItemListConfiguration) a(itemListConfiguration, 5));
        return tuw;
    }
}
