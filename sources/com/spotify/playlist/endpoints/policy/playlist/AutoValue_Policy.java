package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AutoValue_Policy extends C$AutoValue_Policy {
    public static final Creator<AutoValue_Policy> CREATOR = new Creator<AutoValue_Policy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Policy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_Policy((DecorationPolicy) parcel.readParcelable(Policy.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_Policy(DecorationPolicy decorationPolicy) {
        super(decorationPolicy);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(decorationPolicy(), i);
    }
}
