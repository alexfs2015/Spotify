package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_AdState extends C$AutoValue_AdState {
    public static final Creator<AutoValue_AdState> CREATOR = new Creator<AutoValue_AdState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_AdState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_AdState((State) parcel.readParcelable(AdState.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_AdState(State state) {
        super(state);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getState(), i);
    }
}
