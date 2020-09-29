package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Artist extends C$AutoValue_Artist {
    public static final Creator<AutoValue_Artist> CREATOR = new Creator<AutoValue_Artist>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                String readString2 = parcel.readString();
                String str3 = readString2;
                str = readString2;
            } else {
                str = null;
            }
            if (parcel.readInt() == 0) {
                String readString3 = parcel.readString();
                String str4 = readString3;
                str2 = readString3;
            } else {
                str2 = null;
            }
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            Integer valueOf = parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null;
            AutoValue_Artist autoValue_Artist = r0;
            String str5 = str;
            String str6 = str2;
            String str7 = str2;
            boolean z2 = z;
            boolean z3 = z;
            Integer num = valueOf;
            AutoValue_Artist autoValue_Artist2 = new AutoValue_Artist(readString, str5, str7, z3, valueOf);
            return autoValue_Artist2;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Artist[i];
        }
    };

    AutoValue_Artist(String str, String str2, String str3, boolean z, Integer num) {
        super(str, str2, str3, z, num);
    }

    public final int describeContents() {
        return 0;
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
