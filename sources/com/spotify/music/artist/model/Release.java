package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Release implements Parcelable, JacksonModel {
    public static final Creator<Release> CREATOR = new Creator<Release>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Release[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Release(parcel);
        }
    };
    public final Image cover;
    public final int day;
    public final int month;
    public final String name;
    public final int trackCount;
    public final String uri;
    public final int year;

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public Release(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("cover") Image image, @JsonProperty("year") int i, @JsonProperty("month") int i2, @JsonProperty("day") int i3, @JsonProperty("track_count") int i4) {
        this.uri = (String) fay.a(str);
        this.name = (String) fay.a(str2);
        this.cover = image;
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.trackCount = i4;
    }

    private Release(Parcel parcel) {
        this.uri = parcel.readString();
        this.name = parcel.readString();
        this.cover = (Image) jse.b(parcel, Image.CREATOR);
        this.year = parcel.readInt();
        this.month = parcel.readInt();
        this.day = parcel.readInt();
        this.trackCount = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.name);
        jse.a(parcel, (Parcelable) this.cover, 0);
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
        parcel.writeInt(this.day);
        parcel.writeInt(this.trackCount);
    }
}
