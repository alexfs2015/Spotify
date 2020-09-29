package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.offline.OfflineErrorResponse;
import io.reactivex.Observable;

/* renamed from: tsx reason: default package */
public interface tsx {
    @SUB("sp://offline/v1/error")
    Observable<OfflineErrorResponse> a();
}
