package defpackage;

import com.spotify.music.libs.album.model.Album;

/* renamed from: lej reason: default package */
public final class lej implements wig<gmm<Album>> {
    private final wzi<gmn> a;

    private lej(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static lej a(wzi<gmn> wzi) {
        return new lej(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(Album.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
