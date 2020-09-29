package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_RelatedArtistModel extends C$AutoValue_RelatedArtistModel {
    public static final Creator<AutoValue_RelatedArtistModel> CREATOR = new Creator<AutoValue_RelatedArtistModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_RelatedArtistModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_RelatedArtistModel(parcel.readString(), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_RelatedArtistModel(String str, String str2) {
        super(str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(artistName());
        parcel.writeString(artistUri());
    }
}
