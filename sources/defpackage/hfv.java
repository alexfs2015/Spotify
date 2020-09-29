package defpackage;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.common.uri.SpotifyUri.Kind;
import com.spotify.common.uri.SpotifyUriParserException;

@JsonSerialize(using = ToStringSerializer.class)
/* renamed from: hfv reason: default package */
public final class hfv {
    private final SpotifyUri a;

    @JsonCreator
    public hfv(String str) {
        SpotifyUri spotifyUri;
        if (!TextUtils.isEmpty(str)) {
            try {
                spotifyUri = new SpotifyUri(str);
            } catch (SpotifyUriParserException unused) {
                Logger.a("Invalid/unsupported URI: %s", str);
            }
            this.a = spotifyUri;
        }
        spotifyUri = null;
        this.a = spotifyUri;
    }

    public final String a() {
        SpotifyUri spotifyUri = this.a;
        if (spotifyUri == null) {
            return null;
        }
        return spotifyUri.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hfv)) {
            return false;
        }
        hfv hfv = (hfv) obj;
        SpotifyUri spotifyUri = this.a;
        if (spotifyUri != null) {
            SpotifyUri spotifyUri2 = hfv.a;
            if (spotifyUri2 != null) {
                return spotifyUri.a(spotifyUri2);
            }
        }
        return false;
    }

    public final int hashCode() {
        SpotifyUri spotifyUri = this.a;
        boolean z = true;
        if (spotifyUri == null) {
            return 1;
        }
        Kind kind = spotifyUri.a;
        if (!(kind == Kind.PLAYLIST || kind == Kind.PLAYLIST_V2)) {
            z = false;
        }
        return !z ? this.a.hashCode() : this.a.b.hashCode();
    }

    public final String toString() {
        String a2 = a();
        return !TextUtils.isEmpty(a2) ? a2 : "<empty>";
    }
}
