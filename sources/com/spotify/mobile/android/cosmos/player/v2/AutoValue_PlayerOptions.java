package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_PlayerOptions extends C$AutoValue_PlayerOptions {
    public static final Creator<AutoValue_PlayerOptions> CREATOR = new Creator<AutoValue_PlayerOptions>() {
        public final AutoValue_PlayerOptions createFromParcel(Parcel parcel) {
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new AutoValue_PlayerOptions(z2, z3, z);
        }

        public final AutoValue_PlayerOptions[] newArray(int i) {
            return new AutoValue_PlayerOptions[i];
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3) {
        super(z, z2, z3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(shufflingContext() ? 1 : 0);
        parcel.writeInt(repeatingContext() ? 1 : 0);
        parcel.writeInt(repeatingTrack() ? 1 : 0);
    }
}
