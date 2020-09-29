package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ConcertTicketing extends C$AutoValue_ConcertTicketing {
    public static final Creator<AutoValue_ConcertTicketing> CREATOR = new Creator<AutoValue_ConcertTicketing>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_ConcertTicketing(readString, str);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ConcertTicketing[i];
        }
    };

    AutoValue_ConcertTicketing(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getMinPrice() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getMinPrice());
        }
        if (getMaxPrice() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getMaxPrice());
    }
}
