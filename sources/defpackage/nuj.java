package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.squareup.picasso.Picasso;

/* renamed from: nuj reason: default package */
public final class nuj implements a {
    private final wlc<a> a;
    private final wlc<oew> b;
    private final wlc<a> c;
    private final wlc<num> d;
    private final wlc<Context> e;
    private final wlc<Picasso> f;
    private final wlc<fpt> g;

    public nuj(wlc<a> wlc, wlc<oew> wlc2, wlc<a> wlc3, wlc<num> wlc4, wlc<Context> wlc5, wlc<Picasso> wlc6, wlc<fpt> wlc7) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
        this.e = (wlc) a((T) wlc5, 5);
        this.f = (wlc) a((T) wlc6, 6);
        this.g = (wlc) a((T) wlc7, 7);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ nuo a(ItemListConfiguration itemListConfiguration, ntw ntw) {
        nui nui = new nui((a) a((T) this.a.get(), 1), (oew) a((T) this.b.get(), 2), (a) a((T) this.c.get(), 3), (num) a((T) this.d.get(), 4), (Context) a((T) this.e.get(), 5), (Picasso) a((T) this.f.get(), 6), (fpt) a((T) this.g.get(), 7), (ItemListConfiguration) a((T) itemListConfiguration, 8), (ntw) a((T) ntw, 9));
        return nui;
    }
}
