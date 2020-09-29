package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;

/* renamed from: rzr reason: default package */
public final class rzr implements rzq {
    public final SpotifyIconV2 a(Entity entity) {
        switch (EntityCase.a(entity.d)) {
            case ARTIST:
                return SpotifyIconV2.ARTIST;
            case TRACK:
                return SpotifyIconV2.TRACK;
            case ALBUM:
                return SpotifyIconV2.ALBUM;
            case PLAYLIST:
                return SpotifyIconV2.PLAYLIST;
            case GENRE:
                return SpotifyIconV2.BROWSE;
            case AUDIO_SHOW:
            case AUDIO_EPISODE:
                return SpotifyIconV2.PODCASTS;
            case PROFILE:
                return SpotifyIconV2.USER;
            case ENTITY_NOT_SET:
                return SpotifyIconV2.SEARCH;
            default:
                StringBuilder sb = new StringBuilder("Could not resolve image placeholder for unknown entity: ");
                sb.append(entity);
                Assertion.b(sb.toString());
                return SpotifyIconV2.TRACK;
        }
    }
}
