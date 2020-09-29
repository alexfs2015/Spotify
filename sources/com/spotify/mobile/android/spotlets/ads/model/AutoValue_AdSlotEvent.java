package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_AdSlotEvent extends C$AutoValue_AdSlotEvent {
    public static final Creator<AutoValue_AdSlotEvent> CREATOR = new Creator<AutoValue_AdSlotEvent>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Class<AdSlotEvent> cls = AdSlotEvent.class;
            return new AutoValue_AdSlotEvent(parcel.readString(), parcel.readString(), (Ad) parcel.readParcelable(AdSlotEvent.class.getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AdSlotEvent[i];
        }
    };

    AutoValue_AdSlotEvent(String str, String str2, Ad ad) {
        super(str, str2, ad);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getEventString());
        parcel.writeString(getFormatString());
        parcel.writeParcelable(getAd(), i);
    }
}
