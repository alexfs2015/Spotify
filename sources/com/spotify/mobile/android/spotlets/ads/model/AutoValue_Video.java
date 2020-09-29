package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Video extends C$AutoValue_Video {
    public static final Creator<AutoValue_Video> CREATOR = new Creator<AutoValue_Video>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z = parcel.readInt() == 1;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            AutoValue_Video autoValue_Video = r0;
            boolean z4 = z;
            boolean z5 = z2;
            int i = readInt3;
            String str = readString2;
            String str2 = readString3;
            AutoValue_Video autoValue_Video2 = new AutoValue_Video(readString, readInt, readInt2, z, z2, z3, readInt3, readString2, readString3);
            return autoValue_Video2;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Video[i];
        }
    };

    AutoValue_Video(String str, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str2, String str3) {
        super(str, i, i2, z, z2, z3, i3, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getMimeType());
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        parcel.writeInt(isScalable() ? 1 : 0);
        parcel.writeInt(isLockedRatio() ? 1 : 0);
        parcel.writeInt(isHasDisplay() ? 1 : 0);
        parcel.writeInt(getBitrate());
        int i2 = 7 << 0;
        if (getUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getUrl());
        }
        if (getVideoHexId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getVideoHexId());
    }
}
