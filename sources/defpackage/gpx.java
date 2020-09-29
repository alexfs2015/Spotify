package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.metadata.proto.Metadata.Album;
import com.spotify.metadata.proto.Metadata.Artist;
import com.spotify.metadata.proto.Metadata.Track;
import io.reactivex.Single;

/* renamed from: gpx reason: default package */
public interface gpx {
    @GET("sp://metadata/v1/uri/{uri}")
    Single<Album> a(@Path("uri") String str);

    @GET("sp://metadata/v1/uri/{uri}")
    Single<Artist> b(@Path("uri") String str);

    @GET("sp://metadata/v1/uri/{uri}")
    Single<Track> c(@Path("uri") String str);
}
