package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;

/* renamed from: tjl reason: default package */
public final class tjl implements a {
    private final wlc<a> a;
    private final wlc<oew> b;
    private final wlc<a> c;
    private final wlc<tjo> d;

    public tjl(wlc<a> wlc, wlc<oew> wlc2, wlc<a> wlc3, wlc<tjo> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ tjq a(ItemListConfiguration itemListConfiguration) {
        tjk tjk = new tjk((a) a(this.a.get(), 1), (oew) a(this.b.get(), 2), (a) a(this.c.get(), 3), (tjo) a(this.d.get(), 4), (ItemListConfiguration) a(itemListConfiguration, 5));
        return tjk;
    }
}
