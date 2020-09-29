package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;

/* renamed from: qiw reason: default package */
public final class qiw implements vua<gky<RelatedArtistsResponse>> {
    private final wlc<gkz> a;

    private qiw(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static qiw a(wlc<gkz> wlc) {
        return new qiw(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(RelatedArtistsResponse.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
