package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: oox reason: default package */
public final class oox implements a {
    private final wlc<oos> a;
    private final wlc<ofh> b;
    private final wlc<oew> c;
    private final wlc<a> d;

    public oox(wlc<oos> wlc, wlc<ofh> wlc2, wlc<oew> wlc3, wlc<a> wlc4) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oou a(ooh ooh, ItemListConfiguration itemListConfiguration) {
        oow oow = new oow((oos) a((T) this.a.get(), 1), (ofh) a((T) this.b.get(), 2), (oew) a((T) this.c.get(), 3), (a) a((T) this.d.get(), 4), (ooh) a((T) ooh, 5), (ItemListConfiguration) a((T) itemListConfiguration, 6));
        return oow;
    }
}
