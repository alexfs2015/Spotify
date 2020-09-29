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
/* renamed from: hcz reason: default package */
public final class hcz {
    private final SpotifyUri a;

    @JsonCreator
    public hcz(String str) {
        SpotifyUri spotifyUri;
        if (!TextUtils.isEmpty(str)) {
            try {
                spotifyUri = new SpotifyUri(str);
            } catch (SpotifyUriParserException unused) {
                StringBuilder sb = new StringBuilder("Invalid/unsupported URI ");
                sb.append(str);
                Logger.a(str, sb.toString());
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
        if (!(obj instanceof hcz)) {
            return false;
        }
        hcz hcz = (hcz) obj;
        SpotifyUri spotifyUri = this.a;
        if (spotifyUri != null) {
            SpotifyUri spotifyUri2 = hcz.a;
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
        if (!z) {
            return this.a.hashCode();
        }
        return this.a.b.hashCode();
    }

    public final String toString() {
        String a2 = a();
        return !TextUtils.isEmpty(a2) ? a2 : "<empty>";
    }
}
