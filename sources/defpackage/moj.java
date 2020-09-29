package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: moj reason: default package */
public final class moj implements a {
    private final wzi<a> a;
    private final wzi<mom> b;
    private final wzi<fqn> c;
    private final wzi<jlr> d;
    private final wzi<jtz> e;
    private final wzi<String> f;

    public moj(wzi<a> wzi, wzi<mom> wzi2, wzi<fqn> wzi3, wzi<jlr> wzi4, wzi<jtz> wzi5, wzi<String> wzi6) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
        this.e = (wzi) a((T) wzi5, 5);
        this.f = (wzi) a((T) wzi6, 6);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ moo a(ovn ovn, ItemListConfiguration itemListConfiguration) {
        moi moi = new moi((ovn) a((T) ovn, 1), (a) a((T) this.a.get(), 2), (mom) a((T) this.b.get(), 3), (fqn) a((T) this.c.get(), 4), (jlr) a((T) this.d.get(), 5), (jtz) a((T) this.e.get(), 6), (String) a((T) this.f.get(), 7), (ItemListConfiguration) a((T) itemListConfiguration, 8));
        return moi;
    }
}
