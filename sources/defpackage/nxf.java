package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.localfilesimport.model.LocalAlbums;
import com.spotify.music.features.localfilesimport.model.LocalArtists;
import com.spotify.music.features.localfilesimport.model.LocalSources;
import com.spotify.music.features.localfilesimport.model.LocalSourcesResponse;
import com.spotify.music.features.localfilesimport.model.LocalTracks;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: nxf reason: default package */
public interface nxf {
    @SUB("sp://local-files/v1/albums")
    Observable<LocalAlbums> a(@QueryMap Map<String, String> map);

    @PUT("sp://local-files/v2/sources")
    Single<LocalSourcesResponse> a(@Body nxm nxm);

    @SUB("sp://local-files/v1/artists")
    Observable<LocalArtists> b(@QueryMap Map<String, String> map);

    @SUB("sp://local-files/v2/tracks")
    Observable<LocalTracks> c(@QueryMap Map<String, String> map);

    @SUB("sp://local-files/v1/folders")
    Observable<LocalSources> d(@QueryMap Map<String, String> map);
}
