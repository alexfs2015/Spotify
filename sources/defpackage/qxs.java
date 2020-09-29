package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader;
import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader.AlbumRecsResponse;

/* renamed from: qxs reason: default package */
public final class qxs implements vua<AlbumRecsLoader> {
    private final wlc<gky<AlbumRecsResponse>> a;

    private qxs(wlc<gky<AlbumRecsResponse>> wlc) {
        this.a = wlc;
    }

    public static qxs a(wlc<gky<AlbumRecsResponse>> wlc) {
        return new qxs(wlc);
    }

    public final /* synthetic */ Object get() {
        return new AlbumRecsLoader((gky) this.a.get());
    }
}
