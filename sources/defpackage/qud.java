package defpackage;

import android.net.Uri;
import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;

/* renamed from: qud reason: default package */
public final class qud {
    private static final Uri e = Uri.parse("hm://nftonboarding/v2/search");
    public final gmm<ArtistSearchResponse> a;
    public final jtz b;
    public final quk c;
    public final quk d;

    public qud(gmm<ArtistSearchResponse> gmm, jtz jtz, quk quk, quk quk2) {
        this.a = gmm;
        this.b = jtz;
        this.c = quk;
        this.d = quk2;
    }

    public static String a(String str, long j, String str2, String str3) {
        return e.buildUpon().appendQueryParameter("query", str).appendQueryParameter("timestamp", String.valueOf(j)).appendQueryParameter("search-session-id", str2).appendQueryParameter("session-id", str3).build().toString();
    }
}
