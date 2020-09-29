package defpackage;

import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.LocationsHolder;
import com.spotify.mobile.android.spotlets.eventshub.model.ArtistConcertsModel;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;
import com.spotify.mobile.android.spotlets.eventshub.model.EventsHubModel;
import io.reactivex.Single;

/* renamed from: isf reason: default package */
public interface isf {
    @wti(a = "concerts/v2/concerts/view")
    Single<wsj<EventsHubModel>> a(@wtw(a = "geonameId") Integer num);

    @wti(a = "concerts/v1/concert/view/{concertId}")
    Single<ConcertEntityModel> a(@wtv(a = "concertId") String str);

    @wti(a = "concerts/v2/concerts/artist/{artistId}?decorate=true&locale=en")
    Single<ArtistConcertsModel> a(@wtv(a = "artistId") String str, @wtw(a = "geohash") Integer num, @wtw(a = "filterByLoc") boolean z);

    @wti(a = "concerts/v1/location/suggest")
    Single<wsj<LocationsHolder>> b(@wtw(a = "q") String str);
}
