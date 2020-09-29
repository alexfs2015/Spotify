package com.spotify.music.libs.album.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_AlbumRelease extends C$AutoValue_AlbumRelease {
    public static final Creator<AutoValue_AlbumRelease> CREATOR = new Creator<AutoValue_AlbumRelease>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_AlbumRelease(parcel.readInt(), (AlbumImage) parcel.readParcelable(AlbumRelease.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AlbumRelease[i];
        }
    };

    AutoValue_AlbumRelease(int i, AlbumImage albumImage, String str, String str2) {
        super(i, albumImage, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getYear());
        parcel.writeParcelable(getCover(), i);
        parcel.writeString(getUri());
        parcel.writeString(getName());
    }
}
