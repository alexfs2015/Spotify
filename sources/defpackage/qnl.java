package defpackage;

import com.spotify.music.features.trackcredits.model.TrackCredits;
import io.reactivex.Single;

/* renamed from: qnl reason: default package */
public interface qnl {
    @wti(a = "track-credits-view/v0/track/{trackId}/credits")
    Single<TrackCredits> a(@wtv(a = "trackId") String str);
}
