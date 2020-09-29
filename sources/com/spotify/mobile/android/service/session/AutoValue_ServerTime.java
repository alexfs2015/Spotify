package com.spotify.mobile.android.service.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ServerTime extends C$AutoValue_ServerTime {
    public static final Creator<AutoValue_ServerTime> CREATOR = new Creator<AutoValue_ServerTime>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ServerTime(parcel.readLong(), parcel.readLong());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ServerTime[i];
        }
    };

    AutoValue_ServerTime(long j, long j2) {
        super(j, j2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(currentTimeMillis());
        parcel.writeLong(currentServerTime());
    }
}
