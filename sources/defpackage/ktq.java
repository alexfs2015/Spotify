package defpackage;

import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.Single;

/* renamed from: ktq reason: default package */
public interface ktq {
    @xhn(a = "artist/v3/{artistId}/android/entity?format=json&release_window=true")
    Single<ArtistModel> a(@xia(a = "artistId") String str);
}
