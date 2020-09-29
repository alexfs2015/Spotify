package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.loader.AlbumRecsLoader.AlbumRecsResponse;

/* renamed from: qvr reason: default package */
public final class qvr implements vua<gky<AlbumRecsResponse>> {
    private final wlc<gkz> a;

    private qvr(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static qvr a(wlc<gkz> wlc) {
        return new qvr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(AlbumRecsResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
