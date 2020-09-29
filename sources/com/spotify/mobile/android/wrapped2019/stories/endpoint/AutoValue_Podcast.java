package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Podcast extends C$AutoValue_Podcast {
    public static final Creator<AutoValue_Podcast> CREATOR = new Creator<AutoValue_Podcast>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_Podcast(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Podcast[i];
        }
    };

    AutoValue_Podcast(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
        parcel.writeString(rank());
        parcel.writeString(imageUrl());
    }
}
