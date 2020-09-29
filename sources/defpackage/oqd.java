package defpackage;

import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: oqd reason: default package */
final class oqd implements a {
    private final wzi<vje> a;
    private final wzi<String> b;
    private final wzi<jwo> c;
    private final wzi<hfp> d;
    private final wzi<hdz> e;
    private final wzi<omp> f;

    oqd(wzi<vje> wzi, wzi<String> wzi2, wzi<jwo> wzi3, wzi<hfp> wzi4, wzi<hdz> wzi5, wzi<omp> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oqa a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
        oqc oqc = new oqc((vje) a(this.a.get(), 1), (String) a(this.b.get(), 2), (jwo) a(this.c.get(), 3), (hfp) a(this.d.get(), 4), (hdz) a(this.e.get(), 5), (omp) a(this.f.get(), 6), (PlaylistDataSourceConfiguration) a(playlistDataSourceConfiguration, 7));
        return oqc;
    }
}
