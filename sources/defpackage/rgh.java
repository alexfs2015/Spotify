package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader;
import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader.AlbumRecsResponse;

/* renamed from: rgh reason: default package */
public final class rgh implements wig<AlbumRecsLoader> {
    private final wzi<gmm<AlbumRecsResponse>> a;

    private rgh(wzi<gmm<AlbumRecsResponse>> wzi) {
        this.a = wzi;
    }

    public static rgh a(wzi<gmm<AlbumRecsResponse>> wzi) {
        return new rgh(wzi);
    }

    public final /* synthetic */ Object get() {
        return new AlbumRecsLoader((gmm) this.a.get());
    }
}
