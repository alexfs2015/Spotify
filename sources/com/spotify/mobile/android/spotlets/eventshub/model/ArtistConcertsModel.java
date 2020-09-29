package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ArtistConcertsModel implements Parcelable, JacksonModel {

    static final class a extends upv<ConcertResult> {
        protected a() {
            super(ArtistConcertsModel.getConcertResultCreator());
        }
    }

    static final class b extends upy<Artist> {
        protected b() {
            super(ArtistConcertsModel.getArtistCreator());
        }
    }

    @JsonProperty("artist")
    public abstract Artist getArtist();

    @JsonProperty("concerts")
    public abstract List<ConcertResult> getConcerts();

    @JsonProperty("userLocation")
    public abstract String getUserLocation();

    @JsonCreator
    public static ArtistConcertsModel create(@JsonProperty("artist") Artist artist, @JsonProperty("userLocation") String str, @JsonProperty("concerts") List<ConcertResult> list) {
        return new AutoValue_ArtistConcertsModel(artist, str, list);
    }

    /* access modifiers changed from: private */
    public static Creator<? extends Artist> getArtistCreator() {
        return AutoValue_Artist.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends ConcertResult> getConcertResultCreator() {
        return AutoValue_ConcertResult.CREATOR;
    }
}
