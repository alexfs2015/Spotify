package com.spotify.mobile.android.spotlets.user;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_TopArtistModel extends C$AutoValue_TopArtistModel {
    public static final Creator<AutoValue_TopArtistModel> CREATOR = new Creator<AutoValue_TopArtistModel>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_TopArtistModel(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString(), parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TopArtistModel[i];
        }
    };

    AutoValue_TopArtistModel(String str, String str2, String str3, int i) {
        super(str, str2, str3, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
        if (imageUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(imageUrl());
        }
        parcel.writeString(uri());
        parcel.writeInt(followersCount());
    }
}
