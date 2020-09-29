package com.spotify.podcast.endpoints.policy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_DecorationPolicy extends C$AutoValue_DecorationPolicy {
    public static final Creator<AutoValue_DecorationPolicy> CREATOR = new Creator<AutoValue_DecorationPolicy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_DecorationPolicy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_DecorationPolicy((ListPolicy) parcel.readParcelable(DecorationPolicy.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_DecorationPolicy(ListPolicy listPolicy) {
        super(listPolicy);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(listPolicy(), i);
    }
}
