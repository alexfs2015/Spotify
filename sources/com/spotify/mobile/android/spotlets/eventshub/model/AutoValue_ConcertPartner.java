package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ConcertPartner extends C$AutoValue_ConcertPartner {
    public static final Creator<AutoValue_ConcertPartner> CREATOR = new Creator<AutoValue_ConcertPartner>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_ConcertPartner(parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ConcertPartner[i];
        }
    };

    AutoValue_ConcertPartner(String str, String str2) {
        super(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPartnerId());
        parcel.writeString(getConcertId());
    }
}
