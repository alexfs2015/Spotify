package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistReleases implements Parcelable, JacksonModel {
    public static final Creator<ArtistReleases> CREATOR = new Creator<ArtistReleases>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ArtistReleases(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ArtistReleases[i];
        }
    };
    public final Releases releases;
    public final String uri;

    private ArtistReleases(Parcel parcel) {
        this.uri = parcel.readString();
        this.releases = (Releases) Releases.CREATOR.createFromParcel(parcel);
    }

    @JsonCreator
    public ArtistReleases(@JsonProperty("uri") String str, @JsonProperty("releases") Releases releases2) {
        this.uri = (String) fbp.a(str);
        this.releases = (Releases) fbp.a(releases2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        this.releases.writeToParcel(parcel, i);
    }
}
