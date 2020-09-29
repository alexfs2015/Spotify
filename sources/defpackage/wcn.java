package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.http.wg.TokenResponse;
import io.reactivex.Single;

/* renamed from: wcn reason: default package */
public interface wcn {
    @GET("hm://keymaster/token/authenticated")
    Single<TokenResponse> a(@Query("client_id") String str, @Query("scope") String str2, @Query("alt") String str3);
}
