package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_LinksModel extends C$AutoValue_LinksModel {
    public static final Creator<AutoValue_LinksModel> CREATOR = new Creator<AutoValue_LinksModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_LinksModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_LinksModel(readString, readString2, readString3, str);
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_LinksModel(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getTwitterLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTwitterLink());
        }
        if (getInstagramLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getInstagramLink());
        }
        if (getWikipediaLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getWikipediaLink());
        }
        if (getFacebookLink() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getFacebookLink());
    }
}
