package defpackage;

import android.net.Uri;
import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;

/* renamed from: qlu reason: default package */
public final class qlu {
    private static final Uri e = Uri.parse("hm://nftonboarding/v2/search");
    public final gky<ArtistSearchResponse> a;
    public final jrp b;
    public final qmc c;
    public final qmc d;

    public qlu(gky<ArtistSearchResponse> gky, jrp jrp, qmc qmc, qmc qmc2) {
        this.a = gky;
        this.b = jrp;
        this.c = qmc;
        this.d = qmc2;
    }

    public static String a(String str, long j, String str2, String str3) {
        return e.buildUpon().appendQueryParameter("query", str).appendQueryParameter("timestamp", String.valueOf(j)).appendQueryParameter("search-session-id", str2).appendQueryParameter("session-id", str3).build().toString();
    }
}
