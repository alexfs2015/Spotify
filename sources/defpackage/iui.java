package defpackage;

import com.spotify.mobile.android.spotlets.eventshub.locationsearch.model.LocationsHolder;
import com.spotify.mobile.android.spotlets.eventshub.model.ArtistConcertsModel;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel;
import com.spotify.mobile.android.spotlets.eventshub.model.EventsHubModel;
import io.reactivex.Single;

/* renamed from: iui reason: default package */
public interface iui {
    @xhn(a = "concerts/v2/concerts/view")
    Single<xgo<EventsHubModel>> a(@xib(a = "geonameId") Integer num);

    @xhn(a = "concerts/v1/concert/view/{concertId}")
    Single<ConcertEntityModel> a(@xia(a = "concertId") String str);

    @xhn(a = "concerts/v2/concerts/artist/{artistId}?decorate=true&locale=en")
    Single<ArtistConcertsModel> a(@xia(a = "artistId") String str, @xib(a = "geohash") Integer num, @xib(a = "filterByLoc") boolean z);

    @xhn(a = "concerts/v1/location/suggest")
    Single<xgo<LocationsHolder>> b(@xib(a = "q") String str);
}
