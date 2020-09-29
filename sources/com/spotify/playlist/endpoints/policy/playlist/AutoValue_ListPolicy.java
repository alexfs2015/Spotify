package com.spotify.playlist.endpoints.policy.playlist;

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
            ImmutableMap immutableMap2;
            ImmutableMap immutableMap3;
            ImmutableMap immutableMap4;
            ImmutableMap immutableMap5;
            if (parcel.readInt() == 0) {
                AutoValue_ListPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap = (ImmutableMap) parcel.readSerializable();
            } else {
                immutableMap = null;
            }
            if (parcel.readInt() == 0) {
                AutoValue_ListPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap2 = (ImmutableMap) parcel.readSerializable();
            } else {
                immutableMap2 = null;
            }
            if (parcel.readInt() == 0) {
                AutoValue_ListPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap3 = (ImmutableMap) parcel.readSerializable();
            } else {
                immutableMap3 = null;
            }
            if (parcel.readInt() == 0) {
                AutoValue_ListPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap4 = (ImmutableMap) parcel.readSerializable();
            } else {
                immutableMap4 = null;
            }
            if (parcel.readInt() == 0) {
                AutoValue_ListPolicy.IMMUTABLE_MAP_TYPE_ADAPTER;
                immutableMap5 = (ImmutableMap) parcel.readSerializable();
            } else {
                immutableMap5 = null;
            }
            AutoValue_ListPolicy autoValue_ListPolicy = new AutoValue_ListPolicy(immutableMap, immutableMap2, immutableMap3, immutableMap4, immutableMap5);
            return autoValue_ListPolicy;
        }
    };
    /* access modifiers changed from: private */
    public static final uym IMMUTABLE_MAP_TYPE_ADAPTER = new uym();

    public final int describeContents() {
        return 0;
    }

    AutoValue_ListPolicy(ImmutableMap<String, Boolean> immutableMap, ImmutableMap<String, Boolean> immutableMap2, ImmutableMap<String, Boolean> immutableMap3, ImmutableMap<String, Boolean> immutableMap4, ImmutableMap<String, Boolean> immutableMap5) {
        super(immutableMap, immutableMap2, immutableMap3, immutableMap4, immutableMap5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (attributes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(attributes());
        }
        if (albumAttributes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(albumAttributes());
        }
        if (artistsAttributes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(artistsAttributes());
        }
        if (showAttributes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(showAttributes());
        }
        if (addedByAttributes() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeSerializable(addedByAttributes());
    }
}
