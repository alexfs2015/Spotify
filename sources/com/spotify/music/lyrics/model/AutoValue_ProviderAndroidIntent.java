package com.spotify.music.lyrics.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ProviderAndroidIntent extends C$AutoValue_ProviderAndroidIntent {
    public static final Creator<AutoValue_ProviderAndroidIntent> CREATOR = new Creator<AutoValue_ProviderAndroidIntent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ProviderAndroidIntent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String str = null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_ProviderAndroidIntent(readString, readString2, readString3, str);
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_ProviderAndroidIntent(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getProviderAndroidPackage());
        if (getAction() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAction());
        }
        if (getData() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getData());
        }
        if (getContentType() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getContentType());
    }
}
