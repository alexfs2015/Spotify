package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import io.reactivex.Completable;

/* renamed from: upb reason: default package */
public interface upb {
    @PUT("sp://social-listening/v1/session/set-active")
    Completable a();

    @PUT("sp://social-listening/v1/session/set-not-active")
    Completable b();
}
