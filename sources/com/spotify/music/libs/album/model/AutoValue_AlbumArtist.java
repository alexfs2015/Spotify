package com.spotify.music.libs.album.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_AlbumArtist extends C$AutoValue_AlbumArtist {
    public static final Creator<AutoValue_AlbumArtist> CREATOR = new Creator<AutoValue_AlbumArtist>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_AlbumArtist((AlbumImage) parcel.readParcelable(AlbumArtist.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AlbumArtist[i];
        }
    };

    AutoValue_AlbumArtist(AlbumImage albumImage, String str, String str2) {
        super(albumImage, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getImage(), i);
        parcel.writeString(getUri());
        parcel.writeString(getName());
    }
}
