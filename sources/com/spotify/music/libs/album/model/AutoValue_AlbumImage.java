package com.spotify.music.libs.album.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_AlbumImage extends C$AutoValue_AlbumImage {
    public static final Creator<AutoValue_AlbumImage> CREATOR = new Creator<AutoValue_AlbumImage>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_AlbumImage(parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AlbumImage[i];
        }
    };

    AutoValue_AlbumImage(String str) {
        super(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getUri());
    }
}
