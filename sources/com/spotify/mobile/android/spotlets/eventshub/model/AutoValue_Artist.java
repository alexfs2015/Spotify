package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Artist extends C$AutoValue_Artist {
    public static final Creator<AutoValue_Artist> CREATOR = new Creator<AutoValue_Artist>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Artist[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            AutoValue_Artist autoValue_Artist = new AutoValue_Artist(readString, readString2, readString3, z, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null);
            return autoValue_Artist;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_Artist(String str, String str2, String str3, boolean z, Integer num) {
        super(str, str2, str3, z, num);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getUri());
        if (getName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getName());
        }
        if (getImageUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getImageUri());
        }
        parcel.writeInt(hasAffinity() ? 1 : 0);
        if (getMonthlyListener() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(getMonthlyListener().intValue());
    }
}
