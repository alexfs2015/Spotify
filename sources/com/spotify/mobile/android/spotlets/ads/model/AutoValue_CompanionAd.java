package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_CompanionAd extends C$AutoValue_CompanionAd {
    public static final Creator<AutoValue_CompanionAd> CREATOR = new Creator<AutoValue_CompanionAd>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            if (parcel.readInt() == 0) {
                String readString = parcel.readString();
                String str3 = readString;
                str = readString;
            } else {
                str = null;
            }
            if (parcel.readInt() == 0) {
                String readString2 = parcel.readString();
                String str4 = readString2;
                str2 = readString2;
            } else {
                str2 = null;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z = true;
            boolean z2 = true;
            boolean z3 = parcel.readInt() == 1;
            boolean z4 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z2 = false;
            }
            int readInt3 = parcel.readInt();
            String str5 = str;
            String str6 = str;
            String str7 = str2;
            String str8 = str2;
            int i = readInt;
            boolean z5 = z4;
            int i2 = readInt3;
            AutoValue_CompanionAd autoValue_CompanionAd = new AutoValue_CompanionAd(str6, str8, readInt, readInt2, z3, z4, z2, readInt3, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_CompanionAd;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_CompanionAd[i];
        }
    };

    AutoValue_CompanionAd(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str3) {
        super(str, str2, i, i2, z, z2, z3, i3, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (getImageHexId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getImageHexId());
        }
        if (getMimeType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getMimeType());
        }
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        parcel.writeInt(isScalable() ? 1 : 0);
        parcel.writeInt(isLockedRatio() ? 1 : 0);
        parcel.writeInt(isHasDisplay() ? 1 : 0);
        parcel.writeInt(getBitrate());
        if (getUrl() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getUrl());
    }
}
