package com.spotify.music.features.placebobanner;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_BannerEvent extends C$AutoValue_BannerEvent {
    public static final Creator<AutoValue_BannerEvent> CREATOR = new Creator<AutoValue_BannerEvent>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_BannerEvent(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_BannerEvent[i];
        }
    };

    AutoValue_BannerEvent(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(event());
        parcel.writeString(configurationId());
    }
}
