package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.mobile.android.recentlyplayed.model.DeleteModel;
import io.reactivex.Completable;

/* renamed from: hdh reason: default package */
public interface hdh {
    @DELETE("sp://core-recently-played/unstable/items")
    Completable a(@Body DeleteModel deleteModel);
}
