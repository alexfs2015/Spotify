package com.spotify.music.features.quicksilver.triggers.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ClientEventTrigger extends C$AutoValue_ClientEventTrigger {
    public static final Creator<AutoValue_ClientEventTrigger> CREATOR = new Creator<AutoValue_ClientEventTrigger>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ClientEventTrigger[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_ClientEventTrigger(readString, z, parcel.readString());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_ClientEventTrigger(String str, boolean z, String str2) {
        super(str, z, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPattern());
        parcel.writeInt(isCache() ? 1 : 0);
        parcel.writeString(getFormat());
    }
}
