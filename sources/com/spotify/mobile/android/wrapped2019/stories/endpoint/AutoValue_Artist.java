package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Artist extends C$AutoValue_Artist {
    public static final Creator<AutoValue_Artist> CREATOR = new Creator<AutoValue_Artist>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_Artist(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Artist[i];
        }
    };

    AutoValue_Artist(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
        parcel.writeString(imageUrl());
    }
}
