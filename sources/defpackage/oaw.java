package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.squareup.picasso.Picasso;

/* renamed from: oaw reason: default package */
public final class oaw implements a {
    private final wzi<a> a;
    private final wzi<omc> b;
    private final wzi<a> c;
    private final wzi<oaz> d;
    private final wzi<Context> e;
    private final wzi<Picasso> f;
    private final wzi<fqn> g;

    public oaw(wzi<a> wzi, wzi<omc> wzi2, wzi<a> wzi3, wzi<oaz> wzi4, wzi<Context> wzi5, wzi<Picasso> wzi6, wzi<fqn> wzi7) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
        this.e = (wzi) a((T) wzi5, 5);
        this.f = (wzi) a((T) wzi6, 6);
        this.g = (wzi) a((T) wzi7, 7);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ obb a(ItemListConfiguration itemListConfiguration, oaj oaj) {
        oav oav = new oav((a) a((T) this.a.get(), 1), (omc) a((T) this.b.get(), 2), (a) a((T) this.c.get(), 3), (oaz) a((T) this.d.get(), 4), (Context) a((T) this.e.get(), 5), (Picasso) a((T) this.f.get(), 6), (fqn) a((T) this.g.get(), 7), (ItemListConfiguration) a((T) itemListConfiguration, 8), (oaj) a((T) oaj, 9));
        return oav;
    }
}
