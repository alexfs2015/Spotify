package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ConcertEntityModel implements Parcelable, JacksonModel {
    public static final String FEW_TICKETS_LEFT = "FEW_TICKETS_LEFT";
    public static final String TICKETS_NOT_AVAILABLE = "TICKETS_NOT_AVAILABLE";

    static final class a extends upv<Album> {
        protected a() {
            super(ConcertEntityModel.getAlbumCreator());
        }
    }

    static final class b extends upv<Artist> {
        protected b() {
            super(ConcertEntityModel.getArtistCreator());
        }
    }

    static final class c extends upy<ConcertResult> {
        protected c() {
            super(ConcertEntityModel.getConcertResultCreator());
        }
    }

    static final class d extends upv<ConcertResult> {
        protected d() {
            super(ConcertEntityModel.getConcertResultCreator());
        }
    }

    @JsonProperty("albums")
    public abstract List<Album> getAlbumsForConcert();

    @JsonProperty("artists")
    public abstract List<Artist> getArtists();

    @JsonProperty("color")
    public abstract String getColor();

    @JsonProperty("concert")
    public abstract ConcertResult getConcertResult();

    @JsonProperty("ticketAvailability")
    public abstract String getTicketAvailability();

    @JsonProperty("upcomingConcerts")
    public abstract List<ConcertResult> getUpcomingConcerts();

    @JsonProperty("upcomingConcertsSource")
    public abstract String getUpcomingConcertsSource();

    @JsonProperty("userLocation")
    public abstract String getUserLocation();

    @JsonCreator
    public static ConcertEntityModel create(@JsonProperty("concert") ConcertResult concertResult, @JsonProperty("artists") List<Artist> list, @JsonProperty("upcomingConcerts") List<ConcertResult> list2, @JsonProperty("albums") List<Album> list3, @JsonProperty("userLocation") String str, @JsonProperty("upcomingConcertsSource") String str2, @JsonProperty("color") String str3, @JsonProperty("ticketAvailability") String str4) {
        AutoValue_ConcertEntityModel autoValue_ConcertEntityModel = new AutoValue_ConcertEntityModel(concertResult, list, list2, list3, str, str2, str3, str4);
        return autoValue_ConcertEntityModel;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends Artist> getArtistCreator() {
        return AutoValue_Artist.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends Album> getAlbumCreator() {
        return AutoValue_Album.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends ConcertResult> getConcertResultCreator() {
        return AutoValue_ConcertResult.CREATOR;
    }
}
