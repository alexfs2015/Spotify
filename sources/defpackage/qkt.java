package defpackage;

import android.net.Uri;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;

/* renamed from: qkt reason: default package */
public final class qkt {
    private static final Uri b = Uri.parse("hm://nftonboarding/");
    public final gky<RelatedArtistsResponse> a;

    public qkt(gky<RelatedArtistsResponse> gky) {
        this.a = gky;
    }

    public static Request a(String str) {
        return RequestBuilder.get(b.buildUpon().encodedPath(str).build().toString()).build();
    }
}
