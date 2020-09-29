package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.mobile.android.spotlets.user.PlaylistListModel;
import io.reactivex.Single;

/* renamed from: rnb reason: default package */
public interface rnb {
    @GET("hm://user-profile-view/v1/android/profile/{username}/playlists")
    Single<PlaylistListModel> a(@Path("username") String str);
}
