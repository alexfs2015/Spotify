package defpackage;

import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.Single;

/* renamed from: kut reason: default package */
public interface kut {
    @xhn(a = "annotations/v1/genius/enabled-tracks-and-resources")
    Single<TracksAndResources> a();

    @xhn(a = "annotations/v1/genius/track/{trackId}")
    Single<TrackAnnotationSet> a(@xia(a = "trackId") String str);
}
