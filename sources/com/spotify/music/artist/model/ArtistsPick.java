package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistsPick implements Parcelable, JacksonModel {
    public static final Creator<ArtistsPick> CREATOR = new Creator<ArtistsPick>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ArtistsPick(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ArtistsPick[i];
        }
    };
    public final String description;
    public final Optional<String> imageUri;
    public final String name;
    public final String uri;

    protected ArtistsPick(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.uri = parcel.readString();
        this.imageUri = Optional.c(parcel.readString());
    }

    @JsonCreator
    public ArtistsPick(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2, @JsonProperty("uri") String str3, @JsonProperty("image") String str4) {
        this.name = str;
        this.description = str2;
        this.uri = str3;
        this.imageUri = Optional.c(str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistsPick)) {
            return false;
        }
        ArtistsPick artistsPick = (ArtistsPick) obj;
        if (this.name.equals(artistsPick.name) && this.description.equals(artistsPick.description) && this.uri.equals(artistsPick.uri)) {
            return this.imageUri.equals(artistsPick.imageUri);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.description.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.imageUri.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.uri);
        parcel.writeString((String) this.imageUri.d());
    }
}
