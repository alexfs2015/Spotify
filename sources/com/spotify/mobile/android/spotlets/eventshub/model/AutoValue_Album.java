package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Album extends C$AutoValue_Album {
    public static final Creator<AutoValue_Album> CREATOR = new Creator<AutoValue_Album>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Album[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String str = null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_Album(readString, readString2, readString3, str);
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_Album(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
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
        if (getArtistName() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getArtistName());
    }
}
