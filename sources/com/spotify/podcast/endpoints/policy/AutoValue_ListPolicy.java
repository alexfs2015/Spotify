package com.spotify.podcast.endpoints.policy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;

final class AutoValue_ListPolicy extends C$AutoValue_ListPolicy {
    public static final Creator<AutoValue_ListPolicy> CREATOR = new Creator<AutoValue_ListPolicy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ListPolicy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ImmutableMap immutableMap;
            ImmutableMap immutableMap2 = null;
            if (parcel.readInt() == 0) {
                AutoValue_ListPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap = (ImmutableMap) parcel.readSerializable();
            } else {
                immutableMap = null;
            }
            if (parcel.readInt() == 0) {
                AutoValue_ListPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap2 = (ImmutableMap) parcel.readSerializable();
            }
            return new AutoValue_ListPolicy(immutableMap, immutableMap2);
        }
    };
    /* access modifiers changed from: private */
    public static final uzr IMMUTABLE_MAP_TYPE_ADAPTER = new uzr();

    public final int describeContents() {
        return 0;
    }

    AutoValue_ListPolicy(ImmutableMap<String, Boolean> immutableMap, ImmutableMap<String, Boolean> immutableMap2) {
        super(immutableMap, immutableMap2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (attributes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(attributes());
        }
        if (showAttributes() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeSerializable(showAttributes());
    }
}
