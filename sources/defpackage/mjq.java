package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: mjq reason: default package */
public final class mjq implements a {
    private final wlc<a> a;
    private final wlc<mjt> b;
    private final wlc<fpt> c;
    private final wlc<jjf> d;
    private final wlc<jrp> e;
    private final wlc<String> f;

    public mjq(wlc<a> wlc, wlc<mjt> wlc2, wlc<fpt> wlc3, wlc<jjf> wlc4, wlc<jrp> wlc5, wlc<String> wlc6) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
        this.e = (wlc) a((T) wlc5, 5);
        this.f = (wlc) a((T) wlc6, 6);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ mjv a(ooh ooh, ItemListConfiguration itemListConfiguration) {
        mjp mjp = new mjp((ooh) a((T) ooh, 1), (a) a((T) this.a.get(), 2), (mjt) a((T) this.b.get(), 3), (fpt) a((T) this.c.get(), 4), (jjf) a((T) this.d.get(), 5), (jrp) a((T) this.e.get(), 6), (String) a((T) this.f.get(), 7), (ItemListConfiguration) a((T) itemListConfiguration, 8));
        return mjp;
    }
}
