package defpackage;

import com.spotify.music.libs.album.model.Album;

/* renamed from: law reason: default package */
public final class law implements vua<gky<Album>> {
    private final wlc<gkz> a;

    private law(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static law a(wlc<gkz> wlc) {
        return new law(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(Album.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
