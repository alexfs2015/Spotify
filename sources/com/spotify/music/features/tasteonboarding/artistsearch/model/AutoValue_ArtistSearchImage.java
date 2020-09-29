package com.spotify.music.features.tasteonboarding.artistsearch.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ArtistSearchImage extends C$AutoValue_ArtistSearchImage {
    public static final Creator<AutoValue_ArtistSearchImage> CREATOR = new Creator<AutoValue_ArtistSearchImage>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ArtistSearchImage(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ArtistSearchImage[i];
        }
    };

    AutoValue_ArtistSearchImage(String str, int i, int i2) {
        super(str, i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uri());
        parcel.writeInt(height());
        parcel.writeInt(width());
    }
}
