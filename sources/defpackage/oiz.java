package defpackage;

import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: oiz reason: default package */
final class oiz implements a {
    private final wlc<uxc> a;
    private final wlc<String> b;
    private final wlc<jug> c;
    private final wlc<hct> d;
    private final wlc<hbg> e;
    private final wlc<ofl> f;

    oiz(wlc<uxc> wlc, wlc<String> wlc2, wlc<jug> wlc3, wlc<hct> wlc4, wlc<hbg> wlc5, wlc<ofl> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oiw a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
        oiy oiy = new oiy((uxc) a(this.a.get(), 1), (String) a(this.b.get(), 2), (jug) a(this.c.get(), 3), (hct) a(this.d.get(), 4), (hbg) a(this.e.get(), 5), (ofl) a(this.f.get(), 6), (PlaylistDataSourceConfiguration) a(playlistDataSourceConfiguration, 7));
        return oiy;
    }
}
