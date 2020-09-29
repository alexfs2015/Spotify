package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ImageModel extends C$AutoValue_ImageModel {
    public static final Creator<AutoValue_ImageModel> CREATOR = new Creator<AutoValue_ImageModel>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ImageModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ImageModel[i];
        }
    };

    AutoValue_ImageModel(String str, int i, int i2, String str2) {
        super(str, i, i2, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getUri());
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        if (getModerationUri() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getModerationUri());
    }
}
