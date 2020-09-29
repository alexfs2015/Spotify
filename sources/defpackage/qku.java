package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;

/* renamed from: qku reason: default package */
public final class qku implements vua<qkt> {
    private final wlc<gky<RelatedArtistsResponse>> a;

    private qku(wlc<gky<RelatedArtistsResponse>> wlc) {
        this.a = wlc;
    }

    public static qku a(wlc<gky<RelatedArtistsResponse>> wlc) {
        return new qku(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qkt((gky) this.a.get());
    }
}
