package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;
import io.reactivex.Single;

/* renamed from: rne reason: default package */
public interface rne {
    @GET("hm://user-profile-view/v2/android/profile/{username}/volatile")
    Single<ProfileV2VolatileModel> a(@Path("username") String str);
}