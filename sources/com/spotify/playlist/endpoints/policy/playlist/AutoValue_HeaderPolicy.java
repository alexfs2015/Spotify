package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;

final class AutoValue_HeaderPolicy extends C$AutoValue_HeaderPolicy {
    public static final Creator<AutoValue_HeaderPolicy> CREATOR = new Creator<AutoValue_HeaderPolicy>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            ImmutableMap immutableMap;
            ImmutableMap immutableMap2;
            ImmutableMap immutableMap3 = null;
            if (parcel.readInt() == 0) {
                AutoValue_HeaderPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap = (ImmutableMap) parcel.readSerializable();
            } else {
                immutableMap = null;
            }
            if (parcel.readInt() == 0) {
                AutoValue_HeaderPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap2 = (ImmutableMap) parcel.readSerializable();
            } else {
                immutableMap2 = null;
            }
            if (parcel.readInt() == 0) {
                AutoValue_HeaderPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap3 = (ImmutableMap) parcel.readSerializable();
            }
            return new AutoValue_HeaderPolicy(immutableMap, immutableMap2, immutableMap3);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_HeaderPolicy[i];
        }
    };
    /* access modifiers changed from: private */
    public static final vkp IMMUTABLE_MAP_TYPE_ADAPTER = new vkp();

    AutoValue_HeaderPolicy(ImmutableMap<String, Boolean> immutableMap, ImmutableMap<String, Boolean> immutableMap2, ImmutableMap<String, Boolean> immutableMap3) {
        super(immutableMap, immutableMap2, immutableMap3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (attributes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(attributes());
        }
        if (ownerAttributes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(ownerAttributes());
        }
        if (madeForAttributes() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeSerializable(madeForAttributes());
    }
}
