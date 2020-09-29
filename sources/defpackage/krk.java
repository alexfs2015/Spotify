package defpackage;

import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.Single;

/* renamed from: krk reason: default package */
public interface krk {
    @wti(a = "annotations/v1/genius/enabled-tracks-and-resources")
    Single<TracksAndResources> a();

    @wti(a = "annotations/v1/genius/track/{trackId}")
    Single<TrackAnnotationSet> a(@wtv(a = "trackId") String str);
}
