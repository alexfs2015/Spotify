package defpackage;

import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.Single;

/* renamed from: ktp reason: default package */
public interface ktp {
    @xhn(a = "artist/v1/{artistId}/android?format=json&release_window=true")
    Single<ArtistModel> a(@xia(a = "artistId") String str);
}
