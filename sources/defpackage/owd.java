package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: owd reason: default package */
public final class owd implements a {
    private final wzi<ovy> a;
    private final wzi<oml> b;
    private final wzi<omc> c;
    private final wzi<a> d;

    public owd(wzi<ovy> wzi, wzi<oml> wzi2, wzi<omc> wzi3, wzi<a> wzi4) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ owa a(ovn ovn, ItemListConfiguration itemListConfiguration) {
        owc owc = new owc((ovy) a((T) this.a.get(), 1), (oml) a((T) this.b.get(), 2), (omc) a((T) this.c.get(), 3), (a) a((T) this.d.get(), 4), (ovn) a((T) ovn, 5), (ItemListConfiguration) a((T) itemListConfiguration, 6));
        return owc;
    }
}
