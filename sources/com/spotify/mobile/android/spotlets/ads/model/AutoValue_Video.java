package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_Video extends C$AutoValue_Video {
    public static final Creator<AutoValue_Video> CREATOR = new Creator<AutoValue_Video>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Video[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_Video autoValue_Video = new AutoValue_Video(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_Video;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_Video(String str, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str2, String str3) {
        super(str, i, i2, z, z2, z3, i3, str2, str3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getMimeType());
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        parcel.writeInt(isScalable() ? 1 : 0);
        parcel.writeInt(isLockedRatio() ? 1 : 0);
        parcel.writeInt(isHasDisplay() ? 1 : 0);
        parcel.writeInt(getBitrate());
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
