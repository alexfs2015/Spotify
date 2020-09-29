package defpackage;

import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.Single;

/* renamed from: kqg reason: default package */
public interface kqg {
    @wti(a = "artist/v1/{artistId}/android?format=json&release_window=true")
    Single<ArtistModel> a(@wtv(a = "artistId") String str);
}
