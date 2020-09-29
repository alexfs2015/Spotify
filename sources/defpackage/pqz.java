package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.mobile.android.spotlets.user.PlaylistListModel;
import com.spotify.mobile.android.spotlets.user.ProfileListModel;
import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;
import com.spotify.mobile.android.spotlets.user.TopArtistsListModel;
import io.reactivex.Single;

/* renamed from: pqz reason: default package */
public interface pqz {
    @GET("hm://user-profile-view/v2/android/profile/{username}/volatile")
    Single<ProfileV2VolatileModel> a(@Path("username") String str);

    @GET("hm://user-profile-view/v2/android/profile/{username}/followers")
    Single<ProfileListModel> b(@Path("username") String str);

    @GET("hm://user-profile-view/v2/android/profile/{username}/following")
    Single<ProfileListModel> c(@Path("username") String str);

    @GET("hm://user-profile-view/v1/android/profile/{username}/most-played-artists")
    Single<TopArtistsListModel> d(@Path("username") String str);

    @GET("hm://user-profile-view/v1/android/profile/{username}/playlists")
    Single<PlaylistListModel> e(@Path("username") String str);
}
