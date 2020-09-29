package com.spotify.music.features.quicksilver.triggers.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_UriTrigger extends C$AutoValue_UriTrigger {
    public static final Creator<AutoValue_UriTrigger> CREATOR = new Creator<AutoValue_UriTrigger>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_UriTrigger[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_UriTrigger(readString, z, parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_UriTrigger(String str, boolean z, String str2) {
        super(str, z, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPattern());
        parcel.writeInt(isCache() ? 1 : 0);
        parcel.writeString(getFormat());
    }
}
