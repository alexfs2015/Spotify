package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image implements Parcelable, JacksonModel {
    public static final Creator<Image> CREATOR = new Creator<Image>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Image[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }
    };
    public final int height;
    public final String uri;
    public final int width;

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public Image(@JsonProperty("uri") String str, @JsonProperty("width") int i, @JsonProperty("height") int i2) {
        this.uri = (String) fay.a(str);
        this.width = i;
        this.height = i2;
    }

    private Image(Parcel parcel) {
        this.uri = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return this.width == image.width && this.height == image.height && faw.a(this.uri, image.uri);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.uri, Integer.valueOf(this.width), Integer.valueOf(this.height)});
    }

    @JsonIgnore
    public Uri getUri() {
        return !TextUtils.isEmpty(this.uri) ? Uri.parse(this.uri) : Uri.EMPTY;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
