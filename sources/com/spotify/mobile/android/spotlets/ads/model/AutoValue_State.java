package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_State extends C$AutoValue_State {
    public static final Creator<AutoValue_State> CREATOR = new Creator<AutoValue_State>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_State[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            AutoValue_State autoValue_State = new AutoValue_State(z, parcel.readInt() == 0 ? parcel.readString() : null, (AdBreakState) Enum.valueOf(AdBreakState.class, parcel.readString()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (icb) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_State;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_State(boolean z, String str, AdBreakState adBreakState, String str2, String str3, icb icb, String str4) {
        super(z, str, adBreakState, str2, str3, icb, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(isAdsEnabled() ? 1 : 0);
        if (getAppStartupId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAppStartupId());
        }
        parcel.writeString(getAdBreakState().name());
        if (getAdSlotId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAdSlotId());
        }
        if (getAdId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAdId());
        }
        parcel.writeParcelable(getPendingAds(), i);
        if (getStreamTimeInMs() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getStreamTimeInMs());
    }
}
