package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Image extends C$AutoValue_Image {
    public static final Creator<AutoValue_Image> CREATOR = new Creator<AutoValue_Image>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_Image(parcel.readInt() == 0 ? parcel.readString() : null);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Image[i];
        }
    };

    AutoValue_Image(String str) {
        super(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getUrl() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getUrl());
    }
}
