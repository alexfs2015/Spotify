package com.spotify.mobile.android.spotlets.ads.sponsorship.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Sponsorship extends C$AutoValue_Sponsorship {
    public static final Creator<AutoValue_Sponsorship> CREATOR = new Creator<AutoValue_Sponsorship>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Sponsorship[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_Sponsorship(Long.valueOf(parcel.readLong()), Long.valueOf(parcel.readLong()), parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_Sponsorship(Long l, Long l2, String str) {
        super(l, l2, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(startTime().longValue());
        parcel.writeLong(endTime().longValue());
        parcel.writeString(uri());
    }
}
