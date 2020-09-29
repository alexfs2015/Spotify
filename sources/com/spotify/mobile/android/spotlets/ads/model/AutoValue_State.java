package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class AutoValue_State extends C$AutoValue_State {
    public static final Creator<AutoValue_State> CREATOR = new Creator<AutoValue_State>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            if (parcel.readInt() == 0) {
                String readString = parcel.readString();
                String str3 = readString;
                str = readString;
            } else {
                str = null;
            }
            AdBreakState adBreakState = (AdBreakState) Enum.valueOf(AdBreakState.class, parcel.readString());
            if (parcel.readInt() == 0) {
                String readString2 = parcel.readString();
                String str4 = readString2;
                str2 = readString2;
            } else {
                str2 = null;
            }
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            Parcelable readParcelable = parcel.readParcelable(State.class.getClassLoader());
            Parcelable parcelable = readParcelable;
            ien ien = (ien) readParcelable;
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String str5 = str;
            String str6 = str;
            AdBreakState adBreakState2 = adBreakState;
            String str7 = str2;
            String str8 = readString3;
            String str9 = readString3;
            ien ien2 = ien;
            ien ien3 = ien;
            String str10 = readString4;
            AutoValue_State autoValue_State = new AutoValue_State(z, str6, adBreakState2, str7, str9, ien3, readString4);
            return autoValue_State;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_State[i];
        }
    };

    AutoValue_State(boolean z, String str, AdBreakState adBreakState, String str2, String str3, ien ien, String str4) {
        super(z, str, adBreakState, str2, str3, ien, str4);
    }

    public final int describeContents() {
        return 0;
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
