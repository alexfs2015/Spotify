package defpackage;

import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.Single;

/* renamed from: kqh reason: default package */
public interface kqh {
    @wti(a = "artist/v3/{artistId}/android/entity?format=json&release_window=true")
    Single<ArtistModel> a(@wtv(a = "artistId") String str);
}
