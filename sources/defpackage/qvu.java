package defpackage;

import com.spotify.music.features.trackcredits.model.TrackCredits;
import io.reactivex.Single;

/* renamed from: qvu reason: default package */
public interface qvu {
    @xhn(a = "track-credits-view/v1/track/{trackId}/credits")
    Single<TrackCredits> a(@xia(a = "trackId") String str);
}
