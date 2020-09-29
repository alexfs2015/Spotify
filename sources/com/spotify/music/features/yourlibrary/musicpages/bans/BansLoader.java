package com.spotify.music.features.yourlibrary.musicpages.bans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.collection.json.ArtistJacksonModel;
import com.spotify.mobile.android.spotlets.collection.json.TrackJacksonModel;
import com.spotify.mobile.android.spotlets.collection.util.UriBuilder;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;

public final class BansLoader {
    private final gmm<BansResponse> a;
    private Observable<BansResponse> b;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class BansResponse implements JacksonModel {
        @JsonCreator
        public static BansResponse create(@JsonProperty("tracks") List<TrackJacksonModel> list, @JsonProperty("artists") List<ArtistJacksonModel> list2) {
            return new AutoValue_BansLoader_BansResponse(list, list2);
        }

        public abstract List<ArtistJacksonModel> getArtists();

        public abstract List<TrackJacksonModel> getTracks();
    }

    public BansLoader(gmn gmn) {
        this.a = gmn.a(BansResponse.class);
    }

    public final Observable<BansResponse> a() {
        if (this.b == null) {
            UriBuilder uriBuilder = new UriBuilder("sp://core-collection/unstable/bans");
            uriBuilder.l = way.e().a("addTime").a(true).a();
            this.b = wit.b(this.a.resolve(new Request(Request.SUB, uriBuilder.a()))).e((Function<? super Throwable, ? extends T>) $$Lambda$BansLoader$KdNOxaXHtRcyJuGSOo1s2rtw6Hw.INSTANCE).a(1).a();
        }
        return this.b;
    }
}
