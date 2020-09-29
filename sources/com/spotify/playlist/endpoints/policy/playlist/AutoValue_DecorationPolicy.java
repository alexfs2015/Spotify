package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_DecorationPolicy extends C$AutoValue_DecorationPolicy {
    public static final Creator<AutoValue_DecorationPolicy> CREATOR = new Creator<AutoValue_DecorationPolicy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_DecorationPolicy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_DecorationPolicy((ListPolicy) parcel.readParcelable(DecorationPolicy.class.getClassLoader()), (HeaderPolicy) parcel.readParcelable(DecorationPolicy.class.getClassLoader()));
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_DecorationPolicy(ListPolicy listPolicy, HeaderPolicy headerPolicy) {
        super(listPolicy, headerPolicy);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(listPolicy(), i);
        parcel.writeParcelable(headerPolicy(), i);
    }
}
